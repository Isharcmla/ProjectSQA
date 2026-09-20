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

public class BigFraction_toString_45424332252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1612;

    public BigFraction_toString_45424332252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1612 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term1613 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1615 = (int[]) newIntArray(4);
        Object term1624 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1626 = (int[]) newIntArray(4);
        setIntField(term1613, term1613.getClass(), "signum", 1);
        setIntElement(term1615, 0, 1365478879);
        setIntElement(term1615, 1, -446371438);
        setIntElement(term1615, 2, -777595675);
        setIntElement(term1615, 3, 2061813905);
        setField(term1613, term1613.getClass(), "mag", term1615);
        setIntField(term1613, term1613.getClass(), "bitCountPlusOne", 0);
        setIntField(term1613, term1613.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1613, term1613.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1613, term1613.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1612, term1612.getClass(), "numerator", term1613);
        setIntField(term1624, term1624.getClass(), "signum", 1);
        setIntElement(term1626, 0, -1113945521);
        setIntElement(term1626, 1, -383537098);
        setIntElement(term1626, 2, 434760750);
        setIntElement(term1626, 3, 1648360580);
        setField(term1624, term1624.getClass(), "mag", term1626);
        setIntField(term1624, term1624.getClass(), "bitCountPlusOne", 0);
        setIntField(term1624, term1624.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1624, term1624.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1624, term1624.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1612, term1612.getClass(), "denominator", term1624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1612, args);
    }

};
