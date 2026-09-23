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

public class TypeBindings_init_352540534278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90139;
     Object term90140;
     Object term91446;
     Object term91453;
     Object term91454;

    public TypeBindings_init_352540534278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term90306 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term90306, term90306.getClass(), "_names", null);
        setField(term90306, term90306.getClass(), "_types", null);
        term90139 = (Object[]) newArray("java.lang.String", 4);
        term90140 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term90412 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term90508 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term90600 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term90698 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setIntField(term90412, term90412.getClass(), "_hash", 0);
        setElement(term90140, 0, term90412);
        setIntField(term90508, term90508.getClass(), "_hash", 0);
        setElement(term90140, 1, term90508);
        setIntField(term90600, term90600.getClass(), "_hash", 0);
        setElement(term90140, 2, term90600);
        setElement(term90140, 3, term90698);
        term91446 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term91447 = (Object[]) newArray("java.lang.String", 4);
        Object[] term91448 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term91449 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term91450 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term91451 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term91452 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term91446, term91446.getClass(), "_names", term91447);
        setField(term91449, term91449.getClass(), "_elementType", null);
        setField(term91449, term91449.getClass(), "_superClass", null);
        setField(term91449, term91449.getClass(), "_superInterfaces", null);
        setField(term91449, term91449.getClass(), "_bindings", null);
        setField(term91449, term91449.getClass(), "_canonicalName", null);
        setField(term91449, term91449.getClass(), "_class", null);
        setIntField(term91449, term91449.getClass(), "_hash", 0);
        setField(term91449, term91449.getClass(), "_valueHandler", null);
        setField(term91449, term91449.getClass(), "_typeHandler", null);
        setBooleanField(term91449, term91449.getClass(), "_asStatic", false);
        setElement(term91448, 0, term91449);
        setField(term91450, term91450.getClass(), "_componentType", null);
        setField(term91450, term91450.getClass(), "_emptyArray", null);
        setField(term91450, term91450.getClass(), "_superClass", null);
        setField(term91450, term91450.getClass(), "_superInterfaces", null);
        setField(term91450, term91450.getClass(), "_bindings", null);
        setField(term91450, term91450.getClass(), "_canonicalName", null);
        setField(term91450, term91450.getClass(), "_class", null);
        setIntField(term91450, term91450.getClass(), "_hash", 0);
        setField(term91450, term91450.getClass(), "_valueHandler", null);
        setField(term91450, term91450.getClass(), "_typeHandler", null);
        setBooleanField(term91450, term91450.getClass(), "_asStatic", false);
        setElement(term91448, 1, term91450);
        setField(term91451, term91451.getClass(), "_keyType", null);
        setField(term91451, term91451.getClass(), "_valueType", null);
        setField(term91451, term91451.getClass(), "_superClass", null);
        setField(term91451, term91451.getClass(), "_superInterfaces", null);
        setField(term91451, term91451.getClass(), "_bindings", null);
        setField(term91451, term91451.getClass(), "_canonicalName", null);
        setField(term91451, term91451.getClass(), "_class", null);
        setIntField(term91451, term91451.getClass(), "_hash", 0);
        setField(term91451, term91451.getClass(), "_valueHandler", null);
        setField(term91451, term91451.getClass(), "_typeHandler", null);
        setBooleanField(term91451, term91451.getClass(), "_asStatic", false);
        setElement(term91448, 2, term91451);
        setField(term91452, term91452.getClass(), "_superClass", null);
        setField(term91452, term91452.getClass(), "_superInterfaces", null);
        setField(term91452, term91452.getClass(), "_bindings", null);
        setField(term91452, term91452.getClass(), "_canonicalName", null);
        setField(term91452, term91452.getClass(), "_class", null);
        setIntField(term91452, term91452.getClass(), "_hash", 0);
        setField(term91452, term91452.getClass(), "_valueHandler", null);
        setField(term91452, term91452.getClass(), "_typeHandler", null);
        setBooleanField(term91452, term91452.getClass(), "_asStatic", false);
        setElement(term91448, 3, term91452);
        setField(term91446, term91446.getClass(), "_types", term91448);
        setField(term91446, term91446.getClass(), "_unboundVariables", null);
        setIntField(term91446, term91446.getClass(), "_hashCode", 1);
        term91453 = (Object[]) newArray("java.lang.String", 4);
        term91454 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term91455 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term91456 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term91457 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term91458 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term91455, term91455.getClass(), "_elementType", null);
        setField(term91455, term91455.getClass(), "_superClass", null);
        setField(term91455, term91455.getClass(), "_superInterfaces", null);
        setField(term91455, term91455.getClass(), "_bindings", null);
        setField(term91455, term91455.getClass(), "_canonicalName", null);
        setField(term91455, term91455.getClass(), "_class", null);
        setIntField(term91455, term91455.getClass(), "_hash", 0);
        setField(term91455, term91455.getClass(), "_valueHandler", null);
        setField(term91455, term91455.getClass(), "_typeHandler", null);
        setBooleanField(term91455, term91455.getClass(), "_asStatic", false);
        setElement(term91454, 0, term91455);
        setField(term91456, term91456.getClass(), "_componentType", null);
        setField(term91456, term91456.getClass(), "_emptyArray", null);
        setField(term91456, term91456.getClass(), "_superClass", null);
        setField(term91456, term91456.getClass(), "_superInterfaces", null);
        setField(term91456, term91456.getClass(), "_bindings", null);
        setField(term91456, term91456.getClass(), "_canonicalName", null);
        setField(term91456, term91456.getClass(), "_class", null);
        setIntField(term91456, term91456.getClass(), "_hash", 0);
        setField(term91456, term91456.getClass(), "_valueHandler", null);
        setField(term91456, term91456.getClass(), "_typeHandler", null);
        setBooleanField(term91456, term91456.getClass(), "_asStatic", false);
        setElement(term91454, 1, term91456);
        setField(term91457, term91457.getClass(), "_keyType", null);
        setField(term91457, term91457.getClass(), "_valueType", null);
        setField(term91457, term91457.getClass(), "_superClass", null);
        setField(term91457, term91457.getClass(), "_superInterfaces", null);
        setField(term91457, term91457.getClass(), "_bindings", null);
        setField(term91457, term91457.getClass(), "_canonicalName", null);
        setField(term91457, term91457.getClass(), "_class", null);
        setIntField(term91457, term91457.getClass(), "_hash", 0);
        setField(term91457, term91457.getClass(), "_valueHandler", null);
        setField(term91457, term91457.getClass(), "_typeHandler", null);
        setBooleanField(term91457, term91457.getClass(), "_asStatic", false);
        setElement(term91454, 2, term91457);
        setField(term91458, term91458.getClass(), "_superClass", null);
        setField(term91458, term91458.getClass(), "_superInterfaces", null);
        setField(term91458, term91458.getClass(), "_bindings", null);
        setField(term91458, term91458.getClass(), "_canonicalName", null);
        setField(term91458, term91458.getClass(), "_class", null);
        setIntField(term91458, term91458.getClass(), "_hash", 0);
        setField(term91458, term91458.getClass(), "_valueHandler", null);
        setField(term91458, term91458.getClass(), "_typeHandler", null);
        setBooleanField(term91458, term91458.getClass(), "_asStatic", false);
        setElement(term91454, 3, term91458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term90139;
        args[1] = term90140;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term91446));
        assertTrue(recursiveEquals(term90139, term91453));
        assertTrue(recursiveEquals(term90140, term91454));
    }

};


