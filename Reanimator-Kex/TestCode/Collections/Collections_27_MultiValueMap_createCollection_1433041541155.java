package org.apache.commons.collections4.map;

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
import org.apache.commons.collections4.FunctorException;
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MultiValueMap_createCollection_1433041541155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52992;

    public MultiValueMap_createCollection_1433041541155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53168 = Class.forName((String) "java.util.stream.ReduceOps$12ReducingSink");
        term52992 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term53132 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap$ReflectionFactory"));
        setField(term53132, term53132.getClass(), "clazz", term53168);
        setField(term52992, term52992.getClass(), "collectionFactory", term53132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "createCollection", argTypes, term52992, args);
            assertTrue(false);
        }
        catch (FunctorException e) {
        }

    }

};


