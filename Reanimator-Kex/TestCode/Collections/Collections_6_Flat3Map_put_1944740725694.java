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

public class Flat3Map_put_1944740725694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164539;
     Object term165153;

    public Flat3Map_put_1944740725694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164539 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term164633 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term164725 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term164819 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term164931 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object term165061 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term164633, term164633.getClass(), "size", 3);
        setField(term164539, term164539.getClass(), "delegateMap", term164633);
        setIntField(term164539, term164539.getClass(), "size", 3);
        setIntField(term164539, term164539.getClass(), "hash3", 1091046632);
        setIntField(term164819, term164819.getClass(), "size", 0);
        setField(term164725, term164725.getClass(), "delegateMap", term164819);
        setIntField(term164725, term164725.getClass(), "size", 3);
        setField(term164725, term164725.getClass(), "key3", term164931);
        setField(term164725, term164725.getClass(), "key2", null);
        setField(term164725, term164725.getClass(), "value2", null);
        setField(term164539, term164539.getClass(), "key3", term164725);
        setIntField(term164539, term164539.getClass(), "hash2", 1091046632);
        setField(term164539, term164539.getClass(), "key2", null);
        setIntField(term164539, term164539.getClass(), "hash1", 1091046632);
        setField(term164539, term164539.getClass(), "key1", null);
        setField(term164539, term164539.getClass(), "value3", null);
        setField(term164539, term164539.getClass(), "value2", null);
        setField(term164539, term164539.getClass(), "value1", term165061);
        term165153 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term165263 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term165153, term165153.getClass(), "delegateMap", null);
        setIntField(term165153, term165153.getClass(), "size", 3);
        setIntField(term165153, term165153.getClass(), "hash3", 6106120);
        setField(term165153, term165153.getClass(), "value3", null);
        setIntField(term165153, term165153.getClass(), "hash2", 57568);
        setIntField(term165263, term165263.getClass(), "size", 0);
        setField(term165153, term165153.getClass(), "value2", term165263);
        setIntField(term165153, term165153.getClass(), "hash1", 1084882944);
        setField(term165153, term165153.getClass(), "value1", null);
        setField(term165153, term165153.getClass(), "key3", null);
        setField(term165153, term165153.getClass(), "key2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term165153;
        args[1] = null;
        callMethod(klass, "put", argTypes, term164539, args);
    }

};


