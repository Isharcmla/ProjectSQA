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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term713052;
     Object term713454;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term714885 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term714884 = ((Class) term714885).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term714884).setAccessible(true);
        Object enum756 = ((Field) term714884).get((Object) null);
        Class<? extends Object> term715246 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term715245 = ((Class) term715246).getDeclaredField((String) "NAME");
        ((Field) term715245).setAccessible(true);
        Object enum757 = ((Field) term715245).get((Object) null);
        term713052 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term713052, term713052.getClass(), "_appliesFor", enum756);
        setField(term713052, term713052.getClass(), "_idType", enum757);
        setField(term713052, term713052.getClass(), "_customIdResolver", null);
        Class<? extends Object> term713582 = Class.forName((String) "com.fasterxml.jackson.databind.ser.Serializers");
        term713454 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term713546 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term713546, term713546.getClass(), "_class", term713582);
        setField(term713454, term713454.getClass(), "_referencedType", term713546);
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
        args[1] = term713454;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term713052, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


