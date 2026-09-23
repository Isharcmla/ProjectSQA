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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511353;
     Object term511615;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term513967 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term513966 = ((Class) term513967).getDeclaredField((String) "NON_FINAL");
        ((Field) term513966).setAccessible(true);
        Object enum572 = ((Field) term513966).get((Object) null);
        term511353 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term511353, term511353.getClass(), "_appliesFor", enum572);
        Class<? extends Object> term511757 = Class.forName((String) "java.util.concurrent.ForkJoinWorkerThread$InnocuousForkJoinWorkerThread$1");
        term511615 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term511721 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term511721, term511721.getClass(), "_class", term511757);
        setField(term511615, term511615.getClass(), "_referencedType", term511721);
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
        args[1] = term511615;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term511353, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


