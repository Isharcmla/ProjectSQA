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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142510;
     Object term142760;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term143808 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term143807 = ((Class) term143808).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term143807).setAccessible(true);
        Object enum211 = ((Field) term143807).get((Object) null);
        term142510 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term142510, term142510.getClass(), "_appliesFor", enum211);
        Class<? extends Object> term142796 = Class.forName((String) "java.util.stream.ReduceOps$CountingSink$OfLong");
        term142760 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term142760, term142760.getClass(), "_class", term142796);
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
        args[1] = term142760;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term142510, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


