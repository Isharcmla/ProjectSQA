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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term594871;
     Object term595273;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term597079 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term597078 = ((Class) term597079).getDeclaredField((String) "NON_FINAL");
        ((Field) term597078).setAccessible(true);
        Object enum649 = ((Field) term597078).get((Object) null);
        Class<? extends Object> term597398 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term597397 = ((Class) term597398).getDeclaredField((String) "NAME");
        ((Field) term597397).setAccessible(true);
        Object enum650 = ((Field) term597397).get((Object) null);
        term594871 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term594871, term594871.getClass(), "_appliesFor", enum649);
        setField(term594871, term594871.getClass(), "_idType", enum650);
        setField(term594871, term594871.getClass(), "_customIdResolver", null);
        Class<? extends Object> term595401 = Class.forName((String) "java.lang.invoke.DirectMethodHandle$Interface");
        term595273 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term595365 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term595365, term595365.getClass(), "_class", term595401);
        setField(term595273, term595273.getClass(), "_referencedType", term595365);
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
        args[1] = term595273;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term594871, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


