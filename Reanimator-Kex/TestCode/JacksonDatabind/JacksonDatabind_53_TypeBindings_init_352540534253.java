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

public class TypeBindings_init_352540534253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82286;
     Object term82290;
     Object term82905;
     Object term82917;
     Object term82924;

    public TypeBindings_init_352540534253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term82446 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term82294 = (Object[]) newArray("java.lang.String", 0);
        Object[] term82295 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term82446, term82446.getClass(), "_names", term82294);
        setField(term82446, term82446.getClass(), "_types", term82295);
        term82286 = (Object[]) newArray("java.lang.String", 3);
        setElement(term82286, 0, "");
        setElement(term82286, 1, "");
        setElement(term82286, 2, "");
        term82290 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term82664 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term82760 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term82858 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setIntField(term82664, term82664.getClass(), "_hash", 0);
        setElement(term82290, 0, term82664);
        setIntField(term82760, term82760.getClass(), "_hash", 0);
        setElement(term82290, 1, term82760);
        setElement(term82290, 2, term82858);
        term82905 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term82906 = (Object[]) newArray("java.lang.String", 3);
        Object[] term82913 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term82914 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term82915 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term82916 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setElement(term82906, 0, "");
        setElement(term82906, 1, "");
        setElement(term82906, 2, "");
        setField(term82905, term82905.getClass(), "_names", term82906);
        setField(term82914, term82914.getClass(), "_referencedType", null);
        setField(term82914, term82914.getClass(), "_superClass", null);
        setField(term82914, term82914.getClass(), "_superInterfaces", null);
        setField(term82914, term82914.getClass(), "_bindings", null);
        setField(term82914, term82914.getClass(), "_canonicalName", null);
        setField(term82914, term82914.getClass(), "_class", null);
        setIntField(term82914, term82914.getClass(), "_hash", 0);
        setField(term82914, term82914.getClass(), "_valueHandler", null);
        setField(term82914, term82914.getClass(), "_typeHandler", null);
        setBooleanField(term82914, term82914.getClass(), "_asStatic", false);
        setElement(term82913, 0, term82914);
        setField(term82915, term82915.getClass(), "_componentType", null);
        setField(term82915, term82915.getClass(), "_emptyArray", null);
        setField(term82915, term82915.getClass(), "_superClass", null);
        setField(term82915, term82915.getClass(), "_superInterfaces", null);
        setField(term82915, term82915.getClass(), "_bindings", null);
        setField(term82915, term82915.getClass(), "_canonicalName", null);
        setField(term82915, term82915.getClass(), "_class", null);
        setIntField(term82915, term82915.getClass(), "_hash", 0);
        setField(term82915, term82915.getClass(), "_valueHandler", null);
        setField(term82915, term82915.getClass(), "_typeHandler", null);
        setBooleanField(term82915, term82915.getClass(), "_asStatic", false);
        setElement(term82913, 1, term82915);
        setField(term82916, term82916.getClass(), "_superClass", null);
        setField(term82916, term82916.getClass(), "_superInterfaces", null);
        setField(term82916, term82916.getClass(), "_bindings", null);
        setField(term82916, term82916.getClass(), "_canonicalName", null);
        setField(term82916, term82916.getClass(), "_class", null);
        setIntField(term82916, term82916.getClass(), "_hash", 0);
        setField(term82916, term82916.getClass(), "_valueHandler", null);
        setField(term82916, term82916.getClass(), "_typeHandler", null);
        setBooleanField(term82916, term82916.getClass(), "_asStatic", false);
        setElement(term82913, 2, term82916);
        setField(term82905, term82905.getClass(), "_types", term82913);
        setField(term82905, term82905.getClass(), "_unboundVariables", null);
        setIntField(term82905, term82905.getClass(), "_hashCode", 1);
        term82917 = (Object[]) newArray("java.lang.String", 3);
        setElement(term82917, 0, "");
        setElement(term82917, 1, "");
        setElement(term82917, 2, "");
        term82924 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term82925 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term82926 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term82927 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term82925, term82925.getClass(), "_referencedType", null);
        setField(term82925, term82925.getClass(), "_superClass", null);
        setField(term82925, term82925.getClass(), "_superInterfaces", null);
        setField(term82925, term82925.getClass(), "_bindings", null);
        setField(term82925, term82925.getClass(), "_canonicalName", null);
        setField(term82925, term82925.getClass(), "_class", null);
        setIntField(term82925, term82925.getClass(), "_hash", 0);
        setField(term82925, term82925.getClass(), "_valueHandler", null);
        setField(term82925, term82925.getClass(), "_typeHandler", null);
        setBooleanField(term82925, term82925.getClass(), "_asStatic", false);
        setElement(term82924, 0, term82925);
        setField(term82926, term82926.getClass(), "_componentType", null);
        setField(term82926, term82926.getClass(), "_emptyArray", null);
        setField(term82926, term82926.getClass(), "_superClass", null);
        setField(term82926, term82926.getClass(), "_superInterfaces", null);
        setField(term82926, term82926.getClass(), "_bindings", null);
        setField(term82926, term82926.getClass(), "_canonicalName", null);
        setField(term82926, term82926.getClass(), "_class", null);
        setIntField(term82926, term82926.getClass(), "_hash", 0);
        setField(term82926, term82926.getClass(), "_valueHandler", null);
        setField(term82926, term82926.getClass(), "_typeHandler", null);
        setBooleanField(term82926, term82926.getClass(), "_asStatic", false);
        setElement(term82924, 1, term82926);
        setField(term82927, term82927.getClass(), "_superClass", null);
        setField(term82927, term82927.getClass(), "_superInterfaces", null);
        setField(term82927, term82927.getClass(), "_bindings", null);
        setField(term82927, term82927.getClass(), "_canonicalName", null);
        setField(term82927, term82927.getClass(), "_class", null);
        setIntField(term82927, term82927.getClass(), "_hash", 0);
        setField(term82927, term82927.getClass(), "_valueHandler", null);
        setField(term82927, term82927.getClass(), "_typeHandler", null);
        setBooleanField(term82927, term82927.getClass(), "_asStatic", false);
        setElement(term82924, 2, term82927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term82286;
        args[1] = term82290;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term82905));
        assertTrue(recursiveEquals(term82286, term82917));
        assertTrue(recursiveEquals(term82290, term82924));
    }

};


