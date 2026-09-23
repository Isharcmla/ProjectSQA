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

public class Flat3Map_equals_1826922527601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126217;
     Object term126415;
     Object term126471;
     Object term126473;

    public Flat3Map_equals_1826922527601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126217 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term126323 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$CounterCell"));
        setField(term126217, term126217.getClass(), "delegateMap", null);
        setIntField(term126217, term126217.getClass(), "size", 3);
        setField(term126217, term126217.getClass(), "key3", null);
        setField(term126217, term126217.getClass(), "value3", null);
        setField(term126217, term126217.getClass(), "key2", null);
        setField(term126217, term126217.getClass(), "value2", null);
        setField(term126217, term126217.getClass(), "key1", term126323);
        term126415 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term126415, term126415.getClass(), "delegateMap", null);
        setIntField(term126415, term126415.getClass(), "size", 3);
        setField(term126415, term126415.getClass(), "key3", null);
        setField(term126415, term126415.getClass(), "value3", null);
        setIntField(term126415, term126415.getClass(), "hash3", 0);
        term126471 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term126472 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$CounterCell"));
        setIntField(term126471, term126471.getClass(), "size", 3);
        setIntField(term126471, term126471.getClass(), "hash1", 0);
        setIntField(term126471, term126471.getClass(), "hash2", 0);
        setIntField(term126471, term126471.getClass(), "hash3", 0);
        setLongField(term126472, term126472.getClass(), "value", 0L);
        setField(term126471, term126471.getClass(), "key1", term126472);
        setField(term126471, term126471.getClass(), "key2", null);
        setField(term126471, term126471.getClass(), "key3", null);
        setField(term126471, term126471.getClass(), "value1", null);
        setField(term126471, term126471.getClass(), "value2", null);
        setField(term126471, term126471.getClass(), "value3", null);
        setField(term126471, term126471.getClass(), "delegateMap", null);
        term126473 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term126473, term126473.getClass(), "size", 3);
        setIntField(term126473, term126473.getClass(), "hash1", 0);
        setIntField(term126473, term126473.getClass(), "hash2", 0);
        setIntField(term126473, term126473.getClass(), "hash3", 0);
        setField(term126473, term126473.getClass(), "key1", null);
        setField(term126473, term126473.getClass(), "key2", null);
        setField(term126473, term126473.getClass(), "key3", null);
        setField(term126473, term126473.getClass(), "value1", null);
        setField(term126473, term126473.getClass(), "value2", null);
        setField(term126473, term126473.getClass(), "value3", null);
        setField(term126473, term126473.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term126415;
        Object retValue = callMethod(klass, "equals", argTypes, term126217, args);
        assertTrue(recursiveEquals(term126217, term126471));
        assertTrue(recursiveEquals(term126415, term126473));
        assertTrue(recursiveEquals(retValue, false));
    }

};


