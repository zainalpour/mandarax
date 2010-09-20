package org.mandarax.dsl;

import java.util.List;
/**
 * Function declarations: [public|private] name(list of parameter names)
 * @author jens dietrich
 *
 */
public class FunctionDeclaration extends ASTNode {
	
	private Visibility visibility;
	private List<String> parameterNames = null;
	private String name = null;
	
	public FunctionDeclaration(Position position, Context context,Visibility visibility, String name, List<String> parameterNames) {
		super(position, context);
		this.visibility = visibility;
		this.parameterNames = parameterNames;
		this.name = name;
	}

	public void accept(ASTVisitor visitor) {
		visitor.visit(this);
		visitor.endVisit(this);
	}

	public Visibility getVisibility() {
		return visibility;
	}

	public List<String> getParameterNames() {
		return parameterNames;
	}

	public String getName() {
		return name;
	}
	
	protected void appendTo(StringBuffer b) {
		b.append(visibility.name());
		b.append(' ');
		b.append(name);
		appendListOfStrings(parameterNames,b,true);
	}

	public boolean hasParameters() {
		return this.parameterNames!=null && !this.parameterNames.isEmpty();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((parameterNames == null) ? 0 : parameterNames.hashCode());
		result = prime * result
				+ ((visibility == null) ? 0 : visibility.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FunctionDeclaration other = (FunctionDeclaration) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parameterNames == null) {
			if (other.parameterNames != null)
				return false;
		} else if (!parameterNames.equals(other.parameterNames))
			return false;
		if (visibility != other.visibility)
			return false;
		return true;
	}
}
