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

public class Flat3Map_put_1944740725689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161036;
     Object term161220;

    public Flat3Map_put_1944740725689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161036 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term161266 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term161036, term161036.getClass(), "delegateMap", null);
        setIntField(term161036, term161036.getClass(), "size", 3);
        setIntField(term161036, term161036.getClass(), "hash3", 0);
        setField(term161266, term161266.getClass(), "delegateMap", null);
        setIntField(term161266, term161266.getClass(), "size", 0);
        setField(term161266, term161266.getClass(), "key3", term161266);
        setField(term161266, term161266.getClass(), "key2", null);
        setField(term161266, term161266.getClass(), "value2", null);
        setIntField(term161266, term161266.getClass(), "hash3", 0);
        setField(term161036, term161036.getClass(), "key3", term161266);
        term161220 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term161220, term161220.getClass(), "delegateMap", null);
        setIntField(term161220, term161220.getClass(), "size", 3);
        setIntField(term161220, term161220.getClass(), "hash3", 0);
        setField(term161220, term161220.getClass(), "value3", null);
        setIntField(term161220, term161220.getClass(), "hash2", 0);
        setField(term161220, term161220.getClass(), "value2", null);
        setIntField(term161220, term161220.getClass(), "hash1", 0);
        setField(term161220, term161220.getClass(), "value1", null);
        setField(term161220, term161220.getClass(), "key3", null);
        setField(term161220, term161220.getClass(), "key2", null);
        setField(term161220, term161220.getClass(), "key1", term161266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term161220;
        args[1] = null;
        callMethod(klass, "put", argTypes, term161036, args);
    }

};


