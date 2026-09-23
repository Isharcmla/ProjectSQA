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

public class BigMatrixImpl_init_1394893403300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103817;

    public BigMatrixImpl_init_1394893403300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103949 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term103822 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        setField(term103949, term103949.getClass(), "data", null);
        setField(term103949, term103949.getClass(), "lu", term103822);
        setField(term103949, term103949.getClass(), "permutation", null);
        setIntField(term103949, term103949.getClass(), "parity", 0);
        setIntField(term103949, term103949.getClass(), "roundingMode", 0);
        setIntField(term103949, term103949.getClass(), "scale", 0);
        term103817 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 2);
        Object[] term103818 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object term103995 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term103820 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object term104041 = newInstance(Class.forName("java.math.BigDecimal"));
        setElement(term103818, 0, term103995);
        setElement(term103818, 1, term103995);
        setElement(term103817, 0, term103818);
        setElement(term103820, 0, term104041);
        setElement(term103820, 1, term103995);
        setElement(term103817, 1, term103820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term103817;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(term103817, 14352384));
    }

};


