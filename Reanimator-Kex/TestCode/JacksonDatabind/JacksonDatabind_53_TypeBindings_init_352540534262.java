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

public class TypeBindings_init_352540534262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85196;
     Object term85197;
     Object term86051;
     Object term86056;
     Object term86057;

    public TypeBindings_init_352540534262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term85342 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term85200 = (Object[]) newArray("java.lang.String", 0);
        Object[] term85201 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term85342, term85342.getClass(), "_names", term85200);
        setField(term85342, term85342.getClass(), "_types", term85201);
        term85196 = (Object[]) newArray("java.lang.String", 2);
        term85197 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term85446 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term85550 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term85446, term85446.getClass(), "_hash", 0);
        setElement(term85197, 0, term85446);
        setElement(term85197, 1, term85550);
        term86051 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term86052 = (Object[]) newArray("java.lang.String", 2);
        Object[] term86053 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term86054 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term86055 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term86051, term86051.getClass(), "_names", term86052);
        setField(term86054, term86054.getClass(), "_referencedType", null);
        setField(term86054, term86054.getClass(), "_superClass", null);
        setField(term86054, term86054.getClass(), "_superInterfaces", null);
        setField(term86054, term86054.getClass(), "_bindings", null);
        setField(term86054, term86054.getClass(), "_canonicalName", null);
        setField(term86054, term86054.getClass(), "_class", null);
        setIntField(term86054, term86054.getClass(), "_hash", 0);
        setField(term86054, term86054.getClass(), "_valueHandler", null);
        setField(term86054, term86054.getClass(), "_typeHandler", null);
        setBooleanField(term86054, term86054.getClass(), "_asStatic", false);
        setElement(term86053, 0, term86054);
        setField(term86055, term86055.getClass(), "_referencedType", null);
        setField(term86055, term86055.getClass(), "_superClass", null);
        setField(term86055, term86055.getClass(), "_superInterfaces", null);
        setField(term86055, term86055.getClass(), "_bindings", null);
        setField(term86055, term86055.getClass(), "_canonicalName", null);
        setField(term86055, term86055.getClass(), "_class", null);
        setIntField(term86055, term86055.getClass(), "_hash", 0);
        setField(term86055, term86055.getClass(), "_valueHandler", null);
        setField(term86055, term86055.getClass(), "_typeHandler", null);
        setBooleanField(term86055, term86055.getClass(), "_asStatic", false);
        setElement(term86053, 1, term86055);
        setField(term86051, term86051.getClass(), "_types", term86053);
        setField(term86051, term86051.getClass(), "_unboundVariables", null);
        setIntField(term86051, term86051.getClass(), "_hashCode", 1);
        term86056 = (Object[]) newArray("java.lang.String", 2);
        term86057 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term86058 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term86059 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term86058, term86058.getClass(), "_referencedType", null);
        setField(term86058, term86058.getClass(), "_superClass", null);
        setField(term86058, term86058.getClass(), "_superInterfaces", null);
        setField(term86058, term86058.getClass(), "_bindings", null);
        setField(term86058, term86058.getClass(), "_canonicalName", null);
        setField(term86058, term86058.getClass(), "_class", null);
        setIntField(term86058, term86058.getClass(), "_hash", 0);
        setField(term86058, term86058.getClass(), "_valueHandler", null);
        setField(term86058, term86058.getClass(), "_typeHandler", null);
        setBooleanField(term86058, term86058.getClass(), "_asStatic", false);
        setElement(term86057, 0, term86058);
        setField(term86059, term86059.getClass(), "_referencedType", null);
        setField(term86059, term86059.getClass(), "_superClass", null);
        setField(term86059, term86059.getClass(), "_superInterfaces", null);
        setField(term86059, term86059.getClass(), "_bindings", null);
        setField(term86059, term86059.getClass(), "_canonicalName", null);
        setField(term86059, term86059.getClass(), "_class", null);
        setIntField(term86059, term86059.getClass(), "_hash", 0);
        setField(term86059, term86059.getClass(), "_valueHandler", null);
        setField(term86059, term86059.getClass(), "_typeHandler", null);
        setBooleanField(term86059, term86059.getClass(), "_asStatic", false);
        setElement(term86057, 1, term86059);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term85196;
        args[1] = term85197;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term86051));
        assertTrue(recursiveEquals(term85196, term86056));
        assertTrue(recursiveEquals(term85197, term86057));
    }

};


