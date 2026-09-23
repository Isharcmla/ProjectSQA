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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599420;
     Object term599682;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term600933 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term600932 = ((Class) term600933).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term600932).setAccessible(true);
        Object enum654 = ((Field) term600932).get((Object) null);
        term599420 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term599420, term599420.getClass(), "_appliesFor", enum654);
        Class<? extends Object> term599822 = Class.forName((String) "com.fasterxml.jackson.databind.util.RootNameLookup");
        term599682 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term599786 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term599786, term599786.getClass(), "_class", term599822);
        setField(term599682, term599682.getClass(), "_referencedType", term599786);
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
        args[1] = term599682;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term599420, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


