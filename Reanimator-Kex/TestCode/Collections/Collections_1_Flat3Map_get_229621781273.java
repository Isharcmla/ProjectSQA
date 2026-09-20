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

public class Flat3Map_get_229621781273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48883;
     Object term48972;
     Object term48974;

    public Flat3Map_get_229621781273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48883 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term48929 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term48883, term48883.getClass(), "delegateMap", null);
        setIntField(term48883, term48883.getClass(), "size", 2);
        setIntField(term48883, term48883.getClass(), "hash2", 0);
        setField(term48883, term48883.getClass(), "value2", null);
        setIntField(term48883, term48883.getClass(), "hash1", 0);
        setField(term48883, term48883.getClass(), "value1", null);
        setField(term48883, term48883.getClass(), "key2", term48929);
        term48972 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term48973 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term48972, term48972.getClass(), "size", 2);
        setIntField(term48972, term48972.getClass(), "hash1", 0);
        setIntField(term48972, term48972.getClass(), "hash2", 0);
        setIntField(term48972, term48972.getClass(), "hash3", 0);
        setField(term48972, term48972.getClass(), "key1", null);
        setIntField(term48973, term48973.getClass(), "size", 0);
        setIntField(term48973, term48973.getClass(), "hash1", 0);
        setIntField(term48973, term48973.getClass(), "hash2", 0);
        setIntField(term48973, term48973.getClass(), "hash3", 0);
        setField(term48973, term48973.getClass(), "key1", null);
        setField(term48973, term48973.getClass(), "key2", null);
        setField(term48973, term48973.getClass(), "key3", null);
        setField(term48973, term48973.getClass(), "value1", null);
        setField(term48973, term48973.getClass(), "value2", null);
        setField(term48973, term48973.getClass(), "value3", null);
        setField(term48973, term48973.getClass(), "delegateMap", null);
        setField(term48972, term48972.getClass(), "key2", term48973);
        setField(term48972, term48972.getClass(), "key3", null);
        setField(term48972, term48972.getClass(), "value1", null);
        setField(term48972, term48972.getClass(), "value2", null);
        setField(term48972, term48972.getClass(), "value3", null);
        setField(term48972, term48972.getClass(), "delegateMap", null);
        term48974 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term48975 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term48974, term48974.getClass(), "size", 2);
        setIntField(term48974, term48974.getClass(), "hash1", 0);
        setIntField(term48974, term48974.getClass(), "hash2", 0);
        setIntField(term48974, term48974.getClass(), "hash3", 0);
        setField(term48974, term48974.getClass(), "key1", null);
        setIntField(term48975, term48975.getClass(), "size", 0);
        setIntField(term48975, term48975.getClass(), "hash1", 0);
        setIntField(term48975, term48975.getClass(), "hash2", 0);
        setIntField(term48975, term48975.getClass(), "hash3", 0);
        setField(term48975, term48975.getClass(), "key1", null);
        setField(term48975, term48975.getClass(), "key2", null);
        setField(term48975, term48975.getClass(), "key3", null);
        setField(term48975, term48975.getClass(), "value1", null);
        setField(term48975, term48975.getClass(), "value2", null);
        setField(term48975, term48975.getClass(), "value3", null);
        setField(term48975, term48975.getClass(), "delegateMap", null);
        setField(term48974, term48974.getClass(), "key2", term48975);
        setField(term48974, term48974.getClass(), "key3", null);
        setField(term48974, term48974.getClass(), "value1", null);
        setField(term48974, term48974.getClass(), "value2", null);
        setField(term48974, term48974.getClass(), "value3", null);
        setField(term48974, term48974.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term48883;
        Object retValue = callMethod(klass, "get", argTypes, term48883, args);
        assertTrue(recursiveEquals(term48883, term48972));
        assertTrue(recursiveEquals(term48883, term48974));
        assertTrue(recursiveEquals(retValue, null));
    }

};
