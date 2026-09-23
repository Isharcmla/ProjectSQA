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

public class TypeBindings_init_352540534419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156434;
     Object term156435;
     Object term157134;
     Object term157141;
     Object term157142;

    public TypeBindings_init_352540534419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term156598 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term156440 = (Object[]) newArray("java.lang.String", 0);
        Object[] term156441 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term156598, term156598.getClass(), "_names", term156440);
        setField(term156598, term156598.getClass(), "_types", term156441);
        term156434 = (Object[]) newArray("java.lang.String", 4);
        term156435 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term156704 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term156808 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term156908 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term157006 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setIntField(term156704, term156704.getClass(), "_hash", 0);
        setElement(term156435, 0, term156704);
        setIntField(term156808, term156808.getClass(), "_hash", 0);
        setElement(term156435, 1, term156808);
        setIntField(term156908, term156908.getClass(), "_hash", 0);
        setElement(term156435, 2, term156908);
        setElement(term156435, 3, term157006);
        term157134 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term157135 = (Object[]) newArray("java.lang.String", 4);
        Object[] term157136 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term157137 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term157138 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term157139 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term157140 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term157134, term157134.getClass(), "_names", term157135);
        setField(term157137, term157137.getClass(), "_elementType", null);
        setField(term157137, term157137.getClass(), "_superClass", null);
        setField(term157137, term157137.getClass(), "_superInterfaces", null);
        setField(term157137, term157137.getClass(), "_bindings", null);
        setField(term157137, term157137.getClass(), "_canonicalName", null);
        setField(term157137, term157137.getClass(), "_class", null);
        setIntField(term157137, term157137.getClass(), "_hash", 0);
        setField(term157137, term157137.getClass(), "_valueHandler", null);
        setField(term157137, term157137.getClass(), "_typeHandler", null);
        setBooleanField(term157137, term157137.getClass(), "_asStatic", false);
        setElement(term157136, 0, term157137);
        setField(term157138, term157138.getClass(), "_referencedType", null);
        setField(term157138, term157138.getClass(), "_superClass", null);
        setField(term157138, term157138.getClass(), "_superInterfaces", null);
        setField(term157138, term157138.getClass(), "_bindings", null);
        setField(term157138, term157138.getClass(), "_canonicalName", null);
        setField(term157138, term157138.getClass(), "_class", null);
        setIntField(term157138, term157138.getClass(), "_hash", 0);
        setField(term157138, term157138.getClass(), "_valueHandler", null);
        setField(term157138, term157138.getClass(), "_typeHandler", null);
        setBooleanField(term157138, term157138.getClass(), "_asStatic", false);
        setElement(term157136, 1, term157138);
        setField(term157139, term157139.getClass(), "_keyType", null);
        setField(term157139, term157139.getClass(), "_valueType", null);
        setField(term157139, term157139.getClass(), "_superClass", null);
        setField(term157139, term157139.getClass(), "_superInterfaces", null);
        setField(term157139, term157139.getClass(), "_bindings", null);
        setField(term157139, term157139.getClass(), "_canonicalName", null);
        setField(term157139, term157139.getClass(), "_class", null);
        setIntField(term157139, term157139.getClass(), "_hash", 0);
        setField(term157139, term157139.getClass(), "_valueHandler", null);
        setField(term157139, term157139.getClass(), "_typeHandler", null);
        setBooleanField(term157139, term157139.getClass(), "_asStatic", false);
        setElement(term157136, 2, term157139);
        setField(term157140, term157140.getClass(), "_superClass", null);
        setField(term157140, term157140.getClass(), "_superInterfaces", null);
        setField(term157140, term157140.getClass(), "_bindings", null);
        setField(term157140, term157140.getClass(), "_canonicalName", null);
        setField(term157140, term157140.getClass(), "_class", null);
        setIntField(term157140, term157140.getClass(), "_hash", 0);
        setField(term157140, term157140.getClass(), "_valueHandler", null);
        setField(term157140, term157140.getClass(), "_typeHandler", null);
        setBooleanField(term157140, term157140.getClass(), "_asStatic", false);
        setElement(term157136, 3, term157140);
        setField(term157134, term157134.getClass(), "_types", term157136);
        setField(term157134, term157134.getClass(), "_unboundVariables", null);
        setIntField(term157134, term157134.getClass(), "_hashCode", 1);
        term157141 = (Object[]) newArray("java.lang.String", 4);
        term157142 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term157143 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term157144 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term157145 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term157146 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term157143, term157143.getClass(), "_elementType", null);
        setField(term157143, term157143.getClass(), "_superClass", null);
        setField(term157143, term157143.getClass(), "_superInterfaces", null);
        setField(term157143, term157143.getClass(), "_bindings", null);
        setField(term157143, term157143.getClass(), "_canonicalName", null);
        setField(term157143, term157143.getClass(), "_class", null);
        setIntField(term157143, term157143.getClass(), "_hash", 0);
        setField(term157143, term157143.getClass(), "_valueHandler", null);
        setField(term157143, term157143.getClass(), "_typeHandler", null);
        setBooleanField(term157143, term157143.getClass(), "_asStatic", false);
        setElement(term157142, 0, term157143);
        setField(term157144, term157144.getClass(), "_referencedType", null);
        setField(term157144, term157144.getClass(), "_superClass", null);
        setField(term157144, term157144.getClass(), "_superInterfaces", null);
        setField(term157144, term157144.getClass(), "_bindings", null);
        setField(term157144, term157144.getClass(), "_canonicalName", null);
        setField(term157144, term157144.getClass(), "_class", null);
        setIntField(term157144, term157144.getClass(), "_hash", 0);
        setField(term157144, term157144.getClass(), "_valueHandler", null);
        setField(term157144, term157144.getClass(), "_typeHandler", null);
        setBooleanField(term157144, term157144.getClass(), "_asStatic", false);
        setElement(term157142, 1, term157144);
        setField(term157145, term157145.getClass(), "_keyType", null);
        setField(term157145, term157145.getClass(), "_valueType", null);
        setField(term157145, term157145.getClass(), "_superClass", null);
        setField(term157145, term157145.getClass(), "_superInterfaces", null);
        setField(term157145, term157145.getClass(), "_bindings", null);
        setField(term157145, term157145.getClass(), "_canonicalName", null);
        setField(term157145, term157145.getClass(), "_class", null);
        setIntField(term157145, term157145.getClass(), "_hash", 0);
        setField(term157145, term157145.getClass(), "_valueHandler", null);
        setField(term157145, term157145.getClass(), "_typeHandler", null);
        setBooleanField(term157145, term157145.getClass(), "_asStatic", false);
        setElement(term157142, 2, term157145);
        setField(term157146, term157146.getClass(), "_superClass", null);
        setField(term157146, term157146.getClass(), "_superInterfaces", null);
        setField(term157146, term157146.getClass(), "_bindings", null);
        setField(term157146, term157146.getClass(), "_canonicalName", null);
        setField(term157146, term157146.getClass(), "_class", null);
        setIntField(term157146, term157146.getClass(), "_hash", 0);
        setField(term157146, term157146.getClass(), "_valueHandler", null);
        setField(term157146, term157146.getClass(), "_typeHandler", null);
        setBooleanField(term157146, term157146.getClass(), "_asStatic", false);
        setElement(term157142, 3, term157146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term156434;
        args[1] = term156435;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term157134));
        assertTrue(recursiveEquals(term156434, term157141));
        assertTrue(recursiveEquals(term156435, term157142));
    }

};


