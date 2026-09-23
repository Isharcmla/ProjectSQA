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

public class Flat3Map_put_1944740725724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182941;
     Object term183467;

    public Flat3Map_put_1944740725724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182941 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term183033 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term183149 = newInstance(Class.forName("org.apache.commons.collections.map.ReferenceIdentityMap"));
        Object term183265 = newInstance(Class.forName("org.apache.commons.collections.map.ReferenceIdentityMap"));
        Object term183375 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term182941, term182941.getClass(), "delegateMap", null);
        setIntField(term182941, term182941.getClass(), "size", 3);
        setIntField(term182941, term182941.getClass(), "hash3", -566226935);
        setField(term182941, term182941.getClass(), "key3", null);
        setIntField(term182941, term182941.getClass(), "hash2", -566226935);
        setField(term182941, term182941.getClass(), "key2", null);
        setIntField(term182941, term182941.getClass(), "hash1", -566226935);
        setIntField(term183149, term183149.getClass(), "size", 0);
        setField(term183033, term183033.getClass(), "delegateMap", term183149);
        setField(term182941, term182941.getClass(), "key1", term183033);
        setField(term182941, term182941.getClass(), "value3", null);
        setField(term182941, term182941.getClass(), "value2", term183265);
        setField(term182941, term182941.getClass(), "value1", term183375);
        term183467 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term183577 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term183467, term183467.getClass(), "delegateMap", null);
        setIntField(term183467, term183467.getClass(), "size", 3);
        setIntField(term183467, term183467.getClass(), "hash3", 2080374788);
        setField(term183467, term183467.getClass(), "value3", null);
        setIntField(term183467, term183467.getClass(), "hash2", 1103102336);
        setField(term183467, term183467.getClass(), "value2", null);
        setIntField(term183467, term183467.getClass(), "hash1", 545263237);
        setIntField(term183577, term183577.getClass(), "size", 0);
        setField(term183467, term183467.getClass(), "value1", term183577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term183467;
        args[1] = null;
        callMethod(klass, "put", argTypes, term182941, args);
    }

};


