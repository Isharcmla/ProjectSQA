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

public class CollectionLikeType_init_124091301117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36841;
     Object term36981;
     Object term37085;

    public CollectionLikeType_init_124091301117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36805 = Class.forName((String) "java.lang.invoke.MethodHandleProxies$1");
        Object term36769 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term36769, term36769.getClass(), "_class", term36805);
        setIntField(term36769, term36769.getClass(), "_hash", 0);
        setField(term36769, term36769.getClass(), "_valueHandler", null);
        setField(term36769, term36769.getClass(), "_typeHandler", null);
        setBooleanField(term36769, term36769.getClass(), "_asStatic", false);
        term36841 = Class.forName((String) "java.lang.String");
        term36981 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term37085 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term37085, term37085.getClass(), "_hash", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("java.lang.Object");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = boolean.class;
        Object[] args = new Object[8];
        args[0] = term36841;
        args[1] = term36981;
        args[2] = null;
        args[3] = null;
        args[4] = term37085;
        args[5] = "byte[]";
        args[6] = null;
        args[7] = true;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


