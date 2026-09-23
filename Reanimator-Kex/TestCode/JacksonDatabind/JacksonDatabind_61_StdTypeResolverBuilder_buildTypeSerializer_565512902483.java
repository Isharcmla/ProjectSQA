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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550175;
     Object term550437;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term551169 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term551168 = ((Class) term551169).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term551168).setAccessible(true);
        Object enum607 = ((Field) term551168).get((Object) null);
        term550175 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term550175, term550175.getClass(), "_appliesFor", enum607);
        term550437 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term550529 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term550529, term550529.getClass(), "_class", null);
        setField(term550437, term550437.getClass(), "_referencedType", term550529);
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
        args[1] = term550437;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term550175, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


