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
import java.util.HashMap;

public class Flat3Map_put_1944740725743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189144;
     Object term189598;

    public Flat3Map_put_1944740725743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term189376 = new HashMap();
        term189144 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term189236 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term189328 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term189506 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term189144, term189144.getClass(), "delegateMap", null);
        setIntField(term189144, term189144.getClass(), "size", 3);
        setIntField(term189144, term189144.getClass(), "hash3", -1986414048);
        setField(term189236, term189236.getClass(), "delegateMap", null);
        setIntField(term189236, term189236.getClass(), "size", 3);
        setField(term189236, term189236.getClass(), "key3", term189328);
        setField(term189236, term189236.getClass(), "key2", null);
        setField(term189236, term189236.getClass(), "value2", term189376);
        setIntField(term189236, term189236.getClass(), "hash3", -1073709762);
        setField(term189236, term189236.getClass(), "value3", null);
        setIntField(term189236, term189236.getClass(), "hash2", 542253577);
        setIntField(term189236, term189236.getClass(), "hash1", 1209173027);
        setField(term189236, term189236.getClass(), "value1", null);
        setField(term189144, term189144.getClass(), "key3", term189236);
        setIntField(term189144, term189144.getClass(), "hash2", 1986414047);
        setIntField(term189144, term189144.getClass(), "hash1", -1986414048);
        setField(term189144, term189144.getClass(), "key1", null);
        setField(term189144, term189144.getClass(), "value3", null);
        setField(term189144, term189144.getClass(), "key2", null);
        setField(term189144, term189144.getClass(), "value2", term189506);
        setField(term189144, term189144.getClass(), "value1", null);
        term189598 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term189598, term189598.getClass(), "delegateMap", null);
        setIntField(term189598, term189598.getClass(), "size", 3);
        setIntField(term189598, term189598.getClass(), "hash3", -262568448);
        setField(term189598, term189598.getClass(), "value3", null);
        setIntField(term189598, term189598.getClass(), "hash2", 222300160);
        setField(term189598, term189598.getClass(), "value2", null);
        setIntField(term189598, term189598.getClass(), "hash1", -1946145760);
        setField(term189598, term189598.getClass(), "value1", null);
        setField(term189598, term189598.getClass(), "key3", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term189598;
        args[1] = null;
        callMethod(klass, "put", argTypes, term189144, args);
    }

};


