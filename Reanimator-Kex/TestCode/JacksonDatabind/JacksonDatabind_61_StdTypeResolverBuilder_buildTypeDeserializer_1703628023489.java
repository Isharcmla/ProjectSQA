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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558944;
     Object term559206;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term560496 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term560495 = ((Class) term560496).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term560495).setAccessible(true);
        Object enum615 = ((Field) term560495).get((Object) null);
        term558944 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term558944, term558944.getClass(), "_appliesFor", enum615);
        Class<? extends Object> term559362 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJDouble$Sorter");
        term559206 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term559326 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term559326, term559326.getClass(), "_class", term559362);
        setField(term559206, term559206.getClass(), "_referencedType", term559326);
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
        args[1] = term559206;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term558944, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


