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

public class Flat3Map_put_19447407251184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369871;
     Object term370275;

    public Flat3Map_put_19447407251184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369871 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term369981 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term370073 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term370183 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term369981, term369981.getClass(), "size", 0);
        setField(term369871, term369871.getClass(), "delegateMap", term369981);
        setIntField(term369871, term369871.getClass(), "size", 3);
        setIntField(term369871, term369871.getClass(), "hash3", 0);
        setField(term370073, term370073.getClass(), "delegateMap", null);
        setIntField(term370073, term370073.getClass(), "size", 3);
        setField(term370073, term370073.getClass(), "key3", term369871);
        setField(term370073, term370073.getClass(), "key2", term370183);
        setField(term370073, term370073.getClass(), "key1", null);
        setField(term370073, term370073.getClass(), "value1", null);
        setIntField(term370073, term370073.getClass(), "hash3", 0);
        setField(term370073, term370073.getClass(), "value3", null);
        setField(term369871, term369871.getClass(), "key3", term370073);
        term370275 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term370367 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term370477 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term370275, term370275.getClass(), "delegateMap", null);
        setIntField(term370275, term370275.getClass(), "size", 3);
        setIntField(term370275, term370275.getClass(), "hash3", 0);
        setField(term370275, term370275.getClass(), "value3", null);
        setIntField(term370275, term370275.getClass(), "hash2", 0);
        setField(term370275, term370275.getClass(), "value2", null);
        setIntField(term370275, term370275.getClass(), "hash1", 0);
        setField(term370275, term370275.getClass(), "value1", null);
        setField(term370275, term370275.getClass(), "key3", null);
        setField(term370367, term370367.getClass(), "delegateMap", null);
        setIntField(term370367, term370367.getClass(), "size", 0);
        setField(term370275, term370275.getClass(), "key2", term370367);
        setField(term370275, term370275.getClass(), "key1", term370477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term370275;
        args[1] = null;
        callMethod(klass, "put", argTypes, term369871, args);
    }

};


