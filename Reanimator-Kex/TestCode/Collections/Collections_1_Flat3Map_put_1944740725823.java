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

public class Flat3Map_put_1944740725823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167164;
     Object term167185;
     Object term167186;

    public Flat3Map_put_1944740725823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167164 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term167164, term167164.getClass(), "delegateMap", null);
        setIntField(term167164, term167164.getClass(), "size", 1);
        setIntField(term167164, term167164.getClass(), "hash1", 0);
        setField(term167164, term167164.getClass(), "value1", null);
        setField(term167164, term167164.getClass(), "key1", term167164);
        term167185 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term167185, term167185.getClass(), "size", 1);
        setIntField(term167185, term167185.getClass(), "hash1", 0);
        setIntField(term167185, term167185.getClass(), "hash2", 0);
        setIntField(term167185, term167185.getClass(), "hash3", 0);
        setField(term167185, term167185.getClass(), "key1", term167185);
        setField(term167185, term167185.getClass(), "key2", null);
        setField(term167185, term167185.getClass(), "key3", null);
        setField(term167185, term167185.getClass(), "value1", null);
        setField(term167185, term167185.getClass(), "value2", null);
        setField(term167185, term167185.getClass(), "value3", null);
        setField(term167185, term167185.getClass(), "delegateMap", null);
        term167186 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term167186, term167186.getClass(), "size", 1);
        setIntField(term167186, term167186.getClass(), "hash1", 0);
        setIntField(term167186, term167186.getClass(), "hash2", 0);
        setIntField(term167186, term167186.getClass(), "hash3", 0);
        setField(term167186, term167186.getClass(), "key1", term167186);
        setField(term167186, term167186.getClass(), "key2", null);
        setField(term167186, term167186.getClass(), "key3", null);
        setField(term167186, term167186.getClass(), "value1", null);
        setField(term167186, term167186.getClass(), "value2", null);
        setField(term167186, term167186.getClass(), "value3", null);
        setField(term167186, term167186.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term167164;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term167164, args);
        assertTrue(recursiveEquals(term167164, term167185));
        assertTrue(recursiveEquals(term167164, term167186));
        assertTrue(recursiveEquals(retValue, null));
    }

};
