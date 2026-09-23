package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;

public class BigMatrixImpl_init_1505302127344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111899;
     Object term112069;

    public BigMatrixImpl_init_1505302127344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term112068 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        setField(term112068, term112068.getClass(), "data", null);
        setField(term112068, term112068.getClass(), "lu", null);
        setField(term112068, term112068.getClass(), "permutation", null);
        setIntField(term112068, term112068.getClass(), "parity", 0);
        setIntField(term112068, term112068.getClass(), "roundingMode", 0);
        setIntField(term112068, term112068.getClass(), "scale", 0);
        term111899 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 7);
        Object[] term111900 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object[] term111901 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object[] term111902 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object[] term111903 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object[] term111904 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object[] term111905 = (Object[]) newArray("java.math.BigDecimal", 4);
        setElement(term111899, 0, term111900);
        setElement(term111899, 1, term111901);
        setElement(term111899, 2, term111902);
        setElement(term111899, 3, term111903);
        setElement(term111899, 4, term111904);
        setElement(term111899, 5, term111905);
        setElement(term111899, 6, term111900);
        term112069 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term112070 = newInstance(Class.forName("java.math.BigInteger"));
        setIntField(term112070, term112070.getClass(), "signum", 1);
        setField(term112070, term112070.getClass(), "mag", null);
        setIntField(term112070, term112070.getClass(), "bitCountPlusOne", 0);
        setIntField(term112070, term112070.getClass(), "bitLengthPlusOne", 0);
        setIntField(term112070, term112070.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term112070, term112070.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term112069, term112069.getClass(), "intVal", term112070);
        setIntField(term112069, term112069.getClass(), "scale", 53);
        setIntField(term112069, term112069.getClass(), "precision", 0);
        setField(term112069, term112069.getClass(), "stringCache", null);
        setLongField(term112069, term112069.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term111899;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(term111899, term112069));
    }

};


