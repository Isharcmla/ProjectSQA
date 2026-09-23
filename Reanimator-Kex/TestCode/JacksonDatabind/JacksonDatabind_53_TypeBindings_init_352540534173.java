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

public class TypeBindings_init_352540534173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58156;
     Object term58157;
     Object term58520;
     Object term58525;
     Object term58526;

    public TypeBindings_init_352540534173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term58299 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term58160 = (Object[]) newArray("java.lang.String", 0);
        Object[] term58161 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term58299, term58299.getClass(), "_names", term58160);
        setField(term58299, term58299.getClass(), "_types", term58161);
        term58156 = (Object[]) newArray("java.lang.String", 2);
        term58157 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term58397 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term58493 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term58397, term58397.getClass(), "_hash", 0);
        setElement(term58157, 0, term58397);
        setElement(term58157, 1, term58493);
        term58520 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term58521 = (Object[]) newArray("java.lang.String", 2);
        Object[] term58522 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term58523 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term58524 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term58520, term58520.getClass(), "_names", term58521);
        setField(term58523, term58523.getClass(), "_superClass", null);
        setField(term58523, term58523.getClass(), "_superInterfaces", null);
        setField(term58523, term58523.getClass(), "_bindings", null);
        setField(term58523, term58523.getClass(), "_canonicalName", null);
        setField(term58523, term58523.getClass(), "_class", null);
        setIntField(term58523, term58523.getClass(), "_hash", 0);
        setField(term58523, term58523.getClass(), "_valueHandler", null);
        setField(term58523, term58523.getClass(), "_typeHandler", null);
        setBooleanField(term58523, term58523.getClass(), "_asStatic", false);
        setElement(term58522, 0, term58523);
        setField(term58524, term58524.getClass(), "_componentType", null);
        setField(term58524, term58524.getClass(), "_emptyArray", null);
        setField(term58524, term58524.getClass(), "_superClass", null);
        setField(term58524, term58524.getClass(), "_superInterfaces", null);
        setField(term58524, term58524.getClass(), "_bindings", null);
        setField(term58524, term58524.getClass(), "_canonicalName", null);
        setField(term58524, term58524.getClass(), "_class", null);
        setIntField(term58524, term58524.getClass(), "_hash", 0);
        setField(term58524, term58524.getClass(), "_valueHandler", null);
        setField(term58524, term58524.getClass(), "_typeHandler", null);
        setBooleanField(term58524, term58524.getClass(), "_asStatic", false);
        setElement(term58522, 1, term58524);
        setField(term58520, term58520.getClass(), "_types", term58522);
        setField(term58520, term58520.getClass(), "_unboundVariables", null);
        setIntField(term58520, term58520.getClass(), "_hashCode", 1);
        term58525 = (Object[]) newArray("java.lang.String", 2);
        term58526 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term58527 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term58528 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term58527, term58527.getClass(), "_superClass", null);
        setField(term58527, term58527.getClass(), "_superInterfaces", null);
        setField(term58527, term58527.getClass(), "_bindings", null);
        setField(term58527, term58527.getClass(), "_canonicalName", null);
        setField(term58527, term58527.getClass(), "_class", null);
        setIntField(term58527, term58527.getClass(), "_hash", 0);
        setField(term58527, term58527.getClass(), "_valueHandler", null);
        setField(term58527, term58527.getClass(), "_typeHandler", null);
        setBooleanField(term58527, term58527.getClass(), "_asStatic", false);
        setElement(term58526, 0, term58527);
        setField(term58528, term58528.getClass(), "_componentType", null);
        setField(term58528, term58528.getClass(), "_emptyArray", null);
        setField(term58528, term58528.getClass(), "_superClass", null);
        setField(term58528, term58528.getClass(), "_superInterfaces", null);
        setField(term58528, term58528.getClass(), "_bindings", null);
        setField(term58528, term58528.getClass(), "_canonicalName", null);
        setField(term58528, term58528.getClass(), "_class", null);
        setIntField(term58528, term58528.getClass(), "_hash", 0);
        setField(term58528, term58528.getClass(), "_valueHandler", null);
        setField(term58528, term58528.getClass(), "_typeHandler", null);
        setBooleanField(term58528, term58528.getClass(), "_asStatic", false);
        setElement(term58526, 1, term58528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term58156;
        args[1] = term58157;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term58520));
        assertTrue(recursiveEquals(term58156, term58525));
        assertTrue(recursiveEquals(term58157, term58526));
    }

};


