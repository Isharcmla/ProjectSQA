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

public class Flat3Map_put_19447407251187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371627;
     Object term371675;

    public Flat3Map_put_19447407251187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term371627 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term371627, term371627.getClass(), "delegateMap", null);
        setIntField(term371627, term371627.getClass(), "size", 2);
        setIntField(term371627, term371627.getClass(), "hash2", -1);
        setIntField(term371627, term371627.getClass(), "hash1", 0);
        term371675 = newInstance(Class.forName("java.util.Collections"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term371675;
        args[1] = null;
        callMethod(klass, "put", argTypes, term371627, args);
    }

};


