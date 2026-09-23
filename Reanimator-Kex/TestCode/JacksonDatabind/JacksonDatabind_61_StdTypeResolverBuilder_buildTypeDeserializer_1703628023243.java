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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238389;
     Object term238807;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term240114 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term240113 = ((Class) term240114).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term240113).setAccessible(true);
        Object enum300 = ((Field) term240113).get((Object) null);
        Class<? extends Object> term240475 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term240474 = ((Class) term240475).getDeclaredField((String) "CLASS");
        ((Field) term240474).setAccessible(true);
        Object enum301 = ((Field) term240474).get((Object) null);
        term238389 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term238389, term238389.getClass(), "_appliesFor", enum300);
        setField(term238389, term238389.getClass(), "_idType", enum301);
        setField(term238389, term238389.getClass(), "_customIdResolver", null);
        Class<? extends Object> term238843 = Class.forName((String) "java.lang.ProcessHandleImpl$ExitCompletion");
        term238807 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term238807, term238807.getClass(), "_class", term238843);
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
        args[1] = term238807;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term238389, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


