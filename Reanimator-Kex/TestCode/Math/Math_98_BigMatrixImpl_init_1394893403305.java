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

public class BigMatrixImpl_init_1394893403305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104740;
     Object term104937;
     Object term104955;

    public BigMatrixImpl_init_1394893403305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term104886 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term104745 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        setField(term104886, term104886.getClass(), "data", term104745);
        setField(term104886, term104886.getClass(), "lu", null);
        setField(term104886, term104886.getClass(), "permutation", null);
        setIntField(term104886, term104886.getClass(), "parity", 0);
        setIntField(term104886, term104886.getClass(), "roundingMode", 0);
        setIntField(term104886, term104886.getClass(), "scale", 0);
        term104740 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 4);
        Object[] term104741 = (Object[]) newArray("java.math.BigDecimal", 16);
        Object[] term104742 = (Object[]) newArray("java.math.BigDecimal", 16);
        Object[] term104743 = (Object[]) newArray("java.math.BigDecimal", 16);
        Object[] term104744 = (Object[]) newArray("java.math.BigDecimal", 16);
        setElement(term104740, 0, term104741);
        setElement(term104740, 1, term104742);
        setElement(term104740, 2, term104743);
        setElement(term104740, 3, term104744);
        term104937 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term104938 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 16);
        Object[] term104939 = (Object[]) newArray("java.math.BigDecimal", 16);
        Object[] term104940 = (Object[]) newArray("java.math.BigDecimal", 16);
        Object[] term104941 = (Object[]) newArray("java.math.BigDecimal", 16);
        Object[] term104942 = (Object[]) newArray("java.math.BigDecimal", 16);
        Object[] term104943 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object[] term104944 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object[] term104945 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object[] term104946 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object[] term104947 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object[] term104948 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object[] term104949 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object[] term104950 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object[] term104951 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object[] term104952 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object[] term104953 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object[] term104954 = (Object[]) newArray("java.math.BigDecimal", 4);
        setElement(term104938, 0, term104939);
        setElement(term104938, 1, term104940);
        setElement(term104938, 2, term104941);
        setElement(term104938, 3, term104942);
        setElement(term104938, 4, term104943);
        setElement(term104938, 5, term104944);
        setElement(term104938, 6, term104945);
        setElement(term104938, 7, term104946);
        setElement(term104938, 8, term104947);
        setElement(term104938, 9, term104948);
        setElement(term104938, 10, term104949);
        setElement(term104938, 11, term104950);
        setElement(term104938, 12, term104951);
        setElement(term104938, 13, term104952);
        setElement(term104938, 14, term104953);
        setElement(term104938, 15, term104954);
        setField(term104937, term104937.getClass(), "data", term104938);
        setField(term104937, term104937.getClass(), "lu", null);
        setField(term104937, term104937.getClass(), "permutation", null);
        setIntField(term104937, term104937.getClass(), "parity", 1);
        setIntField(term104937, term104937.getClass(), "roundingMode", 4);
        setIntField(term104937, term104937.getClass(), "scale", 64);
        term104955 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 4);
        Object[] term104956 = (Object[]) newArray("java.math.BigDecimal", 16);
        Object[] term104957 = (Object[]) newArray("java.math.BigDecimal", 16);
        Object[] term104958 = (Object[]) newArray("java.math.BigDecimal", 16);
        Object[] term104959 = (Object[]) newArray("java.math.BigDecimal", 16);
        setElement(term104955, 0, term104956);
        setElement(term104955, 1, term104957);
        setElement(term104955, 2, term104958);
        setElement(term104955, 3, term104959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term104740;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term104937));
        assertTrue(recursiveEquals(term104740, term104955));
    }

};


