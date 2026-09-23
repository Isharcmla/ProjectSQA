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
import java.lang.IllegalArgumentException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MultiValueMap_createCollection_1754308673165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36576;

    public MultiValueMap_createCollection_1754308673165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36734 = Class.forName((String) "java.lang.IndexOutOfBoundsException");
        term36576 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term36698 = newInstance(Class.forName("org.apache.commons.collections.functors.InstantiateFactory"));
        Object[] term36432 = (Object[]) newArray("java.lang.Class", 0);
        setField(term36698, term36698.getClass(), "iConstructor", null);
        setField(term36698, term36698.getClass(), "iClassToInstantiate", term36734);
        setField(term36698, term36698.getClass(), "iParamTypes", term36432);
        setField(term36576, term36576.getClass(), "collectionFactory", term36698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "createCollection", argTypes, term36576, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


