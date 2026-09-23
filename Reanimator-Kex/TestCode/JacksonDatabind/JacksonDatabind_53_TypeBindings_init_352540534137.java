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

public class TypeBindings_init_352540534137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45052;
     Object term45053;
     Object term45305;
     Object term45309;
     Object term45310;

    public TypeBindings_init_352540534137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45186 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term45186, term45186.getClass(), "_names", null);
        setField(term45186, term45186.getClass(), "_types", null);
        term45052 = (Object[]) newArray("java.lang.String", 1);
        term45053 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term45286 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setElement(term45053, 0, term45286);
        term45305 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term45306 = (Object[]) newArray("java.lang.String", 1);
        Object[] term45307 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term45308 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term45305, term45305.getClass(), "_names", term45306);
        setField(term45308, term45308.getClass(), "_keyType", null);
        setField(term45308, term45308.getClass(), "_valueType", null);
        setField(term45308, term45308.getClass(), "_superClass", null);
        setField(term45308, term45308.getClass(), "_superInterfaces", null);
        setField(term45308, term45308.getClass(), "_bindings", null);
        setField(term45308, term45308.getClass(), "_canonicalName", null);
        setField(term45308, term45308.getClass(), "_class", null);
        setIntField(term45308, term45308.getClass(), "_hash", 0);
        setField(term45308, term45308.getClass(), "_valueHandler", null);
        setField(term45308, term45308.getClass(), "_typeHandler", null);
        setBooleanField(term45308, term45308.getClass(), "_asStatic", false);
        setElement(term45307, 0, term45308);
        setField(term45305, term45305.getClass(), "_types", term45307);
        setField(term45305, term45305.getClass(), "_unboundVariables", null);
        setIntField(term45305, term45305.getClass(), "_hashCode", 1);
        term45309 = (Object[]) newArray("java.lang.String", 1);
        term45310 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term45311 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term45311, term45311.getClass(), "_keyType", null);
        setField(term45311, term45311.getClass(), "_valueType", null);
        setField(term45311, term45311.getClass(), "_superClass", null);
        setField(term45311, term45311.getClass(), "_superInterfaces", null);
        setField(term45311, term45311.getClass(), "_bindings", null);
        setField(term45311, term45311.getClass(), "_canonicalName", null);
        setField(term45311, term45311.getClass(), "_class", null);
        setIntField(term45311, term45311.getClass(), "_hash", 0);
        setField(term45311, term45311.getClass(), "_valueHandler", null);
        setField(term45311, term45311.getClass(), "_typeHandler", null);
        setBooleanField(term45311, term45311.getClass(), "_asStatic", false);
        setElement(term45310, 0, term45311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term45052;
        args[1] = term45053;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45305));
        assertTrue(recursiveEquals(term45052, term45309));
        assertTrue(recursiveEquals(term45053, term45310));
    }

};


