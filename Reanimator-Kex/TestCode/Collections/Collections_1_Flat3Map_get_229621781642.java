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

public class Flat3Map_get_229621781642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125094;
     Object term125370;
     Object term125909;
     Object term125912;

    public Flat3Map_get_229621781642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125094 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term125186 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term125278 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term125094, term125094.getClass(), "delegateMap", null);
        setIntField(term125094, term125094.getClass(), "size", 3);
        setIntField(term125094, term125094.getClass(), "hash3", 0);
        setField(term125186, term125186.getClass(), "delegateMap", null);
        setIntField(term125186, term125186.getClass(), "size", 3);
        setField(term125186, term125186.getClass(), "key3", term125278);
        setField(term125186, term125186.getClass(), "key2", null);
        setField(term125186, term125186.getClass(), "value2", null);
        setField(term125094, term125094.getClass(), "key3", term125186);
        term125370 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term125462 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term125370, term125370.getClass(), "delegateMap", null);
        setIntField(term125370, term125370.getClass(), "size", 3);
        setIntField(term125370, term125370.getClass(), "hash3", 0);
        setField(term125370, term125370.getClass(), "value3", null);
        setIntField(term125370, term125370.getClass(), "hash2", 0);
        setField(term125370, term125370.getClass(), "value2", null);
        setIntField(term125370, term125370.getClass(), "hash1", 0);
        setField(term125370, term125370.getClass(), "value1", null);
        setField(term125370, term125370.getClass(), "key3", null);
        setField(term125370, term125370.getClass(), "key2", null);
        setField(term125370, term125370.getClass(), "key1", term125462);
        term125909 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term125910 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term125911 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term125909, term125909.getClass(), "size", 3);
        setIntField(term125909, term125909.getClass(), "hash1", 0);
        setIntField(term125909, term125909.getClass(), "hash2", 0);
        setIntField(term125909, term125909.getClass(), "hash3", 0);
        setField(term125909, term125909.getClass(), "key1", null);
        setField(term125909, term125909.getClass(), "key2", null);
        setIntField(term125910, term125910.getClass(), "size", 3);
        setIntField(term125910, term125910.getClass(), "hash1", 0);
        setIntField(term125910, term125910.getClass(), "hash2", 0);
        setIntField(term125910, term125910.getClass(), "hash3", 0);
        setField(term125910, term125910.getClass(), "key1", null);
        setField(term125910, term125910.getClass(), "key2", null);
        setIntField(term125911, term125911.getClass(), "size", 0);
        setIntField(term125911, term125911.getClass(), "hash1", 0);
        setIntField(term125911, term125911.getClass(), "hash2", 0);
        setIntField(term125911, term125911.getClass(), "hash3", 0);
        setField(term125911, term125911.getClass(), "key1", null);
        setField(term125911, term125911.getClass(), "key2", null);
        setField(term125911, term125911.getClass(), "key3", null);
        setField(term125911, term125911.getClass(), "value1", null);
        setField(term125911, term125911.getClass(), "value2", null);
        setField(term125911, term125911.getClass(), "value3", null);
        setField(term125911, term125911.getClass(), "delegateMap", null);
        setField(term125910, term125910.getClass(), "key3", term125911);
        setField(term125910, term125910.getClass(), "value1", null);
        setField(term125910, term125910.getClass(), "value2", null);
        setField(term125910, term125910.getClass(), "value3", null);
        setField(term125910, term125910.getClass(), "delegateMap", null);
        setField(term125909, term125909.getClass(), "key3", term125910);
        setField(term125909, term125909.getClass(), "value1", null);
        setField(term125909, term125909.getClass(), "value2", null);
        setField(term125909, term125909.getClass(), "value3", null);
        setField(term125909, term125909.getClass(), "delegateMap", null);
        term125912 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term125913 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term125912, term125912.getClass(), "size", 3);
        setIntField(term125912, term125912.getClass(), "hash1", 0);
        setIntField(term125912, term125912.getClass(), "hash2", 0);
        setIntField(term125912, term125912.getClass(), "hash3", 0);
        setIntField(term125913, term125913.getClass(), "size", 0);
        setIntField(term125913, term125913.getClass(), "hash1", 0);
        setIntField(term125913, term125913.getClass(), "hash2", 0);
        setIntField(term125913, term125913.getClass(), "hash3", 0);
        setField(term125913, term125913.getClass(), "key1", null);
        setField(term125913, term125913.getClass(), "key2", null);
        setField(term125913, term125913.getClass(), "key3", null);
        setField(term125913, term125913.getClass(), "value1", null);
        setField(term125913, term125913.getClass(), "value2", null);
        setField(term125913, term125913.getClass(), "value3", null);
        setField(term125913, term125913.getClass(), "delegateMap", null);
        setField(term125912, term125912.getClass(), "key1", term125913);
        setField(term125912, term125912.getClass(), "key2", null);
        setField(term125912, term125912.getClass(), "key3", null);
        setField(term125912, term125912.getClass(), "value1", null);
        setField(term125912, term125912.getClass(), "value2", null);
        setField(term125912, term125912.getClass(), "value3", null);
        setField(term125912, term125912.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term125370;
        Object retValue = callMethod(klass, "get", argTypes, term125094, args);
        assertTrue(recursiveEquals(term125094, term125909));
        assertTrue(recursiveEquals(term125370, term125912));
        assertTrue(recursiveEquals(retValue, null));
    }

};
