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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681031;
     Object term681433;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term682967 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term682966 = ((Class) term682967).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term682966).setAccessible(true);
        Object enum723 = ((Field) term682966).get((Object) null);
        Class<? extends Object> term683307 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term683306 = ((Class) term683307).getDeclaredField((String) "MINIMAL_CLASS");
        ((Field) term683306).setAccessible(true);
        Object enum724 = ((Field) term683306).get((Object) null);
        term681031 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term681031, term681031.getClass(), "_appliesFor", enum723);
        setField(term681031, term681031.getClass(), "_idType", enum724);
        setField(term681031, term681031.getClass(), "_customIdResolver", null);
        Class<? extends Object> term681561 = Class.forName((String) "java.nio.file.Files$1");
        term681433 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term681525 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term681525, term681525.getClass(), "_class", term681561);
        setField(term681433, term681433.getClass(), "_referencedType", term681525);
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
        args[1] = term681433;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term681031, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


