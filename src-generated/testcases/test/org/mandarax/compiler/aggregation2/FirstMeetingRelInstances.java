package test.org.mandarax.compiler.aggregation2;
 
import java.util.*;
 
import test.org.mandarax.compiler.*;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>FirstMeeting</strong>.
 * Generated by org.mandarax.compiler.impl.DefaultCompiler.
 * @version Nov 21, 2010 9:48:24 PM 
 */
public class FirstMeetingRelInstances {
	// object references
	
	
	// fields representing annotations
	
	// rule: rule1:  -> FirstMeeting(v,min t in Meeting(v,t));
	private final static java.util.Properties _annotations_rule1 = new java.util.Properties();
	
	
	// initialise annotations
	static {
		// relationship annotations for rule  rule1:  -> FirstMeeting(v,min t in Meeting(v,t));
		
		// rule annotations for rule  rule1:  -> FirstMeeting(v,min t in Meeting(v,t));
		
		
	}
		
	

	// interface generated for queries	
	 
	public static ResultSet<FirstMeetingRel> getFirstMeeting (  String venue  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<FirstMeetingRel>(getFirstMeeting ( _derivation ,  venue ),_derivation);
	} 
	
	
	// implementations - these methods are referenced by code generated from other rules in this package
	// and therefore kept static 
	 
	static ResourceIterator<FirstMeetingRel> getFirstMeeting ( final DerivationController _derivation ,  final String venue  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FirstMeetingRel>(1) {
			
			public ResourceIterator<FirstMeetingRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke rule1:  -> FirstMeeting(v,min t in Meeting(v,t));
                			return getFirstMeeting_0(_derivation.pop(_derivationlevel) ,  venue );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	
	
	
	// private methods - each method represents the invocation of a single rule for a certain query
	// query: getFirstMeeting
	// rule: rule1:  -> FirstMeeting(v,min t in Meeting(v,t));
	private static ResourceIterator<FirstMeetingRel> getFirstMeeting_0 (final DerivationController _derivation ,  final String venue ) {
		
		_derivation.log("FirstMeeting.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		// rule: rule1:  -> FirstMeeting(v,_min_0(MeetingRelInstances.getMeetings(v)));
		// prereqs: []
		class _Bindings {
			private java.lang.String v = venue;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;
		
		 
		
		
		
		
		

		
		
		// rule head
		
		return new SingletonIterator(new FirstMeetingRel(_bindings.v,_min_0(MeetingRelInstances.getMeetings(_bindings.v))));
        
		
		
		
	

	}
	
	
	// methods representing aggregation functions
	 
	
	
	
	// agg _min_0(MeetingRelInstances.getMeetings(v)) type is min
	 	static java.util.Calendar _min_0 (ResourceIterator<MeetingRel> _rel) {
		java.util.Calendar _v = null ;
		boolean f = true;
		while (_rel.hasNext()) {
		    MeetingRel _c = _rel.next();
		    if (f) {
		    	 _v = _c.time;
		    	
		    	f = false;
		    }
		    else {
				 if (_c.time.compareTo(_v)<0) {_v = _c.time;}
				
			}
		}
		_rel.close();
		return _v;
	}
	
	
	

	
	
	
}


