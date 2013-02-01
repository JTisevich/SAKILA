/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TTriggersRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.TTriggersRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>, org.jooq.test.h2.generatedclasses.tables.interfaces.ITTriggers {

	private static final long serialVersionUID = 725392900;

	/**
	 * Setter for <code>PUBLIC.T_TRIGGERS.ID_GENERATED</code>. 
	 */
	@Override
	public void setIdGenerated(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TTriggers.ID_GENERATED, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_TRIGGERS.ID_GENERATED</code>. 
	 */
	@Override
	public java.lang.Integer getIdGenerated() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TTriggers.ID_GENERATED);
	}

	/**
	 * Setter for <code>PUBLIC.T_TRIGGERS.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TTriggers.ID, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_TRIGGERS.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TTriggers.ID);
	}

	/**
	 * Setter for <code>PUBLIC.T_TRIGGERS.COUNTER</code>. 
	 */
	@Override
	public void setCounter(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TTriggers.COUNTER, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_TRIGGERS.COUNTER</code>. 
	 */
	@Override
	public java.lang.Integer getCounter() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TTriggers.COUNTER);
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
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.h2.generatedclasses.tables.TTriggers.ID_GENERATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.h2.generatedclasses.tables.TTriggers.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.h2.generatedclasses.tables.TTriggers.COUNTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdGenerated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCounter();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.ITTriggers from) {
		setIdGenerated(from.getIdGenerated());
		setId(from.getId());
		setCounter(from.getCounter());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.ITTriggers> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TTriggersRecord
	 */
	public TTriggersRecord() {
		super(org.jooq.test.h2.generatedclasses.tables.TTriggers.T_TRIGGERS);
	}
}
