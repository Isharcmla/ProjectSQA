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
import java.lang.Integer;
import java.lang.Object;

public class BigFraction_init_9115102561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68;
     Object term70;
     Object term5798;

    public BigFraction_init_9115102561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68 = new Integer(-616727354);
        term70 = new Integer(-1955890973);
        term5798 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term5799 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5800 = (int[]) newIntArray(1);
        Object term5801 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5802 = (int[]) newIntArray(1);
        setIntField(term5799, term5799.getClass(), "signum", 1);
        setIntElement(term5800, 0, 616727354);
        setField(term5799, term5799.getClass(), "mag", term5800);
        setIntField(term5799, term5799.getClass(), "bitCountPlusOne", 0);
        setIntField(term5799, term5799.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5799, term5799.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5799, term5799.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5798, term5798.getClass(), "numerator", term5799);
        setIntField(term5801, term5801.getClass(), "signum", 1);
        setIntElement(term5802, 0, 1955890973);
        setField(term5801, term5801.getClass(), "mag", term5802);
        setIntField(term5801, term5801.getClass(), "bitCountPlusOne", 0);
        setIntField(term5801, term5801.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5801, term5801.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5801, term5801.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5798, term5798.getClass(), "denominator", term5801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term68;
        args[1] = term70;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5798));
        assertTrue(recursiveEquals(term68, -616727354));
        assertTrue(recursiveEquals(term70, -1955890973));
    }

};
