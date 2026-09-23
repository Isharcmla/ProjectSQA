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

public class TypeBindings_init_352540534481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189119;
     Object term189120;
     Object term189497;
     Object term189502;
     Object term189503;

    public TypeBindings_init_352540534481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term189264 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term189123 = (Object[]) newArray("java.lang.String", 0);
        setField(term189264, term189264.getClass(), "_names", term189123);
        setField(term189264, term189264.getClass(), "_types", null);
        term189119 = (Object[]) newArray("java.lang.String", 4);
        term189120 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term189368 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term189460 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term189368, term189368.getClass(), "_hash", 0);
        setElement(term189120, 0, term189368);
        setElement(term189120, 1, term189460);
        setElement(term189120, 2, term189460);
        setElement(term189120, 3, term189460);
        term189497 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term189498 = (Object[]) newArray("java.lang.String", 4);
        Object[] term189499 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term189500 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term189501 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term189497, term189497.getClass(), "_names", term189498);
        setField(term189500, term189500.getClass(), "_referencedType", null);
        setField(term189500, term189500.getClass(), "_superClass", null);
        setField(term189500, term189500.getClass(), "_superInterfaces", null);
        setField(term189500, term189500.getClass(), "_bindings", null);
        setField(term189500, term189500.getClass(), "_canonicalName", null);
        setField(term189500, term189500.getClass(), "_class", null);
        setIntField(term189500, term189500.getClass(), "_hash", 0);
        setField(term189500, term189500.getClass(), "_valueHandler", null);
        setField(term189500, term189500.getClass(), "_typeHandler", null);
        setBooleanField(term189500, term189500.getClass(), "_asStatic", false);
        setElement(term189499, 0, term189500);
        setField(term189501, term189501.getClass(), "_keyType", null);
        setField(term189501, term189501.getClass(), "_valueType", null);
        setField(term189501, term189501.getClass(), "_superClass", null);
        setField(term189501, term189501.getClass(), "_superInterfaces", null);
        setField(term189501, term189501.getClass(), "_bindings", null);
        setField(term189501, term189501.getClass(), "_canonicalName", null);
        setField(term189501, term189501.getClass(), "_class", null);
        setIntField(term189501, term189501.getClass(), "_hash", 0);
        setField(term189501, term189501.getClass(), "_valueHandler", null);
        setField(term189501, term189501.getClass(), "_typeHandler", null);
        setBooleanField(term189501, term189501.getClass(), "_asStatic", false);
        setElement(term189499, 1, term189501);
        setElement(term189499, 2, term189501);
        setElement(term189499, 3, term189501);
        setField(term189497, term189497.getClass(), "_types", term189499);
        setField(term189497, term189497.getClass(), "_unboundVariables", null);
        setIntField(term189497, term189497.getClass(), "_hashCode", 1);
        term189502 = (Object[]) newArray("java.lang.String", 4);
        term189503 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term189504 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term189505 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term189504, term189504.getClass(), "_referencedType", null);
        setField(term189504, term189504.getClass(), "_superClass", null);
        setField(term189504, term189504.getClass(), "_superInterfaces", null);
        setField(term189504, term189504.getClass(), "_bindings", null);
        setField(term189504, term189504.getClass(), "_canonicalName", null);
        setField(term189504, term189504.getClass(), "_class", null);
        setIntField(term189504, term189504.getClass(), "_hash", 0);
        setField(term189504, term189504.getClass(), "_valueHandler", null);
        setField(term189504, term189504.getClass(), "_typeHandler", null);
        setBooleanField(term189504, term189504.getClass(), "_asStatic", false);
        setElement(term189503, 0, term189504);
        setField(term189505, term189505.getClass(), "_keyType", null);
        setField(term189505, term189505.getClass(), "_valueType", null);
        setField(term189505, term189505.getClass(), "_superClass", null);
        setField(term189505, term189505.getClass(), "_superInterfaces", null);
        setField(term189505, term189505.getClass(), "_bindings", null);
        setField(term189505, term189505.getClass(), "_canonicalName", null);
        setField(term189505, term189505.getClass(), "_class", null);
        setIntField(term189505, term189505.getClass(), "_hash", 0);
        setField(term189505, term189505.getClass(), "_valueHandler", null);
        setField(term189505, term189505.getClass(), "_typeHandler", null);
        setBooleanField(term189505, term189505.getClass(), "_asStatic", false);
        setElement(term189503, 1, term189505);
        setElement(term189503, 2, term189505);
        setElement(term189503, 3, term189505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term189119;
        args[1] = term189120;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term189497));
        assertTrue(recursiveEquals(term189119, term189502));
        assertTrue(recursiveEquals(term189120, term189503));
    }

};


