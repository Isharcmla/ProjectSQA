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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250928;
     Object term251494;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term252802 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term252801 = ((Class) term252802).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term252801).setAccessible(true);
        Object enum311 = ((Field) term252801).get((Object) null);
        Class<? extends Object> term253142 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term253141 = ((Class) term253142).getDeclaredField((String) "CUSTOM");
        ((Field) term253141).setAccessible(true);
        Object enum312 = ((Field) term253141).get((Object) null);
        term250928 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        Object term251374 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term250928, term250928.getClass(), "_appliesFor", enum311);
        setField(term250928, term250928.getClass(), "_idType", enum312);
        setField(term250928, term250928.getClass(), "_customIdResolver", term251374);
        Class<? extends Object> term251530 = Class.forName((String) "com.fasterxml.jackson.annotation.JacksonAnnotation");
        term251494 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term251494, term251494.getClass(), "_class", term251530);
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
        args[1] = term251494;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term250928, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


