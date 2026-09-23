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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261583;
     Object term262135;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term263467 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term263466 = ((Class) term263467).getDeclaredField((String) "NON_FINAL");
        ((Field) term263466).setAccessible(true);
        Object enum320 = ((Field) term263466).get((Object) null);
        Class<? extends Object> term263786 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term263785 = ((Class) term263786).getDeclaredField((String) "CLASS");
        ((Field) term263785).setAccessible(true);
        Object enum321 = ((Field) term263785).get((Object) null);
        term261583 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        Object term262015 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term261583, term261583.getClass(), "_appliesFor", enum320);
        setField(term261583, term261583.getClass(), "_idType", enum321);
        setField(term261583, term261583.getClass(), "_customIdResolver", term262015);
        Class<? extends Object> term262171 = Class.forName((String) "java.util.stream.DoublePipeline$StatelessOp");
        term262135 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term262135, term262135.getClass(), "_class", term262171);
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
        args[1] = term262135;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term261583, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


