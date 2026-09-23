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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534975;
     Object term535237;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term536422 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term536421 = ((Class) term536422).getDeclaredField((String) "NON_FINAL");
        ((Field) term536421).setAccessible(true);
        Object enum592 = ((Field) term536421).get((Object) null);
        term534975 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term534975, term534975.getClass(), "_appliesFor", enum592);
        Class<? extends Object> term535393 = Class.forName((String) "java.util.concurrent.atomic.LongAdder");
        term535237 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term535357 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term535357, term535357.getClass(), "_class", term535393);
        setField(term535237, term535237.getClass(), "_referencedType", term535357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term535237;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term534975, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


