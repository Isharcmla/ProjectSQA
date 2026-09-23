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

public class Flat3Map_put_19447407251198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379122;
     Object term379382;

    public Flat3Map_put_19447407251198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379122 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term379160 = newInstance(Class.forName("java.lang.Object"));
        Object term379252 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term379290 = newInstance(Class.forName("java.lang.Object"));
        setField(term379122, term379122.getClass(), "delegateMap", null);
        setIntField(term379122, term379122.getClass(), "size", 3);
        setIntField(term379122, term379122.getClass(), "hash3", 0);
        setField(term379122, term379122.getClass(), "key3", term379160);
        setIntField(term379122, term379122.getClass(), "hash2", 0);
        setField(term379252, term379252.getClass(), "delegateMap", null);
        setIntField(term379252, term379252.getClass(), "size", 3);
        setField(term379252, term379252.getClass(), "key3", term379290);
        setField(term379252, term379252.getClass(), "key2", null);
        setField(term379252, term379252.getClass(), "value2", null);
        setField(term379122, term379122.getClass(), "key2", term379252);
        term379382 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term379474 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term379512 = newInstance(Class.forName("java.lang.Object"));
        setField(term379382, term379382.getClass(), "delegateMap", null);
        setIntField(term379382, term379382.getClass(), "size", 3);
        setIntField(term379382, term379382.getClass(), "hash3", 0);
        setField(term379382, term379382.getClass(), "value3", null);
        setIntField(term379382, term379382.getClass(), "hash2", 0);
        setField(term379382, term379382.getClass(), "value2", null);
        setIntField(term379382, term379382.getClass(), "hash1", 0);
        setField(term379382, term379382.getClass(), "value1", null);
        setField(term379382, term379382.getClass(), "key3", null);
        setField(term379474, term379474.getClass(), "delegateMap", null);
        setIntField(term379474, term379474.getClass(), "size", 3);
        setIntField(term379474, term379474.getClass(), "hash3", 0);
        setField(term379474, term379474.getClass(), "value3", null);
        setIntField(term379474, term379474.getClass(), "hash2", 0);
        setField(term379474, term379474.getClass(), "value2", null);
        setIntField(term379474, term379474.getClass(), "hash1", 0);
        setField(term379474, term379474.getClass(), "value1", term379512);
        setField(term379382, term379382.getClass(), "key2", term379474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term379382;
        args[1] = null;
        callMethod(klass, "put", argTypes, term379122, args);
    }

};


