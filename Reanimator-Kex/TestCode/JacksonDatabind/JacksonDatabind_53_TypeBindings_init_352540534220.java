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

public class TypeBindings_init_352540534220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71964;
     Object term71965;
     Object term73053;
     Object term73059;
     Object term73060;

    public TypeBindings_init_352540534220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term72119 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term71969 = (Object[]) newArray("java.lang.String", 0);
        Object[] term71970 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term72119, term72119.getClass(), "_names", term71969);
        setField(term72119, term72119.getClass(), "_types", term71970);
        term71964 = (Object[]) newArray("java.lang.String", 3);
        term71965 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term72225 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term72321 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term72427 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term72225, term72225.getClass(), "_hash", 0);
        setElement(term71965, 0, term72225);
        setIntField(term72321, term72321.getClass(), "_hash", 0);
        setElement(term71965, 1, term72321);
        setElement(term71965, 2, term72427);
        term73053 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term73054 = (Object[]) newArray("java.lang.String", 3);
        Object[] term73055 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term73056 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term73057 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term73058 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term73053, term73053.getClass(), "_names", term73054);
        setField(term73056, term73056.getClass(), "_elementType", null);
        setField(term73056, term73056.getClass(), "_superClass", null);
        setField(term73056, term73056.getClass(), "_superInterfaces", null);
        setField(term73056, term73056.getClass(), "_bindings", null);
        setField(term73056, term73056.getClass(), "_canonicalName", null);
        setField(term73056, term73056.getClass(), "_class", null);
        setIntField(term73056, term73056.getClass(), "_hash", 0);
        setField(term73056, term73056.getClass(), "_valueHandler", null);
        setField(term73056, term73056.getClass(), "_typeHandler", null);
        setBooleanField(term73056, term73056.getClass(), "_asStatic", false);
        setElement(term73055, 0, term73056);
        setField(term73057, term73057.getClass(), "_componentType", null);
        setField(term73057, term73057.getClass(), "_emptyArray", null);
        setField(term73057, term73057.getClass(), "_superClass", null);
        setField(term73057, term73057.getClass(), "_superInterfaces", null);
        setField(term73057, term73057.getClass(), "_bindings", null);
        setField(term73057, term73057.getClass(), "_canonicalName", null);
        setField(term73057, term73057.getClass(), "_class", null);
        setIntField(term73057, term73057.getClass(), "_hash", 0);
        setField(term73057, term73057.getClass(), "_valueHandler", null);
        setField(term73057, term73057.getClass(), "_typeHandler", null);
        setBooleanField(term73057, term73057.getClass(), "_asStatic", false);
        setElement(term73055, 1, term73057);
        setField(term73058, term73058.getClass(), "_elementType", null);
        setField(term73058, term73058.getClass(), "_superClass", null);
        setField(term73058, term73058.getClass(), "_superInterfaces", null);
        setField(term73058, term73058.getClass(), "_bindings", null);
        setField(term73058, term73058.getClass(), "_canonicalName", null);
        setField(term73058, term73058.getClass(), "_class", null);
        setIntField(term73058, term73058.getClass(), "_hash", 0);
        setField(term73058, term73058.getClass(), "_valueHandler", null);
        setField(term73058, term73058.getClass(), "_typeHandler", null);
        setBooleanField(term73058, term73058.getClass(), "_asStatic", false);
        setElement(term73055, 2, term73058);
        setField(term73053, term73053.getClass(), "_types", term73055);
        setField(term73053, term73053.getClass(), "_unboundVariables", null);
        setIntField(term73053, term73053.getClass(), "_hashCode", 1);
        term73059 = (Object[]) newArray("java.lang.String", 3);
        term73060 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term73061 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term73062 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term73063 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term73061, term73061.getClass(), "_elementType", null);
        setField(term73061, term73061.getClass(), "_superClass", null);
        setField(term73061, term73061.getClass(), "_superInterfaces", null);
        setField(term73061, term73061.getClass(), "_bindings", null);
        setField(term73061, term73061.getClass(), "_canonicalName", null);
        setField(term73061, term73061.getClass(), "_class", null);
        setIntField(term73061, term73061.getClass(), "_hash", 0);
        setField(term73061, term73061.getClass(), "_valueHandler", null);
        setField(term73061, term73061.getClass(), "_typeHandler", null);
        setBooleanField(term73061, term73061.getClass(), "_asStatic", false);
        setElement(term73060, 0, term73061);
        setField(term73062, term73062.getClass(), "_componentType", null);
        setField(term73062, term73062.getClass(), "_emptyArray", null);
        setField(term73062, term73062.getClass(), "_superClass", null);
        setField(term73062, term73062.getClass(), "_superInterfaces", null);
        setField(term73062, term73062.getClass(), "_bindings", null);
        setField(term73062, term73062.getClass(), "_canonicalName", null);
        setField(term73062, term73062.getClass(), "_class", null);
        setIntField(term73062, term73062.getClass(), "_hash", 0);
        setField(term73062, term73062.getClass(), "_valueHandler", null);
        setField(term73062, term73062.getClass(), "_typeHandler", null);
        setBooleanField(term73062, term73062.getClass(), "_asStatic", false);
        setElement(term73060, 1, term73062);
        setField(term73063, term73063.getClass(), "_elementType", null);
        setField(term73063, term73063.getClass(), "_superClass", null);
        setField(term73063, term73063.getClass(), "_superInterfaces", null);
        setField(term73063, term73063.getClass(), "_bindings", null);
        setField(term73063, term73063.getClass(), "_canonicalName", null);
        setField(term73063, term73063.getClass(), "_class", null);
        setIntField(term73063, term73063.getClass(), "_hash", 0);
        setField(term73063, term73063.getClass(), "_valueHandler", null);
        setField(term73063, term73063.getClass(), "_typeHandler", null);
        setBooleanField(term73063, term73063.getClass(), "_asStatic", false);
        setElement(term73060, 2, term73063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term71964;
        args[1] = term71965;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term73053));
        assertTrue(recursiveEquals(term71964, term73059));
        assertTrue(recursiveEquals(term71965, term73060));
    }

};


