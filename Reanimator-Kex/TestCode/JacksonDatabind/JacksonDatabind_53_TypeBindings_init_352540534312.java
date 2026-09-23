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

public class TypeBindings_init_352540534312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104157;
     Object term104158;
     Object term105646;
     Object term105653;
     Object term105654;

    public TypeBindings_init_352540534312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term104316 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term104158 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term104840 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term104892 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term104952 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term105012 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term104316, term104316.getClass(), "_names", null);
        setIntField(term104840, term104840.getClass(), "_hash", 0);
        setElement(term104158, 0, term104840);
        setIntField(term104892, term104892.getClass(), "_hash", 0);
        setElement(term104158, 1, term104892);
        setIntField(term104952, term104952.getClass(), "_hash", 0);
        setElement(term104158, 2, term104952);
        setElement(term104158, 3, term105012);
        setField(term104316, term104316.getClass(), "_types", term104158);
        term104157 = (Object[]) newArray("java.lang.String", 4);
        term105646 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term105647 = (Object[]) newArray("java.lang.String", 4);
        Object[] term105648 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term105649 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term105650 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term105651 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term105652 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term105646, term105646.getClass(), "_names", term105647);
        setField(term105649, term105649.getClass(), "_referencedType", null);
        setField(term105649, term105649.getClass(), "_superClass", null);
        setField(term105649, term105649.getClass(), "_superInterfaces", null);
        setField(term105649, term105649.getClass(), "_bindings", null);
        setField(term105649, term105649.getClass(), "_canonicalName", null);
        setField(term105649, term105649.getClass(), "_class", null);
        setIntField(term105649, term105649.getClass(), "_hash", 0);
        setField(term105649, term105649.getClass(), "_valueHandler", null);
        setField(term105649, term105649.getClass(), "_typeHandler", null);
        setBooleanField(term105649, term105649.getClass(), "_asStatic", false);
        setElement(term105648, 0, term105649);
        setField(term105650, term105650.getClass(), "_referencedType", null);
        setField(term105650, term105650.getClass(), "_superClass", null);
        setField(term105650, term105650.getClass(), "_superInterfaces", null);
        setField(term105650, term105650.getClass(), "_bindings", null);
        setField(term105650, term105650.getClass(), "_canonicalName", null);
        setField(term105650, term105650.getClass(), "_class", null);
        setIntField(term105650, term105650.getClass(), "_hash", 0);
        setField(term105650, term105650.getClass(), "_valueHandler", null);
        setField(term105650, term105650.getClass(), "_typeHandler", null);
        setBooleanField(term105650, term105650.getClass(), "_asStatic", false);
        setElement(term105648, 1, term105650);
        setField(term105651, term105651.getClass(), "_referencedType", null);
        setField(term105651, term105651.getClass(), "_superClass", null);
        setField(term105651, term105651.getClass(), "_superInterfaces", null);
        setField(term105651, term105651.getClass(), "_bindings", null);
        setField(term105651, term105651.getClass(), "_canonicalName", null);
        setField(term105651, term105651.getClass(), "_class", null);
        setIntField(term105651, term105651.getClass(), "_hash", 0);
        setField(term105651, term105651.getClass(), "_valueHandler", null);
        setField(term105651, term105651.getClass(), "_typeHandler", null);
        setBooleanField(term105651, term105651.getClass(), "_asStatic", false);
        setElement(term105648, 2, term105651);
        setField(term105652, term105652.getClass(), "_referencedType", null);
        setField(term105652, term105652.getClass(), "_superClass", null);
        setField(term105652, term105652.getClass(), "_superInterfaces", null);
        setField(term105652, term105652.getClass(), "_bindings", null);
        setField(term105652, term105652.getClass(), "_canonicalName", null);
        setField(term105652, term105652.getClass(), "_class", null);
        setIntField(term105652, term105652.getClass(), "_hash", 0);
        setField(term105652, term105652.getClass(), "_valueHandler", null);
        setField(term105652, term105652.getClass(), "_typeHandler", null);
        setBooleanField(term105652, term105652.getClass(), "_asStatic", false);
        setElement(term105648, 3, term105652);
        setField(term105646, term105646.getClass(), "_types", term105648);
        setField(term105646, term105646.getClass(), "_unboundVariables", null);
        setIntField(term105646, term105646.getClass(), "_hashCode", 1);
        term105653 = (Object[]) newArray("java.lang.String", 4);
        term105654 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term105655 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term105656 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term105657 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term105658 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term105655, term105655.getClass(), "_referencedType", null);
        setField(term105655, term105655.getClass(), "_superClass", null);
        setField(term105655, term105655.getClass(), "_superInterfaces", null);
        setField(term105655, term105655.getClass(), "_bindings", null);
        setField(term105655, term105655.getClass(), "_canonicalName", null);
        setField(term105655, term105655.getClass(), "_class", null);
        setIntField(term105655, term105655.getClass(), "_hash", 0);
        setField(term105655, term105655.getClass(), "_valueHandler", null);
        setField(term105655, term105655.getClass(), "_typeHandler", null);
        setBooleanField(term105655, term105655.getClass(), "_asStatic", false);
        setElement(term105654, 0, term105655);
        setField(term105656, term105656.getClass(), "_referencedType", null);
        setField(term105656, term105656.getClass(), "_superClass", null);
        setField(term105656, term105656.getClass(), "_superInterfaces", null);
        setField(term105656, term105656.getClass(), "_bindings", null);
        setField(term105656, term105656.getClass(), "_canonicalName", null);
        setField(term105656, term105656.getClass(), "_class", null);
        setIntField(term105656, term105656.getClass(), "_hash", 0);
        setField(term105656, term105656.getClass(), "_valueHandler", null);
        setField(term105656, term105656.getClass(), "_typeHandler", null);
        setBooleanField(term105656, term105656.getClass(), "_asStatic", false);
        setElement(term105654, 1, term105656);
        setField(term105657, term105657.getClass(), "_referencedType", null);
        setField(term105657, term105657.getClass(), "_superClass", null);
        setField(term105657, term105657.getClass(), "_superInterfaces", null);
        setField(term105657, term105657.getClass(), "_bindings", null);
        setField(term105657, term105657.getClass(), "_canonicalName", null);
        setField(term105657, term105657.getClass(), "_class", null);
        setIntField(term105657, term105657.getClass(), "_hash", 0);
        setField(term105657, term105657.getClass(), "_valueHandler", null);
        setField(term105657, term105657.getClass(), "_typeHandler", null);
        setBooleanField(term105657, term105657.getClass(), "_asStatic", false);
        setElement(term105654, 2, term105657);
        setField(term105658, term105658.getClass(), "_referencedType", null);
        setField(term105658, term105658.getClass(), "_superClass", null);
        setField(term105658, term105658.getClass(), "_superInterfaces", null);
        setField(term105658, term105658.getClass(), "_bindings", null);
        setField(term105658, term105658.getClass(), "_canonicalName", null);
        setField(term105658, term105658.getClass(), "_class", null);
        setIntField(term105658, term105658.getClass(), "_hash", 0);
        setField(term105658, term105658.getClass(), "_valueHandler", null);
        setField(term105658, term105658.getClass(), "_typeHandler", null);
        setBooleanField(term105658, term105658.getClass(), "_asStatic", false);
        setElement(term105654, 3, term105658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term104157;
        args[1] = term104158;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term105646));
        assertTrue(recursiveEquals(term104157, term105653));
        assertTrue(recursiveEquals(term104158, term105654));
    }

};


