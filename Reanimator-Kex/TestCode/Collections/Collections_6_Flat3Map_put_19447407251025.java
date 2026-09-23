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

public class Flat3Map_put_19447407251025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292652;
     Object term292744;

    public Flat3Map_put_19447407251025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292652 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term292652, term292652.getClass(), "delegateMap", null);
        setIntField(term292652, term292652.getClass(), "size", 2);
        setIntField(term292652, term292652.getClass(), "hash2", 0);
        setField(term292652, term292652.getClass(), "key2", null);
        setIntField(term292652, term292652.getClass(), "hash1", 0);
        setField(term292652, term292652.getClass(), "key1", null);
        term292744 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term292854 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term292744, term292744.getClass(), "delegateMap", null);
        setIntField(term292744, term292744.getClass(), "size", 2);
        setIntField(term292744, term292744.getClass(), "hash2", 0);
        setField(term292744, term292744.getClass(), "value2", null);
        setIntField(term292744, term292744.getClass(), "hash1", 0);
        setField(term292744, term292744.getClass(), "value1", null);
        setIntField(term292854, term292854.getClass(), "size", 0);
        setField(term292744, term292744.getClass(), "key2", term292854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term292744;
        args[1] = null;
        callMethod(klass, "put", argTypes, term292652, args);
    }

};


