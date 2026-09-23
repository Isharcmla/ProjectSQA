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

public class TypeBindings_init_352540534209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69209;
     Object term69210;
     Object term69642;
     Object term69647;
     Object term69648;

    public TypeBindings_init_352540534209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term69354 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term69213 = (Object[]) newArray("java.lang.String", 0);
        setField(term69354, term69354.getClass(), "_names", term69213);
        setField(term69354, term69354.getClass(), "_types", null);
        term69209 = (Object[]) newArray("java.lang.String", 4);
        term69210 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term69458 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term69554 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term69458, term69458.getClass(), "_hash", 0);
        setElement(term69210, 0, term69458);
        setElement(term69210, 1, term69554);
        setElement(term69210, 2, term69554);
        setElement(term69210, 3, term69554);
        term69642 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term69643 = (Object[]) newArray("java.lang.String", 4);
        Object[] term69644 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term69645 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term69646 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term69642, term69642.getClass(), "_names", term69643);
        setField(term69645, term69645.getClass(), "_referencedType", null);
        setField(term69645, term69645.getClass(), "_superClass", null);
        setField(term69645, term69645.getClass(), "_superInterfaces", null);
        setField(term69645, term69645.getClass(), "_bindings", null);
        setField(term69645, term69645.getClass(), "_canonicalName", null);
        setField(term69645, term69645.getClass(), "_class", null);
        setIntField(term69645, term69645.getClass(), "_hash", 0);
        setField(term69645, term69645.getClass(), "_valueHandler", null);
        setField(term69645, term69645.getClass(), "_typeHandler", null);
        setBooleanField(term69645, term69645.getClass(), "_asStatic", false);
        setElement(term69644, 0, term69645);
        setField(term69646, term69646.getClass(), "_componentType", null);
        setField(term69646, term69646.getClass(), "_emptyArray", null);
        setField(term69646, term69646.getClass(), "_superClass", null);
        setField(term69646, term69646.getClass(), "_superInterfaces", null);
        setField(term69646, term69646.getClass(), "_bindings", null);
        setField(term69646, term69646.getClass(), "_canonicalName", null);
        setField(term69646, term69646.getClass(), "_class", null);
        setIntField(term69646, term69646.getClass(), "_hash", 0);
        setField(term69646, term69646.getClass(), "_valueHandler", null);
        setField(term69646, term69646.getClass(), "_typeHandler", null);
        setBooleanField(term69646, term69646.getClass(), "_asStatic", false);
        setElement(term69644, 1, term69646);
        setElement(term69644, 2, term69646);
        setElement(term69644, 3, term69646);
        setField(term69642, term69642.getClass(), "_types", term69644);
        setField(term69642, term69642.getClass(), "_unboundVariables", null);
        setIntField(term69642, term69642.getClass(), "_hashCode", 1);
        term69647 = (Object[]) newArray("java.lang.String", 4);
        term69648 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term69649 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term69650 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term69649, term69649.getClass(), "_referencedType", null);
        setField(term69649, term69649.getClass(), "_superClass", null);
        setField(term69649, term69649.getClass(), "_superInterfaces", null);
        setField(term69649, term69649.getClass(), "_bindings", null);
        setField(term69649, term69649.getClass(), "_canonicalName", null);
        setField(term69649, term69649.getClass(), "_class", null);
        setIntField(term69649, term69649.getClass(), "_hash", 0);
        setField(term69649, term69649.getClass(), "_valueHandler", null);
        setField(term69649, term69649.getClass(), "_typeHandler", null);
        setBooleanField(term69649, term69649.getClass(), "_asStatic", false);
        setElement(term69648, 0, term69649);
        setField(term69650, term69650.getClass(), "_componentType", null);
        setField(term69650, term69650.getClass(), "_emptyArray", null);
        setField(term69650, term69650.getClass(), "_superClass", null);
        setField(term69650, term69650.getClass(), "_superInterfaces", null);
        setField(term69650, term69650.getClass(), "_bindings", null);
        setField(term69650, term69650.getClass(), "_canonicalName", null);
        setField(term69650, term69650.getClass(), "_class", null);
        setIntField(term69650, term69650.getClass(), "_hash", 0);
        setField(term69650, term69650.getClass(), "_valueHandler", null);
        setField(term69650, term69650.getClass(), "_typeHandler", null);
        setBooleanField(term69650, term69650.getClass(), "_asStatic", false);
        setElement(term69648, 1, term69650);
        setElement(term69648, 2, term69650);
        setElement(term69648, 3, term69650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term69209;
        args[1] = term69210;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term69642));
        assertTrue(recursiveEquals(term69209, term69647));
        assertTrue(recursiveEquals(term69210, term69648));
    }

};


