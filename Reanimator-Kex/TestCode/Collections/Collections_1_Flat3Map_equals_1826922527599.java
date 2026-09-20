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

public class Flat3Map_equals_1826922527599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115029;
     Object term115189;
     Object term115308;
     Object term115310;

    public Flat3Map_equals_1826922527599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115029 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term115097 = newInstance(Class.forName("java.util.stream.DoubleStream$1"));
        setField(term115029, term115029.getClass(), "delegateMap", null);
        setIntField(term115029, term115029.getClass(), "size", 2);
        setField(term115029, term115029.getClass(), "key2", term115097);
        term115189 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term115189, term115189.getClass(), "delegateMap", null);
        setIntField(term115189, term115189.getClass(), "size", 2);
        term115308 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term115309 = newInstance(Class.forName("java.util.stream.DoubleStream$1"));
        setIntField(term115308, term115308.getClass(), "size", 2);
        setIntField(term115308, term115308.getClass(), "hash1", 0);
        setIntField(term115308, term115308.getClass(), "hash2", 0);
        setIntField(term115308, term115308.getClass(), "hash3", 0);
        setField(term115308, term115308.getClass(), "key1", null);
        setDoubleField(term115309, term115309.getClass(), "prev", 0.0);
        setBooleanField(term115309, term115309.getClass(), "started", false);
        setField(term115309, term115309.getClass(), "val$f", null);
        setDoubleField(term115309, term115309.getClass(), "val$seed", 0.0);
        setIntField(term115309, term115309.getClass(), "characteristics", 0);
        setLongField(term115309, term115309.getClass(), "est", 0L);
        setIntField(term115309, term115309.getClass(), "batch", 0);
        setField(term115308, term115308.getClass(), "key2", term115309);
        setField(term115308, term115308.getClass(), "key3", null);
        setField(term115308, term115308.getClass(), "value1", null);
        setField(term115308, term115308.getClass(), "value2", null);
        setField(term115308, term115308.getClass(), "value3", null);
        setField(term115308, term115308.getClass(), "delegateMap", null);
        term115310 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term115310, term115310.getClass(), "size", 2);
        setIntField(term115310, term115310.getClass(), "hash1", 0);
        setIntField(term115310, term115310.getClass(), "hash2", 0);
        setIntField(term115310, term115310.getClass(), "hash3", 0);
        setField(term115310, term115310.getClass(), "key1", null);
        setField(term115310, term115310.getClass(), "key2", null);
        setField(term115310, term115310.getClass(), "key3", null);
        setField(term115310, term115310.getClass(), "value1", null);
        setField(term115310, term115310.getClass(), "value2", null);
        setField(term115310, term115310.getClass(), "value3", null);
        setField(term115310, term115310.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term115189;
        Object retValue = callMethod(klass, "equals", argTypes, term115029, args);
        assertTrue(recursiveEquals(term115029, term115308));
        assertTrue(recursiveEquals(term115189, term115310));
        assertTrue(recursiveEquals(retValue, false));
    }

};
