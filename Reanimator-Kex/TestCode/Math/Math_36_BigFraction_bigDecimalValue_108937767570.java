package org.apache.commons.math.fraction;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.ArithmeticException;
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BigFraction_bigDecimalValue_108937767570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287;

    public BigFraction_bigDecimalValue_108937767570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term288 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term290 = (int[]) newIntArray(4);
        Object term299 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term301 = (int[]) newIntArray(4);
        setIntField(term288, term288.getClass(), "signum", 1);
        setIntElement(term290, 0, -2110912439);
        setIntElement(term290, 1, -1522472114);
        setIntElement(term290, 2, -1740681823);
        setIntElement(term290, 3, -1478790406);
        setField(term288, term288.getClass(), "mag", term290);
        setIntField(term288, term288.getClass(), "bitCountPlusOne", 0);
        setIntField(term288, term288.getClass(), "bitLengthPlusOne", 0);
        setIntField(term288, term288.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term288, term288.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term287, term287.getClass(), "numerator", term288);
        setIntField(term299, term299.getClass(), "signum", 1);
        setIntElement(term301, 0, 234112249);
        setIntElement(term301, 1, 753114167);
        setIntElement(term301, 2, -1046012143);
        setIntElement(term301, 3, 264659769);
        setField(term299, term299.getClass(), "mag", term301);
        setIntField(term299, term299.getClass(), "bitCountPlusOne", 0);
        setIntField(term299, term299.getClass(), "bitLengthPlusOne", 0);
        setIntField(term299, term299.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term299, term299.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term287, term287.getClass(), "denominator", term299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "bigDecimalValue", argTypes, term287, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


