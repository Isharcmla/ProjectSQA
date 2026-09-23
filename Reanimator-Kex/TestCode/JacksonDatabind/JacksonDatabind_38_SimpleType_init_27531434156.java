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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class SimpleType_init_27531434156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13600;
     Object term13740;
     Object term14129;
     Object term14155;
     Object term14179;

    public SimpleType_init_27531434156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13526 = Class.forName((String) "java.io.FilterReader");
        Object term13490 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term13490, term13490.getClass(), "_class", term13526);
        setIntField(term13490, term13490.getClass(), "_hash", 0);
        setField(term13490, term13490.getClass(), "_valueHandler", null);
        setField(term13490, term13490.getClass(), "_typeHandler", "null");
        setBooleanField(term13490, term13490.getClass(), "_asStatic", false);
        term13600 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeBindings");
        term13740 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Class<? extends Object> term14131 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeBindings");
        term14129 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term14130 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term14129, term14129.getClass(), "_superClass", null);
        setField(term14129, term14129.getClass(), "_superInterfaces", null);
        setField(term14130, term14130.getClass(), "_names", null);
        setField(term14130, term14130.getClass(), "_types", null);
        setField(term14130, term14130.getClass(), "_unboundVariables", null);
        setIntField(term14130, term14130.getClass(), "_hashCode", 0);
        setField(term14129, term14129.getClass(), "_bindings", term14130);
        setField(term14129, term14129.getClass(), "_canonicalName", null);
        setField(term14129, term14129.getClass(), "_class", term14131);
        setIntField(term14129, term14129.getClass(), "_hash", 1340834877);
        setField(term14129, term14129.getClass(), "_valueHandler", null);
        setField(term14129, term14129.getClass(), "_typeHandler", null);
        setBooleanField(term14129, term14129.getClass(), "_asStatic", true);
        term14155 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeBindings");
        term14179 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term14179, term14179.getClass(), "_names", null);
        setField(term14179, term14179.getClass(), "_types", null);
        setField(term14179, term14179.getClass(), "_unboundVariables", null);
        setIntField(term14179, term14179.getClass(), "_hashCode", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.Object");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = boolean.class;
        Object[] args = new Object[8];
        args[0] = term13600;
        args[1] = term13740;
        args[2] = null;
        args[3] = null;
        args[4] = 0;
        args[5] = null;
        args[6] = null;
        args[7] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14129));
        assertTrue(recursiveEquals(term13600, term14155));
        assertTrue(recursiveEquals(term13740, 0));
    }

};


