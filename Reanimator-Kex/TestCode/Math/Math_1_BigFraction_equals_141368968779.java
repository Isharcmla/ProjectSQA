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
import static org.apache.commons.math3.fraction.EqualityUtils.*;
import java.lang.Object;

public class BigFraction_equals_141368968779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653;
     Object term676;
     Object term9167;
     Object term9172;

    public BigFraction_equals_141368968779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term654 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term656 = (int[]) newIntArray(4);
        Object term665 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term667 = (int[]) newIntArray(4);
        setIntField(term654, term654.getClass(), "signum", 1);
        setIntElement(term656, 0, -92660371);
        setIntElement(term656, 1, 1806660338);
        setIntElement(term656, 2, -1813466624);
        setIntElement(term656, 3, 2057596020);
        setField(term654, term654.getClass(), "mag", term656);
        setIntField(term654, term654.getClass(), "bitCountPlusOne", 0);
        setIntField(term654, term654.getClass(), "bitLengthPlusOne", 0);
        setIntField(term654, term654.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term654, term654.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term653, term653.getClass(), "numerator", term654);
        setIntField(term665, term665.getClass(), "signum", 1);
        setIntElement(term667, 0, 1396472396);
        setIntElement(term667, 1, -2060859936);
        setIntElement(term667, 2, -1259907501);
        setIntElement(term667, 3, -1922979571);
        setField(term665, term665.getClass(), "mag", term667);
        setIntField(term665, term665.getClass(), "bitCountPlusOne", 0);
        setIntField(term665, term665.getClass(), "bitLengthPlusOne", 0);
        setIntField(term665, term665.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term665, term665.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term653, term653.getClass(), "denominator", term665);
        term676 = newInstance(Class.forName("java.lang.Object"));
        term9167 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term9168 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9169 = (int[]) newIntArray(4);
        Object term9170 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9171 = (int[]) newIntArray(4);
        setIntField(term9168, term9168.getClass(), "signum", 1);
        setIntElement(term9169, 0, -92660371);
        setIntElement(term9169, 1, 1806660338);
        setIntElement(term9169, 2, -1813466624);
        setIntElement(term9169, 3, 2057596020);
        setField(term9168, term9168.getClass(), "mag", term9169);
        setIntField(term9168, term9168.getClass(), "bitCountPlusOne", 0);
        setIntField(term9168, term9168.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9168, term9168.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9168, term9168.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9167, term9167.getClass(), "numerator", term9168);
        setIntField(term9170, term9170.getClass(), "signum", 1);
        setIntElement(term9171, 0, 1396472396);
        setIntElement(term9171, 1, -2060859936);
        setIntElement(term9171, 2, -1259907501);
        setIntElement(term9171, 3, -1922979571);
        setField(term9170, term9170.getClass(), "mag", term9171);
        setIntField(term9170, term9170.getClass(), "bitCountPlusOne", 0);
        setIntField(term9170, term9170.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9170, term9170.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9170, term9170.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9167, term9167.getClass(), "denominator", term9170);
        term9172 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term676;
        Object retValue = callMethod(klass, "equals", argTypes, term653, args);
        assertTrue(recursiveEquals(term653, term9167));
        assertTrue(recursiveEquals(term676, term9172));
        assertTrue(recursiveEquals(retValue, false));
    }

};
