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

public class BigFraction_getNumeratorAsLong_69737650286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term871;
     Object term9491;

    public BigFraction_getNumeratorAsLong_69737650286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term871 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term872 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term874 = (int[]) newIntArray(4);
        Object term883 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term885 = (int[]) newIntArray(4);
        setIntField(term872, term872.getClass(), "signum", 1);
        setIntElement(term874, 0, 1028631840);
        setIntElement(term874, 1, -1509536045);
        setIntElement(term874, 2, -439420060);
        setIntElement(term874, 3, 2006509111);
        setField(term872, term872.getClass(), "mag", term874);
        setIntField(term872, term872.getClass(), "bitCountPlusOne", 0);
        setIntField(term872, term872.getClass(), "bitLengthPlusOne", 0);
        setIntField(term872, term872.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term872, term872.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term871, term871.getClass(), "numerator", term872);
        setIntField(term883, term883.getClass(), "signum", 1);
        setIntElement(term885, 0, -2096734519);
        setIntElement(term885, 1, 1690368128);
        setIntElement(term885, 2, -664560);
        setIntElement(term885, 3, -2119859660);
        setField(term883, term883.getClass(), "mag", term885);
        setIntField(term883, term883.getClass(), "bitCountPlusOne", 0);
        setIntField(term883, term883.getClass(), "bitLengthPlusOne", 0);
        setIntField(term883, term883.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term883, term883.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term871, term871.getClass(), "denominator", term883);
        term9491 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term9492 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9493 = (int[]) newIntArray(4);
        Object term9494 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9495 = (int[]) newIntArray(4);
        setIntField(term9492, term9492.getClass(), "signum", 1);
        setIntElement(term9493, 0, 1028631840);
        setIntElement(term9493, 1, -1509536045);
        setIntElement(term9493, 2, -439420060);
        setIntElement(term9493, 3, 2006509111);
        setField(term9492, term9492.getClass(), "mag", term9493);
        setIntField(term9492, term9492.getClass(), "bitCountPlusOne", 0);
        setIntField(term9492, term9492.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9492, term9492.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9492, term9492.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9491, term9491.getClass(), "numerator", term9492);
        setIntField(term9494, term9494.getClass(), "signum", 1);
        setIntElement(term9495, 0, -2096734519);
        setIntElement(term9495, 1, 1690368128);
        setIntElement(term9495, 2, -664560);
        setIntElement(term9495, 3, -2119859660);
        setField(term9494, term9494.getClass(), "mag", term9495);
        setIntField(term9494, term9494.getClass(), "bitCountPlusOne", 0);
        setIntField(term9494, term9494.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9494, term9494.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9494, term9494.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9491, term9491.getClass(), "denominator", term9494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumeratorAsLong", argTypes, term871, args);
        assertTrue(recursiveEquals(term871, term9491));
        assertTrue(recursiveEquals(retValue, -1887294784899848649L));
    }

};
