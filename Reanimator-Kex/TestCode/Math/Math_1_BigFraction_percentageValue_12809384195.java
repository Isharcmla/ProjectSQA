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

public class BigFraction_percentageValue_12809384195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1200;
     Object term10813;

    public BigFraction_percentageValue_12809384195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1200 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term1201 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1203 = (int[]) newIntArray(4);
        Object term1212 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1214 = (int[]) newIntArray(4);
        setIntField(term1201, term1201.getClass(), "signum", 1);
        setIntElement(term1203, 0, 337439489);
        setIntElement(term1203, 1, -1901435799);
        setIntElement(term1203, 2, 1569107530);
        setIntElement(term1203, 3, -991806174);
        setField(term1201, term1201.getClass(), "mag", term1203);
        setIntField(term1201, term1201.getClass(), "bitCountPlusOne", 0);
        setIntField(term1201, term1201.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1201, term1201.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1201, term1201.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1200, term1200.getClass(), "numerator", term1201);
        setIntField(term1212, term1212.getClass(), "signum", 1);
        setIntElement(term1214, 0, -55083539);
        setIntElement(term1214, 1, 470099930);
        setIntElement(term1214, 2, 1579515075);
        setIntElement(term1214, 3, 8655869);
        setField(term1212, term1212.getClass(), "mag", term1214);
        setIntField(term1212, term1212.getClass(), "bitCountPlusOne", 0);
        setIntField(term1212, term1212.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1212, term1212.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1212, term1212.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1200, term1200.getClass(), "denominator", term1212);
        term10813 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term10814 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term10815 = (int[]) newIntArray(4);
        Object term10816 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term10817 = (int[]) newIntArray(4);
        setIntField(term10814, term10814.getClass(), "signum", 1);
        setIntElement(term10815, 0, 337439489);
        setIntElement(term10815, 1, -1901435799);
        setIntElement(term10815, 2, 1569107530);
        setIntElement(term10815, 3, -991806174);
        setField(term10814, term10814.getClass(), "mag", term10815);
        setIntField(term10814, term10814.getClass(), "bitCountPlusOne", 0);
        setIntField(term10814, term10814.getClass(), "bitLengthPlusOne", 0);
        setIntField(term10814, term10814.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term10814, term10814.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term10813, term10813.getClass(), "numerator", term10814);
        setIntField(term10816, term10816.getClass(), "signum", 1);
        setIntElement(term10817, 0, -55083539);
        setIntElement(term10817, 1, 470099930);
        setIntElement(term10817, 2, 1579515075);
        setIntElement(term10817, 3, 8655869);
        setField(term10816, term10816.getClass(), "mag", term10817);
        setIntField(term10816, term10816.getClass(), "bitCountPlusOne", 0);
        setIntField(term10816, term10816.getClass(), "bitLengthPlusOne", 0);
        setIntField(term10816, term10816.getClass(), "lowestSetBitPlusTwo", 2);
        setIntField(term10816, term10816.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term10813, term10813.getClass(), "denominator", term10816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "percentageValue", argTypes, term1200, args);
        assertTrue(recursiveEquals(term1200, term10813));
        assertTrue(recursiveEquals(retValue, 7.95869672114165));
    }

};
