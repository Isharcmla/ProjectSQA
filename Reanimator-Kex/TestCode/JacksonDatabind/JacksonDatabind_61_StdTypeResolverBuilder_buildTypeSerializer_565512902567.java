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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term687405;
     Object term687807;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term689226 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term689225 = ((Class) term689226).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term689225).setAccessible(true);
        Object enum729 = ((Field) term689225).get((Object) null);
        Class<? extends Object> term689587 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term689586 = ((Class) term689587).getDeclaredField((String) "CUSTOM");
        ((Field) term689586).setAccessible(true);
        Object enum730 = ((Field) term689586).get((Object) null);
        term687405 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term687405, term687405.getClass(), "_appliesFor", enum729);
        setField(term687405, term687405.getClass(), "_idType", enum730);
        setField(term687405, term687405.getClass(), "_customIdResolver", null);
        Class<? extends Object> term687935 = Class.forName((String) "java.util.ArrayPrefixHelpers");
        term687807 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term687899 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term687899, term687899.getClass(), "_class", term687935);
        setField(term687807, term687807.getClass(), "_referencedType", term687899);
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
        args[1] = term687807;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term687405, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


