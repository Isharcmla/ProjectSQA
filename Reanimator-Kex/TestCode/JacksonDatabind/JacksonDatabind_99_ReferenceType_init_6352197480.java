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

public class ReferenceType_init_6352197480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17633;
     Object term17773;
     Object term17877;

    public ReferenceType_init_6352197480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17597 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJLong$Sorter");
        Object term17561 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term17561, term17561.getClass(), "_class", term17597);
        setIntField(term17561, term17561.getClass(), "_hash", 0);
        setField(term17561, term17561.getClass(), "_valueHandler", null);
        setField(term17561, term17561.getClass(), "_typeHandler", null);
        setBooleanField(term17561, term17561.getClass(), "_asStatic", false);
        term17633 = Class.forName((String) "java.lang.String");
        term17773 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term17877 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term17877, term17877.getClass(), "_hash", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.ReferenceType");
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
        args[0] = term17633;
        args[1] = term17773;
        args[2] = null;
        args[3] = null;
        args[4] = term17877;
        args[5] = null;
        args[6] = "";
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


