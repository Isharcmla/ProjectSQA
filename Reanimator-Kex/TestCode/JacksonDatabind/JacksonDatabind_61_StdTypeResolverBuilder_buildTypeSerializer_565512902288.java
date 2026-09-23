package com.fasterxml.jackson.databind.jsontype.impl;

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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeSerializer_565512902288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301392;
     Object term301646;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term304517 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term304516 = ((Class) term304517).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term304516).setAccessible(true);
        Object enum357 = ((Field) term304516).get((Object) null);
        term301392 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term301392, term301392.getClass(), "_appliesFor", enum357);
        Class<? extends Object> term301682 = Class.forName((String) "java.util.Calendar$1");
        term301646 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term301646, term301646.getClass(), "_class", term301682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term301646;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term301392, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


