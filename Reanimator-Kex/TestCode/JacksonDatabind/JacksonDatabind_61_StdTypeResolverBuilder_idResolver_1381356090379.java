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

public class StdTypeResolverBuilder_idResolver_1381356090379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407246;

    public StdTypeResolverBuilder_idResolver_1381356090379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term409543 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term409542 = ((Class) term409543).getDeclaredField((String) "CLASS");
        ((Field) term409542).setAccessible(true);
        Object enum475 = ((Field) term409542).get((Object) null);
        term407246 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        setField(term407246, term407246.getClass(), "_customIdResolver", null);
        setField(term407246, term407246.getClass(), "_idType", enum475);
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
        try {
            callMethod(klass, "idResolver", argTypes, term407246, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


