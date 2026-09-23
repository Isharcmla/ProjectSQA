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

public class Flat3Map_put_1944740725856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223643;
     Object term224257;

    public Flat3Map_put_1944740725856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223643 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term223735 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term223829 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term223917 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        term224257 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term224312 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term223227 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term224211 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term223643, term223643.getClass(), "delegateMap", null);
        setIntField(term223643, term223643.getClass(), "size", 3);
        setIntField(term223643, term223643.getClass(), "hash3", 1020177344);
        setIntField(term223829, term223829.getClass(), "size", 0);
        setField(term223735, term223735.getClass(), "delegateMap", term223829);
        setIntField(term223735, term223735.getClass(), "size", 3);
        setField(term223735, term223735.getClass(), "key3", term223917);
        setField(term223735, term223735.getClass(), "key2", null);
        setField(term223735, term223735.getClass(), "value2", null);
        setField(term223643, term223643.getClass(), "key3", term223735);
        setIntField(term223643, term223643.getClass(), "hash2", 1020177344);
        setField(term223643, term223643.getClass(), "key2", null);
        setIntField(term223643, term223643.getClass(), "hash1", 1020177344);
        setField(term223643, term223643.getClass(), "key1", null);
        setField(term224257, term224257.getClass(), "delegateMap", null);
        setIntField(term224257, term224257.getClass(), "size", 3);
        setIntField(term224257, term224257.getClass(), "hash3", 33669120);
        setField(term224257, term224257.getClass(), "value3", null);
        setIntField(term224257, term224257.getClass(), "hash2", 978550784);
        setIntField(term224312, term224312.getClass(), "size", 0);
        setField(term224257, term224257.getClass(), "value2", term224312);
        setIntField(term224257, term224257.getClass(), "hash1", 7957440);
        setField(term224257, term224257.getClass(), "value1", null);
        setField(term224257, term224257.getClass(), "key3", null);
        setField(term224257, term224257.getClass(), "key2", null);
        setField(term223643, term223643.getClass(), "value3", term224257);
        setField(term223643, term223643.getClass(), "value2", term223227);
        setField(term223643, term223643.getClass(), "value1", term224211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term224257;
        args[1] = null;
        callMethod(klass, "put", argTypes, term223643, args);
    }

};


