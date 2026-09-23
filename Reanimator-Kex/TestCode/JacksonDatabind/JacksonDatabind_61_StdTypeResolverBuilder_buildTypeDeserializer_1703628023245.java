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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242202;
     Object term242466;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term243524 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term243523 = ((Class) term243524).getDeclaredField((String) "NON_FINAL");
        ((Field) term243523).setAccessible(true);
        Object enum303 = ((Field) term243523).get((Object) null);
        term242202 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term242202, term242202.getClass(), "_appliesFor", enum303);
        Class<? extends Object> term242502 = Class.forName((String) "java.util.concurrent.SynchronousQueue");
        term242466 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term242466, term242466.getClass(), "_class", term242502);
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
        args[1] = term242466;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term242202, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


