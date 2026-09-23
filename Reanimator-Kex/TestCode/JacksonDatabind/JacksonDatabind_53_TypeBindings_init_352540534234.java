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

public class TypeBindings_init_352540534234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76018;
     Object term76021;
     Object term77019;
     Object term77028;
     Object term77033;

    public TypeBindings_init_352540534234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term76170 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term76024 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term76170, term76170.getClass(), "_names", null);
        setField(term76170, term76170.getClass(), "_types", term76024);
        term76018 = (Object[]) newArray("java.lang.String", 2);
        setElement(term76018, 0, "");
        setElement(term76018, 1, "");
        term76021 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term76352 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term76448 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term76352, term76352.getClass(), "_hash", 0);
        setElement(term76021, 0, term76352);
        setIntField(term76448, term76448.getClass(), "_hash", 0);
        setElement(term76021, 1, term76448);
        term77019 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term77020 = (Object[]) newArray("java.lang.String", 2);
        Object[] term77025 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term77026 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term77027 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setElement(term77020, 0, "");
        setElement(term77020, 1, "");
        setField(term77019, term77019.getClass(), "_names", term77020);
        setField(term77026, term77026.getClass(), "_elementType", null);
        setField(term77026, term77026.getClass(), "_superClass", null);
        setField(term77026, term77026.getClass(), "_superInterfaces", null);
        setField(term77026, term77026.getClass(), "_bindings", null);
        setField(term77026, term77026.getClass(), "_canonicalName", null);
        setField(term77026, term77026.getClass(), "_class", null);
        setIntField(term77026, term77026.getClass(), "_hash", 0);
        setField(term77026, term77026.getClass(), "_valueHandler", null);
        setField(term77026, term77026.getClass(), "_typeHandler", null);
        setBooleanField(term77026, term77026.getClass(), "_asStatic", false);
        setElement(term77025, 0, term77026);
        setField(term77027, term77027.getClass(), "_componentType", null);
        setField(term77027, term77027.getClass(), "_emptyArray", null);
        setField(term77027, term77027.getClass(), "_superClass", null);
        setField(term77027, term77027.getClass(), "_superInterfaces", null);
        setField(term77027, term77027.getClass(), "_bindings", null);
        setField(term77027, term77027.getClass(), "_canonicalName", null);
        setField(term77027, term77027.getClass(), "_class", null);
        setIntField(term77027, term77027.getClass(), "_hash", 0);
        setField(term77027, term77027.getClass(), "_valueHandler", null);
        setField(term77027, term77027.getClass(), "_typeHandler", null);
        setBooleanField(term77027, term77027.getClass(), "_asStatic", false);
        setElement(term77025, 1, term77027);
        setField(term77019, term77019.getClass(), "_types", term77025);
        setField(term77019, term77019.getClass(), "_unboundVariables", null);
        setIntField(term77019, term77019.getClass(), "_hashCode", 1);
        term77028 = (Object[]) newArray("java.lang.String", 2);
        setElement(term77028, 0, "");
        setElement(term77028, 1, "");
        term77033 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term77034 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term77035 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term77034, term77034.getClass(), "_elementType", null);
        setField(term77034, term77034.getClass(), "_superClass", null);
        setField(term77034, term77034.getClass(), "_superInterfaces", null);
        setField(term77034, term77034.getClass(), "_bindings", null);
        setField(term77034, term77034.getClass(), "_canonicalName", null);
        setField(term77034, term77034.getClass(), "_class", null);
        setIntField(term77034, term77034.getClass(), "_hash", 0);
        setField(term77034, term77034.getClass(), "_valueHandler", null);
        setField(term77034, term77034.getClass(), "_typeHandler", null);
        setBooleanField(term77034, term77034.getClass(), "_asStatic", false);
        setElement(term77033, 0, term77034);
        setField(term77035, term77035.getClass(), "_componentType", null);
        setField(term77035, term77035.getClass(), "_emptyArray", null);
        setField(term77035, term77035.getClass(), "_superClass", null);
        setField(term77035, term77035.getClass(), "_superInterfaces", null);
        setField(term77035, term77035.getClass(), "_bindings", null);
        setField(term77035, term77035.getClass(), "_canonicalName", null);
        setField(term77035, term77035.getClass(), "_class", null);
        setIntField(term77035, term77035.getClass(), "_hash", 0);
        setField(term77035, term77035.getClass(), "_valueHandler", null);
        setField(term77035, term77035.getClass(), "_typeHandler", null);
        setBooleanField(term77035, term77035.getClass(), "_asStatic", false);
        setElement(term77033, 1, term77035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term76018;
        args[1] = term76021;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term77019));
        assertTrue(recursiveEquals(term76018, term77028));
        assertTrue(recursiveEquals(term76021, term77033));
    }

};


