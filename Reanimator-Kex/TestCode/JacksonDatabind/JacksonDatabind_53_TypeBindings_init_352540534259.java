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

public class TypeBindings_init_352540534259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84526;
     Object term84527;
     Object term85182;
     Object term85189;
     Object term85190;

    public TypeBindings_init_352540534259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term84690 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term84532 = (Object[]) newArray("java.lang.String", 0);
        Object[] term84533 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term84690, term84690.getClass(), "_names", term84532);
        setField(term84690, term84690.getClass(), "_types", term84533);
        term84526 = (Object[]) newArray("java.lang.String", 4);
        term84527 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term84796 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term84892 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term84992 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term85084 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term84796, term84796.getClass(), "_hash", 0);
        setElement(term84527, 0, term84796);
        setIntField(term84892, term84892.getClass(), "_hash", 0);
        setElement(term84527, 1, term84892);
        setIntField(term84992, term84992.getClass(), "_hash", 0);
        setElement(term84527, 2, term84992);
        setElement(term84527, 3, term85084);
        term85182 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term85183 = (Object[]) newArray("java.lang.String", 4);
        Object[] term85184 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term85185 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term85186 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term85187 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term85188 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term85182, term85182.getClass(), "_names", term85183);
        setField(term85185, term85185.getClass(), "_elementType", null);
        setField(term85185, term85185.getClass(), "_superClass", null);
        setField(term85185, term85185.getClass(), "_superInterfaces", null);
        setField(term85185, term85185.getClass(), "_bindings", null);
        setField(term85185, term85185.getClass(), "_canonicalName", null);
        setField(term85185, term85185.getClass(), "_class", null);
        setIntField(term85185, term85185.getClass(), "_hash", 0);
        setField(term85185, term85185.getClass(), "_valueHandler", null);
        setField(term85185, term85185.getClass(), "_typeHandler", null);
        setBooleanField(term85185, term85185.getClass(), "_asStatic", false);
        setElement(term85184, 0, term85185);
        setField(term85186, term85186.getClass(), "_componentType", null);
        setField(term85186, term85186.getClass(), "_emptyArray", null);
        setField(term85186, term85186.getClass(), "_superClass", null);
        setField(term85186, term85186.getClass(), "_superInterfaces", null);
        setField(term85186, term85186.getClass(), "_bindings", null);
        setField(term85186, term85186.getClass(), "_canonicalName", null);
        setField(term85186, term85186.getClass(), "_class", null);
        setIntField(term85186, term85186.getClass(), "_hash", 0);
        setField(term85186, term85186.getClass(), "_valueHandler", null);
        setField(term85186, term85186.getClass(), "_typeHandler", null);
        setBooleanField(term85186, term85186.getClass(), "_asStatic", false);
        setElement(term85184, 1, term85186);
        setField(term85187, term85187.getClass(), "_keyType", null);
        setField(term85187, term85187.getClass(), "_valueType", null);
        setField(term85187, term85187.getClass(), "_superClass", null);
        setField(term85187, term85187.getClass(), "_superInterfaces", null);
        setField(term85187, term85187.getClass(), "_bindings", null);
        setField(term85187, term85187.getClass(), "_canonicalName", null);
        setField(term85187, term85187.getClass(), "_class", null);
        setIntField(term85187, term85187.getClass(), "_hash", 0);
        setField(term85187, term85187.getClass(), "_valueHandler", null);
        setField(term85187, term85187.getClass(), "_typeHandler", null);
        setBooleanField(term85187, term85187.getClass(), "_asStatic", false);
        setElement(term85184, 2, term85187);
        setField(term85188, term85188.getClass(), "_keyType", null);
        setField(term85188, term85188.getClass(), "_valueType", null);
        setField(term85188, term85188.getClass(), "_superClass", null);
        setField(term85188, term85188.getClass(), "_superInterfaces", null);
        setField(term85188, term85188.getClass(), "_bindings", null);
        setField(term85188, term85188.getClass(), "_canonicalName", null);
        setField(term85188, term85188.getClass(), "_class", null);
        setIntField(term85188, term85188.getClass(), "_hash", 0);
        setField(term85188, term85188.getClass(), "_valueHandler", null);
        setField(term85188, term85188.getClass(), "_typeHandler", null);
        setBooleanField(term85188, term85188.getClass(), "_asStatic", false);
        setElement(term85184, 3, term85188);
        setField(term85182, term85182.getClass(), "_types", term85184);
        setField(term85182, term85182.getClass(), "_unboundVariables", null);
        setIntField(term85182, term85182.getClass(), "_hashCode", 1);
        term85189 = (Object[]) newArray("java.lang.String", 4);
        term85190 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term85191 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term85192 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term85193 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term85194 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term85191, term85191.getClass(), "_elementType", null);
        setField(term85191, term85191.getClass(), "_superClass", null);
        setField(term85191, term85191.getClass(), "_superInterfaces", null);
        setField(term85191, term85191.getClass(), "_bindings", null);
        setField(term85191, term85191.getClass(), "_canonicalName", null);
        setField(term85191, term85191.getClass(), "_class", null);
        setIntField(term85191, term85191.getClass(), "_hash", 0);
        setField(term85191, term85191.getClass(), "_valueHandler", null);
        setField(term85191, term85191.getClass(), "_typeHandler", null);
        setBooleanField(term85191, term85191.getClass(), "_asStatic", false);
        setElement(term85190, 0, term85191);
        setField(term85192, term85192.getClass(), "_componentType", null);
        setField(term85192, term85192.getClass(), "_emptyArray", null);
        setField(term85192, term85192.getClass(), "_superClass", null);
        setField(term85192, term85192.getClass(), "_superInterfaces", null);
        setField(term85192, term85192.getClass(), "_bindings", null);
        setField(term85192, term85192.getClass(), "_canonicalName", null);
        setField(term85192, term85192.getClass(), "_class", null);
        setIntField(term85192, term85192.getClass(), "_hash", 0);
        setField(term85192, term85192.getClass(), "_valueHandler", null);
        setField(term85192, term85192.getClass(), "_typeHandler", null);
        setBooleanField(term85192, term85192.getClass(), "_asStatic", false);
        setElement(term85190, 1, term85192);
        setField(term85193, term85193.getClass(), "_keyType", null);
        setField(term85193, term85193.getClass(), "_valueType", null);
        setField(term85193, term85193.getClass(), "_superClass", null);
        setField(term85193, term85193.getClass(), "_superInterfaces", null);
        setField(term85193, term85193.getClass(), "_bindings", null);
        setField(term85193, term85193.getClass(), "_canonicalName", null);
        setField(term85193, term85193.getClass(), "_class", null);
        setIntField(term85193, term85193.getClass(), "_hash", 0);
        setField(term85193, term85193.getClass(), "_valueHandler", null);
        setField(term85193, term85193.getClass(), "_typeHandler", null);
        setBooleanField(term85193, term85193.getClass(), "_asStatic", false);
        setElement(term85190, 2, term85193);
        setField(term85194, term85194.getClass(), "_keyType", null);
        setField(term85194, term85194.getClass(), "_valueType", null);
        setField(term85194, term85194.getClass(), "_superClass", null);
        setField(term85194, term85194.getClass(), "_superInterfaces", null);
        setField(term85194, term85194.getClass(), "_bindings", null);
        setField(term85194, term85194.getClass(), "_canonicalName", null);
        setField(term85194, term85194.getClass(), "_class", null);
        setIntField(term85194, term85194.getClass(), "_hash", 0);
        setField(term85194, term85194.getClass(), "_valueHandler", null);
        setField(term85194, term85194.getClass(), "_typeHandler", null);
        setBooleanField(term85194, term85194.getClass(), "_asStatic", false);
        setElement(term85190, 3, term85194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term84526;
        args[1] = term84527;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term85182));
        assertTrue(recursiveEquals(term84526, term85189));
        assertTrue(recursiveEquals(term84527, term85190));
    }

};


