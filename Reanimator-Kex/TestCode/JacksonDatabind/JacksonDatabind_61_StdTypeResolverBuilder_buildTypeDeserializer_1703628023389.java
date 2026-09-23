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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418049;
     Object term418311;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term419051 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term419050 = ((Class) term419051).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term419050).setAccessible(true);
        Object enum486 = ((Field) term419050).get((Object) null);
        term418049 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term418049, term418049.getClass(), "_appliesFor", enum486);
        term418311 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term418403 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term418311, term418311.getClass(), "_referencedType", term418403);
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
        args[1] = term418311;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term418049, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


