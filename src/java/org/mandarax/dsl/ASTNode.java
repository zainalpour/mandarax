/*
 * Copyright 2010 Jens Dietrich 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 
 * Unless required by applicable law or agreed to in writing, software distributed under the 
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language governing permissions 
 * and limitations under the License.
 */

package org.mandarax.dsl;

import java.util.*;

/**
 * Superclass for all AST nodes.
 * @author jens dietrich
 */

public abstract class ASTNode  implements Visitable {
	public ASTNode(Position position,Context context) {
		super();
		this.position = position;
		this.context = context;
	}

	// the position of this artefact in the script defining it
	private Position position = null;
	// contextual information
	private Context context = null;
	// cached variables
	private List<Variable> variables = null;
	// additional properties
	private Map<Object,Object> properties = new HashMap<Object,Object>(); 
	
	public void setProperty(Object key,Object value) {
		properties.put(key, value);
	}
	public Object getProperty(Object key) {
		return properties.get(key);
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}
	
	// utility for recursive printing
	protected void appendList(List<? extends Object> objs, StringBuffer b, boolean br,String sep) {
		if (br) b.append('(');
		boolean f = true;
		for (Object obj:objs) {
			if (f) f=false;
			else b.append(sep);
			b.append(obj);
		}
		if (br) b.append(')');
	}
	
	/**
	 * Get all variables contained in this node.
	 * @return
	 */
	public List<Variable> getVariables() {
		// try cached variables first
		if (variables!=null) return variables;
		
		class VariableCollector extends AbstractASTVisitor {
			List<Variable> variables = new ArrayList<Variable>();
			@Override
			public boolean visit(Variable x) {
				if (!variables.contains(x)) variables.add(x);
				return super.visit(x);
			}
		}
		VariableCollector collector = new VariableCollector();
		this.accept(collector);
		variables = collector.variables;
		
		return variables;
		
	}
	
	// reset cached info
	public void reset() {
		this.variables = null;
	}

}
