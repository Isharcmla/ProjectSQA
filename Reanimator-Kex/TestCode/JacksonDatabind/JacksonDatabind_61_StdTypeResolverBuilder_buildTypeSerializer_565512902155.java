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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131628;
     Object term131886;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term132510 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term132509 = ((Class) term132510).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term132509).setAccessible(true);
        Object enum200 = ((Field) term132509).get((Object) null);
        term131628 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term131628, term131628.getClass(), "_appliesFor", enum200);
        term131886 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
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
        args[1] = term131886;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term131628, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


