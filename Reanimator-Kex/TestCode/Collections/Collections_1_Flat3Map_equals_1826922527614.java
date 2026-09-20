package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.lang.Object;

public class Flat3Map_equals_1826922527614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118045;
     Object term118207;
     Object term118637;
     Object term118639;

    public Flat3Map_equals_1826922527614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118045 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term118115 = newInstance(Class.forName("java.util.InputMismatchException"));
        setField(term118045, term118045.getClass(), "delegateMap", null);
        setIntField(term118045, term118045.getClass(), "size", 2);
        setField(term118045, term118045.getClass(), "key2", null);
        setField(term118045, term118045.getClass(), "value2", null);
        setField(term118045, term118045.getClass(), "key1", term118115);
        term118207 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term118207, term118207.getClass(), "delegateMap", null);
        setIntField(term118207, term118207.getClass(), "size", 2);
        setField(term118207, term118207.getClass(), "key2", null);
        setField(term118207, term118207.getClass(), "value2", null);
        term118637 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term118638 = newInstance(Class.forName("java.util.InputMismatchException"));
        setIntField(term118637, term118637.getClass(), "size", 2);
        setIntField(term118637, term118637.getClass(), "hash1", 0);
        setIntField(term118637, term118637.getClass(), "hash2", 0);
        setIntField(term118637, term118637.getClass(), "hash3", 0);
        setField(term118638, term118638.getClass(), "backtrace", null);
        setField(term118638, term118638.getClass(), "detailMessage", null);
        setField(term118638, term118638.getClass(), "cause", null);
        setField(term118638, term118638.getClass(), "stackTrace", null);
        setIntField(term118638, term118638.getClass(), "depth", 0);
        setField(term118638, term118638.getClass(), "suppressedExceptions", null);
        setField(term118637, term118637.getClass(), "key1", term118638);
        setField(term118637, term118637.getClass(), "key2", null);
        setField(term118637, term118637.getClass(), "key3", null);
        setField(term118637, term118637.getClass(), "value1", null);
        setField(term118637, term118637.getClass(), "value2", null);
        setField(term118637, term118637.getClass(), "value3", null);
        setField(term118637, term118637.getClass(), "delegateMap", null);
        term118639 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term118639, term118639.getClass(), "size", 2);
        setIntField(term118639, term118639.getClass(), "hash1", 0);
        setIntField(term118639, term118639.getClass(), "hash2", 0);
        setIntField(term118639, term118639.getClass(), "hash3", 0);
        setField(term118639, term118639.getClass(), "key1", null);
        setField(term118639, term118639.getClass(), "key2", null);
        setField(term118639, term118639.getClass(), "key3", null);
        setField(term118639, term118639.getClass(), "value1", null);
        setField(term118639, term118639.getClass(), "value2", null);
        setField(term118639, term118639.getClass(), "value3", null);
        setField(term118639, term118639.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term118207;
        Object retValue = callMethod(klass, "equals", argTypes, term118045, args);
        assertTrue(recursiveEquals(term118045, term118637));
        assertTrue(recursiveEquals(term118207, term118639));
        assertTrue(recursiveEquals(retValue, false));
    }

};
