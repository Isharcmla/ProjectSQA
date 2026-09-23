package com.fasterxml.jackson.databind.deser.impl;

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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class JavaUtilCollectionsDeserializers_converter_180689703354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327339;
     Object term327635;

    public JavaUtilCollectionsDeserializers_converter_180689703354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term327375 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$2");
        Class<? extends Object> term327503 = Class.forName((String) "java.util.concurrent.CompletableFuture$DelayedExecutor");
        term327339 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term327467 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term327599 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term327339, term327339.getClass(), "_class", term327375);
        setField(term327467, term327467.getClass(), "_class", term327503);
        setField(term327599, term327599.getClass(), "_class", null);
        setField(term327467, term327467.getClass(), "_superClass", term327599);
        setField(term327339, term327339.getClass(), "_superClass", term327467);
        term327635 = Class.forName((String) "java.util.ListResourceBundle");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = term327339;
        args[2] = term327635;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


