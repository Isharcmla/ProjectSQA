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
import java.lang.StackOverflowError;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_put_2036360295162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35123;

    public MultiValueMap_put_2036360295162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35123 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term35225 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term35327 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term35327, term35327.getClass(), "map", term35327);
        setField(term35225, term35225.getClass(), "map", term35327);
        setField(term35123, term35123.getClass(), "map", term35225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "put", argTypes, term35123, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


