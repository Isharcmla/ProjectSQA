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

public class TypeBindings_init_352540534187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62094;
     Object term62095;
     Object term62478;
     Object term62483;
     Object term62484;

    public TypeBindings_init_352540534187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term62241 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term62098 = (Object[]) newArray("java.lang.String", 0);
        Object[] term62099 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term62241, term62241.getClass(), "_names", term62098);
        setField(term62241, term62241.getClass(), "_types", term62099);
        term62094 = (Object[]) newArray("java.lang.String", 2);
        term62095 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term62345 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term62451 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term62345, term62345.getClass(), "_hash", 0);
        setElement(term62095, 0, term62345);
        setElement(term62095, 1, term62451);
        term62478 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term62479 = (Object[]) newArray("java.lang.String", 2);
        Object[] term62480 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term62481 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term62482 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term62478, term62478.getClass(), "_names", term62479);
        setField(term62481, term62481.getClass(), "_referencedType", null);
        setField(term62481, term62481.getClass(), "_superClass", null);
        setField(term62481, term62481.getClass(), "_superInterfaces", null);
        setField(term62481, term62481.getClass(), "_bindings", null);
        setField(term62481, term62481.getClass(), "_canonicalName", null);
        setField(term62481, term62481.getClass(), "_class", null);
        setIntField(term62481, term62481.getClass(), "_hash", 0);
        setField(term62481, term62481.getClass(), "_valueHandler", null);
        setField(term62481, term62481.getClass(), "_typeHandler", null);
        setBooleanField(term62481, term62481.getClass(), "_asStatic", false);
        setElement(term62480, 0, term62481);
        setField(term62482, term62482.getClass(), "_elementType", null);
        setField(term62482, term62482.getClass(), "_superClass", null);
        setField(term62482, term62482.getClass(), "_superInterfaces", null);
        setField(term62482, term62482.getClass(), "_bindings", null);
        setField(term62482, term62482.getClass(), "_canonicalName", null);
        setField(term62482, term62482.getClass(), "_class", null);
        setIntField(term62482, term62482.getClass(), "_hash", 0);
        setField(term62482, term62482.getClass(), "_valueHandler", null);
        setField(term62482, term62482.getClass(), "_typeHandler", null);
        setBooleanField(term62482, term62482.getClass(), "_asStatic", false);
        setElement(term62480, 1, term62482);
        setField(term62478, term62478.getClass(), "_types", term62480);
        setField(term62478, term62478.getClass(), "_unboundVariables", null);
        setIntField(term62478, term62478.getClass(), "_hashCode", 1);
        term62483 = (Object[]) newArray("java.lang.String", 2);
        term62484 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term62485 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term62486 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term62485, term62485.getClass(), "_referencedType", null);
        setField(term62485, term62485.getClass(), "_superClass", null);
        setField(term62485, term62485.getClass(), "_superInterfaces", null);
        setField(term62485, term62485.getClass(), "_bindings", null);
        setField(term62485, term62485.getClass(), "_canonicalName", null);
        setField(term62485, term62485.getClass(), "_class", null);
        setIntField(term62485, term62485.getClass(), "_hash", 0);
        setField(term62485, term62485.getClass(), "_valueHandler", null);
        setField(term62485, term62485.getClass(), "_typeHandler", null);
        setBooleanField(term62485, term62485.getClass(), "_asStatic", false);
        setElement(term62484, 0, term62485);
        setField(term62486, term62486.getClass(), "_elementType", null);
        setField(term62486, term62486.getClass(), "_superClass", null);
        setField(term62486, term62486.getClass(), "_superInterfaces", null);
        setField(term62486, term62486.getClass(), "_bindings", null);
        setField(term62486, term62486.getClass(), "_canonicalName", null);
        setField(term62486, term62486.getClass(), "_class", null);
        setIntField(term62486, term62486.getClass(), "_hash", 0);
        setField(term62486, term62486.getClass(), "_valueHandler", null);
        setField(term62486, term62486.getClass(), "_typeHandler", null);
        setBooleanField(term62486, term62486.getClass(), "_asStatic", false);
        setElement(term62484, 1, term62486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term62094;
        args[1] = term62095;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term62478));
        assertTrue(recursiveEquals(term62094, term62483));
        assertTrue(recursiveEquals(term62095, term62484));
    }

};


