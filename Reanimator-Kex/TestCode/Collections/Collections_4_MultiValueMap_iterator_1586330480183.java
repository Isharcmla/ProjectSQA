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

public class MultiValueMap_iterator_1586330480183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45213;

    public MultiValueMap_iterator_1586330480183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45213 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term45315 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term45417 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term45417, term45417.getClass(), "map", term45417);
        setField(term45315, term45315.getClass(), "map", term45417);
        setField(term45213, term45213.getClass(), "map", term45315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "iterator", argTypes, term45213, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


