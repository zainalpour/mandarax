package org.mandarax.examples.userv.rules.generated;

import org.mandarax.examples.userv.domain.*;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>IsEligible</strong>. Generated
 * by org.mandarax.compiler.impl.DefaultCompiler.
 * 
 * @version Nov 22, 2010 2:53:26 PM
 */
public class IsEligibleRelInstances {
	// object references

	// fields representing annotations

	// rule: DE_DAC03: DriverCategory(_driver,"young driver") &
	// HasTrainingCertification(_driver) -> IsEligible(_driver);
	private final static java.util.Properties _annotations_DE_DAC03 = new java.util.Properties();

	// rule: DE_DAC05: DriverCategory(_driver,"senior driver") &
	// HasTrainingCertification(_driver) -> IsEligible(_driver);
	private final static java.util.Properties _annotations_DE_DAC05 = new java.util.Properties();

	// rule: DE_DAC06: not DriverCategory(_driver,"senior driver") & not
	// DriverCategory(_driver,"young driver") -> IsEligible(_driver);
	private final static java.util.Properties _annotations_DE_DAC06 = new java.util.Properties();

	static {
		// relationship annotations for rule DE_DAC03:
		// DriverCategory(_driver,"young driver") &
		// HasTrainingCertification(_driver) -> IsEligible(_driver);
		_annotations_DE_DAC03.put("category", "Driver Eligibility Rule Set");
		_annotations_DE_DAC03.put("author", "Jens Dietrich");
		_annotations_DE_DAC03.put("lastupdated", "19/11/10");

		// rule annotations for rule DE_DAC03:
		// DriverCategory(_driver,"young driver") &
		// HasTrainingCertification(_driver) -> IsEligible(_driver);
		_annotations_DE_DAC03.put("description", "If young driver and driver has training certification, then eligible driver");

		// relationship annotations for rule DE_DAC05:
		// DriverCategory(_driver,"senior driver") &
		// HasTrainingCertification(_driver) -> IsEligible(_driver);
		_annotations_DE_DAC05.put("category", "Driver Eligibility Rule Set");
		_annotations_DE_DAC05.put("author", "Jens Dietrich");
		_annotations_DE_DAC05.put("lastupdated", "19/11/10");

		// rule annotations for rule DE_DAC05:
		// DriverCategory(_driver,"senior driver") &
		// HasTrainingCertification(_driver) -> IsEligible(_driver);
		_annotations_DE_DAC05.put("description", "If senior driver and driver has training certification, then eligible driver");

		// relationship annotations for rule DE_DAC06: not
		// DriverCategory(_driver,"senior driver") & not
		// DriverCategory(_driver,"young driver") -> IsEligible(_driver);
		_annotations_DE_DAC06.put("category", "Driver Eligibility Rule Set");
		_annotations_DE_DAC06.put("author", "Jens Dietrich");
		_annotations_DE_DAC06.put("lastupdated", "19/11/10");

		// rule annotations for rule DE_DAC06: not
		// DriverCategory(_driver,"senior driver") & not
		// DriverCategory(_driver,"young driver") -> IsEligible(_driver);
	}

	// interface generated for queries
	public static ResultSet<IsEligibleRel> isEligible(Driver driver) {
		DerivationController _derivation = new DefaultDerivationController();

		return new ResultSet<IsEligibleRel>(isEligible(_derivation, driver), _derivation);
	}

	// implementations - these methods are referenced by code generated from
	// other rules in this package
	// and therefore kept static
	static ResourceIterator<IsEligibleRel> isEligible(final DerivationController _derivation, final Driver driver) {
		final int _derivationlevel = _derivation.size();

		return new IteratorChain<IsEligibleRel>(3) {
			public ResourceIterator<IsEligibleRel> getNextIterator(int pos) {
				switch (pos) {
				case 0:// invoke DE_DAC03:
						// DriverCategory(_driver,"young driver") &
						// HasTrainingCertification(_driver) ->
						// IsEligible(_driver);
					return isEligible_0(_derivation.pop(_derivationlevel), driver);

				case 1:// invoke DE_DAC05:
						// DriverCategory(_driver,"senior driver") &
						// HasTrainingCertification(_driver) ->
						// IsEligible(_driver);
					return isEligible_1(_derivation.pop(_derivationlevel), driver);

				case 2:// invoke DE_DAC06: not
						// DriverCategory(_driver,"senior driver") & not
						// DriverCategory(_driver,"young driver") ->
						// IsEligible(_driver);
					return isEligible_2(_derivation.pop(_derivationlevel), driver);

				default:
					return EmptyIterator.DEFAULT;
				}
			}
		};
	}

	// private methods - each method represents the invocation of a single rule
	// for a certain query
	// query: isEligible
	// rule: DE_DAC03: DriverCategory(_driver,"young driver") &
	// HasTrainingCertification(_driver) -> IsEligible(_driver);
	private static ResourceIterator<IsEligibleRel> isEligible_0(final DerivationController _derivation, final Driver driver) {
		_derivation.log("IsEligible.DE_DAC03", DerivationController.RULE, _annotations_DE_DAC03);

		// utility class used to keep track of variables bindings
		// rule: DE_DAC03: DriverCategory(_driver,"young driver") &
		// HasTrainingCertification(_driver) -> IsEligible(_driver);
		// prereqs: [DriverCategory(_driver,"young driver"),
		// HasTrainingCertification(_driver)]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Driver _driver = driver;
		}

		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// apply prerequisite DriverCategory(_driver,"young driver")

		// case 4
		_tmp = DriverCategoryRelInstances.hasCategory(_derivation.push(), _bindings._driver, "young driver");

		if (!_tmp.hasNext()) {
			_tmp.close();

			return EmptyIterator.DEFAULT;
		}

		// apply prerequisite HasTrainingCertification(_driver)

		// case 4
		_tmp = HasTrainingCertificationRelInstances.hasDertification(_derivation.push(), _bindings._driver);

		if (!_tmp.hasNext()) {
			_tmp.close();

			return EmptyIterator.DEFAULT;
		}

		// rule head
		return new SingletonIterator(new IsEligibleRel(_bindings._driver));
	}

	// rule: DE_DAC05: DriverCategory(_driver,"senior driver") &
	// HasTrainingCertification(_driver) -> IsEligible(_driver);
	private static ResourceIterator<IsEligibleRel> isEligible_1(final DerivationController _derivation, final Driver driver) {
		_derivation.log("IsEligible.DE_DAC05", DerivationController.RULE, _annotations_DE_DAC05);

		// utility class used to keep track of variables bindings
		// rule: DE_DAC05: DriverCategory(_driver,"senior driver") &
		// HasTrainingCertification(_driver) -> IsEligible(_driver);
		// prereqs: [DriverCategory(_driver,"senior driver"),
		// HasTrainingCertification(_driver)]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Driver _driver = driver;
		}

		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// apply prerequisite DriverCategory(_driver,"senior driver")

		// case 4
		_tmp = DriverCategoryRelInstances.hasCategory(_derivation.push(), _bindings._driver, "senior driver");

		if (!_tmp.hasNext()) {
			_tmp.close();

			return EmptyIterator.DEFAULT;
		}

		// apply prerequisite HasTrainingCertification(_driver)

		// case 4
		_tmp = HasTrainingCertificationRelInstances.hasDertification(_derivation.push(), _bindings._driver);

		if (!_tmp.hasNext()) {
			_tmp.close();

			return EmptyIterator.DEFAULT;
		}

		// rule head
		return new SingletonIterator(new IsEligibleRel(_bindings._driver));
	}

	// rule: DE_DAC06: not DriverCategory(_driver,"senior driver") & not
	// DriverCategory(_driver,"young driver") -> IsEligible(_driver);
	private static ResourceIterator<IsEligibleRel> isEligible_2(final DerivationController _derivation, final Driver driver) {
		_derivation.log("IsEligible.DE_DAC06", DerivationController.RULE, _annotations_DE_DAC06);

		// utility class used to keep track of variables bindings
		// rule: DE_DAC06: not DriverCategory(_driver,"senior driver") & not
		// DriverCategory(_driver,"young driver") -> IsEligible(_driver);
		// prereqs: [not DriverCategory(_driver,"senior driver"), not
		// DriverCategory(_driver,"young driver")]
		class _Bindings {
			private org.mandarax.examples.userv.domain.Driver _driver = driver;
		}

		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// apply prerequisite not DriverCategory(_driver,"senior driver")

		// case 4
		_tmp = DriverCategoryRelInstances.hasCategory(_derivation.push(), _bindings._driver, "senior driver");

		if (_tmp.hasNext()) {
			_tmp.close();

			return EmptyIterator.DEFAULT;
		}

		// apply prerequisite not DriverCategory(_driver,"young driver")

		// case 4
		_tmp = DriverCategoryRelInstances.hasCategory(_derivation.push(), _bindings._driver, "young driver");

		if (_tmp.hasNext()) {
			_tmp.close();

			return EmptyIterator.DEFAULT;
		}

		// rule head
		return new SingletonIterator(new IsEligibleRel(_bindings._driver));
	}

	// methods representing aggregation functions
}
