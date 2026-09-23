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

public class TypeBindings_init_352540534205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68005;
     Object term68006;
     Object term68759;
     Object term68764;
     Object term68765;

    public TypeBindings_init_352540534205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term68149 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term68009 = (Object[]) newArray("java.lang.String", 0);
        setField(term68149, term68149.getClass(), "_names", term68009);
        setField(term68149, term68149.getClass(), "_types", null);
        term68005 = (Object[]) newArray("java.lang.String", 2);
        term68006 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term68253 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term68357 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term68253, term68253.getClass(), "_hash", 0);
        setElement(term68006, 0, term68253);
        setElement(term68006, 1, term68357);
        term68759 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term68760 = (Object[]) newArray("java.lang.String", 2);
        Object[] term68761 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term68762 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term68763 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term68759, term68759.getClass(), "_names", term68760);
        setField(term68762, term68762.getClass(), "_referencedType", null);
        setField(term68762, term68762.getClass(), "_superClass", null);
        setField(term68762, term68762.getClass(), "_superInterfaces", null);
        setField(term68762, term68762.getClass(), "_bindings", null);
        setField(term68762, term68762.getClass(), "_canonicalName", null);
        setField(term68762, term68762.getClass(), "_class", null);
        setIntField(term68762, term68762.getClass(), "_hash", 0);
        setField(term68762, term68762.getClass(), "_valueHandler", null);
        setField(term68762, term68762.getClass(), "_typeHandler", null);
        setBooleanField(term68762, term68762.getClass(), "_asStatic", false);
        setElement(term68761, 0, term68762);
        setField(term68763, term68763.getClass(), "_referencedType", null);
        setField(term68763, term68763.getClass(), "_superClass", null);
        setField(term68763, term68763.getClass(), "_superInterfaces", null);
        setField(term68763, term68763.getClass(), "_bindings", null);
        setField(term68763, term68763.getClass(), "_canonicalName", null);
        setField(term68763, term68763.getClass(), "_class", null);
        setIntField(term68763, term68763.getClass(), "_hash", 0);
        setField(term68763, term68763.getClass(), "_valueHandler", null);
        setField(term68763, term68763.getClass(), "_typeHandler", null);
        setBooleanField(term68763, term68763.getClass(), "_asStatic", false);
        setElement(term68761, 1, term68763);
        setField(term68759, term68759.getClass(), "_types", term68761);
        setField(term68759, term68759.getClass(), "_unboundVariables", null);
        setIntField(term68759, term68759.getClass(), "_hashCode", 1);
        term68764 = (Object[]) newArray("java.lang.String", 2);
        term68765 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term68766 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term68767 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term68766, term68766.getClass(), "_referencedType", null);
        setField(term68766, term68766.getClass(), "_superClass", null);
        setField(term68766, term68766.getClass(), "_superInterfaces", null);
        setField(term68766, term68766.getClass(), "_bindings", null);
        setField(term68766, term68766.getClass(), "_canonicalName", null);
        setField(term68766, term68766.getClass(), "_class", null);
        setIntField(term68766, term68766.getClass(), "_hash", 0);
        setField(term68766, term68766.getClass(), "_valueHandler", null);
        setField(term68766, term68766.getClass(), "_typeHandler", null);
        setBooleanField(term68766, term68766.getClass(), "_asStatic", false);
        setElement(term68765, 0, term68766);
        setField(term68767, term68767.getClass(), "_referencedType", null);
        setField(term68767, term68767.getClass(), "_superClass", null);
        setField(term68767, term68767.getClass(), "_superInterfaces", null);
        setField(term68767, term68767.getClass(), "_bindings", null);
        setField(term68767, term68767.getClass(), "_canonicalName", null);
        setField(term68767, term68767.getClass(), "_class", null);
        setIntField(term68767, term68767.getClass(), "_hash", 0);
        setField(term68767, term68767.getClass(), "_valueHandler", null);
        setField(term68767, term68767.getClass(), "_typeHandler", null);
        setBooleanField(term68767, term68767.getClass(), "_asStatic", false);
        setElement(term68765, 1, term68767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term68005;
        args[1] = term68006;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term68759));
        assertTrue(recursiveEquals(term68005, term68764));
        assertTrue(recursiveEquals(term68006, term68765));
    }

};


