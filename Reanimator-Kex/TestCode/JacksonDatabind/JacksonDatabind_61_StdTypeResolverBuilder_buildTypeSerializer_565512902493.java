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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564449;
     Object term564711;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term565852 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term565851 = ((Class) term565852).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term565851).setAccessible(true);
        Object enum619 = ((Field) term565851).get((Object) null);
        term564449 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term564449, term564449.getClass(), "_appliesFor", enum619);
        Class<? extends Object> term564867 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer");
        term564711 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term564831 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term564831, term564831.getClass(), "_class", term564867);
        setField(term564711, term564711.getClass(), "_referencedType", term564831);
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
        args[1] = term564711;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term564449, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


