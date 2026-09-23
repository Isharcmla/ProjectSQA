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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313038;
     Object term313300;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term314951 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term314950 = ((Class) term314951).getDeclaredField((String) "NON_FINAL");
        ((Field) term314950).setAccessible(true);
        Object enum367 = ((Field) term314950).get((Object) null);
        term313038 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term313038, term313038.getClass(), "_appliesFor", enum367);
        Class<? extends Object> term313336 = Class.forName((String) "com.fasterxml.jackson.core.Versioned");
        term313300 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term313300, term313300.getClass(), "_class", term313336);
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
        args[1] = term313300;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term313038, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


