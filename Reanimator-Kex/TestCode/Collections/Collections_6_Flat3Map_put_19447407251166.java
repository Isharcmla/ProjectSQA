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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_put_19447407251166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358104;
     Object term358306;

    public Flat3Map_put_19447407251166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358104 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term358361 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term358361, term358361.getClass(), "size", 0);
        setField(term358104, term358104.getClass(), "delegateMap", term358361);
        setIntField(term358104, term358104.getClass(), "size", 3);
        setIntField(term358104, term358104.getClass(), "hash3", 0);
        setField(term358104, term358104.getClass(), "key3", null);
        setIntField(term358104, term358104.getClass(), "hash2", 0);
        setField(term358104, term358104.getClass(), "key2", term358104);
        term358306 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term358306, term358306.getClass(), "delegateMap", null);
        setIntField(term358306, term358306.getClass(), "size", 3);
        setIntField(term358306, term358306.getClass(), "hash3", 0);
        setField(term358306, term358306.getClass(), "value3", null);
        setIntField(term358306, term358306.getClass(), "hash2", 0);
        setField(term358306, term358306.getClass(), "value2", term358361);
        setIntField(term358306, term358306.getClass(), "hash1", 0);
        setField(term358306, term358306.getClass(), "value1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term358306;
        args[1] = null;
        try {
            callMethod(klass, "put", argTypes, term358104, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


