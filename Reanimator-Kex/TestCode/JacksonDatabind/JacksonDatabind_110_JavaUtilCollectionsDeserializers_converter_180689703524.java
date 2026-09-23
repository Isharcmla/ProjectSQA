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

public class JavaUtilCollectionsDeserializers_converter_180689703524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547499;
     Object term547877;

    public JavaUtilCollectionsDeserializers_converter_180689703524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term547535 = Class.forName((String) "com.fasterxml.jackson.databind.DatabindContext");
        term547877 = Class.forName((String) "java.util.jar.JavaUtilJarAccessImpl");
        term547499 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term547627 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term547723 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term547823 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term547499, term547499.getClass(), "_class", term547535);
        setField(term547627, term547627.getClass(), "_class", null);
        setField(term547723, term547723.getClass(), "_class", null);
        setField(term547823, term547823.getClass(), "_class", term547877);
        setField(term547723, term547723.getClass(), "_superClass", term547823);
        setField(term547627, term547627.getClass(), "_superClass", term547723);
        setField(term547499, term547499.getClass(), "_superClass", term547627);
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
        args[1] = term547499;
        args[2] = term547877;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


