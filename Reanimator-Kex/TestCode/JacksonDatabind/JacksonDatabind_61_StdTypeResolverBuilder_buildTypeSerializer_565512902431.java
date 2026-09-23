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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476314;
     Object term476716;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term478223 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term478222 = ((Class) term478223).getDeclaredField((String) "NON_FINAL");
        ((Field) term478222).setAccessible(true);
        Object enum538 = ((Field) term478222).get((Object) null);
        Class<? extends Object> term478542 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term478541 = ((Class) term478542).getDeclaredField((String) "NONE");
        ((Field) term478541).setAccessible(true);
        Object enum539 = ((Field) term478541).get((Object) null);
        term476314 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term476314, term476314.getClass(), "_appliesFor", enum538);
        setField(term476314, term476314.getClass(), "_idType", enum539);
        Class<? extends Object> term476872 = Class.forName((String) "java.lang.StackStreamFactory");
        term476716 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term476836 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term476836, term476836.getClass(), "_class", term476872);
        setField(term476716, term476716.getClass(), "_referencedType", term476836);
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
        args[1] = term476716;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term476314, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


