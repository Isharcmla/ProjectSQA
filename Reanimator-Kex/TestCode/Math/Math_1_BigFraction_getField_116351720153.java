package org.apache.commons.math3.fraction;

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
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BigFraction_getField_116351720153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1643;

    public BigFraction_getField_116351720153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1643 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term1644 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1646 = (int[]) newIntArray(4);
        Object term1655 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1657 = (int[]) newIntArray(4);
        setIntField(term1644, term1644.getClass(), "signum", 1);
        setIntElement(term1646, 0, -1539919311);
        setIntElement(term1646, 1, -710206189);
        setIntElement(term1646, 2, -911476151);
        setIntElement(term1646, 3, 2049488230);
        setField(term1644, term1644.getClass(), "mag", term1646);
        setIntField(term1644, term1644.getClass(), "bitCountPlusOne", 0);
        setIntField(term1644, term1644.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1644, term1644.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1644, term1644.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1643, term1643.getClass(), "numerator", term1644);
        setIntField(term1655, term1655.getClass(), "signum", 1);
        setIntElement(term1657, 0, -725738039);
        setIntElement(term1657, 1, 1464188574);
        setIntElement(term1657, 2, 723690541);
        setIntElement(term1657, 3, -440566374);
        setField(term1655, term1655.getClass(), "mag", term1657);
        setIntField(term1655, term1655.getClass(), "bitCountPlusOne", 0);
        setIntField(term1655, term1655.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1655, term1655.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1655, term1655.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1643, term1643.getClass(), "denominator", term1655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getField", argTypes, term1643, args);
    }

};
