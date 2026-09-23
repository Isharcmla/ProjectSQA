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

public class TypeBindings_init_352540534238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77106;
     Object term77109;
     Object term78047;
     Object term78056;
     Object term78061;

    public TypeBindings_init_352540534238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term77258 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term77112 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term77258, term77258.getClass(), "_names", null);
        setField(term77258, term77258.getClass(), "_types", term77112);
        term77106 = (Object[]) newArray("java.lang.String", 2);
        setElement(term77106, 0, "");
        setElement(term77106, 1, "");
        term77109 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term77438 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term77534 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term77438, term77438.getClass(), "_hash", 0);
        setElement(term77109, 0, term77438);
        setIntField(term77534, term77534.getClass(), "_hash", 0);
        setElement(term77109, 1, term77534);
        term78047 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term78048 = (Object[]) newArray("java.lang.String", 2);
        Object[] term78053 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term78054 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term78055 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setElement(term78048, 0, "");
        setElement(term78048, 1, "");
        setField(term78047, term78047.getClass(), "_names", term78048);
        setField(term78054, term78054.getClass(), "_referencedType", null);
        setField(term78054, term78054.getClass(), "_superClass", null);
        setField(term78054, term78054.getClass(), "_superInterfaces", null);
        setField(term78054, term78054.getClass(), "_bindings", null);
        setField(term78054, term78054.getClass(), "_canonicalName", null);
        setField(term78054, term78054.getClass(), "_class", null);
        setIntField(term78054, term78054.getClass(), "_hash", 0);
        setField(term78054, term78054.getClass(), "_valueHandler", null);
        setField(term78054, term78054.getClass(), "_typeHandler", null);
        setBooleanField(term78054, term78054.getClass(), "_asStatic", false);
        setElement(term78053, 0, term78054);
        setField(term78055, term78055.getClass(), "_componentType", null);
        setField(term78055, term78055.getClass(), "_emptyArray", null);
        setField(term78055, term78055.getClass(), "_superClass", null);
        setField(term78055, term78055.getClass(), "_superInterfaces", null);
        setField(term78055, term78055.getClass(), "_bindings", null);
        setField(term78055, term78055.getClass(), "_canonicalName", null);
        setField(term78055, term78055.getClass(), "_class", null);
        setIntField(term78055, term78055.getClass(), "_hash", 0);
        setField(term78055, term78055.getClass(), "_valueHandler", null);
        setField(term78055, term78055.getClass(), "_typeHandler", null);
        setBooleanField(term78055, term78055.getClass(), "_asStatic", false);
        setElement(term78053, 1, term78055);
        setField(term78047, term78047.getClass(), "_types", term78053);
        setField(term78047, term78047.getClass(), "_unboundVariables", null);
        setIntField(term78047, term78047.getClass(), "_hashCode", 1);
        term78056 = (Object[]) newArray("java.lang.String", 2);
        setElement(term78056, 0, "");
        setElement(term78056, 1, "");
        term78061 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term78062 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term78063 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term78062, term78062.getClass(), "_referencedType", null);
        setField(term78062, term78062.getClass(), "_superClass", null);
        setField(term78062, term78062.getClass(), "_superInterfaces", null);
        setField(term78062, term78062.getClass(), "_bindings", null);
        setField(term78062, term78062.getClass(), "_canonicalName", null);
        setField(term78062, term78062.getClass(), "_class", null);
        setIntField(term78062, term78062.getClass(), "_hash", 0);
        setField(term78062, term78062.getClass(), "_valueHandler", null);
        setField(term78062, term78062.getClass(), "_typeHandler", null);
        setBooleanField(term78062, term78062.getClass(), "_asStatic", false);
        setElement(term78061, 0, term78062);
        setField(term78063, term78063.getClass(), "_componentType", null);
        setField(term78063, term78063.getClass(), "_emptyArray", null);
        setField(term78063, term78063.getClass(), "_superClass", null);
        setField(term78063, term78063.getClass(), "_superInterfaces", null);
        setField(term78063, term78063.getClass(), "_bindings", null);
        setField(term78063, term78063.getClass(), "_canonicalName", null);
        setField(term78063, term78063.getClass(), "_class", null);
        setIntField(term78063, term78063.getClass(), "_hash", 0);
        setField(term78063, term78063.getClass(), "_valueHandler", null);
        setField(term78063, term78063.getClass(), "_typeHandler", null);
        setBooleanField(term78063, term78063.getClass(), "_asStatic", false);
        setElement(term78061, 1, term78063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term77106;
        args[1] = term77109;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term78047));
        assertTrue(recursiveEquals(term77106, term78056));
        assertTrue(recursiveEquals(term77109, term78061));
    }

};


