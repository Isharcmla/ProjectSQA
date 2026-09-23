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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282507;
     Object term282757;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term283765 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term283764 = ((Class) term283765).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term283764).setAccessible(true);
        Object enum340 = ((Field) term283764).get((Object) null);
        term282507 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term282507, term282507.getClass(), "_appliesFor", enum340);
        Class<? extends Object> term282793 = Class.forName((String) "java.util.jar.JarException");
        term282757 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term282757, term282757.getClass(), "_class", term282793);
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
        args[1] = term282757;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term282507, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


