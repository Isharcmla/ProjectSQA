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

public class TypeBindings_init_352540534267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86699;
     Object term86700;
     Object term87390;
     Object term87397;
     Object term87398;

    public TypeBindings_init_352540534267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term86853 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term86705 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term86853, term86853.getClass(), "_names", null);
        setField(term86853, term86853.getClass(), "_types", term86705);
        term86699 = (Object[]) newArray("java.lang.String", 4);
        term86700 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term86957 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term87063 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term87167 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term87265 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setIntField(term86957, term86957.getClass(), "_hash", 0);
        setElement(term86700, 0, term86957);
        setIntField(term87063, term87063.getClass(), "_hash", 0);
        setElement(term86700, 1, term87063);
        setElement(term86700, 2, term87167);
        setElement(term86700, 3, term87265);
        term87390 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term87391 = (Object[]) newArray("java.lang.String", 4);
        Object[] term87392 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term87393 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term87394 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term87395 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term87396 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term87390, term87390.getClass(), "_names", term87391);
        setField(term87393, term87393.getClass(), "_referencedType", null);
        setField(term87393, term87393.getClass(), "_superClass", null);
        setField(term87393, term87393.getClass(), "_superInterfaces", null);
        setField(term87393, term87393.getClass(), "_bindings", null);
        setField(term87393, term87393.getClass(), "_canonicalName", null);
        setField(term87393, term87393.getClass(), "_class", null);
        setIntField(term87393, term87393.getClass(), "_hash", 0);
        setField(term87393, term87393.getClass(), "_valueHandler", null);
        setField(term87393, term87393.getClass(), "_typeHandler", null);
        setBooleanField(term87393, term87393.getClass(), "_asStatic", false);
        setElement(term87392, 0, term87393);
        setField(term87394, term87394.getClass(), "_elementType", null);
        setField(term87394, term87394.getClass(), "_superClass", null);
        setField(term87394, term87394.getClass(), "_superInterfaces", null);
        setField(term87394, term87394.getClass(), "_bindings", null);
        setField(term87394, term87394.getClass(), "_canonicalName", null);
        setField(term87394, term87394.getClass(), "_class", null);
        setIntField(term87394, term87394.getClass(), "_hash", 0);
        setField(term87394, term87394.getClass(), "_valueHandler", null);
        setField(term87394, term87394.getClass(), "_typeHandler", null);
        setBooleanField(term87394, term87394.getClass(), "_asStatic", false);
        setElement(term87392, 1, term87394);
        setField(term87395, term87395.getClass(), "_referencedType", null);
        setField(term87395, term87395.getClass(), "_superClass", null);
        setField(term87395, term87395.getClass(), "_superInterfaces", null);
        setField(term87395, term87395.getClass(), "_bindings", null);
        setField(term87395, term87395.getClass(), "_canonicalName", null);
        setField(term87395, term87395.getClass(), "_class", null);
        setIntField(term87395, term87395.getClass(), "_hash", 0);
        setField(term87395, term87395.getClass(), "_valueHandler", null);
        setField(term87395, term87395.getClass(), "_typeHandler", null);
        setBooleanField(term87395, term87395.getClass(), "_asStatic", false);
        setElement(term87392, 2, term87395);
        setField(term87396, term87396.getClass(), "_superClass", null);
        setField(term87396, term87396.getClass(), "_superInterfaces", null);
        setField(term87396, term87396.getClass(), "_bindings", null);
        setField(term87396, term87396.getClass(), "_canonicalName", null);
        setField(term87396, term87396.getClass(), "_class", null);
        setIntField(term87396, term87396.getClass(), "_hash", 0);
        setField(term87396, term87396.getClass(), "_valueHandler", null);
        setField(term87396, term87396.getClass(), "_typeHandler", null);
        setBooleanField(term87396, term87396.getClass(), "_asStatic", false);
        setElement(term87392, 3, term87396);
        setField(term87390, term87390.getClass(), "_types", term87392);
        setField(term87390, term87390.getClass(), "_unboundVariables", null);
        setIntField(term87390, term87390.getClass(), "_hashCode", 1);
        term87397 = (Object[]) newArray("java.lang.String", 4);
        term87398 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term87399 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term87400 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term87401 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term87402 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term87399, term87399.getClass(), "_referencedType", null);
        setField(term87399, term87399.getClass(), "_superClass", null);
        setField(term87399, term87399.getClass(), "_superInterfaces", null);
        setField(term87399, term87399.getClass(), "_bindings", null);
        setField(term87399, term87399.getClass(), "_canonicalName", null);
        setField(term87399, term87399.getClass(), "_class", null);
        setIntField(term87399, term87399.getClass(), "_hash", 0);
        setField(term87399, term87399.getClass(), "_valueHandler", null);
        setField(term87399, term87399.getClass(), "_typeHandler", null);
        setBooleanField(term87399, term87399.getClass(), "_asStatic", false);
        setElement(term87398, 0, term87399);
        setField(term87400, term87400.getClass(), "_elementType", null);
        setField(term87400, term87400.getClass(), "_superClass", null);
        setField(term87400, term87400.getClass(), "_superInterfaces", null);
        setField(term87400, term87400.getClass(), "_bindings", null);
        setField(term87400, term87400.getClass(), "_canonicalName", null);
        setField(term87400, term87400.getClass(), "_class", null);
        setIntField(term87400, term87400.getClass(), "_hash", 0);
        setField(term87400, term87400.getClass(), "_valueHandler", null);
        setField(term87400, term87400.getClass(), "_typeHandler", null);
        setBooleanField(term87400, term87400.getClass(), "_asStatic", false);
        setElement(term87398, 1, term87400);
        setField(term87401, term87401.getClass(), "_referencedType", null);
        setField(term87401, term87401.getClass(), "_superClass", null);
        setField(term87401, term87401.getClass(), "_superInterfaces", null);
        setField(term87401, term87401.getClass(), "_bindings", null);
        setField(term87401, term87401.getClass(), "_canonicalName", null);
        setField(term87401, term87401.getClass(), "_class", null);
        setIntField(term87401, term87401.getClass(), "_hash", 0);
        setField(term87401, term87401.getClass(), "_valueHandler", null);
        setField(term87401, term87401.getClass(), "_typeHandler", null);
        setBooleanField(term87401, term87401.getClass(), "_asStatic", false);
        setElement(term87398, 2, term87401);
        setField(term87402, term87402.getClass(), "_superClass", null);
        setField(term87402, term87402.getClass(), "_superInterfaces", null);
        setField(term87402, term87402.getClass(), "_bindings", null);
        setField(term87402, term87402.getClass(), "_canonicalName", null);
        setField(term87402, term87402.getClass(), "_class", null);
        setIntField(term87402, term87402.getClass(), "_hash", 0);
        setField(term87402, term87402.getClass(), "_valueHandler", null);
        setField(term87402, term87402.getClass(), "_typeHandler", null);
        setBooleanField(term87402, term87402.getClass(), "_asStatic", false);
        setElement(term87398, 3, term87402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term86699;
        args[1] = term86700;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term87390));
        assertTrue(recursiveEquals(term86699, term87397));
        assertTrue(recursiveEquals(term86700, term87398));
    }

};


