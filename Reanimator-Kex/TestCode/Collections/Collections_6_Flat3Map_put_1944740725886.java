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

public class Flat3Map_put_1944740725886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233961;
     Object term234237;

    public Flat3Map_put_1944740725886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233961 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term234053 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term234145 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term233961, term233961.getClass(), "delegateMap", null);
        setIntField(term233961, term233961.getClass(), "size", 3);
        setIntField(term233961, term233961.getClass(), "hash3", 0);
        setField(term234053, term234053.getClass(), "delegateMap", null);
        setIntField(term234053, term234053.getClass(), "size", 3);
        setField(term234145, term234145.getClass(), "delegateMap", null);
        setIntField(term234145, term234145.getClass(), "size", 0);
        setField(term234053, term234053.getClass(), "key3", term234145);
        setField(term234053, term234053.getClass(), "key2", null);
        setField(term234053, term234053.getClass(), "value2", null);
        setIntField(term234053, term234053.getClass(), "hash3", 0);
        setField(term234053, term234053.getClass(), "value3", null);
        setField(term233961, term233961.getClass(), "key3", term234053);
        term234237 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term234329 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term234421 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term234237, term234237.getClass(), "delegateMap", null);
        setIntField(term234237, term234237.getClass(), "size", 3);
        setIntField(term234237, term234237.getClass(), "hash3", 0);
        setField(term234237, term234237.getClass(), "value3", null);
        setIntField(term234237, term234237.getClass(), "hash2", 0);
        setField(term234237, term234237.getClass(), "value2", null);
        setIntField(term234237, term234237.getClass(), "hash1", 0);
        setField(term234237, term234237.getClass(), "value1", null);
        setField(term234237, term234237.getClass(), "key3", null);
        setField(term234329, term234329.getClass(), "delegateMap", null);
        setIntField(term234329, term234329.getClass(), "size", 0);
        setField(term234237, term234237.getClass(), "key2", term234329);
        setField(term234421, term234421.getClass(), "delegateMap", null);
        setIntField(term234421, term234421.getClass(), "size", 1);
        setField(term234237, term234237.getClass(), "key1", term234421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term234237;
        args[1] = null;
        callMethod(klass, "put", argTypes, term233961, args);
    }

};


