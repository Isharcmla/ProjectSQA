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

public class Flat3Map_put_1944740725712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174470;
     Object term174672;

    public Flat3Map_put_1944740725712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174470 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term174580 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term174470, term174470.getClass(), "delegateMap", term174580);
        setIntField(term174470, term174470.getClass(), "size", 3);
        setIntField(term174470, term174470.getClass(), "hash3", 0);
        setField(term174470, term174470.getClass(), "key3", null);
        setIntField(term174470, term174470.getClass(), "hash2", 0);
        setField(term174470, term174470.getClass(), "key2", null);
        setIntField(term174470, term174470.getClass(), "hash1", 0);
        setField(term174470, term174470.getClass(), "key1", term174470);
        term174672 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term174766 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term174672, term174672.getClass(), "delegateMap", null);
        setIntField(term174672, term174672.getClass(), "size", 3);
        setIntField(term174672, term174672.getClass(), "hash3", 0);
        setField(term174672, term174672.getClass(), "value3", null);
        setIntField(term174672, term174672.getClass(), "hash2", 0);
        setField(term174672, term174672.getClass(), "value2", null);
        setIntField(term174672, term174672.getClass(), "hash1", 0);
        setIntField(term174766, term174766.getClass(), "size", 0);
        setField(term174672, term174672.getClass(), "value1", term174766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term174672;
        args[1] = null;
        callMethod(klass, "put", argTypes, term174470, args);
    }

};


