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

public class MultiValueMap_size_1076345013160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34257;

    public MultiValueMap_size_1076345013160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34257 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term34359 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term34461 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term34563 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term34461, term34461.getClass(), "map", term34563);
        setField(term34359, term34359.getClass(), "map", term34461);
        setField(term34257, term34257.getClass(), "map", term34359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "size", argTypes, term34257, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


