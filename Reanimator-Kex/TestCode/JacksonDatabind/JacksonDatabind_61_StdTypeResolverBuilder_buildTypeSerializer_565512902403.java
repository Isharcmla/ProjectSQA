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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434245;
     Object term434507;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term435244 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term435243 = ((Class) term435244).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term435243).setAccessible(true);
        Object enum501 = ((Field) term435243).get((Object) null);
        term434245 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term434245, term434245.getClass(), "_appliesFor", enum501);
        term434507 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term434611 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term434611, term434611.getClass(), "_class", null);
        setField(term434507, term434507.getClass(), "_referencedType", term434611);
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
        args[1] = term434507;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term434245, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


