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

public class TypeBindings_init_352540534229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74800;
     Object term74801;
     Object term75339;
     Object term75345;
     Object term75346;

    public TypeBindings_init_352540534229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term74957 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term74805 = (Object[]) newArray("java.lang.String", 0);
        setField(term74957, term74957.getClass(), "_names", term74805);
        setField(term74957, term74957.getClass(), "_types", null);
        term74800 = (Object[]) newArray("java.lang.String", 3);
        term74801 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term75063 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term75159 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term75259 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setIntField(term75063, term75063.getClass(), "_hash", 0);
        setElement(term74801, 0, term75063);
        setIntField(term75159, term75159.getClass(), "_hash", 0);
        setElement(term74801, 1, term75159);
        setElement(term74801, 2, term75259);
        term75339 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term75340 = (Object[]) newArray("java.lang.String", 3);
        Object[] term75341 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term75342 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term75343 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term75344 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term75339, term75339.getClass(), "_names", term75340);
        setField(term75342, term75342.getClass(), "_elementType", null);
        setField(term75342, term75342.getClass(), "_superClass", null);
        setField(term75342, term75342.getClass(), "_superInterfaces", null);
        setField(term75342, term75342.getClass(), "_bindings", null);
        setField(term75342, term75342.getClass(), "_canonicalName", null);
        setField(term75342, term75342.getClass(), "_class", null);
        setIntField(term75342, term75342.getClass(), "_hash", 0);
        setField(term75342, term75342.getClass(), "_valueHandler", null);
        setField(term75342, term75342.getClass(), "_typeHandler", null);
        setBooleanField(term75342, term75342.getClass(), "_asStatic", false);
        setElement(term75341, 0, term75342);
        setField(term75343, term75343.getClass(), "_componentType", null);
        setField(term75343, term75343.getClass(), "_emptyArray", null);
        setField(term75343, term75343.getClass(), "_superClass", null);
        setField(term75343, term75343.getClass(), "_superInterfaces", null);
        setField(term75343, term75343.getClass(), "_bindings", null);
        setField(term75343, term75343.getClass(), "_canonicalName", null);
        setField(term75343, term75343.getClass(), "_class", null);
        setIntField(term75343, term75343.getClass(), "_hash", 0);
        setField(term75343, term75343.getClass(), "_valueHandler", null);
        setField(term75343, term75343.getClass(), "_typeHandler", null);
        setBooleanField(term75343, term75343.getClass(), "_asStatic", false);
        setElement(term75341, 1, term75343);
        setField(term75344, term75344.getClass(), "_keyType", null);
        setField(term75344, term75344.getClass(), "_valueType", null);
        setField(term75344, term75344.getClass(), "_superClass", null);
        setField(term75344, term75344.getClass(), "_superInterfaces", null);
        setField(term75344, term75344.getClass(), "_bindings", null);
        setField(term75344, term75344.getClass(), "_canonicalName", null);
        setField(term75344, term75344.getClass(), "_class", null);
        setIntField(term75344, term75344.getClass(), "_hash", 0);
        setField(term75344, term75344.getClass(), "_valueHandler", null);
        setField(term75344, term75344.getClass(), "_typeHandler", null);
        setBooleanField(term75344, term75344.getClass(), "_asStatic", false);
        setElement(term75341, 2, term75344);
        setField(term75339, term75339.getClass(), "_types", term75341);
        setField(term75339, term75339.getClass(), "_unboundVariables", null);
        setIntField(term75339, term75339.getClass(), "_hashCode", 1);
        term75345 = (Object[]) newArray("java.lang.String", 3);
        term75346 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term75347 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term75348 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term75349 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term75347, term75347.getClass(), "_elementType", null);
        setField(term75347, term75347.getClass(), "_superClass", null);
        setField(term75347, term75347.getClass(), "_superInterfaces", null);
        setField(term75347, term75347.getClass(), "_bindings", null);
        setField(term75347, term75347.getClass(), "_canonicalName", null);
        setField(term75347, term75347.getClass(), "_class", null);
        setIntField(term75347, term75347.getClass(), "_hash", 0);
        setField(term75347, term75347.getClass(), "_valueHandler", null);
        setField(term75347, term75347.getClass(), "_typeHandler", null);
        setBooleanField(term75347, term75347.getClass(), "_asStatic", false);
        setElement(term75346, 0, term75347);
        setField(term75348, term75348.getClass(), "_componentType", null);
        setField(term75348, term75348.getClass(), "_emptyArray", null);
        setField(term75348, term75348.getClass(), "_superClass", null);
        setField(term75348, term75348.getClass(), "_superInterfaces", null);
        setField(term75348, term75348.getClass(), "_bindings", null);
        setField(term75348, term75348.getClass(), "_canonicalName", null);
        setField(term75348, term75348.getClass(), "_class", null);
        setIntField(term75348, term75348.getClass(), "_hash", 0);
        setField(term75348, term75348.getClass(), "_valueHandler", null);
        setField(term75348, term75348.getClass(), "_typeHandler", null);
        setBooleanField(term75348, term75348.getClass(), "_asStatic", false);
        setElement(term75346, 1, term75348);
        setField(term75349, term75349.getClass(), "_keyType", null);
        setField(term75349, term75349.getClass(), "_valueType", null);
        setField(term75349, term75349.getClass(), "_superClass", null);
        setField(term75349, term75349.getClass(), "_superInterfaces", null);
        setField(term75349, term75349.getClass(), "_bindings", null);
        setField(term75349, term75349.getClass(), "_canonicalName", null);
        setField(term75349, term75349.getClass(), "_class", null);
        setIntField(term75349, term75349.getClass(), "_hash", 0);
        setField(term75349, term75349.getClass(), "_valueHandler", null);
        setField(term75349, term75349.getClass(), "_typeHandler", null);
        setBooleanField(term75349, term75349.getClass(), "_asStatic", false);
        setElement(term75346, 2, term75349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term74800;
        args[1] = term74801;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term75339));
        assertTrue(recursiveEquals(term74800, term75345));
        assertTrue(recursiveEquals(term74801, term75346));
    }

};


