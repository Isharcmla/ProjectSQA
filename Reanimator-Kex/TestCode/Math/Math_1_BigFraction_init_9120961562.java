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
import java.lang.Long;
import java.lang.Object;

public class BigFraction_init_9120961562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term5901;

    public BigFraction_init_9120961562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = new Long(2442117782898005296L);
        term5901 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term5902 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5903 = (int[]) newIntArray(2);
        Object term5904 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5905 = (int[]) newIntArray(1);
        setIntField(term5902, term5902.getClass(), "signum", 1);
        setIntElement(term5903, 0, 568599855);
        setIntElement(term5903, 1, 1162663216);
        setField(term5902, term5902.getClass(), "mag", term5903);
        setIntField(term5902, term5902.getClass(), "bitCountPlusOne", 0);
        setIntField(term5902, term5902.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5902, term5902.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5902, term5902.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5901, term5901.getClass(), "numerator", term5902);
        setIntField(term5904, term5904.getClass(), "signum", 1);
        setIntElement(term5905, 0, 1);
        setField(term5904, term5904.getClass(), "mag", term5905);
        setIntField(term5904, term5904.getClass(), "bitCountPlusOne", 0);
        setIntField(term5904, term5904.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5904, term5904.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5904, term5904.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5901, term5901.getClass(), "denominator", term5904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term72;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5901));
        assertTrue(recursiveEquals(term72, 2442117782898005296L));
    }

};
