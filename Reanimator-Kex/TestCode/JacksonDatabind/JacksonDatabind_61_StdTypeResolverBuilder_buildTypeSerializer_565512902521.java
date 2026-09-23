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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term616913;
     Object term617175;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term618446 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term618445 = ((Class) term618446).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term618445).setAccessible(true);
        Object enum667 = ((Field) term618445).get((Object) null);
        term616913 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term616913, term616913.getClass(), "_appliesFor", enum667);
        Class<? extends Object> term617303 = Class.forName((String) "kex.sun.misc.DoubleConsts");
        term617175 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term617267 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term617267, term617267.getClass(), "_class", term617303);
        setField(term617175, term617175.getClass(), "_referencedType", term617267);
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
        args[1] = term617175;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term616913, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


