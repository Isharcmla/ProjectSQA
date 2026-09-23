package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MapType_init_1937319099253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109250;
     Object term109390;
     Object term109496;
     Object term109600;
     Object term109692;

    public MapType_init_1937319099253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term109214 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonClassDescription");
        Object term109178 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term109178, term109178.getClass(), "_class", term109214);
        setIntField(term109178, term109178.getClass(), "_hash", 0);
        setField(term109178, term109178.getClass(), "_valueHandler", null);
        setField(term109178, term109178.getClass(), "_typeHandler", null);
        setBooleanField(term109178, term109178.getClass(), "_asStatic", false);
        term109250 = Class.forName((String) "java.lang.Class");
        term109390 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term109496 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term109496, term109496.getClass(), "_hash", 0);
        term109600 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term109600, term109600.getClass(), "_hash", 0);
        term109692 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapType");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term109250;
        args[1] = term109390;
        args[2] = null;
        args[3] = null;
        args[4] = term109496;
        args[5] = term109600;
        args[6] = term109692;
        args[7] = null;
        args[8] = true;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


