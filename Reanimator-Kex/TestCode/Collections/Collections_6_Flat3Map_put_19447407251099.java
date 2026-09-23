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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_put_19447407251099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325672;
     Object term325950;

    public Flat3Map_put_19447407251099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term325672 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term325764 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term325858 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term325672, term325672.getClass(), "delegateMap", null);
        setIntField(term325672, term325672.getClass(), "size", 3);
        setIntField(term325672, term325672.getClass(), "hash3", 0);
        setField(term325672, term325672.getClass(), "key3", null);
        setIntField(term325672, term325672.getClass(), "hash2", 0);
        setField(term325672, term325672.getClass(), "key2", null);
        setIntField(term325672, term325672.getClass(), "hash1", 0);
        setIntField(term325858, term325858.getClass(), "size", 3);
        setField(term325764, term325764.getClass(), "delegateMap", term325858);
        setField(term325672, term325672.getClass(), "key1", term325764);
        term325950 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term326044 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term325950, term325950.getClass(), "delegateMap", null);
        setIntField(term325950, term325950.getClass(), "size", 3);
        setIntField(term325950, term325950.getClass(), "hash3", 0);
        setField(term325950, term325950.getClass(), "value3", null);
        setIntField(term325950, term325950.getClass(), "hash2", 0);
        setIntField(term326044, term326044.getClass(), "size", 0);
        setField(term325950, term325950.getClass(), "value2", term326044);
        setIntField(term325950, term325950.getClass(), "hash1", 0);
        setField(term325950, term325950.getClass(), "value1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term325950;
        args[1] = null;
        try {
            callMethod(klass, "put", argTypes, term325672, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


