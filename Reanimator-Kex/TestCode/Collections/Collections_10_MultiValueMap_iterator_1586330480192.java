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

public class MultiValueMap_iterator_1586330480192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100468;

    public MultiValueMap_iterator_1586330480192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100468 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term100570 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term100672 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term100672, term100672.getClass(), "map", term100672);
        setField(term100570, term100570.getClass(), "map", term100672);
        setField(term100468, term100468.getClass(), "map", term100570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "iterator", argTypes, term100468, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


