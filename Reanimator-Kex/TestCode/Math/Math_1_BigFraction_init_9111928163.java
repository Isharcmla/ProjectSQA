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

public class BigFraction_init_9111928163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74;
     Object term76;
     Object term6008;

    public BigFraction_init_9111928163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74 = new Long(6375119433582206027L);
        term76 = new Long(-8257434502486459194L);
        term6008 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term6009 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6010 = (int[]) newIntArray(2);
        Object term6011 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6012 = (int[]) newIntArray(2);
        setIntField(term6009, term6009.getClass(), "signum", -1);
        setIntElement(term6010, 0, 1484323161);
        setIntElement(term6010, 1, 391863371);
        setField(term6009, term6009.getClass(), "mag", term6010);
        setIntField(term6009, term6009.getClass(), "bitCountPlusOne", 0);
        setIntField(term6009, term6009.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6009, term6009.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6009, term6009.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6008, term6008.getClass(), "numerator", term6009);
        setIntField(term6011, term6011.getClass(), "signum", 1);
        setIntElement(term6012, 0, 1922583790);
        setIntElement(term6012, 1, 616727354);
        setField(term6011, term6011.getClass(), "mag", term6012);
        setIntField(term6011, term6011.getClass(), "bitCountPlusOne", 0);
        setIntField(term6011, term6011.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6011, term6011.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6011, term6011.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6008, term6008.getClass(), "denominator", term6011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term74;
        args[1] = term76;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6008));
        assertTrue(recursiveEquals(term74, 6375119433582206027L));
        assertTrue(recursiveEquals(term76, -8257434502486459194L));
    }

};
