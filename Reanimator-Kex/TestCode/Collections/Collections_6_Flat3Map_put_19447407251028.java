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

public class Flat3Map_put_19447407251028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293335;

    public Flat3Map_put_19447407251028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293335 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term293370 = newInstance(Class.forName("java.util.stream.IntPipeline$1$1"));
        setField(term293335, term293335.getClass(), "delegateMap", null);
        setIntField(term293335, term293335.getClass(), "size", 1);
        setIntField(term293335, term293335.getClass(), "hash1", 0);
        setField(term293335, term293335.getClass(), "value1", term293370);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term293335;
        args[1] = null;
        callMethod(klass, "put", argTypes, term293335, args);
    }

};


