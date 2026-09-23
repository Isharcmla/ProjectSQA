package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.bind.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class JsonAdapterAnnotationTypeAdapterFactory_init_19946121943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term167;
     Object term170;

    public JsonAdapterAnnotationTypeAdapterFactory_init_19946121943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        term1 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        setField(term1, term1.getClass(), "instanceCreators", term2);
        HashMap term169 = new HashMap();
        term167 = newInstance(Class.forName("com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory"));
        Object term168 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        setField(term168, term168.getClass(), "instanceCreators", term169);
        setField(term167, term167.getClass(), "constructorConstructor", term168);
        HashMap term171 = new HashMap();
        term170 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        setField(term170, term170.getClass(), "instanceCreators", term171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term167));
        assertTrue(recursiveEquals(term1, term170));
    }

};


