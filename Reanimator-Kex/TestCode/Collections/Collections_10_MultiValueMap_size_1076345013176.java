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

public class MultiValueMap_size_1076345013176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80688;

    public MultiValueMap_size_1076345013176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80688 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term80790 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term80892 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term80892, term80892.getClass(), "map", term80892);
        setField(term80790, term80790.getClass(), "map", term80892);
        setField(term80688, term80688.getClass(), "map", term80790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "size", argTypes, term80688, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


