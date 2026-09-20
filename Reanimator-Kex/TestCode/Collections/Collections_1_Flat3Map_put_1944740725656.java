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

public class Flat3Map_put_1944740725656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128064;
     Object term128156;
     Object term128462;
     Object term128464;

    public Flat3Map_put_1944740725656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128064 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term128064, term128064.getClass(), "delegateMap", null);
        term128156 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term128462 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term128463 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term128462, term128462.getClass(), "size", 1);
        setIntField(term128462, term128462.getClass(), "hash1", 0);
        setIntField(term128462, term128462.getClass(), "hash2", 0);
        setIntField(term128462, term128462.getClass(), "hash3", 0);
        setIntField(term128463, term128463.getClass(), "size", 0);
        setIntField(term128463, term128463.getClass(), "hash1", 0);
        setIntField(term128463, term128463.getClass(), "hash2", 0);
        setIntField(term128463, term128463.getClass(), "hash3", 0);
        setField(term128463, term128463.getClass(), "key1", null);
        setField(term128463, term128463.getClass(), "key2", null);
        setField(term128463, term128463.getClass(), "key3", null);
        setField(term128463, term128463.getClass(), "value1", null);
        setField(term128463, term128463.getClass(), "value2", null);
        setField(term128463, term128463.getClass(), "value3", null);
        setField(term128463, term128463.getClass(), "delegateMap", null);
        setField(term128462, term128462.getClass(), "key1", term128463);
        setField(term128462, term128462.getClass(), "key2", null);
        setField(term128462, term128462.getClass(), "key3", null);
        setField(term128462, term128462.getClass(), "value1", null);
        setField(term128462, term128462.getClass(), "value2", null);
        setField(term128462, term128462.getClass(), "value3", null);
        setField(term128462, term128462.getClass(), "delegateMap", null);
        term128464 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term128464, term128464.getClass(), "size", 0);
        setIntField(term128464, term128464.getClass(), "hash1", 0);
        setIntField(term128464, term128464.getClass(), "hash2", 0);
        setIntField(term128464, term128464.getClass(), "hash3", 0);
        setField(term128464, term128464.getClass(), "key1", null);
        setField(term128464, term128464.getClass(), "key2", null);
        setField(term128464, term128464.getClass(), "key3", null);
        setField(term128464, term128464.getClass(), "value1", null);
        setField(term128464, term128464.getClass(), "value2", null);
        setField(term128464, term128464.getClass(), "value3", null);
        setField(term128464, term128464.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term128156;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term128064, args);
        assertTrue(recursiveEquals(term128064, term128462));
        assertTrue(recursiveEquals(term128156, term128464));
        assertTrue(recursiveEquals(retValue, null));
    }

};
