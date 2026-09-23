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

public class TypeBindings_init_352540534239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77536;
     Object term77537;
     Object term78098;
     Object term78104;
     Object term78105;

    public TypeBindings_init_352540534239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term77692 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term77541 = (Object[]) newArray("java.lang.String", 0);
        setField(term77692, term77692.getClass(), "_names", term77541);
        setField(term77692, term77692.getClass(), "_types", null);
        term77536 = (Object[]) newArray("java.lang.String", 3);
        term77537 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term77796 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term77892 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term78012 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term77796, term77796.getClass(), "_hash", 0);
        setElement(term77537, 0, term77796);
        setIntField(term77892, term77892.getClass(), "_hash", 0);
        setElement(term77537, 1, term77892);
        setElement(term77537, 2, term78012);
        term78098 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term78099 = (Object[]) newArray("java.lang.String", 3);
        Object[] term78100 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term78101 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term78102 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term78103 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term78098, term78098.getClass(), "_names", term78099);
        setField(term78101, term78101.getClass(), "_referencedType", null);
        setField(term78101, term78101.getClass(), "_superClass", null);
        setField(term78101, term78101.getClass(), "_superInterfaces", null);
        setField(term78101, term78101.getClass(), "_bindings", null);
        setField(term78101, term78101.getClass(), "_canonicalName", null);
        setField(term78101, term78101.getClass(), "_class", null);
        setIntField(term78101, term78101.getClass(), "_hash", 0);
        setField(term78101, term78101.getClass(), "_valueHandler", null);
        setField(term78101, term78101.getClass(), "_typeHandler", null);
        setBooleanField(term78101, term78101.getClass(), "_asStatic", false);
        setElement(term78100, 0, term78101);
        setField(term78102, term78102.getClass(), "_componentType", null);
        setField(term78102, term78102.getClass(), "_emptyArray", null);
        setField(term78102, term78102.getClass(), "_superClass", null);
        setField(term78102, term78102.getClass(), "_superInterfaces", null);
        setField(term78102, term78102.getClass(), "_bindings", null);
        setField(term78102, term78102.getClass(), "_canonicalName", null);
        setField(term78102, term78102.getClass(), "_class", null);
        setIntField(term78102, term78102.getClass(), "_hash", 0);
        setField(term78102, term78102.getClass(), "_valueHandler", null);
        setField(term78102, term78102.getClass(), "_typeHandler", null);
        setBooleanField(term78102, term78102.getClass(), "_asStatic", false);
        setElement(term78100, 1, term78102);
        setField(term78103, term78103.getClass(), "_referencedType", null);
        setField(term78103, term78103.getClass(), "_superClass", null);
        setField(term78103, term78103.getClass(), "_superInterfaces", null);
        setField(term78103, term78103.getClass(), "_bindings", null);
        setField(term78103, term78103.getClass(), "_canonicalName", null);
        setField(term78103, term78103.getClass(), "_class", null);
        setIntField(term78103, term78103.getClass(), "_hash", 0);
        setField(term78103, term78103.getClass(), "_valueHandler", null);
        setField(term78103, term78103.getClass(), "_typeHandler", null);
        setBooleanField(term78103, term78103.getClass(), "_asStatic", false);
        setElement(term78100, 2, term78103);
        setField(term78098, term78098.getClass(), "_types", term78100);
        setField(term78098, term78098.getClass(), "_unboundVariables", null);
        setIntField(term78098, term78098.getClass(), "_hashCode", 1);
        term78104 = (Object[]) newArray("java.lang.String", 3);
        term78105 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term78106 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term78107 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term78108 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term78106, term78106.getClass(), "_referencedType", null);
        setField(term78106, term78106.getClass(), "_superClass", null);
        setField(term78106, term78106.getClass(), "_superInterfaces", null);
        setField(term78106, term78106.getClass(), "_bindings", null);
        setField(term78106, term78106.getClass(), "_canonicalName", null);
        setField(term78106, term78106.getClass(), "_class", null);
        setIntField(term78106, term78106.getClass(), "_hash", 0);
        setField(term78106, term78106.getClass(), "_valueHandler", null);
        setField(term78106, term78106.getClass(), "_typeHandler", null);
        setBooleanField(term78106, term78106.getClass(), "_asStatic", false);
        setElement(term78105, 0, term78106);
        setField(term78107, term78107.getClass(), "_componentType", null);
        setField(term78107, term78107.getClass(), "_emptyArray", null);
        setField(term78107, term78107.getClass(), "_superClass", null);
        setField(term78107, term78107.getClass(), "_superInterfaces", null);
        setField(term78107, term78107.getClass(), "_bindings", null);
        setField(term78107, term78107.getClass(), "_canonicalName", null);
        setField(term78107, term78107.getClass(), "_class", null);
        setIntField(term78107, term78107.getClass(), "_hash", 0);
        setField(term78107, term78107.getClass(), "_valueHandler", null);
        setField(term78107, term78107.getClass(), "_typeHandler", null);
        setBooleanField(term78107, term78107.getClass(), "_asStatic", false);
        setElement(term78105, 1, term78107);
        setField(term78108, term78108.getClass(), "_referencedType", null);
        setField(term78108, term78108.getClass(), "_superClass", null);
        setField(term78108, term78108.getClass(), "_superInterfaces", null);
        setField(term78108, term78108.getClass(), "_bindings", null);
        setField(term78108, term78108.getClass(), "_canonicalName", null);
        setField(term78108, term78108.getClass(), "_class", null);
        setIntField(term78108, term78108.getClass(), "_hash", 0);
        setField(term78108, term78108.getClass(), "_valueHandler", null);
        setField(term78108, term78108.getClass(), "_typeHandler", null);
        setBooleanField(term78108, term78108.getClass(), "_asStatic", false);
        setElement(term78105, 2, term78108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term77536;
        args[1] = term77537;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term78098));
        assertTrue(recursiveEquals(term77536, term78104));
        assertTrue(recursiveEquals(term77537, term78105));
    }

};


