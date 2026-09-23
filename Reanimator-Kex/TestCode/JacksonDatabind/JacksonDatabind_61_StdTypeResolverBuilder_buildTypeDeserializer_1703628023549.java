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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term658111;
     Object term658513;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term660025 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term660024 = ((Class) term660025).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term660024).setAccessible(true);
        Object enum701 = ((Field) term660024).get((Object) null);
        Class<? extends Object> term660386 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term660385 = ((Class) term660386).getDeclaredField((String) "NONE");
        ((Field) term660385).setAccessible(true);
        Object enum702 = ((Field) term660385).get((Object) null);
        term658111 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term658111, term658111.getClass(), "_appliesFor", enum701);
        setField(term658111, term658111.getClass(), "_idType", enum702);
        Class<? extends Object> term658641 = Class.forName((String) "java.util.stream.LongPipeline$8$1");
        term658513 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term658605 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term658605, term658605.getClass(), "_class", term658641);
        setField(term658513, term658513.getClass(), "_referencedType", term658605);
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
        args[1] = term658513;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term658111, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


