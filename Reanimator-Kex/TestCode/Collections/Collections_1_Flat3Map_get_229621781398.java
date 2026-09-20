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

public class Flat3Map_get_229621781398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73122;
     Object term73234;
     Object term73712;
     Object term73713;

    public Flat3Map_get_229621781398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73122 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term73122, term73122.getClass(), "delegateMap", null);
        setIntField(term73122, term73122.getClass(), "size", 2);
        term73234 = newInstance(Class.forName("org.apache.commons.collections.functors.TruePredicate"));
        term73712 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term73712, term73712.getClass(), "size", 2);
        setIntField(term73712, term73712.getClass(), "hash1", 0);
        setIntField(term73712, term73712.getClass(), "hash2", 0);
        setIntField(term73712, term73712.getClass(), "hash3", 0);
        setField(term73712, term73712.getClass(), "key1", null);
        setField(term73712, term73712.getClass(), "key2", null);
        setField(term73712, term73712.getClass(), "key3", null);
        setField(term73712, term73712.getClass(), "value1", null);
        setField(term73712, term73712.getClass(), "value2", null);
        setField(term73712, term73712.getClass(), "value3", null);
        setField(term73712, term73712.getClass(), "delegateMap", null);
        term73713 = newInstance(Class.forName("org.apache.commons.collections.functors.TruePredicate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term73234;
        Object retValue = callMethod(klass, "get", argTypes, term73122, args);
        assertTrue(recursiveEquals(term73122, term73712));
        assertTrue(recursiveEquals(term73234, term73713));
        assertTrue(recursiveEquals(retValue, null));
    }

};
