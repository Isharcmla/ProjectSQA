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

public class Flat3Map_remove_8406902791086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215430;
     Object term215462;
     Object term215856;
     Object term215857;

    public Flat3Map_remove_8406902791086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215430 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term215430, term215430.getClass(), "delegateMap", null);
        setIntField(term215430, term215430.getClass(), "size", 2);
        setIntField(term215430, term215430.getClass(), "hash2", -1);
        setIntField(term215430, term215430.getClass(), "hash1", 0);
        term215462 = newInstance(Class.forName("java.nio.Bits"));
        term215856 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term215856, term215856.getClass(), "size", 2);
        setIntField(term215856, term215856.getClass(), "hash1", 0);
        setIntField(term215856, term215856.getClass(), "hash2", -1);
        setIntField(term215856, term215856.getClass(), "hash3", 0);
        setField(term215856, term215856.getClass(), "key1", null);
        setField(term215856, term215856.getClass(), "key2", null);
        setField(term215856, term215856.getClass(), "key3", null);
        setField(term215856, term215856.getClass(), "value1", null);
        setField(term215856, term215856.getClass(), "value2", null);
        setField(term215856, term215856.getClass(), "value3", null);
        setField(term215856, term215856.getClass(), "delegateMap", null);
        term215857 = newInstance(Class.forName("java.nio.Bits"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term215462;
        Object retValue = callMethod(klass, "remove", argTypes, term215430, args);
        assertTrue(recursiveEquals(term215430, term215856));
        assertTrue(recursiveEquals(term215462, term215857));
        assertTrue(recursiveEquals(retValue, null));
    }

};
