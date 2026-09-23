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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625208;
     Object term625470;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term626558 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term626557 = ((Class) term626558).getDeclaredField((String) "NON_FINAL");
        ((Field) term626557).setAccessible(true);
        Object enum673 = ((Field) term626557).get((Object) null);
        term625208 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term625208, term625208.getClass(), "_appliesFor", enum673);
        Class<? extends Object> term625598 = Class.forName((String) "java.util.stream.Nodes$SpinedNodeBuilder");
        term625470 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term625562 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term625562, term625562.getClass(), "_class", term625598);
        setField(term625470, term625470.getClass(), "_referencedType", term625562);
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
        args[1] = term625470;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term625208, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


