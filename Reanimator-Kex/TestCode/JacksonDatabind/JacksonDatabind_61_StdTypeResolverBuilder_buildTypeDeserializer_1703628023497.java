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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570918;
     Object term571320;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term572806 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term572805 = ((Class) term572806).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term572805).setAccessible(true);
        Object enum624 = ((Field) term572805).get((Object) null);
        Class<? extends Object> term573167 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term573166 = ((Class) term573167).getDeclaredField((String) "CUSTOM");
        ((Field) term573166).setAccessible(true);
        Object enum625 = ((Field) term573166).get((Object) null);
        term570918 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term570918, term570918.getClass(), "_appliesFor", enum624);
        setField(term570918, term570918.getClass(), "_idType", enum625);
        setField(term570918, term570918.getClass(), "_customIdResolver", null);
        Class<? extends Object> term571476 = Class.forName((String) "java.util.Spliterator$OfDouble");
        term571320 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term571440 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term571440, term571440.getClass(), "_class", term571476);
        setField(term571320, term571320.getClass(), "_referencedType", term571440);
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
        args[1] = term571320;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term570918, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


