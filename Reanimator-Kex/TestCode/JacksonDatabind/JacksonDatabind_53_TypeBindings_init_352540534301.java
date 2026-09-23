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

public class TypeBindings_init_352540534301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99803;
     Object term99806;
     Object term100904;
     Object term100919;
     Object term100928;

    public TypeBindings_init_352540534301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term99971 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term99811 = (Object[]) newArray("java.lang.String", 0);
        setField(term99971, term99971.getClass(), "_names", term99811);
        setField(term99971, term99971.getClass(), "_types", null);
        term99803 = (Object[]) newArray("java.lang.String", 4);
        setElement(term99803, 0, "");
        setElement(term99803, 1, "");
        setElement(term99803, 2, "");
        setElement(term99803, 3, "");
        term99806 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term100151 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term100247 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term100367 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term100465 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setIntField(term100151, term100151.getClass(), "_hash", 0);
        setElement(term99806, 0, term100151);
        setIntField(term100247, term100247.getClass(), "_hash", 0);
        setElement(term99806, 1, term100247);
        setIntField(term100367, term100367.getClass(), "_hash", 0);
        setElement(term99806, 2, term100367);
        setElement(term99806, 3, term100465);
        term100904 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term100905 = (Object[]) newArray("java.lang.String", 4);
        Object[] term100914 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term100915 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term100916 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term100917 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term100918 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setElement(term100905, 0, "");
        setElement(term100905, 1, "");
        setElement(term100905, 2, "");
        setElement(term100905, 3, "");
        setField(term100904, term100904.getClass(), "_names", term100905);
        setField(term100915, term100915.getClass(), "_referencedType", null);
        setField(term100915, term100915.getClass(), "_superClass", null);
        setField(term100915, term100915.getClass(), "_superInterfaces", null);
        setField(term100915, term100915.getClass(), "_bindings", null);
        setField(term100915, term100915.getClass(), "_canonicalName", null);
        setField(term100915, term100915.getClass(), "_class", null);
        setIntField(term100915, term100915.getClass(), "_hash", 0);
        setField(term100915, term100915.getClass(), "_valueHandler", null);
        setField(term100915, term100915.getClass(), "_typeHandler", null);
        setBooleanField(term100915, term100915.getClass(), "_asStatic", false);
        setElement(term100914, 0, term100915);
        setField(term100916, term100916.getClass(), "_componentType", null);
        setField(term100916, term100916.getClass(), "_emptyArray", null);
        setField(term100916, term100916.getClass(), "_superClass", null);
        setField(term100916, term100916.getClass(), "_superInterfaces", null);
        setField(term100916, term100916.getClass(), "_bindings", null);
        setField(term100916, term100916.getClass(), "_canonicalName", null);
        setField(term100916, term100916.getClass(), "_class", null);
        setIntField(term100916, term100916.getClass(), "_hash", 0);
        setField(term100916, term100916.getClass(), "_valueHandler", null);
        setField(term100916, term100916.getClass(), "_typeHandler", null);
        setBooleanField(term100916, term100916.getClass(), "_asStatic", false);
        setElement(term100914, 1, term100916);
        setField(term100917, term100917.getClass(), "_referencedType", null);
        setField(term100917, term100917.getClass(), "_superClass", null);
        setField(term100917, term100917.getClass(), "_superInterfaces", null);
        setField(term100917, term100917.getClass(), "_bindings", null);
        setField(term100917, term100917.getClass(), "_canonicalName", null);
        setField(term100917, term100917.getClass(), "_class", null);
        setIntField(term100917, term100917.getClass(), "_hash", 0);
        setField(term100917, term100917.getClass(), "_valueHandler", null);
        setField(term100917, term100917.getClass(), "_typeHandler", null);
        setBooleanField(term100917, term100917.getClass(), "_asStatic", false);
        setElement(term100914, 2, term100917);
        setField(term100918, term100918.getClass(), "_superClass", null);
        setField(term100918, term100918.getClass(), "_superInterfaces", null);
        setField(term100918, term100918.getClass(), "_bindings", null);
        setField(term100918, term100918.getClass(), "_canonicalName", null);
        setField(term100918, term100918.getClass(), "_class", null);
        setIntField(term100918, term100918.getClass(), "_hash", 0);
        setField(term100918, term100918.getClass(), "_valueHandler", null);
        setField(term100918, term100918.getClass(), "_typeHandler", null);
        setBooleanField(term100918, term100918.getClass(), "_asStatic", false);
        setElement(term100914, 3, term100918);
        setField(term100904, term100904.getClass(), "_types", term100914);
        setField(term100904, term100904.getClass(), "_unboundVariables", null);
        setIntField(term100904, term100904.getClass(), "_hashCode", 1);
        term100919 = (Object[]) newArray("java.lang.String", 4);
        setElement(term100919, 0, "");
        setElement(term100919, 1, "");
        setElement(term100919, 2, "");
        setElement(term100919, 3, "");
        term100928 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term100929 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term100930 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term100931 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term100932 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term100929, term100929.getClass(), "_referencedType", null);
        setField(term100929, term100929.getClass(), "_superClass", null);
        setField(term100929, term100929.getClass(), "_superInterfaces", null);
        setField(term100929, term100929.getClass(), "_bindings", null);
        setField(term100929, term100929.getClass(), "_canonicalName", null);
        setField(term100929, term100929.getClass(), "_class", null);
        setIntField(term100929, term100929.getClass(), "_hash", 0);
        setField(term100929, term100929.getClass(), "_valueHandler", null);
        setField(term100929, term100929.getClass(), "_typeHandler", null);
        setBooleanField(term100929, term100929.getClass(), "_asStatic", false);
        setElement(term100928, 0, term100929);
        setField(term100930, term100930.getClass(), "_componentType", null);
        setField(term100930, term100930.getClass(), "_emptyArray", null);
        setField(term100930, term100930.getClass(), "_superClass", null);
        setField(term100930, term100930.getClass(), "_superInterfaces", null);
        setField(term100930, term100930.getClass(), "_bindings", null);
        setField(term100930, term100930.getClass(), "_canonicalName", null);
        setField(term100930, term100930.getClass(), "_class", null);
        setIntField(term100930, term100930.getClass(), "_hash", 0);
        setField(term100930, term100930.getClass(), "_valueHandler", null);
        setField(term100930, term100930.getClass(), "_typeHandler", null);
        setBooleanField(term100930, term100930.getClass(), "_asStatic", false);
        setElement(term100928, 1, term100930);
        setField(term100931, term100931.getClass(), "_referencedType", null);
        setField(term100931, term100931.getClass(), "_superClass", null);
        setField(term100931, term100931.getClass(), "_superInterfaces", null);
        setField(term100931, term100931.getClass(), "_bindings", null);
        setField(term100931, term100931.getClass(), "_canonicalName", null);
        setField(term100931, term100931.getClass(), "_class", null);
        setIntField(term100931, term100931.getClass(), "_hash", 0);
        setField(term100931, term100931.getClass(), "_valueHandler", null);
        setField(term100931, term100931.getClass(), "_typeHandler", null);
        setBooleanField(term100931, term100931.getClass(), "_asStatic", false);
        setElement(term100928, 2, term100931);
        setField(term100932, term100932.getClass(), "_superClass", null);
        setField(term100932, term100932.getClass(), "_superInterfaces", null);
        setField(term100932, term100932.getClass(), "_bindings", null);
        setField(term100932, term100932.getClass(), "_canonicalName", null);
        setField(term100932, term100932.getClass(), "_class", null);
        setIntField(term100932, term100932.getClass(), "_hash", 0);
        setField(term100932, term100932.getClass(), "_valueHandler", null);
        setField(term100932, term100932.getClass(), "_typeHandler", null);
        setBooleanField(term100932, term100932.getClass(), "_asStatic", false);
        setElement(term100928, 3, term100932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term99803;
        args[1] = term99806;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term100904));
        assertTrue(recursiveEquals(term99803, term100919));
        assertTrue(recursiveEquals(term99806, term100928));
    }

};


