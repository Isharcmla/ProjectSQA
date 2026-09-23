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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term575153;
     Object term575687;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term577147 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term577146 = ((Class) term577147).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term577146).setAccessible(true);
        Object enum628 = ((Field) term577146).get((Object) null);
        Class<? extends Object> term577487 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term577486 = ((Class) term577487).getDeclaredField((String) "MINIMAL_CLASS");
        ((Field) term577486).setAccessible(true);
        Object enum629 = ((Field) term577486).get((Object) null);
        term575153 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        Object term575583 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term575153, term575153.getClass(), "_appliesFor", enum628);
        setField(term575153, term575153.getClass(), "_idType", enum629);
        setField(term575153, term575153.getClass(), "_customIdResolver", term575583);
        Class<? extends Object> term575843 = Class.forName((String) "java.nio.HeapDoubleBufferR");
        term575687 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term575807 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term575807, term575807.getClass(), "_class", term575843);
        setField(term575687, term575687.getClass(), "_referencedType", term575807);
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
        args[1] = term575687;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term575153, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


