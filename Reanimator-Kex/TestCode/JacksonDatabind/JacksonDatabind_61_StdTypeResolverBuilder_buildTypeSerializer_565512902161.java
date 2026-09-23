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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137490;
     Object term137754;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term138755 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term138754 = ((Class) term138755).getDeclaredField((String) "NON_FINAL");
        ((Field) term138754).setAccessible(true);
        Object enum207 = ((Field) term138754).get((Object) null);
        term137490 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term137490, term137490.getClass(), "_appliesFor", enum207);
        Class<? extends Object> term137790 = Class.forName((String) "com.fasterxml.jackson.core.Version");
        term137754 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term137754, term137754.getClass(), "_class", term137790);
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
        args[1] = term137754;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term137490, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


