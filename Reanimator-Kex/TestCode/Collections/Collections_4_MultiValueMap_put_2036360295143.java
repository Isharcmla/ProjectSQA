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

public class MultiValueMap_put_2036360295143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31086;

    public MultiValueMap_put_2036360295143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31086 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term31188 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term31290 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term31290, term31290.getClass(), "map", term31290);
        setField(term31188, term31188.getClass(), "map", term31290);
        setField(term31086, term31086.getClass(), "map", term31188);
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
            callMethod(klass, "put", argTypes, term31086, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


