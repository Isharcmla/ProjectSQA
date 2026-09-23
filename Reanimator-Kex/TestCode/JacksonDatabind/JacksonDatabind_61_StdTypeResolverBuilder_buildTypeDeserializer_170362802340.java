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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.jsontype.impl.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeDeserializer_170362802340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11696;
     Object term13801;

    public StdTypeResolverBuilder_buildTypeDeserializer_170362802340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13806 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term13805 = ((Class) term13806).getDeclaredField((String) "NAME");
        ((Field) term13805).setAccessible(true);
        Object enum17 = ((Field) term13805).get((Object) null);
        term11696 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        setField(term11696, term11696.getClass(), "_idType", enum17);
        Class<? extends Object> term14065 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term14064 = ((Class) term14065).getDeclaredField((String) "NONE");
        ((Field) term14064).setAccessible(true);
        Object enum18 = ((Field) term14064).get((Object) null);
        term13801 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        setField(term13801, term13801.getClass(), "_idType", enum18);
        setField(term13801, term13801.getClass(), "_includeAs", null);
        setField(term13801, term13801.getClass(), "_typeProperty", null);
        setBooleanField(term13801, term13801.getClass(), "_typeIdVisible", false);
        setField(term13801, term13801.getClass(), "_defaultImpl", null);
        setField(term13801, term13801.getClass(), "_customIdResolver", null);
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
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "buildTypeDeserializer", argTypes, term11696, args);
        assertTrue(recursiveEquals(term11696, term13801));
        assertTrue(recursiveEquals(retValue, null));
    }

};


