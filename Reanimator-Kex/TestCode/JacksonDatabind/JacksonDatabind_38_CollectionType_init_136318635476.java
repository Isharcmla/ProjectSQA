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

public class CollectionType_init_136318635476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24210;
     Object term24350;
     Object term24470;
     Object term24568;

    public CollectionType_init_136318635476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24174 = Class.forName((String) "java.nio.channels.SelectionKey");
        Object term24138 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term24138, term24138.getClass(), "_class", term24174);
        setIntField(term24138, term24138.getClass(), "_hash", 0);
        setField(term24138, term24138.getClass(), "_valueHandler", null);
        setField(term24138, term24138.getClass(), "_typeHandler", null);
        setBooleanField(term24138, term24138.getClass(), "_asStatic", false);
        term24210 = Class.forName((String) "java.lang.String");
        term24350 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term24470 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term24470, term24470.getClass(), "_hash", 0);
        term24568 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.CollectionType");
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
        args[0] = term24210;
        args[1] = term24350;
        args[2] = null;
        args[3] = null;
        args[4] = term24470;
        args[5] = term24568;
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


