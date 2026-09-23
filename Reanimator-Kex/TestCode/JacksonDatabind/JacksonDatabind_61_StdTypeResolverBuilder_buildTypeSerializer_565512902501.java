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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578744;
     Object term579006;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term580178 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term580177 = ((Class) term580178).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term580177).setAccessible(true);
        Object enum631 = ((Field) term580177).get((Object) null);
        term578744 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term578744, term578744.getClass(), "_appliesFor", enum631);
        Class<? extends Object> term579134 = Class.forName((String) "java.lang.Shutdown$Lock");
        term579006 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term579098 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term579098, term579098.getClass(), "_class", term579134);
        setField(term579006, term579006.getClass(), "_referencedType", term579098);
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
        args[1] = term579006;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term578744, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


