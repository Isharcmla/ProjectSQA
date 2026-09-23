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

public class TypeBindings_init_352540534321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107762;
     Object term107763;
     Object term108270;
     Object term108276;
     Object term108277;

    public TypeBindings_init_352540534321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term107919 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term107767 = (Object[]) newArray("java.lang.String", 0);
        Object[] term107768 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term107919, term107919.getClass(), "_names", term107767);
        setField(term107919, term107919.getClass(), "_types", term107768);
        term107762 = (Object[]) newArray("java.lang.String", 3);
        term107763 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term108023 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term108129 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term108235 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term108023, term108023.getClass(), "_hash", 0);
        setElement(term107763, 0, term108023);
        setIntField(term108129, term108129.getClass(), "_hash", 0);
        setElement(term107763, 1, term108129);
        setElement(term107763, 2, term108235);
        term108270 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term108271 = (Object[]) newArray("java.lang.String", 3);
        Object[] term108272 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term108273 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term108274 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term108275 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term108270, term108270.getClass(), "_names", term108271);
        setField(term108273, term108273.getClass(), "_referencedType", null);
        setField(term108273, term108273.getClass(), "_superClass", null);
        setField(term108273, term108273.getClass(), "_superInterfaces", null);
        setField(term108273, term108273.getClass(), "_bindings", null);
        setField(term108273, term108273.getClass(), "_canonicalName", null);
        setField(term108273, term108273.getClass(), "_class", null);
        setIntField(term108273, term108273.getClass(), "_hash", 0);
        setField(term108273, term108273.getClass(), "_valueHandler", null);
        setField(term108273, term108273.getClass(), "_typeHandler", null);
        setBooleanField(term108273, term108273.getClass(), "_asStatic", false);
        setElement(term108272, 0, term108273);
        setField(term108274, term108274.getClass(), "_elementType", null);
        setField(term108274, term108274.getClass(), "_superClass", null);
        setField(term108274, term108274.getClass(), "_superInterfaces", null);
        setField(term108274, term108274.getClass(), "_bindings", null);
        setField(term108274, term108274.getClass(), "_canonicalName", null);
        setField(term108274, term108274.getClass(), "_class", null);
        setIntField(term108274, term108274.getClass(), "_hash", 0);
        setField(term108274, term108274.getClass(), "_valueHandler", null);
        setField(term108274, term108274.getClass(), "_typeHandler", null);
        setBooleanField(term108274, term108274.getClass(), "_asStatic", false);
        setElement(term108272, 1, term108274);
        setField(term108275, term108275.getClass(), "_elementType", null);
        setField(term108275, term108275.getClass(), "_superClass", null);
        setField(term108275, term108275.getClass(), "_superInterfaces", null);
        setField(term108275, term108275.getClass(), "_bindings", null);
        setField(term108275, term108275.getClass(), "_canonicalName", null);
        setField(term108275, term108275.getClass(), "_class", null);
        setIntField(term108275, term108275.getClass(), "_hash", 0);
        setField(term108275, term108275.getClass(), "_valueHandler", null);
        setField(term108275, term108275.getClass(), "_typeHandler", null);
        setBooleanField(term108275, term108275.getClass(), "_asStatic", false);
        setElement(term108272, 2, term108275);
        setField(term108270, term108270.getClass(), "_types", term108272);
        setField(term108270, term108270.getClass(), "_unboundVariables", null);
        setIntField(term108270, term108270.getClass(), "_hashCode", 1);
        term108276 = (Object[]) newArray("java.lang.String", 3);
        term108277 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term108278 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term108279 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term108280 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term108278, term108278.getClass(), "_referencedType", null);
        setField(term108278, term108278.getClass(), "_superClass", null);
        setField(term108278, term108278.getClass(), "_superInterfaces", null);
        setField(term108278, term108278.getClass(), "_bindings", null);
        setField(term108278, term108278.getClass(), "_canonicalName", null);
        setField(term108278, term108278.getClass(), "_class", null);
        setIntField(term108278, term108278.getClass(), "_hash", 0);
        setField(term108278, term108278.getClass(), "_valueHandler", null);
        setField(term108278, term108278.getClass(), "_typeHandler", null);
        setBooleanField(term108278, term108278.getClass(), "_asStatic", false);
        setElement(term108277, 0, term108278);
        setField(term108279, term108279.getClass(), "_elementType", null);
        setField(term108279, term108279.getClass(), "_superClass", null);
        setField(term108279, term108279.getClass(), "_superInterfaces", null);
        setField(term108279, term108279.getClass(), "_bindings", null);
        setField(term108279, term108279.getClass(), "_canonicalName", null);
        setField(term108279, term108279.getClass(), "_class", null);
        setIntField(term108279, term108279.getClass(), "_hash", 0);
        setField(term108279, term108279.getClass(), "_valueHandler", null);
        setField(term108279, term108279.getClass(), "_typeHandler", null);
        setBooleanField(term108279, term108279.getClass(), "_asStatic", false);
        setElement(term108277, 1, term108279);
        setField(term108280, term108280.getClass(), "_elementType", null);
        setField(term108280, term108280.getClass(), "_superClass", null);
        setField(term108280, term108280.getClass(), "_superInterfaces", null);
        setField(term108280, term108280.getClass(), "_bindings", null);
        setField(term108280, term108280.getClass(), "_canonicalName", null);
        setField(term108280, term108280.getClass(), "_class", null);
        setIntField(term108280, term108280.getClass(), "_hash", 0);
        setField(term108280, term108280.getClass(), "_valueHandler", null);
        setField(term108280, term108280.getClass(), "_typeHandler", null);
        setBooleanField(term108280, term108280.getClass(), "_asStatic", false);
        setElement(term108277, 2, term108280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term107762;
        args[1] = term107763;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term108270));
        assertTrue(recursiveEquals(term107762, term108276));
        assertTrue(recursiveEquals(term107763, term108277));
    }

};


