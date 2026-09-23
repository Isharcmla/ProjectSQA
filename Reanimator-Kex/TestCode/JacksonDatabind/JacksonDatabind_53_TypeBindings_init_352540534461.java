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

public class TypeBindings_init_352540534461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178994;
     Object term178995;
     Object term179371;
     Object term179376;
     Object term179377;

    public TypeBindings_init_352540534461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term179138 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term179138, term179138.getClass(), "_names", null);
        setField(term179138, term179138.getClass(), "_types", null);
        term178994 = (Object[]) newArray("java.lang.String", 2);
        term178995 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term179244 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term179344 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setIntField(term179244, term179244.getClass(), "_hash", 0);
        setElement(term178995, 0, term179244);
        setElement(term178995, 1, term179344);
        term179371 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term179372 = (Object[]) newArray("java.lang.String", 2);
        Object[] term179373 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term179374 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term179375 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term179371, term179371.getClass(), "_names", term179372);
        setField(term179374, term179374.getClass(), "_elementType", null);
        setField(term179374, term179374.getClass(), "_superClass", null);
        setField(term179374, term179374.getClass(), "_superInterfaces", null);
        setField(term179374, term179374.getClass(), "_bindings", null);
        setField(term179374, term179374.getClass(), "_canonicalName", null);
        setField(term179374, term179374.getClass(), "_class", null);
        setIntField(term179374, term179374.getClass(), "_hash", 0);
        setField(term179374, term179374.getClass(), "_valueHandler", null);
        setField(term179374, term179374.getClass(), "_typeHandler", null);
        setBooleanField(term179374, term179374.getClass(), "_asStatic", false);
        setElement(term179373, 0, term179374);
        setField(term179375, term179375.getClass(), "_keyType", null);
        setField(term179375, term179375.getClass(), "_valueType", null);
        setField(term179375, term179375.getClass(), "_superClass", null);
        setField(term179375, term179375.getClass(), "_superInterfaces", null);
        setField(term179375, term179375.getClass(), "_bindings", null);
        setField(term179375, term179375.getClass(), "_canonicalName", null);
        setField(term179375, term179375.getClass(), "_class", null);
        setIntField(term179375, term179375.getClass(), "_hash", 0);
        setField(term179375, term179375.getClass(), "_valueHandler", null);
        setField(term179375, term179375.getClass(), "_typeHandler", null);
        setBooleanField(term179375, term179375.getClass(), "_asStatic", false);
        setElement(term179373, 1, term179375);
        setField(term179371, term179371.getClass(), "_types", term179373);
        setField(term179371, term179371.getClass(), "_unboundVariables", null);
        setIntField(term179371, term179371.getClass(), "_hashCode", 1);
        term179376 = (Object[]) newArray("java.lang.String", 2);
        term179377 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term179378 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term179379 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term179378, term179378.getClass(), "_elementType", null);
        setField(term179378, term179378.getClass(), "_superClass", null);
        setField(term179378, term179378.getClass(), "_superInterfaces", null);
        setField(term179378, term179378.getClass(), "_bindings", null);
        setField(term179378, term179378.getClass(), "_canonicalName", null);
        setField(term179378, term179378.getClass(), "_class", null);
        setIntField(term179378, term179378.getClass(), "_hash", 0);
        setField(term179378, term179378.getClass(), "_valueHandler", null);
        setField(term179378, term179378.getClass(), "_typeHandler", null);
        setBooleanField(term179378, term179378.getClass(), "_asStatic", false);
        setElement(term179377, 0, term179378);
        setField(term179379, term179379.getClass(), "_keyType", null);
        setField(term179379, term179379.getClass(), "_valueType", null);
        setField(term179379, term179379.getClass(), "_superClass", null);
        setField(term179379, term179379.getClass(), "_superInterfaces", null);
        setField(term179379, term179379.getClass(), "_bindings", null);
        setField(term179379, term179379.getClass(), "_canonicalName", null);
        setField(term179379, term179379.getClass(), "_class", null);
        setIntField(term179379, term179379.getClass(), "_hash", 0);
        setField(term179379, term179379.getClass(), "_valueHandler", null);
        setField(term179379, term179379.getClass(), "_typeHandler", null);
        setBooleanField(term179379, term179379.getClass(), "_asStatic", false);
        setElement(term179377, 1, term179379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term178994;
        args[1] = term178995;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term179371));
        assertTrue(recursiveEquals(term178994, term179376));
        assertTrue(recursiveEquals(term178995, term179377));
    }

};


