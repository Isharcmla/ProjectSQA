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

public class BigFraction_getDenominatorAsLong_113288535183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term778;
     Object term9353;

    public BigFraction_getDenominatorAsLong_113288535183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term778 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
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
        term9353 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term9354 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9355 = (int[]) newIntArray(4);
        Object term9356 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9357 = (int[]) newIntArray(4);
        setIntField(term9354, term9354.getClass(), "signum", 1);
        setIntElement(term9355, 0, -1279951573);
        setIntElement(term9355, 1, -201009402);
        setIntElement(term9355, 2, 974558052);
        setIntElement(term9355, 3, 214162466);
        setField(term9354, term9354.getClass(), "mag", term9355);
        setIntField(term9354, term9354.getClass(), "bitCountPlusOne", 0);
        setIntField(term9354, term9354.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9354, term9354.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9354, term9354.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9353, term9353.getClass(), "numerator", term9354);
        setIntField(term9356, term9356.getClass(), "signum", 1);
        setIntElement(term9357, 0, 1337565981);
        setIntElement(term9357, 1, -50935154);
        setIntElement(term9357, 2, -442381425);
        setIntElement(term9357, 3, 2025714091);
        setField(term9356, term9356.getClass(), "mag", term9357);
        setIntField(term9356, term9356.getClass(), "bitCountPlusOne", 0);
        setIntField(term9356, term9356.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9356, term9356.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9356, term9356.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9353, term9353.getClass(), "denominator", term9356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDenominatorAsLong", argTypes, term778, args);
        assertTrue(recursiveEquals(term778, term9353));
        assertTrue(recursiveEquals(retValue, -1900013750707162709L));
    }

};
