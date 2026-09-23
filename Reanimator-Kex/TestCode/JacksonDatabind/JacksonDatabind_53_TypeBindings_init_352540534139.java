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

public class TypeBindings_init_352540534139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45387;
     Object term45388;
     Object term45662;
     Object term45666;
     Object term45667;

    public TypeBindings_init_352540534139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45523 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term45390 = (Object[]) newArray("java.lang.String", 0);
        Object[] term45391 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term45523, term45523.getClass(), "_names", term45390);
        setField(term45523, term45523.getClass(), "_types", term45391);
        term45387 = (Object[]) newArray("java.lang.String", 1);
        term45388 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term45643 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setElement(term45388, 0, term45643);
        term45662 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term45663 = (Object[]) newArray("java.lang.String", 1);
        Object[] term45664 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term45665 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term45662, term45662.getClass(), "_names", term45663);
        setField(term45665, term45665.getClass(), "_referencedType", null);
        setField(term45665, term45665.getClass(), "_superClass", null);
        setField(term45665, term45665.getClass(), "_superInterfaces", null);
        setField(term45665, term45665.getClass(), "_bindings", null);
        setField(term45665, term45665.getClass(), "_canonicalName", null);
        setField(term45665, term45665.getClass(), "_class", null);
        setIntField(term45665, term45665.getClass(), "_hash", 0);
        setField(term45665, term45665.getClass(), "_valueHandler", null);
        setField(term45665, term45665.getClass(), "_typeHandler", null);
        setBooleanField(term45665, term45665.getClass(), "_asStatic", false);
        setElement(term45664, 0, term45665);
        setField(term45662, term45662.getClass(), "_types", term45664);
        setField(term45662, term45662.getClass(), "_unboundVariables", null);
        setIntField(term45662, term45662.getClass(), "_hashCode", 1);
        term45666 = (Object[]) newArray("java.lang.String", 1);
        term45667 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term45668 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term45668, term45668.getClass(), "_referencedType", null);
        setField(term45668, term45668.getClass(), "_superClass", null);
        setField(term45668, term45668.getClass(), "_superInterfaces", null);
        setField(term45668, term45668.getClass(), "_bindings", null);
        setField(term45668, term45668.getClass(), "_canonicalName", null);
        setField(term45668, term45668.getClass(), "_class", null);
        setIntField(term45668, term45668.getClass(), "_hash", 0);
        setField(term45668, term45668.getClass(), "_valueHandler", null);
        setField(term45668, term45668.getClass(), "_typeHandler", null);
        setBooleanField(term45668, term45668.getClass(), "_asStatic", false);
        setElement(term45667, 0, term45668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term45387;
        args[1] = term45388;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45662));
        assertTrue(recursiveEquals(term45387, term45666));
        assertTrue(recursiveEquals(term45388, term45667));
    }

};


