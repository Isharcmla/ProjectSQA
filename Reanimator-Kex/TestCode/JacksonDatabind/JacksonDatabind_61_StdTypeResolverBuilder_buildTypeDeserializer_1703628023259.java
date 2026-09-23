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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265578;
     Object term265996;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term267328 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term267327 = ((Class) term267328).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term267327).setAccessible(true);
        Object enum324 = ((Field) term267327).get((Object) null);
        Class<? extends Object> term267689 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term267688 = ((Class) term267689).getDeclaredField((String) "CLASS");
        ((Field) term267688).setAccessible(true);
        Object enum325 = ((Field) term267688).get((Object) null);
        term265578 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term265578, term265578.getClass(), "_appliesFor", enum324);
        setField(term265578, term265578.getClass(), "_idType", enum325);
        setField(term265578, term265578.getClass(), "_customIdResolver", null);
        Class<? extends Object> term266032 = Class.forName((String) "java.util.regex.CharPredicates");
        term265996 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term265996, term265996.getClass(), "_class", term266032);
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
        args[1] = term265996;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term265578, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


