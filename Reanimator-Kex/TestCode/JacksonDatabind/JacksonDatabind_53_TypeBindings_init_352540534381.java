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

public class TypeBindings_init_352540534381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135623;
     Object term135624;
     Object term136125;
     Object term136131;
     Object term136132;

    public TypeBindings_init_352540534381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term135780 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term135628 = (Object[]) newArray("java.lang.String", 0);
        setField(term135780, term135780.getClass(), "_names", term135628);
        setField(term135780, term135780.getClass(), "_types", null);
        term135623 = (Object[]) newArray("java.lang.String", 3);
        term135624 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term135886 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term135990 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term136090 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setIntField(term135886, term135886.getClass(), "_hash", 0);
        setElement(term135624, 0, term135886);
        setIntField(term135990, term135990.getClass(), "_hash", 0);
        setElement(term135624, 1, term135990);
        setElement(term135624, 2, term136090);
        term136125 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term136126 = (Object[]) newArray("java.lang.String", 3);
        Object[] term136127 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term136128 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term136129 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term136130 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term136125, term136125.getClass(), "_names", term136126);
        setField(term136128, term136128.getClass(), "_elementType", null);
        setField(term136128, term136128.getClass(), "_superClass", null);
        setField(term136128, term136128.getClass(), "_superInterfaces", null);
        setField(term136128, term136128.getClass(), "_bindings", null);
        setField(term136128, term136128.getClass(), "_canonicalName", null);
        setField(term136128, term136128.getClass(), "_class", null);
        setIntField(term136128, term136128.getClass(), "_hash", 0);
        setField(term136128, term136128.getClass(), "_valueHandler", null);
        setField(term136128, term136128.getClass(), "_typeHandler", null);
        setBooleanField(term136128, term136128.getClass(), "_asStatic", false);
        setElement(term136127, 0, term136128);
        setField(term136129, term136129.getClass(), "_referencedType", null);
        setField(term136129, term136129.getClass(), "_superClass", null);
        setField(term136129, term136129.getClass(), "_superInterfaces", null);
        setField(term136129, term136129.getClass(), "_bindings", null);
        setField(term136129, term136129.getClass(), "_canonicalName", null);
        setField(term136129, term136129.getClass(), "_class", null);
        setIntField(term136129, term136129.getClass(), "_hash", 0);
        setField(term136129, term136129.getClass(), "_valueHandler", null);
        setField(term136129, term136129.getClass(), "_typeHandler", null);
        setBooleanField(term136129, term136129.getClass(), "_asStatic", false);
        setElement(term136127, 1, term136129);
        setField(term136130, term136130.getClass(), "_keyType", null);
        setField(term136130, term136130.getClass(), "_valueType", null);
        setField(term136130, term136130.getClass(), "_superClass", null);
        setField(term136130, term136130.getClass(), "_superInterfaces", null);
        setField(term136130, term136130.getClass(), "_bindings", null);
        setField(term136130, term136130.getClass(), "_canonicalName", null);
        setField(term136130, term136130.getClass(), "_class", null);
        setIntField(term136130, term136130.getClass(), "_hash", 0);
        setField(term136130, term136130.getClass(), "_valueHandler", null);
        setField(term136130, term136130.getClass(), "_typeHandler", null);
        setBooleanField(term136130, term136130.getClass(), "_asStatic", false);
        setElement(term136127, 2, term136130);
        setField(term136125, term136125.getClass(), "_types", term136127);
        setField(term136125, term136125.getClass(), "_unboundVariables", null);
        setIntField(term136125, term136125.getClass(), "_hashCode", 1);
        term136131 = (Object[]) newArray("java.lang.String", 3);
        term136132 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term136133 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term136134 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term136135 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term136133, term136133.getClass(), "_elementType", null);
        setField(term136133, term136133.getClass(), "_superClass", null);
        setField(term136133, term136133.getClass(), "_superInterfaces", null);
        setField(term136133, term136133.getClass(), "_bindings", null);
        setField(term136133, term136133.getClass(), "_canonicalName", null);
        setField(term136133, term136133.getClass(), "_class", null);
        setIntField(term136133, term136133.getClass(), "_hash", 0);
        setField(term136133, term136133.getClass(), "_valueHandler", null);
        setField(term136133, term136133.getClass(), "_typeHandler", null);
        setBooleanField(term136133, term136133.getClass(), "_asStatic", false);
        setElement(term136132, 0, term136133);
        setField(term136134, term136134.getClass(), "_referencedType", null);
        setField(term136134, term136134.getClass(), "_superClass", null);
        setField(term136134, term136134.getClass(), "_superInterfaces", null);
        setField(term136134, term136134.getClass(), "_bindings", null);
        setField(term136134, term136134.getClass(), "_canonicalName", null);
        setField(term136134, term136134.getClass(), "_class", null);
        setIntField(term136134, term136134.getClass(), "_hash", 0);
        setField(term136134, term136134.getClass(), "_valueHandler", null);
        setField(term136134, term136134.getClass(), "_typeHandler", null);
        setBooleanField(term136134, term136134.getClass(), "_asStatic", false);
        setElement(term136132, 1, term136134);
        setField(term136135, term136135.getClass(), "_keyType", null);
        setField(term136135, term136135.getClass(), "_valueType", null);
        setField(term136135, term136135.getClass(), "_superClass", null);
        setField(term136135, term136135.getClass(), "_superInterfaces", null);
        setField(term136135, term136135.getClass(), "_bindings", null);
        setField(term136135, term136135.getClass(), "_canonicalName", null);
        setField(term136135, term136135.getClass(), "_class", null);
        setIntField(term136135, term136135.getClass(), "_hash", 0);
        setField(term136135, term136135.getClass(), "_valueHandler", null);
        setField(term136135, term136135.getClass(), "_typeHandler", null);
        setBooleanField(term136135, term136135.getClass(), "_asStatic", false);
        setElement(term136132, 2, term136135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term135623;
        args[1] = term135624;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term136125));
        assertTrue(recursiveEquals(term135623, term136131));
        assertTrue(recursiveEquals(term135624, term136132));
    }

};


