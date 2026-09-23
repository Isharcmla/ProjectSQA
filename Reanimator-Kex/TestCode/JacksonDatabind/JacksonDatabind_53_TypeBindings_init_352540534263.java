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

public class TypeBindings_init_352540534263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85552;
     Object term85553;
     Object term86094;
     Object term86100;
     Object term86101;

    public TypeBindings_init_352540534263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term85702 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term85557 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term85702, term85702.getClass(), "_names", null);
        setField(term85702, term85702.getClass(), "_types", term85557);
        term85552 = (Object[]) newArray("java.lang.String", 3);
        term85553 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term85806 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term85910 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term86024 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setIntField(term85806, term85806.getClass(), "_hash", 0);
        setElement(term85553, 0, term85806);
        setIntField(term85910, term85910.getClass(), "_hash", 0);
        setElement(term85553, 1, term85910);
        setElement(term85553, 2, term86024);
        term86094 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term86095 = (Object[]) newArray("java.lang.String", 3);
        Object[] term86096 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term86097 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term86098 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term86099 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term86094, term86094.getClass(), "_names", term86095);
        setField(term86097, term86097.getClass(), "_referencedType", null);
        setField(term86097, term86097.getClass(), "_superClass", null);
        setField(term86097, term86097.getClass(), "_superInterfaces", null);
        setField(term86097, term86097.getClass(), "_bindings", null);
        setField(term86097, term86097.getClass(), "_canonicalName", null);
        setField(term86097, term86097.getClass(), "_class", null);
        setIntField(term86097, term86097.getClass(), "_hash", 0);
        setField(term86097, term86097.getClass(), "_valueHandler", null);
        setField(term86097, term86097.getClass(), "_typeHandler", null);
        setBooleanField(term86097, term86097.getClass(), "_asStatic", false);
        setElement(term86096, 0, term86097);
        setField(term86098, term86098.getClass(), "_referencedType", null);
        setField(term86098, term86098.getClass(), "_superClass", null);
        setField(term86098, term86098.getClass(), "_superInterfaces", null);
        setField(term86098, term86098.getClass(), "_bindings", null);
        setField(term86098, term86098.getClass(), "_canonicalName", null);
        setField(term86098, term86098.getClass(), "_class", null);
        setIntField(term86098, term86098.getClass(), "_hash", 0);
        setField(term86098, term86098.getClass(), "_valueHandler", null);
        setField(term86098, term86098.getClass(), "_typeHandler", null);
        setBooleanField(term86098, term86098.getClass(), "_asStatic", false);
        setElement(term86096, 1, term86098);
        setField(term86099, term86099.getClass(), "_elementType", null);
        setField(term86099, term86099.getClass(), "_superClass", null);
        setField(term86099, term86099.getClass(), "_superInterfaces", null);
        setField(term86099, term86099.getClass(), "_bindings", null);
        setField(term86099, term86099.getClass(), "_canonicalName", null);
        setField(term86099, term86099.getClass(), "_class", null);
        setIntField(term86099, term86099.getClass(), "_hash", 0);
        setField(term86099, term86099.getClass(), "_valueHandler", null);
        setField(term86099, term86099.getClass(), "_typeHandler", null);
        setBooleanField(term86099, term86099.getClass(), "_asStatic", false);
        setElement(term86096, 2, term86099);
        setField(term86094, term86094.getClass(), "_types", term86096);
        setField(term86094, term86094.getClass(), "_unboundVariables", null);
        setIntField(term86094, term86094.getClass(), "_hashCode", 1);
        term86100 = (Object[]) newArray("java.lang.String", 3);
        term86101 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term86102 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term86103 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term86104 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term86102, term86102.getClass(), "_referencedType", null);
        setField(term86102, term86102.getClass(), "_superClass", null);
        setField(term86102, term86102.getClass(), "_superInterfaces", null);
        setField(term86102, term86102.getClass(), "_bindings", null);
        setField(term86102, term86102.getClass(), "_canonicalName", null);
        setField(term86102, term86102.getClass(), "_class", null);
        setIntField(term86102, term86102.getClass(), "_hash", 0);
        setField(term86102, term86102.getClass(), "_valueHandler", null);
        setField(term86102, term86102.getClass(), "_typeHandler", null);
        setBooleanField(term86102, term86102.getClass(), "_asStatic", false);
        setElement(term86101, 0, term86102);
        setField(term86103, term86103.getClass(), "_referencedType", null);
        setField(term86103, term86103.getClass(), "_superClass", null);
        setField(term86103, term86103.getClass(), "_superInterfaces", null);
        setField(term86103, term86103.getClass(), "_bindings", null);
        setField(term86103, term86103.getClass(), "_canonicalName", null);
        setField(term86103, term86103.getClass(), "_class", null);
        setIntField(term86103, term86103.getClass(), "_hash", 0);
        setField(term86103, term86103.getClass(), "_valueHandler", null);
        setField(term86103, term86103.getClass(), "_typeHandler", null);
        setBooleanField(term86103, term86103.getClass(), "_asStatic", false);
        setElement(term86101, 1, term86103);
        setField(term86104, term86104.getClass(), "_elementType", null);
        setField(term86104, term86104.getClass(), "_superClass", null);
        setField(term86104, term86104.getClass(), "_superInterfaces", null);
        setField(term86104, term86104.getClass(), "_bindings", null);
        setField(term86104, term86104.getClass(), "_canonicalName", null);
        setField(term86104, term86104.getClass(), "_class", null);
        setIntField(term86104, term86104.getClass(), "_hash", 0);
        setField(term86104, term86104.getClass(), "_valueHandler", null);
        setField(term86104, term86104.getClass(), "_typeHandler", null);
        setBooleanField(term86104, term86104.getClass(), "_asStatic", false);
        setElement(term86101, 2, term86104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term85552;
        args[1] = term85553;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term86094));
        assertTrue(recursiveEquals(term85552, term86100));
        assertTrue(recursiveEquals(term85553, term86101));
    }

};


