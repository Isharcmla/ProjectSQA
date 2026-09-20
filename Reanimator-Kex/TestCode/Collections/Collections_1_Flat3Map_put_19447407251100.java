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

public class Flat3Map_put_19447407251100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217942;

    public Flat3Map_put_19447407251100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217942 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term217997 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term217942, term217942.getClass(), "delegateMap", null);
        setIntField(term217942, term217942.getClass(), "size", 3);
        setIntField(term217942, term217942.getClass(), "hash3", 0);
        setField(term217942, term217942.getClass(), "value3", null);
        setIntField(term217942, term217942.getClass(), "hash2", 0);
        setIntField(term217997, term217997.getClass(), "size", -2147483648);
        setField(term217942, term217942.getClass(), "value2", term217997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term217942;
        args[1] = null;
        try {
            callMethod(klass, "put", argTypes, term217942, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
