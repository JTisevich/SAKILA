/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_64_69Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_64_69Record> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer>, org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_64_69 {

	private static final long serialVersionUID = -1964426963;

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_64_69.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.ID, value);
	}

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_64_69.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.ID);
	}

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_64_69.UNUSED_ID</code>. 
	 */
	@Override
	public void setUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.UNUSED_ID, value);
	}

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_64_69.UNUSED_ID</code>. 
	 */
	@Override
	public java.lang.Integer getUnusedId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.UNUSED_ID);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.UNUSED_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getUnusedId();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_64_69 from) {
		setId(from.getId());
		setUnusedId(from.getUnusedId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_64_69> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record() {
		super(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}
}
