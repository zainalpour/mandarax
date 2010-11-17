package test.org.mandarax.compiler.naf1;
 
import test.org.mandarax.compiler.*;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>Father</strong>.
 * @version Nov 18, 2010 9:53:04 AM 
 */
public class FatherRelInstances {
	// object references
	 
	public static Person m1 = new Person("m1",25);
	 
	public static Person m2 = new Person("m2",5);
	 
	public static Person m3 = new Person("m3",5);
	 
	public static Person f1 = new Person("f1",25);
	
	
	// fields representing annotations
	
	// rule: rule1:  -> Father(m1,m2);
	private final static java.util.Properties _annotations_rule1 = new java.util.Properties();
	
	
	// initialise annotations
	static {
		// relationship annotations for rule  rule1:  -> Father(m1,m2);
		
		// rule annotations for rule  rule1:  -> Father(m1,m2);
		
		
	}
		
	

	// interface generated for queries	
	 
	public static ResultSet<FatherRel> getFather (  Person child  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<FatherRel>(getFather ( _derivation ,  child ),_derivation);
	} 
	 
	public static ResultSet<FatherRel> isFather (  Person father ,  Person child  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<FatherRel>(isFather ( _derivation ,  father ,  child ),_derivation);
	} 
	 
	public static ResultSet<FatherRel> getChildren (  Person father  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<FatherRel>(getChildren ( _derivation ,  father ),_derivation);
	} 
	 
	public static ResultSet<FatherRel> getFatherAndChild (  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<FatherRel>(getFatherAndChild ( _derivation  ),_derivation);
	} 
	
	
	// implementations - these methods are referenced by code generated from other rules in this package
	// and therefore kept static 
	 
	static ResourceIterator<FatherRel> getFather ( final DerivationController _derivation ,  final Person child  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FatherRel>(1) {
			
			public ResourceIterator<FatherRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke rule1:  -> Father(m1,m2);
                			return getFather_0(_derivation.pop(_derivationlevel) ,  child );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	 
	static ResourceIterator<FatherRel> isFather ( final DerivationController _derivation ,  final Person father ,  final Person child  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FatherRel>(1) {
			
			public ResourceIterator<FatherRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke rule1:  -> Father(m1,m2);
                			return isFather_0(_derivation.pop(_derivationlevel) ,  father ,  child );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	 
	static ResourceIterator<FatherRel> getChildren ( final DerivationController _derivation ,  final Person father  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FatherRel>(1) {
			
			public ResourceIterator<FatherRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke rule1:  -> Father(m1,m2);
                			return getChildren_0(_derivation.pop(_derivationlevel) ,  father );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	 
	static ResourceIterator<FatherRel> getFatherAndChild ( final DerivationController _derivation   ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FatherRel>(1) {
			
			public ResourceIterator<FatherRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke rule1:  -> Father(m1,m2);
                			return getFatherAndChild_0(_derivation.pop(_derivationlevel)  );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	
	
	
	// private methods - each method represents the invocation of a single rule for a certain query
	// query: getFather
	// rule: rule1:  -> Father(m1,m2);
	private static ResourceIterator<FatherRel> getFather_0 (final DerivationController _derivation ,  final Person child ) {
		
		_derivation.log("Father.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule1:  -> Father(m1,m2);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person m1 = FatherRelInstances.m1;
			private test.org.mandarax.compiler.Person m2 = FatherRelInstances.m2;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(child,m2); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.m1,_bindings.m2));
        
		
		
		
	

	}
	// query: isFather
	// rule: rule1:  -> Father(m1,m2);
	private static ResourceIterator<FatherRel> isFather_0 (final DerivationController _derivation ,  final Person father ,  final Person child ) {
		
		_derivation.log("Father.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule1:  -> Father(m1,m2);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person m1 = FatherRelInstances.m1;
			private test.org.mandarax.compiler.Person m2 = FatherRelInstances.m2;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,m1); 
		
		_checkfailed = _checkfailed || !Equals.compare(child,m2); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.m1,_bindings.m2));
        
		
		
		
	

	}
	// query: getChildren
	// rule: rule1:  -> Father(m1,m2);
	private static ResourceIterator<FatherRel> getChildren_0 (final DerivationController _derivation ,  final Person father ) {
		
		_derivation.log("Father.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule1:  -> Father(m1,m2);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person m1 = FatherRelInstances.m1;
			private test.org.mandarax.compiler.Person m2 = FatherRelInstances.m2;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,m1); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.m1,_bindings.m2));
        
		
		
		
	

	}
	// query: getFatherAndChild
	// rule: rule1:  -> Father(m1,m2);
	private static ResourceIterator<FatherRel> getFatherAndChild_0 (final DerivationController _derivation  ) {
		
		_derivation.log("Father.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule1:  -> Father(m1,m2);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person m1 = FatherRelInstances.m1;
			private test.org.mandarax.compiler.Person m2 = FatherRelInstances.m2;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.m1,_bindings.m2));
        
		
		
		
	

	}
	
	
	// methods representing aggregation functions
	
	
}


