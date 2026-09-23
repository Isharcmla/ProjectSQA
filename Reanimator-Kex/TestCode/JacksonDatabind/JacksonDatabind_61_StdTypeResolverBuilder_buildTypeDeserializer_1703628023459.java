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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516663;
     Object term516925;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term518387 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term518386 = ((Class) term518387).getDeclaredField((String) "NON_FINAL");
        ((Field) term518386).setAccessible(true);
        Object enum576 = ((Field) term518386).get((Object) null);
        term516663 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term516663, term516663.getClass(), "_appliesFor", enum576);
        Class<? extends Object> term517053 = Class.forName((String) "java.util.jar.JarFile$JarFileEntry");
        term516925 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term517017 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term517017, term517017.getClass(), "_class", term517053);
        setField(term516925, term516925.getClass(), "_referencedType", term517017);
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
        args[1] = term516925;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term516663, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


