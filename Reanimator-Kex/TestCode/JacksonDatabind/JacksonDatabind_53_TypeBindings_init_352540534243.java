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

public class TypeBindings_init_352540534243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78634;
     Object term78635;
     Object term79240;
     Object term79247;
     Object term79248;

    public TypeBindings_init_352540534243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78797 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term78640 = (Object[]) newArray("java.lang.String", 0);
        Object[] term78641 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term78797, term78797.getClass(), "_names", term78640);
        setField(term78797, term78797.getClass(), "_types", term78641);
        term78634 = (Object[]) newArray("java.lang.String", 4);
        term78635 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term78903 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term78999 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term79091 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term79197 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term78903, term78903.getClass(), "_hash", 0);
        setElement(term78635, 0, term78903);
        setIntField(term78999, term78999.getClass(), "_hash", 0);
        setElement(term78635, 1, term78999);
        setIntField(term79091, term79091.getClass(), "_hash", 0);
        setElement(term78635, 2, term79091);
        setElement(term78635, 3, term79197);
        term79240 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term79241 = (Object[]) newArray("java.lang.String", 4);
        Object[] term79242 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term79243 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term79244 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term79245 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term79246 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term79240, term79240.getClass(), "_names", term79241);
        setField(term79243, term79243.getClass(), "_elementType", null);
        setField(term79243, term79243.getClass(), "_superClass", null);
        setField(term79243, term79243.getClass(), "_superInterfaces", null);
        setField(term79243, term79243.getClass(), "_bindings", null);
        setField(term79243, term79243.getClass(), "_canonicalName", null);
        setField(term79243, term79243.getClass(), "_class", null);
        setIntField(term79243, term79243.getClass(), "_hash", 0);
        setField(term79243, term79243.getClass(), "_valueHandler", null);
        setField(term79243, term79243.getClass(), "_typeHandler", null);
        setBooleanField(term79243, term79243.getClass(), "_asStatic", false);
        setElement(term79242, 0, term79243);
        setField(term79244, term79244.getClass(), "_componentType", null);
        setField(term79244, term79244.getClass(), "_emptyArray", null);
        setField(term79244, term79244.getClass(), "_superClass", null);
        setField(term79244, term79244.getClass(), "_superInterfaces", null);
        setField(term79244, term79244.getClass(), "_bindings", null);
        setField(term79244, term79244.getClass(), "_canonicalName", null);
        setField(term79244, term79244.getClass(), "_class", null);
        setIntField(term79244, term79244.getClass(), "_hash", 0);
        setField(term79244, term79244.getClass(), "_valueHandler", null);
        setField(term79244, term79244.getClass(), "_typeHandler", null);
        setBooleanField(term79244, term79244.getClass(), "_asStatic", false);
        setElement(term79242, 1, term79244);
        setField(term79245, term79245.getClass(), "_keyType", null);
        setField(term79245, term79245.getClass(), "_valueType", null);
        setField(term79245, term79245.getClass(), "_superClass", null);
        setField(term79245, term79245.getClass(), "_superInterfaces", null);
        setField(term79245, term79245.getClass(), "_bindings", null);
        setField(term79245, term79245.getClass(), "_canonicalName", null);
        setField(term79245, term79245.getClass(), "_class", null);
        setIntField(term79245, term79245.getClass(), "_hash", 0);
        setField(term79245, term79245.getClass(), "_valueHandler", null);
        setField(term79245, term79245.getClass(), "_typeHandler", null);
        setBooleanField(term79245, term79245.getClass(), "_asStatic", false);
        setElement(term79242, 2, term79245);
        setField(term79246, term79246.getClass(), "_elementType", null);
        setField(term79246, term79246.getClass(), "_superClass", null);
        setField(term79246, term79246.getClass(), "_superInterfaces", null);
        setField(term79246, term79246.getClass(), "_bindings", null);
        setField(term79246, term79246.getClass(), "_canonicalName", null);
        setField(term79246, term79246.getClass(), "_class", null);
        setIntField(term79246, term79246.getClass(), "_hash", 0);
        setField(term79246, term79246.getClass(), "_valueHandler", null);
        setField(term79246, term79246.getClass(), "_typeHandler", null);
        setBooleanField(term79246, term79246.getClass(), "_asStatic", false);
        setElement(term79242, 3, term79246);
        setField(term79240, term79240.getClass(), "_types", term79242);
        setField(term79240, term79240.getClass(), "_unboundVariables", null);
        setIntField(term79240, term79240.getClass(), "_hashCode", 1);
        term79247 = (Object[]) newArray("java.lang.String", 4);
        term79248 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term79249 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term79250 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term79251 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term79252 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term79249, term79249.getClass(), "_elementType", null);
        setField(term79249, term79249.getClass(), "_superClass", null);
        setField(term79249, term79249.getClass(), "_superInterfaces", null);
        setField(term79249, term79249.getClass(), "_bindings", null);
        setField(term79249, term79249.getClass(), "_canonicalName", null);
        setField(term79249, term79249.getClass(), "_class", null);
        setIntField(term79249, term79249.getClass(), "_hash", 0);
        setField(term79249, term79249.getClass(), "_valueHandler", null);
        setField(term79249, term79249.getClass(), "_typeHandler", null);
        setBooleanField(term79249, term79249.getClass(), "_asStatic", false);
        setElement(term79248, 0, term79249);
        setField(term79250, term79250.getClass(), "_componentType", null);
        setField(term79250, term79250.getClass(), "_emptyArray", null);
        setField(term79250, term79250.getClass(), "_superClass", null);
        setField(term79250, term79250.getClass(), "_superInterfaces", null);
        setField(term79250, term79250.getClass(), "_bindings", null);
        setField(term79250, term79250.getClass(), "_canonicalName", null);
        setField(term79250, term79250.getClass(), "_class", null);
        setIntField(term79250, term79250.getClass(), "_hash", 0);
        setField(term79250, term79250.getClass(), "_valueHandler", null);
        setField(term79250, term79250.getClass(), "_typeHandler", null);
        setBooleanField(term79250, term79250.getClass(), "_asStatic", false);
        setElement(term79248, 1, term79250);
        setField(term79251, term79251.getClass(), "_keyType", null);
        setField(term79251, term79251.getClass(), "_valueType", null);
        setField(term79251, term79251.getClass(), "_superClass", null);
        setField(term79251, term79251.getClass(), "_superInterfaces", null);
        setField(term79251, term79251.getClass(), "_bindings", null);
        setField(term79251, term79251.getClass(), "_canonicalName", null);
        setField(term79251, term79251.getClass(), "_class", null);
        setIntField(term79251, term79251.getClass(), "_hash", 0);
        setField(term79251, term79251.getClass(), "_valueHandler", null);
        setField(term79251, term79251.getClass(), "_typeHandler", null);
        setBooleanField(term79251, term79251.getClass(), "_asStatic", false);
        setElement(term79248, 2, term79251);
        setField(term79252, term79252.getClass(), "_elementType", null);
        setField(term79252, term79252.getClass(), "_superClass", null);
        setField(term79252, term79252.getClass(), "_superInterfaces", null);
        setField(term79252, term79252.getClass(), "_bindings", null);
        setField(term79252, term79252.getClass(), "_canonicalName", null);
        setField(term79252, term79252.getClass(), "_class", null);
        setIntField(term79252, term79252.getClass(), "_hash", 0);
        setField(term79252, term79252.getClass(), "_valueHandler", null);
        setField(term79252, term79252.getClass(), "_typeHandler", null);
        setBooleanField(term79252, term79252.getClass(), "_asStatic", false);
        setElement(term79248, 3, term79252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term78634;
        args[1] = term78635;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term79240));
        assertTrue(recursiveEquals(term78634, term79247));
        assertTrue(recursiveEquals(term78635, term79248));
    }

};


