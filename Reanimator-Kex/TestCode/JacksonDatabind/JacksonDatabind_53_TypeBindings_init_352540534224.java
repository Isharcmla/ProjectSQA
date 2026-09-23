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

public class TypeBindings_init_352540534224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73120;
     Object term73121;
     Object term74246;
     Object term74252;
     Object term74253;

    public TypeBindings_init_352540534224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term73275 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term73125 = (Object[]) newArray("java.lang.String", 0);
        Object[] term73126 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term73275, term73275.getClass(), "_names", term73125);
        setField(term73275, term73275.getClass(), "_types", term73126);
        term73120 = (Object[]) newArray("java.lang.String", 3);
        term73121 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term73395 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term73499 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term73619 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term73395, term73395.getClass(), "_hash", 0);
        setElement(term73121, 0, term73395);
        setIntField(term73499, term73499.getClass(), "_hash", 0);
        setElement(term73121, 1, term73499);
        setElement(term73121, 2, term73619);
        term74246 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term74247 = (Object[]) newArray("java.lang.String", 3);
        Object[] term74248 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term74249 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term74250 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term74251 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term74246, term74246.getClass(), "_names", term74247);
        setField(term74249, term74249.getClass(), "_referencedType", null);
        setField(term74249, term74249.getClass(), "_superClass", null);
        setField(term74249, term74249.getClass(), "_superInterfaces", null);
        setField(term74249, term74249.getClass(), "_bindings", null);
        setField(term74249, term74249.getClass(), "_canonicalName", null);
        setField(term74249, term74249.getClass(), "_class", null);
        setIntField(term74249, term74249.getClass(), "_hash", 0);
        setField(term74249, term74249.getClass(), "_valueHandler", null);
        setField(term74249, term74249.getClass(), "_typeHandler", null);
        setBooleanField(term74249, term74249.getClass(), "_asStatic", false);
        setElement(term74248, 0, term74249);
        setField(term74250, term74250.getClass(), "_referencedType", null);
        setField(term74250, term74250.getClass(), "_superClass", null);
        setField(term74250, term74250.getClass(), "_superInterfaces", null);
        setField(term74250, term74250.getClass(), "_bindings", null);
        setField(term74250, term74250.getClass(), "_canonicalName", null);
        setField(term74250, term74250.getClass(), "_class", null);
        setIntField(term74250, term74250.getClass(), "_hash", 0);
        setField(term74250, term74250.getClass(), "_valueHandler", null);
        setField(term74250, term74250.getClass(), "_typeHandler", null);
        setBooleanField(term74250, term74250.getClass(), "_asStatic", false);
        setElement(term74248, 1, term74250);
        setField(term74251, term74251.getClass(), "_referencedType", null);
        setField(term74251, term74251.getClass(), "_superClass", null);
        setField(term74251, term74251.getClass(), "_superInterfaces", null);
        setField(term74251, term74251.getClass(), "_bindings", null);
        setField(term74251, term74251.getClass(), "_canonicalName", null);
        setField(term74251, term74251.getClass(), "_class", null);
        setIntField(term74251, term74251.getClass(), "_hash", 0);
        setField(term74251, term74251.getClass(), "_valueHandler", null);
        setField(term74251, term74251.getClass(), "_typeHandler", null);
        setBooleanField(term74251, term74251.getClass(), "_asStatic", false);
        setElement(term74248, 2, term74251);
        setField(term74246, term74246.getClass(), "_types", term74248);
        setField(term74246, term74246.getClass(), "_unboundVariables", null);
        setIntField(term74246, term74246.getClass(), "_hashCode", 1);
        term74252 = (Object[]) newArray("java.lang.String", 3);
        term74253 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term74254 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term74255 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term74256 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term74254, term74254.getClass(), "_referencedType", null);
        setField(term74254, term74254.getClass(), "_superClass", null);
        setField(term74254, term74254.getClass(), "_superInterfaces", null);
        setField(term74254, term74254.getClass(), "_bindings", null);
        setField(term74254, term74254.getClass(), "_canonicalName", null);
        setField(term74254, term74254.getClass(), "_class", null);
        setIntField(term74254, term74254.getClass(), "_hash", 0);
        setField(term74254, term74254.getClass(), "_valueHandler", null);
        setField(term74254, term74254.getClass(), "_typeHandler", null);
        setBooleanField(term74254, term74254.getClass(), "_asStatic", false);
        setElement(term74253, 0, term74254);
        setField(term74255, term74255.getClass(), "_referencedType", null);
        setField(term74255, term74255.getClass(), "_superClass", null);
        setField(term74255, term74255.getClass(), "_superInterfaces", null);
        setField(term74255, term74255.getClass(), "_bindings", null);
        setField(term74255, term74255.getClass(), "_canonicalName", null);
        setField(term74255, term74255.getClass(), "_class", null);
        setIntField(term74255, term74255.getClass(), "_hash", 0);
        setField(term74255, term74255.getClass(), "_valueHandler", null);
        setField(term74255, term74255.getClass(), "_typeHandler", null);
        setBooleanField(term74255, term74255.getClass(), "_asStatic", false);
        setElement(term74253, 1, term74255);
        setField(term74256, term74256.getClass(), "_referencedType", null);
        setField(term74256, term74256.getClass(), "_superClass", null);
        setField(term74256, term74256.getClass(), "_superInterfaces", null);
        setField(term74256, term74256.getClass(), "_bindings", null);
        setField(term74256, term74256.getClass(), "_canonicalName", null);
        setField(term74256, term74256.getClass(), "_class", null);
        setIntField(term74256, term74256.getClass(), "_hash", 0);
        setField(term74256, term74256.getClass(), "_valueHandler", null);
        setField(term74256, term74256.getClass(), "_typeHandler", null);
        setBooleanField(term74256, term74256.getClass(), "_asStatic", false);
        setElement(term74253, 2, term74256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term73120;
        args[1] = term73121;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term74246));
        assertTrue(recursiveEquals(term73120, term74252));
        assertTrue(recursiveEquals(term73121, term74253));
    }

};


