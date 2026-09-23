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

public class TypeBindings_init_352540534251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81264;
     Object term81265;
     Object term82272;
     Object term82279;
     Object term82280;

    public TypeBindings_init_352540534251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term81434 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term81270 = (Object[]) newArray("java.lang.String", 0);
        setField(term81434, term81434.getClass(), "_names", term81270);
        setField(term81434, term81434.getClass(), "_types", null);
        term81264 = (Object[]) newArray("java.lang.String", 5);
        term81265 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 5);
        Object term81554 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term81658 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term81750 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term81854 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term81554, term81554.getClass(), "_hash", 0);
        setElement(term81265, 0, term81554);
        setIntField(term81658, term81658.getClass(), "_hash", 0);
        setElement(term81265, 1, term81658);
        setIntField(term81750, term81750.getClass(), "_hash", 0);
        setElement(term81265, 2, term81750);
        setIntField(term81854, term81854.getClass(), "_hash", 0);
        setElement(term81265, 3, term81854);
        setElement(term81265, 4, term81658);
        term82272 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term82273 = (Object[]) newArray("java.lang.String", 5);
        Object[] term82274 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 5);
        Object term82275 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term82276 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term82277 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term82278 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term82272, term82272.getClass(), "_names", term82273);
        setField(term82275, term82275.getClass(), "_referencedType", null);
        setField(term82275, term82275.getClass(), "_superClass", null);
        setField(term82275, term82275.getClass(), "_superInterfaces", null);
        setField(term82275, term82275.getClass(), "_bindings", null);
        setField(term82275, term82275.getClass(), "_canonicalName", null);
        setField(term82275, term82275.getClass(), "_class", null);
        setIntField(term82275, term82275.getClass(), "_hash", 0);
        setField(term82275, term82275.getClass(), "_valueHandler", null);
        setField(term82275, term82275.getClass(), "_typeHandler", null);
        setBooleanField(term82275, term82275.getClass(), "_asStatic", false);
        setElement(term82274, 0, term82275);
        setField(term82276, term82276.getClass(), "_referencedType", null);
        setField(term82276, term82276.getClass(), "_superClass", null);
        setField(term82276, term82276.getClass(), "_superInterfaces", null);
        setField(term82276, term82276.getClass(), "_bindings", null);
        setField(term82276, term82276.getClass(), "_canonicalName", null);
        setField(term82276, term82276.getClass(), "_class", null);
        setIntField(term82276, term82276.getClass(), "_hash", 0);
        setField(term82276, term82276.getClass(), "_valueHandler", null);
        setField(term82276, term82276.getClass(), "_typeHandler", null);
        setBooleanField(term82276, term82276.getClass(), "_asStatic", false);
        setElement(term82274, 1, term82276);
        setField(term82277, term82277.getClass(), "_keyType", null);
        setField(term82277, term82277.getClass(), "_valueType", null);
        setField(term82277, term82277.getClass(), "_superClass", null);
        setField(term82277, term82277.getClass(), "_superInterfaces", null);
        setField(term82277, term82277.getClass(), "_bindings", null);
        setField(term82277, term82277.getClass(), "_canonicalName", null);
        setField(term82277, term82277.getClass(), "_class", null);
        setIntField(term82277, term82277.getClass(), "_hash", 0);
        setField(term82277, term82277.getClass(), "_valueHandler", null);
        setField(term82277, term82277.getClass(), "_typeHandler", null);
        setBooleanField(term82277, term82277.getClass(), "_asStatic", false);
        setElement(term82274, 2, term82277);
        setField(term82278, term82278.getClass(), "_referencedType", null);
        setField(term82278, term82278.getClass(), "_superClass", null);
        setField(term82278, term82278.getClass(), "_superInterfaces", null);
        setField(term82278, term82278.getClass(), "_bindings", null);
        setField(term82278, term82278.getClass(), "_canonicalName", null);
        setField(term82278, term82278.getClass(), "_class", null);
        setIntField(term82278, term82278.getClass(), "_hash", 0);
        setField(term82278, term82278.getClass(), "_valueHandler", null);
        setField(term82278, term82278.getClass(), "_typeHandler", null);
        setBooleanField(term82278, term82278.getClass(), "_asStatic", false);
        setElement(term82274, 3, term82278);
        setElement(term82274, 4, term82276);
        setField(term82272, term82272.getClass(), "_types", term82274);
        setField(term82272, term82272.getClass(), "_unboundVariables", null);
        setIntField(term82272, term82272.getClass(), "_hashCode", 1);
        term82279 = (Object[]) newArray("java.lang.String", 5);
        term82280 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 5);
        Object term82281 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term82282 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term82283 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term82284 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term82281, term82281.getClass(), "_referencedType", null);
        setField(term82281, term82281.getClass(), "_superClass", null);
        setField(term82281, term82281.getClass(), "_superInterfaces", null);
        setField(term82281, term82281.getClass(), "_bindings", null);
        setField(term82281, term82281.getClass(), "_canonicalName", null);
        setField(term82281, term82281.getClass(), "_class", null);
        setIntField(term82281, term82281.getClass(), "_hash", 0);
        setField(term82281, term82281.getClass(), "_valueHandler", null);
        setField(term82281, term82281.getClass(), "_typeHandler", null);
        setBooleanField(term82281, term82281.getClass(), "_asStatic", false);
        setElement(term82280, 0, term82281);
        setField(term82282, term82282.getClass(), "_referencedType", null);
        setField(term82282, term82282.getClass(), "_superClass", null);
        setField(term82282, term82282.getClass(), "_superInterfaces", null);
        setField(term82282, term82282.getClass(), "_bindings", null);
        setField(term82282, term82282.getClass(), "_canonicalName", null);
        setField(term82282, term82282.getClass(), "_class", null);
        setIntField(term82282, term82282.getClass(), "_hash", 0);
        setField(term82282, term82282.getClass(), "_valueHandler", null);
        setField(term82282, term82282.getClass(), "_typeHandler", null);
        setBooleanField(term82282, term82282.getClass(), "_asStatic", false);
        setElement(term82280, 1, term82282);
        setField(term82283, term82283.getClass(), "_keyType", null);
        setField(term82283, term82283.getClass(), "_valueType", null);
        setField(term82283, term82283.getClass(), "_superClass", null);
        setField(term82283, term82283.getClass(), "_superInterfaces", null);
        setField(term82283, term82283.getClass(), "_bindings", null);
        setField(term82283, term82283.getClass(), "_canonicalName", null);
        setField(term82283, term82283.getClass(), "_class", null);
        setIntField(term82283, term82283.getClass(), "_hash", 0);
        setField(term82283, term82283.getClass(), "_valueHandler", null);
        setField(term82283, term82283.getClass(), "_typeHandler", null);
        setBooleanField(term82283, term82283.getClass(), "_asStatic", false);
        setElement(term82280, 2, term82283);
        setField(term82284, term82284.getClass(), "_referencedType", null);
        setField(term82284, term82284.getClass(), "_superClass", null);
        setField(term82284, term82284.getClass(), "_superInterfaces", null);
        setField(term82284, term82284.getClass(), "_bindings", null);
        setField(term82284, term82284.getClass(), "_canonicalName", null);
        setField(term82284, term82284.getClass(), "_class", null);
        setIntField(term82284, term82284.getClass(), "_hash", 0);
        setField(term82284, term82284.getClass(), "_valueHandler", null);
        setField(term82284, term82284.getClass(), "_typeHandler", null);
        setBooleanField(term82284, term82284.getClass(), "_asStatic", false);
        setElement(term82280, 3, term82284);
        setElement(term82280, 4, term82282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term81264;
        args[1] = term81265;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term82272));
        assertTrue(recursiveEquals(term81264, term82279));
        assertTrue(recursiveEquals(term81265, term82280));
    }

};


