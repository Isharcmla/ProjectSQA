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

public class CollectionLikeType_init_124091301119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38672;
     Object term38812;
     Object term38918;

    public CollectionLikeType_init_124091301119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38598 = Class.forName((String) "java.lang.module.ModuleReference");
        Object term38562 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term38636 = newInstance(Class.forName("java.lang.Object"));
        setField(term38562, term38562.getClass(), "_class", term38598);
        setIntField(term38562, term38562.getClass(), "_hash", 0);
        setField(term38562, term38562.getClass(), "_valueHandler", null);
        setField(term38562, term38562.getClass(), "_typeHandler", term38636);
        setBooleanField(term38562, term38562.getClass(), "_asStatic", false);
        term38672 = Class.forName((String) "java.lang.Class");
        term38812 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term38918 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term38918, term38918.getClass(), "_hash", 0);
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
        args[0] = term38672;
        args[1] = term38812;
        args[2] = null;
        args[3] = null;
        args[4] = term38918;
        args[5] = null;
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


