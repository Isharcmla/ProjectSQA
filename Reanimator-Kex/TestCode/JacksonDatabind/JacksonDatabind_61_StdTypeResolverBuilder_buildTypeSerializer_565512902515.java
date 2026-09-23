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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606812;
     Object term607214;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term608612 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term608611 = ((Class) term608612).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term608611).setAccessible(true);
        Object enum660 = ((Field) term608611).get((Object) null);
        Class<? extends Object> term608973 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term608972 = ((Class) term608973).getDeclaredField((String) "CLASS");
        ((Field) term608972).setAccessible(true);
        Object enum661 = ((Field) term608972).get((Object) null);
        term606812 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term606812, term606812.getClass(), "_appliesFor", enum660);
        setField(term606812, term606812.getClass(), "_idType", enum661);
        Class<? extends Object> term607342 = Class.forName((String) "java.util.zip.InflaterInputStream");
        term607214 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term607306 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term607306, term607306.getClass(), "_class", term607342);
        setField(term607214, term607214.getClass(), "_referencedType", term607306);
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
        args[1] = term607214;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term606812, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


