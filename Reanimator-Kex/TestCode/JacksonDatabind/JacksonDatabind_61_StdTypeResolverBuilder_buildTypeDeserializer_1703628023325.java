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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348391;
     Object term348655;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term349714 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term349713 = ((Class) term349714).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term349713).setAccessible(true);
        Object enum403 = ((Field) term349713).get((Object) null);
        term348391 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term348391, term348391.getClass(), "_appliesFor", enum403);
        Class<? extends Object> term348691 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer");
        term348655 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term348655, term348655.getClass(), "_class", term348691);
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
        args[1] = term348655;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term348391, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


