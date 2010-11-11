package test.org.mandarax.compiler.reldef7;
 
import test.org.mandarax.compiler.*;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>FrequentCustomer</strong>.
 * @version Nov 11, 2010 5:34:54 PM 
 */
public class FrequentCustomerRelInstances {
	// object references
	 
	public static test.org.mandarax.compiler.Discount goldDiscount = new test.org.mandarax.compiler.Discount(20,true);
	 
	public static test.org.mandarax.compiler.Discount silverDiscount = new test.org.mandarax.compiler.Discount(10,true);
	 
	public static test.org.mandarax.compiler.Discount specialDiscount = new test.org.mandarax.compiler.Discount(5,false);
	
	
	// fields representing annotations
	
	// rule: rule1: (c.getTransactionCount())>5 -> FrequentCustomer(c);
	private final static java.util.Properties _annotations_rule1 = new java.util.Properties();
	
	// rule: rule2: (c.getTransactionCount())>3 & (c.getTurnover())>500 -> FrequentCustomer(c);
	private final static java.util.Properties _annotations_rule2 = new java.util.Properties();
	
	
	// initialise annotations
	static {
		// relationship annotations for rule  rule1: (c.getTransactionCount())>5 -> FrequentCustomer(c);
		_annotations_rule1.put("author","jens");
		
		// rule annotations for rule  rule1: (c.getTransactionCount())>5 -> FrequentCustomer(c);
		
		
	
		// relationship annotations for rule  rule2: (c.getTransactionCount())>3 & (c.getTurnover())>500 -> FrequentCustomer(c);
		_annotations_rule2.put("author","jens");
		
		// rule annotations for rule  rule2: (c.getTransactionCount())>3 & (c.getTurnover())>500 -> FrequentCustomer(c);
		
		
	}
		
	

	// interface generated for queries	
	 
	public ResultSet<FrequentCustomerRel> isFrequentCustomer (  Customer customer  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<FrequentCustomerRel>(isFrequentCustomer ( _derivation ,  customer ),_derivation);
	} 
	
	
	// implementations - these methods are referenced by code generated from other rules in this package
	// and therefore kept static 
	 
	static ResourceIterator<FrequentCustomerRel> isFrequentCustomer ( final DerivationController _derivation ,  final Customer customer  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FrequentCustomerRel>(2) {
			
			public ResourceIterator<FrequentCustomerRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke rule1: (c.getTransactionCount())>5 -> FrequentCustomer(c);
                			return isFrequentCustomer_0(_derivation.pop(_derivationlevel) ,  customer );
                		}
				
                		case 1: {
                			// invoke rule2: (c.getTransactionCount())>3 & (c.getTurnover())>500 -> FrequentCustomer(c);
                			return isFrequentCustomer_1(_derivation.pop(_derivationlevel) ,  customer );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	
	
	
	// private methods - each method represents the invocation of a single rule for a certain query
	// query: isFrequentCustomer
	// rule: rule1: (c.getTransactionCount())>5 -> FrequentCustomer(c);
	private static ResourceIterator<FrequentCustomerRel> isFrequentCustomer_0 (final DerivationController _derivation ,  final Customer customer ) {
		
		_derivation.log("FrequentCustomer.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule1: (c.getTransactionCount())>5 -> FrequentCustomer(c);
		// prereqs: [(c.getTransactionCount())>5]
		class _Bindings {
			private test.org.mandarax.compiler.Customer c = customer;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		
		

		 
		
		
		
		// apply prerequisite (c.getTransactionCount())>5
		
		
		 // case 4
					if (!((_bindings.c.getTransactionCount())>5)) {return EmptyIterator.DEFAULT;} 
					
		
		
		// rule head
		
		return new SingletonIterator(new FrequentCustomerRel(_bindings.c));
        
		
		
		
	

	}
	// rule: rule2: (c.getTransactionCount())>3 & (c.getTurnover())>500 -> FrequentCustomer(c);
	private static ResourceIterator<FrequentCustomerRel> isFrequentCustomer_1 (final DerivationController _derivation ,  final Customer customer ) {
		
		_derivation.log("FrequentCustomer.rule2", DerivationController.RULE, _annotations_rule2);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule2: (c.getTransactionCount())>3 & (c.getTurnover())>500 -> FrequentCustomer(c);
		// prereqs: [(c.getTransactionCount())>3, (c.getTurnover())>500]
		class _Bindings {
			private test.org.mandarax.compiler.Customer c = customer;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		
		

		 
		
		
		
		// apply prerequisite (c.getTransactionCount())>3
		
		
		 // case 4
					if (!((_bindings.c.getTransactionCount())>3)) {return EmptyIterator.DEFAULT;} 
					
		 
		
		
		
		// apply prerequisite (c.getTurnover())>500
		
		
		 // case 4
					if (!((_bindings.c.getTurnover())>500)) {return EmptyIterator.DEFAULT;} 
					
		
		
		// rule head
		
		return new SingletonIterator(new FrequentCustomerRel(_bindings.c));
        
		
		
		
	

	}
	
	
}

