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

public class TypeBindings_init_352540534266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86106;
     Object term86110;
     Object term87321;
     Object term87335;
     Object term87344;

    public TypeBindings_init_352540534266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term86269 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term86269, term86269.getClass(), "_names", null);
        setField(term86269, term86269.getClass(), "_types", null);
        term86106 = (Object[]) newArray("java.lang.String", 4);
        setElement(term86106, 0, "");
        setElement(term86106, 1, "");
        setElement(term86106, 2, "");
        setElement(term86106, 3, "");
        term86110 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term86489 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term86593 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term86697 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term86489, term86489.getClass(), "_hash", 0);
        setElement(term86110, 0, term86489);
        setIntField(term86593, term86593.getClass(), "_hash", 0);
        setElement(term86110, 1, term86593);
        setElement(term86110, 2, term86593);
        setElement(term86110, 3, term86697);
        term87321 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term87322 = (Object[]) newArray("java.lang.String", 4);
        Object[] term87331 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term87332 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term87333 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term87334 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setElement(term87322, 0, "");
        setElement(term87322, 1, "");
        setElement(term87322, 2, "");
        setElement(term87322, 3, "");
        setField(term87321, term87321.getClass(), "_names", term87322);
        setField(term87332, term87332.getClass(), "_elementType", null);
        setField(term87332, term87332.getClass(), "_superClass", null);
        setField(term87332, term87332.getClass(), "_superInterfaces", null);
        setField(term87332, term87332.getClass(), "_bindings", null);
        setField(term87332, term87332.getClass(), "_canonicalName", null);
        setField(term87332, term87332.getClass(), "_class", null);
        setIntField(term87332, term87332.getClass(), "_hash", 0);
        setField(term87332, term87332.getClass(), "_valueHandler", null);
        setField(term87332, term87332.getClass(), "_typeHandler", null);
        setBooleanField(term87332, term87332.getClass(), "_asStatic", false);
        setElement(term87331, 0, term87332);
        setField(term87333, term87333.getClass(), "_referencedType", null);
        setField(term87333, term87333.getClass(), "_superClass", null);
        setField(term87333, term87333.getClass(), "_superInterfaces", null);
        setField(term87333, term87333.getClass(), "_bindings", null);
        setField(term87333, term87333.getClass(), "_canonicalName", null);
        setField(term87333, term87333.getClass(), "_class", null);
        setIntField(term87333, term87333.getClass(), "_hash", 0);
        setField(term87333, term87333.getClass(), "_valueHandler", null);
        setField(term87333, term87333.getClass(), "_typeHandler", null);
        setBooleanField(term87333, term87333.getClass(), "_asStatic", false);
        setElement(term87331, 1, term87333);
        setElement(term87331, 2, term87333);
        setField(term87334, term87334.getClass(), "_referencedType", null);
        setField(term87334, term87334.getClass(), "_superClass", null);
        setField(term87334, term87334.getClass(), "_superInterfaces", null);
        setField(term87334, term87334.getClass(), "_bindings", null);
        setField(term87334, term87334.getClass(), "_canonicalName", null);
        setField(term87334, term87334.getClass(), "_class", null);
        setIntField(term87334, term87334.getClass(), "_hash", 0);
        setField(term87334, term87334.getClass(), "_valueHandler", null);
        setField(term87334, term87334.getClass(), "_typeHandler", null);
        setBooleanField(term87334, term87334.getClass(), "_asStatic", false);
        setElement(term87331, 3, term87334);
        setField(term87321, term87321.getClass(), "_types", term87331);
        setField(term87321, term87321.getClass(), "_unboundVariables", null);
        setIntField(term87321, term87321.getClass(), "_hashCode", 1);
        term87335 = (Object[]) newArray("java.lang.String", 4);
        setElement(term87335, 0, "");
        setElement(term87335, 1, "");
        setElement(term87335, 2, "");
        setElement(term87335, 3, "");
        term87344 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term87345 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term87346 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term87347 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term87345, term87345.getClass(), "_elementType", null);
        setField(term87345, term87345.getClass(), "_superClass", null);
        setField(term87345, term87345.getClass(), "_superInterfaces", null);
        setField(term87345, term87345.getClass(), "_bindings", null);
        setField(term87345, term87345.getClass(), "_canonicalName", null);
        setField(term87345, term87345.getClass(), "_class", null);
        setIntField(term87345, term87345.getClass(), "_hash", 0);
        setField(term87345, term87345.getClass(), "_valueHandler", null);
        setField(term87345, term87345.getClass(), "_typeHandler", null);
        setBooleanField(term87345, term87345.getClass(), "_asStatic", false);
        setElement(term87344, 0, term87345);
        setField(term87346, term87346.getClass(), "_referencedType", null);
        setField(term87346, term87346.getClass(), "_superClass", null);
        setField(term87346, term87346.getClass(), "_superInterfaces", null);
        setField(term87346, term87346.getClass(), "_bindings", null);
        setField(term87346, term87346.getClass(), "_canonicalName", null);
        setField(term87346, term87346.getClass(), "_class", null);
        setIntField(term87346, term87346.getClass(), "_hash", 0);
        setField(term87346, term87346.getClass(), "_valueHandler", null);
        setField(term87346, term87346.getClass(), "_typeHandler", null);
        setBooleanField(term87346, term87346.getClass(), "_asStatic", false);
        setElement(term87344, 1, term87346);
        setElement(term87344, 2, term87346);
        setField(term87347, term87347.getClass(), "_referencedType", null);
        setField(term87347, term87347.getClass(), "_superClass", null);
        setField(term87347, term87347.getClass(), "_superInterfaces", null);
        setField(term87347, term87347.getClass(), "_bindings", null);
        setField(term87347, term87347.getClass(), "_canonicalName", null);
        setField(term87347, term87347.getClass(), "_class", null);
        setIntField(term87347, term87347.getClass(), "_hash", 0);
        setField(term87347, term87347.getClass(), "_valueHandler", null);
        setField(term87347, term87347.getClass(), "_typeHandler", null);
        setBooleanField(term87347, term87347.getClass(), "_asStatic", false);
        setElement(term87344, 3, term87347);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term86106;
        args[1] = term86110;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term87321));
        assertTrue(recursiveEquals(term86106, term87335));
        assertTrue(recursiveEquals(term86110, term87344));
    }

};


