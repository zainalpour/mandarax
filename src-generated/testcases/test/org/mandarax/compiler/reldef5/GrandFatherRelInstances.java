package test.org.mandarax.compiler.reldef5;
 
import test.org.mandarax.compiler.Person;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>GrandFather</strong>.
 * @version Nov 9, 2010 11:29:29 AM 
 */
public class GrandFatherRelInstances {
	// object references
	
	
	// fields representing annotations
	
	// rule: rule1: Father(x.getName(),y) & Father(y,z.getName()) -> GrandFather(x,z);
	private final static java.util.Properties _annotations_rule1 = new java.util.Properties();
	
	
	// initialise annotations
	static {
		// relationship annotations for rule  rule1: Father(x.getName(),y) & Father(y,z.getName()) -> GrandFather(x,z);
		
		// rule annotations for rule  rule1: Father(x.getName(),y) & Father(y,z.getName()) -> GrandFather(x,z);
		
		
	}
		
	

	// interface generated for queries	
	 
	public ResultSet<GrandFatherRel> isGrandFather (  Person grandFather ,  Person grandChild  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<GrandFatherRel>(isGrandFather ( _derivation ,  grandFather ,  grandChild ),_derivation);
	} 
	
	
	// implementations - these methods are referenced by code generated from other rules in this package
	// and therefore kept static 
	 
	static ResourceIterator<GrandFatherRel> isGrandFather ( final DerivationController _derivation ,  final Person grandFather ,  final Person grandChild  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<GrandFatherRel>(1) {
			
			public ResourceIterator<GrandFatherRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke rule1: Father(x.getName(),y) & Father(y,z.getName()) -> GrandFather(x,z);
                			return isGrandFather_0(_derivation.pop(_derivationlevel) ,  grandFather ,  grandChild );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	
	
	
	// private methods - each method represents the invocation of a single rule for a certain query
	// query: isGrandFather
	// rule: rule1: Father(x.getName(),y) & Father(y,z.getName()) -> GrandFather(x,z);
	private static ResourceIterator<GrandFatherRel> isGrandFather_0 (final DerivationController _derivation ,  final Person grandFather ,  final Person grandChild ) {
		
		_derivation.log("GrandFather.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule1: Father(x.getName(),y) & Father(y,z.getName()) -> GrandFather(x,z);
		// prereqs: [Father(x.getName(),y), Father(y,z.getName())]
		class _Bindings {
			private test.org.mandarax.compiler.Person x = grandFather;
			private test.org.mandarax.compiler.Person z = grandChild;
			private java.lang.String y = null;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		
		

		 
		
		
		
		// apply prerequisite Father(x.getName(),y)
		
		
		  // case 1
		final ResourceIterator<FatherRel> _iterator2 = FatherRelInstances.getChildren(_derivation.push(),_bindings.x.getName());
		
		
		
		 
		
		
		
		// apply prerequisite Father(y,z.getName())
		
		
		  // case 3
					
					com.google.common.base.Predicate<FatherRel> _filter3 = new com.google.common.base.Predicate<FatherRel>() {
						public boolean apply(FatherRel _object) {
						        // bind parameters from Father(x.getName(),y)
								_bindings.y = _object.child;
								
								
									ResourceIterator<FatherRel> _r =  FatherRelInstances.isFather(_derivation.push(),_bindings.y,_bindings.z.getName());
									boolean _b = _r.hasNext();
									_r.close();
									return _b;
								
							}
					};
					final ResourceIterator<FatherRel> _iterator3 =  new FilteredIterator<FatherRel>(_iterator2,_filter3);
		
					 
		
		
		// rule head
		
		return new NestedIterator<FatherRel, GrandFatherRel>(_iterator3) {
                	public ResourceIterator<GrandFatherRel> getNextIterator(FatherRel _object) {
						// bind parameters from Father(x.getName(),y)
						_bindings.y = _object.child;
						
                    				return new SingletonIterator(new GrandFatherRel(_bindings.x,_bindings.z));
                	}
        	};
        
		
		
		
	

	}
	
	
}

