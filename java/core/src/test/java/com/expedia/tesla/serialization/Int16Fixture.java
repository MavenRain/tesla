/*******************************************************************************
 * Copyright (c) 2013, Expedia, Inc.
 *
 * Int16Fixture.java
 ******************************************************************************/
package com.expedia.tesla.serialization;

import static com.expedia.tesla.serialization.binary.BaseFixture.concat;

import java.util.Arrays;
import java.util.List;

/**
 * Test fixture values for Int16 tests.
 * 
 * @author dheld
 */
public interface Int16Fixture {
	static final short MIN_VALUE = Short.MIN_VALUE;
	static final byte[] MIN_BINARY = { -1, -1, 3 };
	static final String MIN_JSON = "-32768";
	static final short MAX_VALUE = Short.MAX_VALUE;
	static final byte[] MAX_BINARY = { -2, -1, 3 };
	static final String MAX_JSON = "32767";
	static final short NEGATIVE_VALUE = -42;
	static final byte[] NEGATIVE_BINARY = { 83 };
	static final String NEGATIVE_JSON = "-42";
	static final short POSITIVE_VALUE = 777;
	static final byte[] POSITIVE_BINARY = { -110, 12 };
	static final String POSITIVE_JSON = "777";
	static final byte[] OVERSIZE_BINARY = { -110, -120, 42 };
	static final List<Short> ARRAY_VALUES = Arrays.asList(MIN_VALUE, MAX_VALUE,
			NEGATIVE_VALUE, POSITIVE_VALUE);
	static final byte[] ARRAY_BINARY = concat((byte) ARRAY_VALUES.size(),
			MIN_BINARY, MAX_BINARY, NEGATIVE_BINARY, POSITIVE_BINARY);
	static final String ARRAY_JSON = '[' + MIN_JSON + ',' + MAX_JSON + ','
			+ NEGATIVE_JSON + ',' + POSITIVE_JSON + ']';
}
