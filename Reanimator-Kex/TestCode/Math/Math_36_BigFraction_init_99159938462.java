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
import java.lang.Long;
import java.lang.Object;

public class BigFraction_init_99159938462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term4024;

    public BigFraction_init_99159938462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = new Long(2442117782898005296L);
        term4024 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term4025 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4026 = (int[]) newIntArray(2);
        Object term4027 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4028 = (int[]) newIntArray(1);
        setIntField(term4025, term4025.getClass(), "signum", 1);
        setIntElement(term4026, 0, 568599855);
        setIntElement(term4026, 1, 1162663216);
        setField(term4025, term4025.getClass(), "mag", term4026);
        setIntField(term4025, term4025.getClass(), "bitCountPlusOne", 0);
        setIntField(term4025, term4025.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4025, term4025.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4025, term4025.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4024, term4024.getClass(), "numerator", term4025);
        setIntField(term4027, term4027.getClass(), "signum", 1);
        setIntElement(term4028, 0, 1);
        setField(term4027, term4027.getClass(), "mag", term4028);
        setIntField(term4027, term4027.getClass(), "bitCountPlusOne", 0);
        setIntField(term4027, term4027.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4027, term4027.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4027, term4027.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4024, term4024.getClass(), "denominator", term4027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term72;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4024));
        assertTrue(recursiveEquals(term72, 2442117782898005296L));
    }

};


