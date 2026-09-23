package org.apache.commons.math3.util;

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
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.util.EqualityUtils.*;
import java.lang.Object;

public class MathArrays_isMonotonic_1203949196176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53906;
     Object term575978;

    public MathArrays_isMonotonic_1203949196176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53906 = (Object[]) newArray("java.lang.Comparable", 1);
        Object term53992 = newInstance(Class.forName("java.nio.ByteBufferAsShortBufferL"));
        setElement(term53906, 0, term53992);
        term575978 = (Object[]) newArray("java.lang.Comparable", 1);
        Object term575979 = newInstance(Class.forName("java.nio.ByteBufferAsShortBufferL"));
        setField(term575979, term575979.getClass(), "bb", null);
        setField(term575979, term575979.getClass(), "hb", null);
        setIntField(term575979, term575979.getClass(), "offset", 0);
        setBooleanField(term575979, term575979.getClass(), "isReadOnly", false);
        setIntField(term575979, term575979.getClass(), "mark", 0);
        setIntField(term575979, term575979.getClass(), "position", 0);
        setIntField(term575979, term575979.getClass(), "limit", 0);
        setIntField(term575979, term575979.getClass(), "capacity", 0);
        setLongField(term575979, term575979.getClass(), "address", 0L);
        setElement(term575978, 0, term575979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[1] = Class.forName("org.apache.commons.math3.util.MathArrays$OrderDirection");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term53906;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "isMonotonic", argTypes, null, args);
        assertTrue(recursiveEquals(term53906, term575978));
        assertTrue(recursiveEquals(retValue, true));
    }

};


