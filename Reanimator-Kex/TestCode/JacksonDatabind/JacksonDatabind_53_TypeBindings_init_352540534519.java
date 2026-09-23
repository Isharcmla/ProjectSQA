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

public class TypeBindings_init_352540534519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208041;
     Object term208042;
     Object term208664;
     Object term208671;
     Object term208672;

    public TypeBindings_init_352540534519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term208207 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term208047 = (Object[]) newArray("java.lang.String", 0);
        Object[] term208048 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term208207, term208207.getClass(), "_names", term208047);
        setField(term208207, term208207.getClass(), "_types", term208048);
        term208041 = (Object[]) newArray("java.lang.String", 4);
        term208042 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term208313 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term208409 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term208515 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term208621 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term208313, term208313.getClass(), "_hash", 0);
        setElement(term208042, 0, term208313);
        setIntField(term208409, term208409.getClass(), "_hash", 0);
        setElement(term208042, 1, term208409);
        setIntField(term208515, term208515.getClass(), "_hash", 0);
        setElement(term208042, 2, term208515);
        setElement(term208042, 3, term208621);
        term208664 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term208665 = (Object[]) newArray("java.lang.String", 4);
        Object[] term208666 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term208667 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term208668 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term208669 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term208670 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term208664, term208664.getClass(), "_names", term208665);
        setField(term208667, term208667.getClass(), "_elementType", null);
        setField(term208667, term208667.getClass(), "_superClass", null);
        setField(term208667, term208667.getClass(), "_superInterfaces", null);
        setField(term208667, term208667.getClass(), "_bindings", null);
        setField(term208667, term208667.getClass(), "_canonicalName", null);
        setField(term208667, term208667.getClass(), "_class", null);
        setIntField(term208667, term208667.getClass(), "_hash", 0);
        setField(term208667, term208667.getClass(), "_valueHandler", null);
        setField(term208667, term208667.getClass(), "_typeHandler", null);
        setBooleanField(term208667, term208667.getClass(), "_asStatic", false);
        setElement(term208666, 0, term208667);
        setField(term208668, term208668.getClass(), "_componentType", null);
        setField(term208668, term208668.getClass(), "_emptyArray", null);
        setField(term208668, term208668.getClass(), "_superClass", null);
        setField(term208668, term208668.getClass(), "_superInterfaces", null);
        setField(term208668, term208668.getClass(), "_bindings", null);
        setField(term208668, term208668.getClass(), "_canonicalName", null);
        setField(term208668, term208668.getClass(), "_class", null);
        setIntField(term208668, term208668.getClass(), "_hash", 0);
        setField(term208668, term208668.getClass(), "_valueHandler", null);
        setField(term208668, term208668.getClass(), "_typeHandler", null);
        setBooleanField(term208668, term208668.getClass(), "_asStatic", false);
        setElement(term208666, 1, term208668);
        setField(term208669, term208669.getClass(), "_elementType", null);
        setField(term208669, term208669.getClass(), "_superClass", null);
        setField(term208669, term208669.getClass(), "_superInterfaces", null);
        setField(term208669, term208669.getClass(), "_bindings", null);
        setField(term208669, term208669.getClass(), "_canonicalName", null);
        setField(term208669, term208669.getClass(), "_class", null);
        setIntField(term208669, term208669.getClass(), "_hash", 0);
        setField(term208669, term208669.getClass(), "_valueHandler", null);
        setField(term208669, term208669.getClass(), "_typeHandler", null);
        setBooleanField(term208669, term208669.getClass(), "_asStatic", false);
        setElement(term208666, 2, term208669);
        setField(term208670, term208670.getClass(), "_elementType", null);
        setField(term208670, term208670.getClass(), "_superClass", null);
        setField(term208670, term208670.getClass(), "_superInterfaces", null);
        setField(term208670, term208670.getClass(), "_bindings", null);
        setField(term208670, term208670.getClass(), "_canonicalName", null);
        setField(term208670, term208670.getClass(), "_class", null);
        setIntField(term208670, term208670.getClass(), "_hash", 0);
        setField(term208670, term208670.getClass(), "_valueHandler", null);
        setField(term208670, term208670.getClass(), "_typeHandler", null);
        setBooleanField(term208670, term208670.getClass(), "_asStatic", false);
        setElement(term208666, 3, term208670);
        setField(term208664, term208664.getClass(), "_types", term208666);
        setField(term208664, term208664.getClass(), "_unboundVariables", null);
        setIntField(term208664, term208664.getClass(), "_hashCode", 1);
        term208671 = (Object[]) newArray("java.lang.String", 4);
        term208672 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term208673 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term208674 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term208675 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term208676 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term208673, term208673.getClass(), "_elementType", null);
        setField(term208673, term208673.getClass(), "_superClass", null);
        setField(term208673, term208673.getClass(), "_superInterfaces", null);
        setField(term208673, term208673.getClass(), "_bindings", null);
        setField(term208673, term208673.getClass(), "_canonicalName", null);
        setField(term208673, term208673.getClass(), "_class", null);
        setIntField(term208673, term208673.getClass(), "_hash", 0);
        setField(term208673, term208673.getClass(), "_valueHandler", null);
        setField(term208673, term208673.getClass(), "_typeHandler", null);
        setBooleanField(term208673, term208673.getClass(), "_asStatic", false);
        setElement(term208672, 0, term208673);
        setField(term208674, term208674.getClass(), "_componentType", null);
        setField(term208674, term208674.getClass(), "_emptyArray", null);
        setField(term208674, term208674.getClass(), "_superClass", null);
        setField(term208674, term208674.getClass(), "_superInterfaces", null);
        setField(term208674, term208674.getClass(), "_bindings", null);
        setField(term208674, term208674.getClass(), "_canonicalName", null);
        setField(term208674, term208674.getClass(), "_class", null);
        setIntField(term208674, term208674.getClass(), "_hash", 0);
        setField(term208674, term208674.getClass(), "_valueHandler", null);
        setField(term208674, term208674.getClass(), "_typeHandler", null);
        setBooleanField(term208674, term208674.getClass(), "_asStatic", false);
        setElement(term208672, 1, term208674);
        setField(term208675, term208675.getClass(), "_elementType", null);
        setField(term208675, term208675.getClass(), "_superClass", null);
        setField(term208675, term208675.getClass(), "_superInterfaces", null);
        setField(term208675, term208675.getClass(), "_bindings", null);
        setField(term208675, term208675.getClass(), "_canonicalName", null);
        setField(term208675, term208675.getClass(), "_class", null);
        setIntField(term208675, term208675.getClass(), "_hash", 0);
        setField(term208675, term208675.getClass(), "_valueHandler", null);
        setField(term208675, term208675.getClass(), "_typeHandler", null);
        setBooleanField(term208675, term208675.getClass(), "_asStatic", false);
        setElement(term208672, 2, term208675);
        setField(term208676, term208676.getClass(), "_elementType", null);
        setField(term208676, term208676.getClass(), "_superClass", null);
        setField(term208676, term208676.getClass(), "_superInterfaces", null);
        setField(term208676, term208676.getClass(), "_bindings", null);
        setField(term208676, term208676.getClass(), "_canonicalName", null);
        setField(term208676, term208676.getClass(), "_class", null);
        setIntField(term208676, term208676.getClass(), "_hash", 0);
        setField(term208676, term208676.getClass(), "_valueHandler", null);
        setField(term208676, term208676.getClass(), "_typeHandler", null);
        setBooleanField(term208676, term208676.getClass(), "_asStatic", false);
        setElement(term208672, 3, term208676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term208041;
        args[1] = term208042;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term208664));
        assertTrue(recursiveEquals(term208041, term208671));
        assertTrue(recursiveEquals(term208042, term208672));
    }

};


