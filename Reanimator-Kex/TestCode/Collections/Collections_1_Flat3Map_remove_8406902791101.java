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

public class Flat3Map_remove_8406902791101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218110;
     Object term218584;

    public Flat3Map_remove_8406902791101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218110 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term218202 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term218294 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term218110, term218110.getClass(), "delegateMap", null);
        setIntField(term218110, term218110.getClass(), "size", 2);
        setField(term218110, term218110.getClass(), "key2", term218202);
        setField(term218110, term218110.getClass(), "key1", term218294);
        term218584 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term218585 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term218586 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term218584, term218584.getClass(), "size", 2);
        setIntField(term218584, term218584.getClass(), "hash1", 0);
        setIntField(term218584, term218584.getClass(), "hash2", 0);
        setIntField(term218584, term218584.getClass(), "hash3", 0);
        setIntField(term218585, term218585.getClass(), "size", 0);
        setIntField(term218585, term218585.getClass(), "hash1", 0);
        setIntField(term218585, term218585.getClass(), "hash2", 0);
        setIntField(term218585, term218585.getClass(), "hash3", 0);
        setField(term218585, term218585.getClass(), "key1", null);
        setField(term218585, term218585.getClass(), "key2", null);
        setField(term218585, term218585.getClass(), "key3", null);
        setField(term218585, term218585.getClass(), "value1", null);
        setField(term218585, term218585.getClass(), "value2", null);
        setField(term218585, term218585.getClass(), "value3", null);
        setField(term218585, term218585.getClass(), "delegateMap", null);
        setField(term218584, term218584.getClass(), "key1", term218585);
        setIntField(term218586, term218586.getClass(), "size", 0);
        setIntField(term218586, term218586.getClass(), "hash1", 0);
        setIntField(term218586, term218586.getClass(), "hash2", 0);
        setIntField(term218586, term218586.getClass(), "hash3", 0);
        setField(term218586, term218586.getClass(), "key1", null);
        setField(term218586, term218586.getClass(), "key2", null);
        setField(term218586, term218586.getClass(), "key3", null);
        setField(term218586, term218586.getClass(), "value1", null);
        setField(term218586, term218586.getClass(), "value2", null);
        setField(term218586, term218586.getClass(), "value3", null);
        setField(term218586, term218586.getClass(), "delegateMap", null);
        setField(term218584, term218584.getClass(), "key2", term218586);
        setField(term218584, term218584.getClass(), "key3", null);
        setField(term218584, term218584.getClass(), "value1", null);
        setField(term218584, term218584.getClass(), "value2", null);
        setField(term218584, term218584.getClass(), "value3", null);
        setField(term218584, term218584.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "remove", argTypes, term218110, args);
        assertTrue(recursiveEquals(term218110, term218584));
        assertTrue(recursiveEquals(retValue, null));
    }

};
