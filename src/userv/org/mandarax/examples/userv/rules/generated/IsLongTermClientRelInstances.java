package org.mandarax.examples.userv.rules.generated;

import org.mandarax.examples.userv.domain.*;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>IsLongTermClient</strong>.
 * Generated by org.mandarax.compiler.impl.DefaultCompiler.
 * 
 * @version Nov 22, 2010 2:53:26 PM
 */
public class IsLongTermClientRelInstances {
	// object references

	// fields representing annotations

	// rule: ES_08: (_client.getNumberOfYearsWithUServ())>=15 ->
	// IsLongTermClient(_client);
	private final static java.util.Properties _annotations_ES_08 = new java.util.Properties();

	static {
		// relationship annotations for rule ES_08:
		// (_client.getNumberOfYearsWithUServ())>=15 ->
		// IsLongTermClient(_client);
		_annotations_ES_08.put("category", "Eligibility Scoring Rule Set");
		_annotations_ES_08.put("author", "Jens Dietrich");
		_annotations_ES_08.put("lastupdated", "19/11/10");

		// rule annotations for rule ES_08:
		// (_client.getNumberOfYearsWithUServ())>=15 ->
		// IsLongTermClient(_client);
		_annotations_ES_08.put("description", "A long term client has maintained a UServ portfolio for 15 years");
	}

	// interface generated for queries
	public static ResultSet<IsLongTermClientRel> isLongTermClient(Driver client) {
		DerivationController _derivation = new DefaultDerivationController();

		return new ResultSet<IsLongTermClientRel>(isLongTermClient(_derivation, client), _derivation);
	}

	// implementations - these methods are referenced by code generated from
	// other rules in this package
	// and therefore kept static
	static ResourceIterator<IsLongTermClientRel> isLongTermClient(final DerivationController _derivation, final Driver client) {
		final int _derivationlevel = _derivation.size();

		return new IteratorChain<IsLongTermClientRel>(1) {
			public ResourceIterator<IsLongTermClientRel> getNextIterator(int pos) {
				switch (pos) {
				case 0:// invoke ES_08:
						// (_client.getNumberOfYearsWithUServ())>=15 ->
						// IsLongTermClient(_client);
					return isLongTermClient_0(_derivation.pop(_derivationlevel), client);

				default:
					return EmptyIterator.DEFAULT;
				}
			}
		};
	}

	// private methods - each method represents the invocation of a single rule
	// for a certain query
	// query: isLongTermClient
	// rule: ES_08: (_client.getNumberOfYearsWithUServ())>=15 ->
	// IsLongTermClient(_client);
	private static ResourceIterator<IsLongTermClientRel> isLongTermClient_0(final DerivationController _derivation, final Driver client) {
		_derivation.log("IsLongTermClient.ES_08", DerivationController.RULE, _annotations_ES_08);

		// utility class used to keep track of variables bindings
		// rule: ES_08: (_client.getNumberOfYearsWithUServ())>=15 ->
		// IsLongTermClient(_client);
		// prereqs: [(_client.getNumberOfYearsWithUServ())>=15]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Driver _client = client;
		}

		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// apply prerequisite (_client.getNumberOfYearsWithUServ())>=15

		// case 4
		if (!((_bindings._client.getNumberOfYearsWithUServ()) >= 15)) {
			return EmptyIterator.DEFAULT;
		}

		// rule head
		return new SingletonIterator(new IsLongTermClientRel(_bindings._client));
	}

	// methods representing aggregation functions
}
