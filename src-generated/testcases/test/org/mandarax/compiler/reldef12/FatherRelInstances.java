package test.org.mandarax.compiler.reldef12;
 
import test.org.mandarax.compiler.*;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>Father</strong>.
 * @version Nov 18, 2010 9:53:04 AM 
 */
public class FatherRelInstances {
	// object references
	 
	public static Person jens = new Person("Jens");
	 
	public static Person maxd = new Person("Max");
	 
	public static Person klaus = new Person("Klaus");
	 
	public static Person otto = new Person("Otto");
	 
	public static Person xiomara = new Person("Xiomara");
	
	
	// fields representing annotations
	
	// rule: rule1:  -> Father(jens,maxd);
	private final static java.util.Properties _annotations_rule1 = new java.util.Properties();
	
	// rule: rule2:  -> Father(jens,xiomara);
	private final static java.util.Properties _annotations_rule2 = new java.util.Properties();
	
	// rule: rule3:  -> Father(klaus,jens);
	private final static java.util.Properties _annotations_rule3 = new java.util.Properties();
	
	// rule: rule4:  -> Father(otto,klaus);
	private final static java.util.Properties _annotations_rule4 = new java.util.Properties();
	
	
	// initialise annotations
	static {
		// relationship annotations for rule  rule1:  -> Father(jens,maxd);
		
		// rule annotations for rule  rule1:  -> Father(jens,maxd);
		
		
	
		// relationship annotations for rule  rule2:  -> Father(jens,xiomara);
		
		// rule annotations for rule  rule2:  -> Father(jens,xiomara);
		
		
	
		// relationship annotations for rule  rule3:  -> Father(klaus,jens);
		
		// rule annotations for rule  rule3:  -> Father(klaus,jens);
		
		
	
		// relationship annotations for rule  rule4:  -> Father(otto,klaus);
		
		// rule annotations for rule  rule4:  -> Father(otto,klaus);
		
		
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
		return new IteratorChain<FatherRel>(4) {
			
			public ResourceIterator<FatherRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke rule1:  -> Father(jens,maxd);
                			return getFather_0(_derivation.pop(_derivationlevel) ,  child );
                		}
				
                		case 1: {
                			// invoke rule2:  -> Father(jens,xiomara);
                			return getFather_1(_derivation.pop(_derivationlevel) ,  child );
                		}
				
                		case 2: {
                			// invoke rule3:  -> Father(klaus,jens);
                			return getFather_2(_derivation.pop(_derivationlevel) ,  child );
                		}
				
                		case 3: {
                			// invoke rule4:  -> Father(otto,klaus);
                			return getFather_3(_derivation.pop(_derivationlevel) ,  child );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	 
	static ResourceIterator<FatherRel> isFather ( final DerivationController _derivation ,  final Person father ,  final Person child  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FatherRel>(4) {
			
			public ResourceIterator<FatherRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke rule1:  -> Father(jens,maxd);
                			return isFather_0(_derivation.pop(_derivationlevel) ,  father ,  child );
                		}
				
                		case 1: {
                			// invoke rule2:  -> Father(jens,xiomara);
                			return isFather_1(_derivation.pop(_derivationlevel) ,  father ,  child );
                		}
				
                		case 2: {
                			// invoke rule3:  -> Father(klaus,jens);
                			return isFather_2(_derivation.pop(_derivationlevel) ,  father ,  child );
                		}
				
                		case 3: {
                			// invoke rule4:  -> Father(otto,klaus);
                			return isFather_3(_derivation.pop(_derivationlevel) ,  father ,  child );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	 
	static ResourceIterator<FatherRel> getChildren ( final DerivationController _derivation ,  final Person father  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FatherRel>(4) {
			
			public ResourceIterator<FatherRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke rule1:  -> Father(jens,maxd);
                			return getChildren_0(_derivation.pop(_derivationlevel) ,  father );
                		}
				
                		case 1: {
                			// invoke rule2:  -> Father(jens,xiomara);
                			return getChildren_1(_derivation.pop(_derivationlevel) ,  father );
                		}
				
                		case 2: {
                			// invoke rule3:  -> Father(klaus,jens);
                			return getChildren_2(_derivation.pop(_derivationlevel) ,  father );
                		}
				
                		case 3: {
                			// invoke rule4:  -> Father(otto,klaus);
                			return getChildren_3(_derivation.pop(_derivationlevel) ,  father );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	 
	static ResourceIterator<FatherRel> getFatherAndChild ( final DerivationController _derivation   ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FatherRel>(4) {
			
			public ResourceIterator<FatherRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke rule1:  -> Father(jens,maxd);
                			return getFatherAndChild_0(_derivation.pop(_derivationlevel)  );
                		}
				
                		case 1: {
                			// invoke rule2:  -> Father(jens,xiomara);
                			return getFatherAndChild_1(_derivation.pop(_derivationlevel)  );
                		}
				
                		case 2: {
                			// invoke rule3:  -> Father(klaus,jens);
                			return getFatherAndChild_2(_derivation.pop(_derivationlevel)  );
                		}
				
                		case 3: {
                			// invoke rule4:  -> Father(otto,klaus);
                			return getFatherAndChild_3(_derivation.pop(_derivationlevel)  );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	
	
	
	// private methods - each method represents the invocation of a single rule for a certain query
	// query: getFather
	// rule: rule1:  -> Father(jens,maxd);
	private static ResourceIterator<FatherRel> getFather_0 (final DerivationController _derivation ,  final Person child ) {
		
		_derivation.log("Father.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule1:  -> Father(jens,maxd);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person jens = FatherRelInstances.jens;
			private test.org.mandarax.compiler.Person maxd = FatherRelInstances.maxd;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(child,maxd); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.jens,_bindings.maxd));
        
		
		
		
	

	}
	// rule: rule2:  -> Father(jens,xiomara);
	private static ResourceIterator<FatherRel> getFather_1 (final DerivationController _derivation ,  final Person child ) {
		
		_derivation.log("Father.rule2", DerivationController.RULE, _annotations_rule2);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule2:  -> Father(jens,xiomara);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person jens = FatherRelInstances.jens;
			private test.org.mandarax.compiler.Person xiomara = FatherRelInstances.xiomara;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(child,xiomara); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.jens,_bindings.xiomara));
        
		
		
		
	

	}
	// rule: rule3:  -> Father(klaus,jens);
	private static ResourceIterator<FatherRel> getFather_2 (final DerivationController _derivation ,  final Person child ) {
		
		_derivation.log("Father.rule3", DerivationController.RULE, _annotations_rule3);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule3:  -> Father(klaus,jens);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person klaus = FatherRelInstances.klaus;
			private test.org.mandarax.compiler.Person jens = FatherRelInstances.jens;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(child,jens); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.klaus,_bindings.jens));
        
		
		
		
	

	}
	// rule: rule4:  -> Father(otto,klaus);
	private static ResourceIterator<FatherRel> getFather_3 (final DerivationController _derivation ,  final Person child ) {
		
		_derivation.log("Father.rule4", DerivationController.RULE, _annotations_rule4);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule4:  -> Father(otto,klaus);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person otto = FatherRelInstances.otto;
			private test.org.mandarax.compiler.Person klaus = FatherRelInstances.klaus;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(child,klaus); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.otto,_bindings.klaus));
        
		
		
		
	

	}
	// query: isFather
	// rule: rule1:  -> Father(jens,maxd);
	private static ResourceIterator<FatherRel> isFather_0 (final DerivationController _derivation ,  final Person father ,  final Person child ) {
		
		_derivation.log("Father.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule1:  -> Father(jens,maxd);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person jens = FatherRelInstances.jens;
			private test.org.mandarax.compiler.Person maxd = FatherRelInstances.maxd;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,jens); 
		
		_checkfailed = _checkfailed || !Equals.compare(child,maxd); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.jens,_bindings.maxd));
        
		
		
		
	

	}
	// rule: rule2:  -> Father(jens,xiomara);
	private static ResourceIterator<FatherRel> isFather_1 (final DerivationController _derivation ,  final Person father ,  final Person child ) {
		
		_derivation.log("Father.rule2", DerivationController.RULE, _annotations_rule2);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule2:  -> Father(jens,xiomara);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person jens = FatherRelInstances.jens;
			private test.org.mandarax.compiler.Person xiomara = FatherRelInstances.xiomara;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,jens); 
		
		_checkfailed = _checkfailed || !Equals.compare(child,xiomara); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.jens,_bindings.xiomara));
        
		
		
		
	

	}
	// rule: rule3:  -> Father(klaus,jens);
	private static ResourceIterator<FatherRel> isFather_2 (final DerivationController _derivation ,  final Person father ,  final Person child ) {
		
		_derivation.log("Father.rule3", DerivationController.RULE, _annotations_rule3);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule3:  -> Father(klaus,jens);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person klaus = FatherRelInstances.klaus;
			private test.org.mandarax.compiler.Person jens = FatherRelInstances.jens;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,klaus); 
		
		_checkfailed = _checkfailed || !Equals.compare(child,jens); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.klaus,_bindings.jens));
        
		
		
		
	

	}
	// rule: rule4:  -> Father(otto,klaus);
	private static ResourceIterator<FatherRel> isFather_3 (final DerivationController _derivation ,  final Person father ,  final Person child ) {
		
		_derivation.log("Father.rule4", DerivationController.RULE, _annotations_rule4);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule4:  -> Father(otto,klaus);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person otto = FatherRelInstances.otto;
			private test.org.mandarax.compiler.Person klaus = FatherRelInstances.klaus;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,otto); 
		
		_checkfailed = _checkfailed || !Equals.compare(child,klaus); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.otto,_bindings.klaus));
        
		
		
		
	

	}
	// query: getChildren
	// rule: rule1:  -> Father(jens,maxd);
	private static ResourceIterator<FatherRel> getChildren_0 (final DerivationController _derivation ,  final Person father ) {
		
		_derivation.log("Father.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule1:  -> Father(jens,maxd);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person jens = FatherRelInstances.jens;
			private test.org.mandarax.compiler.Person maxd = FatherRelInstances.maxd;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,jens); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.jens,_bindings.maxd));
        
		
		
		
	

	}
	// rule: rule2:  -> Father(jens,xiomara);
	private static ResourceIterator<FatherRel> getChildren_1 (final DerivationController _derivation ,  final Person father ) {
		
		_derivation.log("Father.rule2", DerivationController.RULE, _annotations_rule2);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule2:  -> Father(jens,xiomara);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person jens = FatherRelInstances.jens;
			private test.org.mandarax.compiler.Person xiomara = FatherRelInstances.xiomara;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,jens); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.jens,_bindings.xiomara));
        
		
		
		
	

	}
	// rule: rule3:  -> Father(klaus,jens);
	private static ResourceIterator<FatherRel> getChildren_2 (final DerivationController _derivation ,  final Person father ) {
		
		_derivation.log("Father.rule3", DerivationController.RULE, _annotations_rule3);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule3:  -> Father(klaus,jens);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person klaus = FatherRelInstances.klaus;
			private test.org.mandarax.compiler.Person jens = FatherRelInstances.jens;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,klaus); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.klaus,_bindings.jens));
        
		
		
		
	

	}
	// rule: rule4:  -> Father(otto,klaus);
	private static ResourceIterator<FatherRel> getChildren_3 (final DerivationController _derivation ,  final Person father ) {
		
		_derivation.log("Father.rule4", DerivationController.RULE, _annotations_rule4);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule4:  -> Father(otto,klaus);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person otto = FatherRelInstances.otto;
			private test.org.mandarax.compiler.Person klaus = FatherRelInstances.klaus;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,otto); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.otto,_bindings.klaus));
        
		
		
		
	

	}
	// query: getFatherAndChild
	// rule: rule1:  -> Father(jens,maxd);
	private static ResourceIterator<FatherRel> getFatherAndChild_0 (final DerivationController _derivation  ) {
		
		_derivation.log("Father.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule1:  -> Father(jens,maxd);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person jens = FatherRelInstances.jens;
			private test.org.mandarax.compiler.Person maxd = FatherRelInstances.maxd;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.jens,_bindings.maxd));
        
		
		
		
	

	}
	// rule: rule2:  -> Father(jens,xiomara);
	private static ResourceIterator<FatherRel> getFatherAndChild_1 (final DerivationController _derivation  ) {
		
		_derivation.log("Father.rule2", DerivationController.RULE, _annotations_rule2);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule2:  -> Father(jens,xiomara);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person jens = FatherRelInstances.jens;
			private test.org.mandarax.compiler.Person xiomara = FatherRelInstances.xiomara;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.jens,_bindings.xiomara));
        
		
		
		
	

	}
	// rule: rule3:  -> Father(klaus,jens);
	private static ResourceIterator<FatherRel> getFatherAndChild_2 (final DerivationController _derivation  ) {
		
		_derivation.log("Father.rule3", DerivationController.RULE, _annotations_rule3);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule3:  -> Father(klaus,jens);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person klaus = FatherRelInstances.klaus;
			private test.org.mandarax.compiler.Person jens = FatherRelInstances.jens;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.klaus,_bindings.jens));
        
		
		
		
	

	}
	// rule: rule4:  -> Father(otto,klaus);
	private static ResourceIterator<FatherRel> getFatherAndChild_3 (final DerivationController _derivation  ) {
		
		_derivation.log("Father.rule4", DerivationController.RULE, _annotations_rule4);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule4:  -> Father(otto,klaus);
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.Person otto = FatherRelInstances.otto;
			private test.org.mandarax.compiler.Person klaus = FatherRelInstances.klaus;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel(_bindings.otto,_bindings.klaus));
        
		
		
		
	

	}
	
	
	// methods representing aggregation functions
	
	
}


