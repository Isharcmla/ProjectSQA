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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.fraction.EqualityUtils.*;
import java.lang.Object;

public class BigFraction_getDenominatorAsLong_23249558283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term778;
     Object term7471;

    public BigFraction_getDenominatorAsLong_23249558283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term778 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term779 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term781 = (int[]) newIntArray(4);
        Object term790 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term792 = (int[]) newIntArray(4);
        setIntField(term779, term779.getClass(), "signum", 1);
        setIntElement(term781, 0, -1279951573);
        setIntElement(term781, 1, -201009402);
        setIntElement(term781, 2, 974558052);
        setIntElement(term781, 3, 214162466);
        setField(term779, term779.getClass(), "mag", term781);
        setIntField(term779, term779.getClass(), "bitCountPlusOne", 0);
        setIntField(term779, term779.getClass(), "bitLengthPlusOne", 0);
        setIntField(term779, term779.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term779, term779.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term778, term778.getClass(), "numerator", term779);
        setIntField(term790, term790.getClass(), "signum", 1);
        setIntElement(term792, 0, 1337565981);
        setIntElement(term792, 1, -50935154);
        setIntElement(term792, 2, -442381425);
        setIntElement(term792, 3, 2025714091);
        setField(term790, term790.getClass(), "mag", term792);
        setIntField(term790, term790.getClass(), "bitCountPlusOne", 0);
        setIntField(term790, term790.getClass(), "bitLengthPlusOne", 0);
        setIntField(term790, term790.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term790, term790.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term778, term778.getClass(), "denominator", term790);
        term7471 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term7472 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7473 = (int[]) newIntArray(4);
        Object term7474 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7475 = (int[]) newIntArray(4);
        setIntField(term7472, term7472.getClass(), "signum", 1);
        setIntElement(term7473, 0, -1279951573);
        setIntElement(term7473, 1, -201009402);
        setIntElement(term7473, 2, 974558052);
        setIntElement(term7473, 3, 214162466);
        setField(term7472, term7472.getClass(), "mag", term7473);
        setIntField(term7472, term7472.getClass(), "bitCountPlusOne", 0);
        setIntField(term7472, term7472.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7472, term7472.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7472, term7472.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7471, term7471.getClass(), "numerator", term7472);
        setIntField(term7474, term7474.getClass(), "signum", 1);
        setIntElement(term7475, 0, 1337565981);
        setIntElement(term7475, 1, -50935154);
        setIntElement(term7475, 2, -442381425);
        setIntElement(term7475, 3, 2025714091);
        setField(term7474, term7474.getClass(), "mag", term7475);
        setIntField(term7474, term7474.getClass(), "bitCountPlusOne", 0);
        setIntField(term7474, term7474.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7474, term7474.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7474, term7474.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7471, term7471.getClass(), "denominator", term7474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDenominatorAsLong", argTypes, term778, args);
        assertTrue(recursiveEquals(term778, term7471));
        assertTrue(recursiveEquals(retValue, -1900013750707162709L));
    }

};


