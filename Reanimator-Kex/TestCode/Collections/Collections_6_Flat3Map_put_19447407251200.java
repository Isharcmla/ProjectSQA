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

public class Flat3Map_put_19447407251200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380062;
     Object term380402;

    public Flat3Map_put_19447407251200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term380062 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term380448 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term380503 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        term380402 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term380062, term380062.getClass(), "delegateMap", null);
        setIntField(term380062, term380062.getClass(), "size", 3);
        setIntField(term380062, term380062.getClass(), "hash3", 0);
        setField(term380448, term380448.getClass(), "delegateMap", null);
        setIntField(term380448, term380448.getClass(), "size", 0);
        setField(term380448, term380448.getClass(), "key3", term380503);
        setField(term380448, term380448.getClass(), "key2", null);
        setField(term380448, term380448.getClass(), "value2", null);
        setIntField(term380448, term380448.getClass(), "hash3", -1);
        setIntField(term380448, term380448.getClass(), "hash2", -1);
        setIntField(term380448, term380448.getClass(), "hash1", -1);
        setField(term380062, term380062.getClass(), "key3", term380448);
        setIntField(term380062, term380062.getClass(), "hash2", 0);
        setField(term380402, term380402.getClass(), "delegateMap", null);
        setIntField(term380402, term380402.getClass(), "size", 3);
        setIntField(term380402, term380402.getClass(), "hash3", 0);
        setField(term380402, term380402.getClass(), "value3", null);
        setIntField(term380402, term380402.getClass(), "hash2", 0);
        setField(term380402, term380402.getClass(), "value2", null);
        setIntField(term380402, term380402.getClass(), "hash1", 0);
        setField(term380402, term380402.getClass(), "value1", null);
        setField(term380402, term380402.getClass(), "key3", null);
        setField(term380402, term380402.getClass(), "key2", term380448);
        setField(term380062, term380062.getClass(), "key2", term380402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term380402;
        args[1] = null;
        callMethod(klass, "put", argTypes, term380062, args);
    }

};


