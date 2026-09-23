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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460080;
     Object term460342;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term461542 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term461541 = ((Class) term461542).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term461541).setAccessible(true);
        Object enum524 = ((Field) term461541).get((Object) null);
        term460080 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term460080, term460080.getClass(), "_appliesFor", enum524);
        Class<? extends Object> term460498 = Class.forName((String) "java.io.BufferedOutputStream");
        term460342 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term460462 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term460462, term460462.getClass(), "_class", term460498);
        setField(term460342, term460342.getClass(), "_referencedType", term460462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term460342;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term460080, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


