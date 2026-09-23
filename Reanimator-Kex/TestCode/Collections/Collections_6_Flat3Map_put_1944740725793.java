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

public class Flat3Map_put_1944740725793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207780;
     Object term208178;

    public Flat3Map_put_1944740725793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207780 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term207872 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term207910 = newInstance(Class.forName("java.lang.Object"));
        Object term207948 = newInstance(Class.forName("java.lang.Object"));
        term208178 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term208224 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term207780, term207780.getClass(), "delegateMap", null);
        setIntField(term207780, term207780.getClass(), "size", 3);
        setIntField(term207780, term207780.getClass(), "hash3", 0);
        setField(term207872, term207872.getClass(), "delegateMap", null);
        setIntField(term207872, term207872.getClass(), "size", 0);
        setField(term207780, term207780.getClass(), "key3", term207872);
        setField(term207780, term207780.getClass(), "key2", term207910);
        setField(term207780, term207780.getClass(), "value2", null);
        setField(term207780, term207780.getClass(), "value3", term207948);
        setIntField(term207780, term207780.getClass(), "hash2", 0);
        setIntField(term207780, term207780.getClass(), "hash1", 0);
        setField(term208178, term208178.getClass(), "delegateMap", null);
        setIntField(term208178, term208178.getClass(), "size", 3);
        setIntField(term208178, term208178.getClass(), "hash3", 0);
        setField(term208178, term208178.getClass(), "value3", null);
        setIntField(term208178, term208178.getClass(), "hash2", 0);
        setField(term208178, term208178.getClass(), "value2", null);
        setIntField(term208178, term208178.getClass(), "hash1", 0);
        setField(term208178, term208178.getClass(), "value1", null);
        setField(term208178, term208178.getClass(), "key3", null);
        setField(term208224, term208224.getClass(), "delegateMap", null);
        setIntField(term208224, term208224.getClass(), "size", 0);
        setField(term208178, term208178.getClass(), "key2", term208224);
        setField(term207780, term207780.getClass(), "key1", term208178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term208178;
        args[1] = null;
        callMethod(klass, "put", argTypes, term207780, args);
    }

};


