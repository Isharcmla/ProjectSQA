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

public class TypeBindings_init_352540534141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45818;
     Object term45819;
     Object term46069;
     Object term46073;
     Object term46074;

    public TypeBindings_init_352540534141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45952 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term45952, term45952.getClass(), "_names", null);
        setField(term45952, term45952.getClass(), "_types", null);
        term45818 = (Object[]) newArray("java.lang.String", 1);
        term45819 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term46050 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setElement(term45819, 0, term46050);
        term46069 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term46070 = (Object[]) newArray("java.lang.String", 1);
        Object[] term46071 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term46072 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term46069, term46069.getClass(), "_names", term46070);
        setField(term46072, term46072.getClass(), "_superClass", null);
        setField(term46072, term46072.getClass(), "_superInterfaces", null);
        setField(term46072, term46072.getClass(), "_bindings", null);
        setField(term46072, term46072.getClass(), "_canonicalName", null);
        setField(term46072, term46072.getClass(), "_class", null);
        setIntField(term46072, term46072.getClass(), "_hash", 0);
        setField(term46072, term46072.getClass(), "_valueHandler", null);
        setField(term46072, term46072.getClass(), "_typeHandler", null);
        setBooleanField(term46072, term46072.getClass(), "_asStatic", false);
        setElement(term46071, 0, term46072);
        setField(term46069, term46069.getClass(), "_types", term46071);
        setField(term46069, term46069.getClass(), "_unboundVariables", null);
        setIntField(term46069, term46069.getClass(), "_hashCode", 1);
        term46073 = (Object[]) newArray("java.lang.String", 1);
        term46074 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term46075 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term46075, term46075.getClass(), "_superClass", null);
        setField(term46075, term46075.getClass(), "_superInterfaces", null);
        setField(term46075, term46075.getClass(), "_bindings", null);
        setField(term46075, term46075.getClass(), "_canonicalName", null);
        setField(term46075, term46075.getClass(), "_class", null);
        setIntField(term46075, term46075.getClass(), "_hash", 0);
        setField(term46075, term46075.getClass(), "_valueHandler", null);
        setField(term46075, term46075.getClass(), "_typeHandler", null);
        setBooleanField(term46075, term46075.getClass(), "_asStatic", false);
        setElement(term46074, 0, term46075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term45818;
        args[1] = term45819;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term46069));
        assertTrue(recursiveEquals(term45818, term46073));
        assertTrue(recursiveEquals(term45819, term46074));
    }

};


