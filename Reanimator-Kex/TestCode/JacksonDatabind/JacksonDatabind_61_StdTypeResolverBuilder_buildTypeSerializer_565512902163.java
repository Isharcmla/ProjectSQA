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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139988;
     Object term140238;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term141294 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term141293 = ((Class) term141294).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term141293).setAccessible(true);
        Object enum209 = ((Field) term141293).get((Object) null);
        term139988 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term139988, term139988.getClass(), "_appliesFor", enum209);
        Class<? extends Object> term140274 = Class.forName((String) "java.lang.ProcessBuilder$Redirect$4");
        term140238 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term140238, term140238.getClass(), "_class", term140274);
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
        args[1] = term140238;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term139988, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


