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

public class TypeBindings_init_352540534521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208678;
     Object term208679;
     Object term209161;
     Object term209167;
     Object term209168;

    public TypeBindings_init_352540534521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term208834 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term208683 = (Object[]) newArray("java.lang.String", 0);
        setField(term208834, term208834.getClass(), "_names", term208683);
        setField(term208834, term208834.getClass(), "_types", null);
        term208678 = (Object[]) newArray("java.lang.String", 3);
        term208679 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term208938 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term209034 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term209126 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term208938, term208938.getClass(), "_hash", 0);
        setElement(term208679, 0, term208938);
        setIntField(term209034, term209034.getClass(), "_hash", 0);
        setElement(term208679, 1, term209034);
        setElement(term208679, 2, term209126);
        term209161 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term209162 = (Object[]) newArray("java.lang.String", 3);
        Object[] term209163 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term209164 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term209165 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term209166 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term209161, term209161.getClass(), "_names", term209162);
        setField(term209164, term209164.getClass(), "_referencedType", null);
        setField(term209164, term209164.getClass(), "_superClass", null);
        setField(term209164, term209164.getClass(), "_superInterfaces", null);
        setField(term209164, term209164.getClass(), "_bindings", null);
        setField(term209164, term209164.getClass(), "_canonicalName", null);
        setField(term209164, term209164.getClass(), "_class", null);
        setIntField(term209164, term209164.getClass(), "_hash", 0);
        setField(term209164, term209164.getClass(), "_valueHandler", null);
        setField(term209164, term209164.getClass(), "_typeHandler", null);
        setBooleanField(term209164, term209164.getClass(), "_asStatic", false);
        setElement(term209163, 0, term209164);
        setField(term209165, term209165.getClass(), "_componentType", null);
        setField(term209165, term209165.getClass(), "_emptyArray", null);
        setField(term209165, term209165.getClass(), "_superClass", null);
        setField(term209165, term209165.getClass(), "_superInterfaces", null);
        setField(term209165, term209165.getClass(), "_bindings", null);
        setField(term209165, term209165.getClass(), "_canonicalName", null);
        setField(term209165, term209165.getClass(), "_class", null);
        setIntField(term209165, term209165.getClass(), "_hash", 0);
        setField(term209165, term209165.getClass(), "_valueHandler", null);
        setField(term209165, term209165.getClass(), "_typeHandler", null);
        setBooleanField(term209165, term209165.getClass(), "_asStatic", false);
        setElement(term209163, 1, term209165);
        setField(term209166, term209166.getClass(), "_keyType", null);
        setField(term209166, term209166.getClass(), "_valueType", null);
        setField(term209166, term209166.getClass(), "_superClass", null);
        setField(term209166, term209166.getClass(), "_superInterfaces", null);
        setField(term209166, term209166.getClass(), "_bindings", null);
        setField(term209166, term209166.getClass(), "_canonicalName", null);
        setField(term209166, term209166.getClass(), "_class", null);
        setIntField(term209166, term209166.getClass(), "_hash", 0);
        setField(term209166, term209166.getClass(), "_valueHandler", null);
        setField(term209166, term209166.getClass(), "_typeHandler", null);
        setBooleanField(term209166, term209166.getClass(), "_asStatic", false);
        setElement(term209163, 2, term209166);
        setField(term209161, term209161.getClass(), "_types", term209163);
        setField(term209161, term209161.getClass(), "_unboundVariables", null);
        setIntField(term209161, term209161.getClass(), "_hashCode", 1);
        term209167 = (Object[]) newArray("java.lang.String", 3);
        term209168 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term209169 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term209170 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term209171 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term209169, term209169.getClass(), "_referencedType", null);
        setField(term209169, term209169.getClass(), "_superClass", null);
        setField(term209169, term209169.getClass(), "_superInterfaces", null);
        setField(term209169, term209169.getClass(), "_bindings", null);
        setField(term209169, term209169.getClass(), "_canonicalName", null);
        setField(term209169, term209169.getClass(), "_class", null);
        setIntField(term209169, term209169.getClass(), "_hash", 0);
        setField(term209169, term209169.getClass(), "_valueHandler", null);
        setField(term209169, term209169.getClass(), "_typeHandler", null);
        setBooleanField(term209169, term209169.getClass(), "_asStatic", false);
        setElement(term209168, 0, term209169);
        setField(term209170, term209170.getClass(), "_componentType", null);
        setField(term209170, term209170.getClass(), "_emptyArray", null);
        setField(term209170, term209170.getClass(), "_superClass", null);
        setField(term209170, term209170.getClass(), "_superInterfaces", null);
        setField(term209170, term209170.getClass(), "_bindings", null);
        setField(term209170, term209170.getClass(), "_canonicalName", null);
        setField(term209170, term209170.getClass(), "_class", null);
        setIntField(term209170, term209170.getClass(), "_hash", 0);
        setField(term209170, term209170.getClass(), "_valueHandler", null);
        setField(term209170, term209170.getClass(), "_typeHandler", null);
        setBooleanField(term209170, term209170.getClass(), "_asStatic", false);
        setElement(term209168, 1, term209170);
        setField(term209171, term209171.getClass(), "_keyType", null);
        setField(term209171, term209171.getClass(), "_valueType", null);
        setField(term209171, term209171.getClass(), "_superClass", null);
        setField(term209171, term209171.getClass(), "_superInterfaces", null);
        setField(term209171, term209171.getClass(), "_bindings", null);
        setField(term209171, term209171.getClass(), "_canonicalName", null);
        setField(term209171, term209171.getClass(), "_class", null);
        setIntField(term209171, term209171.getClass(), "_hash", 0);
        setField(term209171, term209171.getClass(), "_valueHandler", null);
        setField(term209171, term209171.getClass(), "_typeHandler", null);
        setBooleanField(term209171, term209171.getClass(), "_asStatic", false);
        setElement(term209168, 2, term209171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term208678;
        args[1] = term208679;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term209161));
        assertTrue(recursiveEquals(term208678, term209167));
        assertTrue(recursiveEquals(term208679, term209168));
    }

};


