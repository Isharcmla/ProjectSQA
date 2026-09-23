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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496963;
     Object term497225;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term497957 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term497956 = ((Class) term497957).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term497956).setAccessible(true);
        Object enum558 = ((Field) term497956).get((Object) null);
        term496963 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term496963, term496963.getClass(), "_appliesFor", enum558);
        term497225 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term497317 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term497225, term497225.getClass(), "_referencedType", term497317);
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
        args[1] = term497225;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term496963, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


