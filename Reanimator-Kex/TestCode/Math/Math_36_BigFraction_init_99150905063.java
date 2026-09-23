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

public class BigFraction_init_99150905063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74;
     Object term76;
     Object term4131;

    public BigFraction_init_99150905063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74 = new Long(6375119433582206027L);
        term76 = new Long(-8257434502486459194L);
        term4131 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term4132 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4133 = (int[]) newIntArray(2);
        Object term4134 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4135 = (int[]) newIntArray(2);
        setIntField(term4132, term4132.getClass(), "signum", -1);
        setIntElement(term4133, 0, 1484323161);
        setIntElement(term4133, 1, 391863371);
        setField(term4132, term4132.getClass(), "mag", term4133);
        setIntField(term4132, term4132.getClass(), "bitCountPlusOne", 0);
        setIntField(term4132, term4132.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4132, term4132.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4132, term4132.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4131, term4131.getClass(), "numerator", term4132);
        setIntField(term4134, term4134.getClass(), "signum", 1);
        setIntElement(term4135, 0, 1922583790);
        setIntElement(term4135, 1, 616727354);
        setField(term4134, term4134.getClass(), "mag", term4135);
        setIntField(term4134, term4134.getClass(), "bitCountPlusOne", 0);
        setIntField(term4134, term4134.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4134, term4134.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4134, term4134.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4131, term4131.getClass(), "denominator", term4134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term74;
        args[1] = term76;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4131));
        assertTrue(recursiveEquals(term74, 6375119433582206027L));
        assertTrue(recursiveEquals(term76, -8257434502486459194L));
    }

};


