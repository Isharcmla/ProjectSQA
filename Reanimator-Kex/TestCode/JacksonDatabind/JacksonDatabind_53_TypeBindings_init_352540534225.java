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

public class TypeBindings_init_352540534225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73621;
     Object term73625;
     Object term74303;
     Object term74315;
     Object term74322;

    public TypeBindings_init_352540534225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term73781 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term73629 = (Object[]) newArray("java.lang.String", 0);
        Object[] term73630 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term73781, term73781.getClass(), "_names", term73629);
        setField(term73781, term73781.getClass(), "_types", term73630);
        term73621 = (Object[]) newArray("java.lang.String", 3);
        setElement(term73621, 0, "");
        setElement(term73621, 1, "");
        setElement(term73621, 2, "");
        term73625 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term74001 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term74097 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term74211 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setIntField(term74001, term74001.getClass(), "_hash", 0);
        setElement(term73625, 0, term74001);
        setIntField(term74097, term74097.getClass(), "_hash", 0);
        setElement(term73625, 1, term74097);
        setElement(term73625, 2, term74211);
        term74303 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term74304 = (Object[]) newArray("java.lang.String", 3);
        Object[] term74311 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term74312 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term74313 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term74314 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setElement(term74304, 0, "");
        setElement(term74304, 1, "");
        setElement(term74304, 2, "");
        setField(term74303, term74303.getClass(), "_names", term74304);
        setField(term74312, term74312.getClass(), "_elementType", null);
        setField(term74312, term74312.getClass(), "_superClass", null);
        setField(term74312, term74312.getClass(), "_superInterfaces", null);
        setField(term74312, term74312.getClass(), "_bindings", null);
        setField(term74312, term74312.getClass(), "_canonicalName", null);
        setField(term74312, term74312.getClass(), "_class", null);
        setIntField(term74312, term74312.getClass(), "_hash", 0);
        setField(term74312, term74312.getClass(), "_valueHandler", null);
        setField(term74312, term74312.getClass(), "_typeHandler", null);
        setBooleanField(term74312, term74312.getClass(), "_asStatic", false);
        setElement(term74311, 0, term74312);
        setField(term74313, term74313.getClass(), "_componentType", null);
        setField(term74313, term74313.getClass(), "_emptyArray", null);
        setField(term74313, term74313.getClass(), "_superClass", null);
        setField(term74313, term74313.getClass(), "_superInterfaces", null);
        setField(term74313, term74313.getClass(), "_bindings", null);
        setField(term74313, term74313.getClass(), "_canonicalName", null);
        setField(term74313, term74313.getClass(), "_class", null);
        setIntField(term74313, term74313.getClass(), "_hash", 0);
        setField(term74313, term74313.getClass(), "_valueHandler", null);
        setField(term74313, term74313.getClass(), "_typeHandler", null);
        setBooleanField(term74313, term74313.getClass(), "_asStatic", false);
        setElement(term74311, 1, term74313);
        setField(term74314, term74314.getClass(), "_elementType", null);
        setField(term74314, term74314.getClass(), "_superClass", null);
        setField(term74314, term74314.getClass(), "_superInterfaces", null);
        setField(term74314, term74314.getClass(), "_bindings", null);
        setField(term74314, term74314.getClass(), "_canonicalName", null);
        setField(term74314, term74314.getClass(), "_class", null);
        setIntField(term74314, term74314.getClass(), "_hash", 0);
        setField(term74314, term74314.getClass(), "_valueHandler", null);
        setField(term74314, term74314.getClass(), "_typeHandler", null);
        setBooleanField(term74314, term74314.getClass(), "_asStatic", false);
        setElement(term74311, 2, term74314);
        setField(term74303, term74303.getClass(), "_types", term74311);
        setField(term74303, term74303.getClass(), "_unboundVariables", null);
        setIntField(term74303, term74303.getClass(), "_hashCode", 1);
        term74315 = (Object[]) newArray("java.lang.String", 3);
        setElement(term74315, 0, "");
        setElement(term74315, 1, "");
        setElement(term74315, 2, "");
        term74322 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term74323 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term74324 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term74325 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term74323, term74323.getClass(), "_elementType", null);
        setField(term74323, term74323.getClass(), "_superClass", null);
        setField(term74323, term74323.getClass(), "_superInterfaces", null);
        setField(term74323, term74323.getClass(), "_bindings", null);
        setField(term74323, term74323.getClass(), "_canonicalName", null);
        setField(term74323, term74323.getClass(), "_class", null);
        setIntField(term74323, term74323.getClass(), "_hash", 0);
        setField(term74323, term74323.getClass(), "_valueHandler", null);
        setField(term74323, term74323.getClass(), "_typeHandler", null);
        setBooleanField(term74323, term74323.getClass(), "_asStatic", false);
        setElement(term74322, 0, term74323);
        setField(term74324, term74324.getClass(), "_componentType", null);
        setField(term74324, term74324.getClass(), "_emptyArray", null);
        setField(term74324, term74324.getClass(), "_superClass", null);
        setField(term74324, term74324.getClass(), "_superInterfaces", null);
        setField(term74324, term74324.getClass(), "_bindings", null);
        setField(term74324, term74324.getClass(), "_canonicalName", null);
        setField(term74324, term74324.getClass(), "_class", null);
        setIntField(term74324, term74324.getClass(), "_hash", 0);
        setField(term74324, term74324.getClass(), "_valueHandler", null);
        setField(term74324, term74324.getClass(), "_typeHandler", null);
        setBooleanField(term74324, term74324.getClass(), "_asStatic", false);
        setElement(term74322, 1, term74324);
        setField(term74325, term74325.getClass(), "_elementType", null);
        setField(term74325, term74325.getClass(), "_superClass", null);
        setField(term74325, term74325.getClass(), "_superInterfaces", null);
        setField(term74325, term74325.getClass(), "_bindings", null);
        setField(term74325, term74325.getClass(), "_canonicalName", null);
        setField(term74325, term74325.getClass(), "_class", null);
        setIntField(term74325, term74325.getClass(), "_hash", 0);
        setField(term74325, term74325.getClass(), "_valueHandler", null);
        setField(term74325, term74325.getClass(), "_typeHandler", null);
        setBooleanField(term74325, term74325.getClass(), "_asStatic", false);
        setElement(term74322, 2, term74325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term73621;
        args[1] = term73625;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term74303));
        assertTrue(recursiveEquals(term73621, term74315));
        assertTrue(recursiveEquals(term73625, term74322));
    }

};


