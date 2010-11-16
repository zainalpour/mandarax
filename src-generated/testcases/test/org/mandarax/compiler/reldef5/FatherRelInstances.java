package test.org.mandarax.compiler.reldef5;
 
import test.org.mandarax.compiler.Person;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>Father</strong>.
 * @version Nov 17, 2010 10:34:19 AM 
 */
public class FatherRelInstances {
	// object references
	
	
	// fields representing annotations
	
	// rule: rule1:  -> Father("Jens","Max");
	private final static java.util.Properties _annotations_rule1 = new java.util.Properties();
	
	// rule: rule2:  -> Father("Jens","Xiomara");
	private final static java.util.Properties _annotations_rule2 = new java.util.Properties();
	
	// rule: rule3:  -> Father("Klaus","Jens");
	private final static java.util.Properties _annotations_rule3 = new java.util.Properties();
	
	// rule: rule4:  -> Father("Otto","Klaus");
	private final static java.util.Properties _annotations_rule4 = new java.util.Properties();
	
	
	// initialise annotations
	static {
		// relationship annotations for rule  rule1:  -> Father("Jens","Max");
		
		// rule annotations for rule  rule1:  -> Father("Jens","Max");
		
		
	
		// relationship annotations for rule  rule2:  -> Father("Jens","Xiomara");
		
		// rule annotations for rule  rule2:  -> Father("Jens","Xiomara");
		
		
	
		// relationship annotations for rule  rule3:  -> Father("Klaus","Jens");
		
		// rule annotations for rule  rule3:  -> Father("Klaus","Jens");
		
		
	
		// relationship annotations for rule  rule4:  -> Father("Otto","Klaus");
		
		// rule annotations for rule  rule4:  -> Father("Otto","Klaus");
		
		
	}
		
	

	// interface generated for queries	
	 
	public static ResultSet<FatherRel> getFather (  String child  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<FatherRel>(getFather ( _derivation ,  child ),_derivation);
	} 
	 
	public static ResultSet<FatherRel> isFather (  String father ,  String child  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<FatherRel>(isFather ( _derivation ,  father ,  child ),_derivation);
	} 
	 
	public static ResultSet<FatherRel> getChildren (  String father  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<FatherRel>(getChildren ( _derivation ,  father ),_derivation);
	} 
	 
	public static ResultSet<FatherRel> getFatherAndChild (  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<FatherRel>(getFatherAndChild ( _derivation  ),_derivation);
	} 
	
	
	// implementations - these methods are referenced by code generated from other rules in this package
	// and therefore kept static 
	 
	static ResourceIterator<FatherRel> getFather ( final DerivationController _derivation ,  final String child  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FatherRel>(4) {
			
			public ResourceIterator<FatherRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke rule1:  -> Father("Jens","Max");
                			return getFather_0(_derivation.pop(_derivationlevel) ,  child );
                		}
				
                		case 1: {
                			// invoke rule2:  -> Father("Jens","Xiomara");
                			return getFather_1(_derivation.pop(_derivationlevel) ,  child );
                		}
				
                		case 2: {
                			// invoke rule3:  -> Father("Klaus","Jens");
                			return getFather_2(_derivation.pop(_derivationlevel) ,  child );
                		}
				
                		case 3: {
                			// invoke rule4:  -> Father("Otto","Klaus");
                			return getFather_3(_derivation.pop(_derivationlevel) ,  child );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	 
	static ResourceIterator<FatherRel> isFather ( final DerivationController _derivation ,  final String father ,  final String child  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FatherRel>(4) {
			
			public ResourceIterator<FatherRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke rule1:  -> Father("Jens","Max");
                			return isFather_0(_derivation.pop(_derivationlevel) ,  father ,  child );
                		}
				
                		case 1: {
                			// invoke rule2:  -> Father("Jens","Xiomara");
                			return isFather_1(_derivation.pop(_derivationlevel) ,  father ,  child );
                		}
				
                		case 2: {
                			// invoke rule3:  -> Father("Klaus","Jens");
                			return isFather_2(_derivation.pop(_derivationlevel) ,  father ,  child );
                		}
				
                		case 3: {
                			// invoke rule4:  -> Father("Otto","Klaus");
                			return isFather_3(_derivation.pop(_derivationlevel) ,  father ,  child );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	 
	static ResourceIterator<FatherRel> getChildren ( final DerivationController _derivation ,  final String father  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FatherRel>(4) {
			
			public ResourceIterator<FatherRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke rule1:  -> Father("Jens","Max");
                			return getChildren_0(_derivation.pop(_derivationlevel) ,  father );
                		}
				
                		case 1: {
                			// invoke rule2:  -> Father("Jens","Xiomara");
                			return getChildren_1(_derivation.pop(_derivationlevel) ,  father );
                		}
				
                		case 2: {
                			// invoke rule3:  -> Father("Klaus","Jens");
                			return getChildren_2(_derivation.pop(_derivationlevel) ,  father );
                		}
				
                		case 3: {
                			// invoke rule4:  -> Father("Otto","Klaus");
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
                			// invoke rule1:  -> Father("Jens","Max");
                			return getFatherAndChild_0(_derivation.pop(_derivationlevel)  );
                		}
				
                		case 1: {
                			// invoke rule2:  -> Father("Jens","Xiomara");
                			return getFatherAndChild_1(_derivation.pop(_derivationlevel)  );
                		}
				
                		case 2: {
                			// invoke rule3:  -> Father("Klaus","Jens");
                			return getFatherAndChild_2(_derivation.pop(_derivationlevel)  );
                		}
				
                		case 3: {
                			// invoke rule4:  -> Father("Otto","Klaus");
                			return getFatherAndChild_3(_derivation.pop(_derivationlevel)  );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	
	
	
	// private methods - each method represents the invocation of a single rule for a certain query
	// query: getFather
	// rule: rule1:  -> Father("Jens","Max");
	private static ResourceIterator<FatherRel> getFather_0 (final DerivationController _derivation ,  final String child ) {
		
		_derivation.log("Father.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule1:  -> Father("Jens","Max");
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(child,"Max"); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel("Jens","Max"));
        
		
		
		
	

	}
	// rule: rule2:  -> Father("Jens","Xiomara");
	private static ResourceIterator<FatherRel> getFather_1 (final DerivationController _derivation ,  final String child ) {
		
		_derivation.log("Father.rule2", DerivationController.RULE, _annotations_rule2);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule2:  -> Father("Jens","Xiomara");
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(child,"Xiomara"); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel("Jens","Xiomara"));
        
		
		
		
	

	}
	// rule: rule3:  -> Father("Klaus","Jens");
	private static ResourceIterator<FatherRel> getFather_2 (final DerivationController _derivation ,  final String child ) {
		
		_derivation.log("Father.rule3", DerivationController.RULE, _annotations_rule3);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule3:  -> Father("Klaus","Jens");
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(child,"Jens"); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel("Klaus","Jens"));
        
		
		
		
	

	}
	// rule: rule4:  -> Father("Otto","Klaus");
	private static ResourceIterator<FatherRel> getFather_3 (final DerivationController _derivation ,  final String child ) {
		
		_derivation.log("Father.rule4", DerivationController.RULE, _annotations_rule4);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule4:  -> Father("Otto","Klaus");
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(child,"Klaus"); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel("Otto","Klaus"));
        
		
		
		
	

	}
	// query: isFather
	// rule: rule1:  -> Father("Jens","Max");
	private static ResourceIterator<FatherRel> isFather_0 (final DerivationController _derivation ,  final String father ,  final String child ) {
		
		_derivation.log("Father.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule1:  -> Father("Jens","Max");
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,"Jens"); 
		
		_checkfailed = _checkfailed || !Equals.compare(child,"Max"); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel("Jens","Max"));
        
		
		
		
	

	}
	// rule: rule2:  -> Father("Jens","Xiomara");
	private static ResourceIterator<FatherRel> isFather_1 (final DerivationController _derivation ,  final String father ,  final String child ) {
		
		_derivation.log("Father.rule2", DerivationController.RULE, _annotations_rule2);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule2:  -> Father("Jens","Xiomara");
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,"Jens"); 
		
		_checkfailed = _checkfailed || !Equals.compare(child,"Xiomara"); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel("Jens","Xiomara"));
        
		
		
		
	

	}
	// rule: rule3:  -> Father("Klaus","Jens");
	private static ResourceIterator<FatherRel> isFather_2 (final DerivationController _derivation ,  final String father ,  final String child ) {
		
		_derivation.log("Father.rule3", DerivationController.RULE, _annotations_rule3);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule3:  -> Father("Klaus","Jens");
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,"Klaus"); 
		
		_checkfailed = _checkfailed || !Equals.compare(child,"Jens"); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel("Klaus","Jens"));
        
		
		
		
	

	}
	// rule: rule4:  -> Father("Otto","Klaus");
	private static ResourceIterator<FatherRel> isFather_3 (final DerivationController _derivation ,  final String father ,  final String child ) {
		
		_derivation.log("Father.rule4", DerivationController.RULE, _annotations_rule4);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule4:  -> Father("Otto","Klaus");
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,"Otto"); 
		
		_checkfailed = _checkfailed || !Equals.compare(child,"Klaus"); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel("Otto","Klaus"));
        
		
		
		
	

	}
	// query: getChildren
	// rule: rule1:  -> Father("Jens","Max");
	private static ResourceIterator<FatherRel> getChildren_0 (final DerivationController _derivation ,  final String father ) {
		
		_derivation.log("Father.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule1:  -> Father("Jens","Max");
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,"Jens"); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel("Jens","Max"));
        
		
		
		
	

	}
	// rule: rule2:  -> Father("Jens","Xiomara");
	private static ResourceIterator<FatherRel> getChildren_1 (final DerivationController _derivation ,  final String father ) {
		
		_derivation.log("Father.rule2", DerivationController.RULE, _annotations_rule2);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule2:  -> Father("Jens","Xiomara");
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,"Jens"); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel("Jens","Xiomara"));
        
		
		
		
	

	}
	// rule: rule3:  -> Father("Klaus","Jens");
	private static ResourceIterator<FatherRel> getChildren_2 (final DerivationController _derivation ,  final String father ) {
		
		_derivation.log("Father.rule3", DerivationController.RULE, _annotations_rule3);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule3:  -> Father("Klaus","Jens");
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,"Klaus"); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel("Klaus","Jens"));
        
		
		
		
	

	}
	// rule: rule4:  -> Father("Otto","Klaus");
	private static ResourceIterator<FatherRel> getChildren_3 (final DerivationController _derivation ,  final String father ) {
		
		_derivation.log("Father.rule4", DerivationController.RULE, _annotations_rule4);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule4:  -> Father("Otto","Klaus");
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		 
		// check conditions	
		boolean _checkfailed = false;
		
		_checkfailed = _checkfailed || !Equals.compare(father,"Otto"); 
		
		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel("Otto","Klaus"));
        
		
		
		
	

	}
	// query: getFatherAndChild
	// rule: rule1:  -> Father("Jens","Max");
	private static ResourceIterator<FatherRel> getFatherAndChild_0 (final DerivationController _derivation  ) {
		
		_derivation.log("Father.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule1:  -> Father("Jens","Max");
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel("Jens","Max"));
        
		
		
		
	

	}
	// rule: rule2:  -> Father("Jens","Xiomara");
	private static ResourceIterator<FatherRel> getFatherAndChild_1 (final DerivationController _derivation  ) {
		
		_derivation.log("Father.rule2", DerivationController.RULE, _annotations_rule2);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule2:  -> Father("Jens","Xiomara");
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel("Jens","Xiomara"));
        
		
		
		
	

	}
	// rule: rule3:  -> Father("Klaus","Jens");
	private static ResourceIterator<FatherRel> getFatherAndChild_2 (final DerivationController _derivation  ) {
		
		_derivation.log("Father.rule3", DerivationController.RULE, _annotations_rule3);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule3:  -> Father("Klaus","Jens");
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel("Klaus","Jens"));
        
		
		
		
	

	}
	// rule: rule4:  -> Father("Otto","Klaus");
	private static ResourceIterator<FatherRel> getFatherAndChild_3 (final DerivationController _derivation  ) {
		
		_derivation.log("Father.rule4", DerivationController.RULE, _annotations_rule4);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule4:  -> Father("Otto","Klaus");
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FatherRel("Otto","Klaus"));
        
		
		
		
	

	}
	
	
	// methods representing aggregation functions
	
	
}


