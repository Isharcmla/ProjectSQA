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

public class Flat3Map_put_1944740725704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170299;
     Object term170575;

    public Flat3Map_put_1944740725704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170299 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term170391 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term170483 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term170299, term170299.getClass(), "delegateMap", null);
        setIntField(term170299, term170299.getClass(), "size", 3);
        setIntField(term170299, term170299.getClass(), "hash3", 0);
        setField(term170391, term170391.getClass(), "delegateMap", null);
        setIntField(term170391, term170391.getClass(), "size", 3);
        setField(term170391, term170391.getClass(), "key3", term170483);
        setField(term170391, term170391.getClass(), "key2", null);
        setField(term170391, term170391.getClass(), "value2", null);
        setField(term170299, term170299.getClass(), "key3", term170391);
        term170575 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term170685 = newInstance(Class.forName("org.apache.commons.collections.functors.NotPredicate"));
        setField(term170575, term170575.getClass(), "delegateMap", null);
        setIntField(term170575, term170575.getClass(), "size", 3);
        setIntField(term170575, term170575.getClass(), "hash3", 0);
        setField(term170575, term170575.getClass(), "value3", null);
        setIntField(term170575, term170575.getClass(), "hash2", 0);
        setField(term170575, term170575.getClass(), "value2", null);
        setIntField(term170575, term170575.getClass(), "hash1", 0);
        setField(term170575, term170575.getClass(), "value1", null);
        setField(term170575, term170575.getClass(), "key3", null);
        setField(term170575, term170575.getClass(), "key2", null);
        setField(term170575, term170575.getClass(), "key1", term170685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term170575;
        args[1] = null;
        callMethod(klass, "put", argTypes, term170299, args);
    }

};


