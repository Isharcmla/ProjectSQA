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

public class BigFraction_init_9121060760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66;
     Object term5696;

    public BigFraction_init_9121060760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66 = new Integer(-1922583790);
        term5696 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term5697 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5698 = (int[]) newIntArray(1);
        Object term5699 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5700 = (int[]) newIntArray(1);
        setIntField(term5697, term5697.getClass(), "signum", -1);
        setIntElement(term5698, 0, 1922583790);
        setField(term5697, term5697.getClass(), "mag", term5698);
        setIntField(term5697, term5697.getClass(), "bitCountPlusOne", 0);
        setIntField(term5697, term5697.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5697, term5697.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5697, term5697.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5696, term5696.getClass(), "numerator", term5697);
        setIntField(term5699, term5699.getClass(), "signum", 1);
        setIntElement(term5700, 0, 1);
        setField(term5699, term5699.getClass(), "mag", term5700);
        setIntField(term5699, term5699.getClass(), "bitCountPlusOne", 0);
        setIntField(term5699, term5699.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5699, term5699.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5699, term5699.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5696, term5696.getClass(), "denominator", term5699);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5696));
        assertTrue(recursiveEquals(term66, -1922583790));
    }

};
