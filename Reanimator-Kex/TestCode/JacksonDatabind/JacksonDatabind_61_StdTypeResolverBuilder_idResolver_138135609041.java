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

public class StdTypeResolverBuilder_idResolver_138135609041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12877;
     Object term14367;

    public StdTypeResolverBuilder_idResolver_138135609041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14372 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term14371 = ((Class) term14372).getDeclaredField((String) "NONE");
        ((Field) term14371).setAccessible(true);
        Object enum19 = ((Field) term14371).get((Object) null);
        term12877 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        setField(term12877, term12877.getClass(), "_customIdResolver", null);
        setField(term12877, term12877.getClass(), "_idType", enum19);
        Class<? extends Object> term14631 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term14630 = ((Class) term14631).getDeclaredField((String) "NONE");
        ((Field) term14630).setAccessible(true);
        Object enum20 = ((Field) term14630).get((Object) null);
        term14367 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        setField(term14367, term14367.getClass(), "_idType", enum20);
        setField(term14367, term14367.getClass(), "_includeAs", null);
        setField(term14367, term14367.getClass(), "_typeProperty", null);
        setBooleanField(term14367, term14367.getClass(), "_typeIdVisible", false);
        setField(term14367, term14367.getClass(), "_defaultImpl", null);
        setField(term14367, term14367.getClass(), "_customIdResolver", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        args[4] = false;
        Object retValue = callMethod(klass, "idResolver", argTypes, term12877, args);
        assertTrue(recursiveEquals(term12877, term14367));
        assertTrue(recursiveEquals(retValue, null));
    }

};


