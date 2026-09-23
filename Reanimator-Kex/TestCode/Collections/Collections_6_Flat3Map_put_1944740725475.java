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

public class Flat3Map_put_1944740725475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87322;
     Object term87931;
     Object term87933;

    public Flat3Map_put_1944740725475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87322 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term87368 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term87322, term87322.getClass(), "delegateMap", null);
        setIntField(term87322, term87322.getClass(), "size", 1);
        setIntField(term87322, term87322.getClass(), "hash1", 0);
        setField(term87322, term87322.getClass(), "value1", null);
        setField(term87322, term87322.getClass(), "key1", term87368);
        term87931 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term87932 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term87931, term87931.getClass(), "size", 2);
        setIntField(term87931, term87931.getClass(), "hash1", 0);
        setIntField(term87931, term87931.getClass(), "hash2", 0);
        setIntField(term87931, term87931.getClass(), "hash3", 0);
        setIntField(term87932, term87932.getClass(), "size", 0);
        setIntField(term87932, term87932.getClass(), "hash1", 0);
        setIntField(term87932, term87932.getClass(), "hash2", 0);
        setIntField(term87932, term87932.getClass(), "hash3", 0);
        setField(term87932, term87932.getClass(), "key1", null);
        setField(term87932, term87932.getClass(), "key2", null);
        setField(term87932, term87932.getClass(), "key3", null);
        setField(term87932, term87932.getClass(), "value1", null);
        setField(term87932, term87932.getClass(), "value2", null);
        setField(term87932, term87932.getClass(), "value3", null);
        setField(term87932, term87932.getClass(), "delegateMap", null);
        setField(term87931, term87931.getClass(), "key1", term87932);
        setField(term87931, term87931.getClass(), "key2", term87931);
        setField(term87931, term87931.getClass(), "key3", null);
        setField(term87931, term87931.getClass(), "value1", null);
        setField(term87931, term87931.getClass(), "value2", null);
        setField(term87931, term87931.getClass(), "value3", null);
        setField(term87931, term87931.getClass(), "delegateMap", null);
        term87933 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term87934 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term87933, term87933.getClass(), "size", 2);
        setIntField(term87933, term87933.getClass(), "hash1", 0);
        setIntField(term87933, term87933.getClass(), "hash2", 0);
        setIntField(term87933, term87933.getClass(), "hash3", 0);
        setIntField(term87934, term87934.getClass(), "size", 0);
        setIntField(term87934, term87934.getClass(), "hash1", 0);
        setIntField(term87934, term87934.getClass(), "hash2", 0);
        setIntField(term87934, term87934.getClass(), "hash3", 0);
        setField(term87934, term87934.getClass(), "key1", null);
        setField(term87934, term87934.getClass(), "key2", null);
        setField(term87934, term87934.getClass(), "key3", null);
        setField(term87934, term87934.getClass(), "value1", null);
        setField(term87934, term87934.getClass(), "value2", null);
        setField(term87934, term87934.getClass(), "value3", null);
        setField(term87934, term87934.getClass(), "delegateMap", null);
        setField(term87933, term87933.getClass(), "key1", term87934);
        setField(term87933, term87933.getClass(), "key2", term87933);
        setField(term87933, term87933.getClass(), "key3", null);
        setField(term87933, term87933.getClass(), "value1", null);
        setField(term87933, term87933.getClass(), "value2", null);
        setField(term87933, term87933.getClass(), "value3", null);
        setField(term87933, term87933.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term87322;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term87322, args);
        assertTrue(recursiveEquals(term87322, term87931));
        assertTrue(recursiveEquals(term87322, term87933));
        assertTrue(recursiveEquals(retValue, null));
    }

};


