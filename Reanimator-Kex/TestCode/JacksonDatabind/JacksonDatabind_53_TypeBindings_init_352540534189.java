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

public class TypeBindings_init_352540534189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62488;
     Object term62489;
     Object term62882;
     Object term62887;
     Object term62888;

    public TypeBindings_init_352540534189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term62637 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term62492 = (Object[]) newArray("java.lang.String", 0);
        Object[] term62493 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term62637, term62637.getClass(), "_names", term62492);
        setField(term62637, term62637.getClass(), "_types", term62493);
        term62488 = (Object[]) newArray("java.lang.String", 2);
        term62489 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term62741 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term62855 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setIntField(term62741, term62741.getClass(), "_hash", 0);
        setElement(term62489, 0, term62741);
        setElement(term62489, 1, term62855);
        term62882 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term62883 = (Object[]) newArray("java.lang.String", 2);
        Object[] term62884 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term62885 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term62886 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term62882, term62882.getClass(), "_names", term62883);
        setField(term62885, term62885.getClass(), "_referencedType", null);
        setField(term62885, term62885.getClass(), "_superClass", null);
        setField(term62885, term62885.getClass(), "_superInterfaces", null);
        setField(term62885, term62885.getClass(), "_bindings", null);
        setField(term62885, term62885.getClass(), "_canonicalName", null);
        setField(term62885, term62885.getClass(), "_class", null);
        setIntField(term62885, term62885.getClass(), "_hash", 0);
        setField(term62885, term62885.getClass(), "_valueHandler", null);
        setField(term62885, term62885.getClass(), "_typeHandler", null);
        setBooleanField(term62885, term62885.getClass(), "_asStatic", false);
        setElement(term62884, 0, term62885);
        setField(term62886, term62886.getClass(), "_elementType", null);
        setField(term62886, term62886.getClass(), "_superClass", null);
        setField(term62886, term62886.getClass(), "_superInterfaces", null);
        setField(term62886, term62886.getClass(), "_bindings", null);
        setField(term62886, term62886.getClass(), "_canonicalName", null);
        setField(term62886, term62886.getClass(), "_class", null);
        setIntField(term62886, term62886.getClass(), "_hash", 0);
        setField(term62886, term62886.getClass(), "_valueHandler", null);
        setField(term62886, term62886.getClass(), "_typeHandler", null);
        setBooleanField(term62886, term62886.getClass(), "_asStatic", false);
        setElement(term62884, 1, term62886);
        setField(term62882, term62882.getClass(), "_types", term62884);
        setField(term62882, term62882.getClass(), "_unboundVariables", null);
        setIntField(term62882, term62882.getClass(), "_hashCode", 1);
        term62887 = (Object[]) newArray("java.lang.String", 2);
        term62888 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term62889 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term62890 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term62889, term62889.getClass(), "_referencedType", null);
        setField(term62889, term62889.getClass(), "_superClass", null);
        setField(term62889, term62889.getClass(), "_superInterfaces", null);
        setField(term62889, term62889.getClass(), "_bindings", null);
        setField(term62889, term62889.getClass(), "_canonicalName", null);
        setField(term62889, term62889.getClass(), "_class", null);
        setIntField(term62889, term62889.getClass(), "_hash", 0);
        setField(term62889, term62889.getClass(), "_valueHandler", null);
        setField(term62889, term62889.getClass(), "_typeHandler", null);
        setBooleanField(term62889, term62889.getClass(), "_asStatic", false);
        setElement(term62888, 0, term62889);
        setField(term62890, term62890.getClass(), "_elementType", null);
        setField(term62890, term62890.getClass(), "_superClass", null);
        setField(term62890, term62890.getClass(), "_superInterfaces", null);
        setField(term62890, term62890.getClass(), "_bindings", null);
        setField(term62890, term62890.getClass(), "_canonicalName", null);
        setField(term62890, term62890.getClass(), "_class", null);
        setIntField(term62890, term62890.getClass(), "_hash", 0);
        setField(term62890, term62890.getClass(), "_valueHandler", null);
        setField(term62890, term62890.getClass(), "_typeHandler", null);
        setBooleanField(term62890, term62890.getClass(), "_asStatic", false);
        setElement(term62888, 1, term62890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term62488;
        args[1] = term62489;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term62882));
        assertTrue(recursiveEquals(term62488, term62887));
        assertTrue(recursiveEquals(term62489, term62888));
    }

};


