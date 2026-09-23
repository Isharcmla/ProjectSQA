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
import java.lang.Object;

public class Flat3Map_put_1944740725963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266694;
     Object term267190;

    public Flat3Map_put_1944740725963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266694 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term266786 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term266878 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term266988 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term267098 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term266694, term266694.getClass(), "delegateMap", null);
        setIntField(term266694, term266694.getClass(), "size", 3);
        setIntField(term266694, term266694.getClass(), "hash3", 0);
        setField(term266786, term266786.getClass(), "delegateMap", null);
        setIntField(term266786, term266786.getClass(), "size", 3);
        setField(term266878, term266878.getClass(), "delegateMap", term266988);
        setField(term266786, term266786.getClass(), "key3", term266878);
        setField(term266786, term266786.getClass(), "key2", term267098);
        setField(term266786, term266786.getClass(), "key1", null);
        setField(term266786, term266786.getClass(), "value1", null);
        setIntField(term266786, term266786.getClass(), "hash3", 0);
        setField(term266694, term266694.getClass(), "key3", term266786);
        term267190 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term267282 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term267190, term267190.getClass(), "delegateMap", null);
        setIntField(term267190, term267190.getClass(), "size", 3);
        setIntField(term267190, term267190.getClass(), "hash3", 0);
        setField(term267190, term267190.getClass(), "value3", null);
        setIntField(term267190, term267190.getClass(), "hash2", 0);
        setField(term267190, term267190.getClass(), "value2", null);
        setIntField(term267190, term267190.getClass(), "hash1", 0);
        setField(term267190, term267190.getClass(), "value1", null);
        setField(term267190, term267190.getClass(), "key3", null);
        setField(term267282, term267282.getClass(), "delegateMap", null);
        setIntField(term267282, term267282.getClass(), "size", 0);
        setField(term267190, term267190.getClass(), "key2", term267282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term267190;
        args[1] = null;
        callMethod(klass, "put", argTypes, term266694, args);
    }

};


