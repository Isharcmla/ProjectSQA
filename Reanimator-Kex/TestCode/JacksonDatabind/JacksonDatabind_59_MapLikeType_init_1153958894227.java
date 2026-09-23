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

public class MapLikeType_init_1153958894227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103489;
     Object term103629;
     Object term103725;
     Object term103839;
     Object term104273;
     Object term104305;
     Object term104306;
     Object term104307;
     Object term104335;

    public MapLikeType_init_1153958894227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103415 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term103453 = newInstance(Class.forName("java.lang.Object"));
        setField(term103415, term103415.getClass(), "_class", null);
        setIntField(term103415, term103415.getClass(), "_hash", 0);
        setField(term103415, term103415.getClass(), "_valueHandler", term103453);
        setField(term103415, term103415.getClass(), "_typeHandler", null);
        setBooleanField(term103415, term103415.getClass(), "_asStatic", false);
        term103489 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        term103629 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term103725 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term103725, term103725.getClass(), "_hash", 0);
        term103839 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setIntField(term103839, term103839.getClass(), "_hash", 0);
        Class<? extends Object> term104277 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        term104273 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term104274 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term104275 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term104276 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term104274, term104274.getClass(), "_componentType", null);
        setField(term104274, term104274.getClass(), "_emptyArray", null);
        setField(term104274, term104274.getClass(), "_superClass", null);
        setField(term104274, term104274.getClass(), "_superInterfaces", null);
        setField(term104274, term104274.getClass(), "_bindings", null);
        setField(term104274, term104274.getClass(), "_canonicalName", null);
        setField(term104274, term104274.getClass(), "_class", null);
        setIntField(term104274, term104274.getClass(), "_hash", 0);
        setField(term104274, term104274.getClass(), "_valueHandler", null);
        setField(term104274, term104274.getClass(), "_typeHandler", null);
        setBooleanField(term104274, term104274.getClass(), "_asStatic", false);
        setField(term104273, term104273.getClass(), "_keyType", term104274);
        setField(term104275, term104275.getClass(), "_elementType", null);
        setField(term104275, term104275.getClass(), "_superClass", null);
        setField(term104275, term104275.getClass(), "_superInterfaces", null);
        setField(term104275, term104275.getClass(), "_bindings", null);
        setField(term104275, term104275.getClass(), "_canonicalName", null);
        setField(term104275, term104275.getClass(), "_class", null);
        setIntField(term104275, term104275.getClass(), "_hash", 0);
        setField(term104275, term104275.getClass(), "_valueHandler", null);
        setField(term104275, term104275.getClass(), "_typeHandler", null);
        setBooleanField(term104275, term104275.getClass(), "_asStatic", false);
        setField(term104273, term104273.getClass(), "_valueType", term104275);
        setField(term104273, term104273.getClass(), "_superClass", null);
        setField(term104273, term104273.getClass(), "_superInterfaces", null);
        setField(term104276, term104276.getClass(), "_names", null);
        setField(term104276, term104276.getClass(), "_types", null);
        setField(term104276, term104276.getClass(), "_unboundVariables", null);
        setIntField(term104276, term104276.getClass(), "_hashCode", 0);
        setField(term104273, term104273.getClass(), "_bindings", term104276);
        setField(term104273, term104273.getClass(), "_canonicalName", null);
        setField(term104273, term104273.getClass(), "_class", term104277);
        setIntField(term104273, term104273.getClass(), "_hash", 338147853);
        setField(term104273, term104273.getClass(), "_valueHandler", "int");
        setField(term104273, term104273.getClass(), "_typeHandler", "byte");
        setBooleanField(term104273, term104273.getClass(), "_asStatic", true);
        term104305 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term104305, term104305.getClass(), "_componentType", null);
        setField(term104305, term104305.getClass(), "_emptyArray", null);
        setField(term104305, term104305.getClass(), "_superClass", null);
        setField(term104305, term104305.getClass(), "_superInterfaces", null);
        setField(term104305, term104305.getClass(), "_bindings", null);
        setField(term104305, term104305.getClass(), "_canonicalName", null);
        setField(term104305, term104305.getClass(), "_class", null);
        setIntField(term104305, term104305.getClass(), "_hash", 0);
        setField(term104305, term104305.getClass(), "_valueHandler", null);
        setField(term104305, term104305.getClass(), "_typeHandler", null);
        setBooleanField(term104305, term104305.getClass(), "_asStatic", false);
        term104306 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term104306, term104306.getClass(), "_elementType", null);
        setField(term104306, term104306.getClass(), "_superClass", null);
        setField(term104306, term104306.getClass(), "_superInterfaces", null);
        setField(term104306, term104306.getClass(), "_bindings", null);
        setField(term104306, term104306.getClass(), "_canonicalName", null);
        setField(term104306, term104306.getClass(), "_class", null);
        setIntField(term104306, term104306.getClass(), "_hash", 0);
        setField(term104306, term104306.getClass(), "_valueHandler", null);
        setField(term104306, term104306.getClass(), "_typeHandler", null);
        setBooleanField(term104306, term104306.getClass(), "_asStatic", false);
        term104307 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        term104335 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term104335, term104335.getClass(), "_names", null);
        setField(term104335, term104335.getClass(), "_types", null);
        setField(term104335, term104335.getClass(), "_unboundVariables", null);
        setIntField(term104335, term104335.getClass(), "_hashCode", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapLikeType");
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
        args[0] = term103489;
        args[1] = term103629;
        args[2] = null;
        args[3] = null;
        args[4] = term103725;
        args[5] = term103839;
        args[6] = "int";
        args[7] = "byte";
        args[8] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term104273));
        assertTrue(recursiveEquals(term103489, term104305));
        assertTrue(recursiveEquals(term103629, term104306));
        assertTrue(recursiveEquals(term103725, "byte"));
        assertTrue(recursiveEquals(term103839, true));
    }

};


