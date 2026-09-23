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

public class TypeBindings_init_352540534241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78110;
     Object term78111;
     Object term78622;
     Object term78628;
     Object term78629;

    public TypeBindings_init_352540534241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78271 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term78115 = (Object[]) newArray("java.lang.String", 0);
        Object[] term78116 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term78271, term78271.getClass(), "_names", term78115);
        setField(term78271, term78271.getClass(), "_types", term78116);
        term78110 = (Object[]) newArray("java.lang.String", 3);
        term78111 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term78391 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term78495 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term78587 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term78391, term78391.getClass(), "_hash", 0);
        setElement(term78111, 0, term78391);
        setIntField(term78495, term78495.getClass(), "_hash", 0);
        setElement(term78111, 1, term78495);
        setIntField(term78587, term78587.getClass(), "_hash", 0);
        setElement(term78111, 2, term78587);
        term78622 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term78623 = (Object[]) newArray("java.lang.String", 3);
        Object[] term78624 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term78625 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term78626 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term78627 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term78622, term78622.getClass(), "_names", term78623);
        setField(term78625, term78625.getClass(), "_referencedType", null);
        setField(term78625, term78625.getClass(), "_superClass", null);
        setField(term78625, term78625.getClass(), "_superInterfaces", null);
        setField(term78625, term78625.getClass(), "_bindings", null);
        setField(term78625, term78625.getClass(), "_canonicalName", null);
        setField(term78625, term78625.getClass(), "_class", null);
        setIntField(term78625, term78625.getClass(), "_hash", 0);
        setField(term78625, term78625.getClass(), "_valueHandler", null);
        setField(term78625, term78625.getClass(), "_typeHandler", null);
        setBooleanField(term78625, term78625.getClass(), "_asStatic", false);
        setElement(term78624, 0, term78625);
        setField(term78626, term78626.getClass(), "_referencedType", null);
        setField(term78626, term78626.getClass(), "_superClass", null);
        setField(term78626, term78626.getClass(), "_superInterfaces", null);
        setField(term78626, term78626.getClass(), "_bindings", null);
        setField(term78626, term78626.getClass(), "_canonicalName", null);
        setField(term78626, term78626.getClass(), "_class", null);
        setIntField(term78626, term78626.getClass(), "_hash", 0);
        setField(term78626, term78626.getClass(), "_valueHandler", null);
        setField(term78626, term78626.getClass(), "_typeHandler", null);
        setBooleanField(term78626, term78626.getClass(), "_asStatic", false);
        setElement(term78624, 1, term78626);
        setField(term78627, term78627.getClass(), "_keyType", null);
        setField(term78627, term78627.getClass(), "_valueType", null);
        setField(term78627, term78627.getClass(), "_superClass", null);
        setField(term78627, term78627.getClass(), "_superInterfaces", null);
        setField(term78627, term78627.getClass(), "_bindings", null);
        setField(term78627, term78627.getClass(), "_canonicalName", null);
        setField(term78627, term78627.getClass(), "_class", null);
        setIntField(term78627, term78627.getClass(), "_hash", 0);
        setField(term78627, term78627.getClass(), "_valueHandler", null);
        setField(term78627, term78627.getClass(), "_typeHandler", null);
        setBooleanField(term78627, term78627.getClass(), "_asStatic", false);
        setElement(term78624, 2, term78627);
        setField(term78622, term78622.getClass(), "_types", term78624);
        setField(term78622, term78622.getClass(), "_unboundVariables", null);
        setIntField(term78622, term78622.getClass(), "_hashCode", 1);
        term78628 = (Object[]) newArray("java.lang.String", 3);
        term78629 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term78630 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term78631 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term78632 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term78630, term78630.getClass(), "_referencedType", null);
        setField(term78630, term78630.getClass(), "_superClass", null);
        setField(term78630, term78630.getClass(), "_superInterfaces", null);
        setField(term78630, term78630.getClass(), "_bindings", null);
        setField(term78630, term78630.getClass(), "_canonicalName", null);
        setField(term78630, term78630.getClass(), "_class", null);
        setIntField(term78630, term78630.getClass(), "_hash", 0);
        setField(term78630, term78630.getClass(), "_valueHandler", null);
        setField(term78630, term78630.getClass(), "_typeHandler", null);
        setBooleanField(term78630, term78630.getClass(), "_asStatic", false);
        setElement(term78629, 0, term78630);
        setField(term78631, term78631.getClass(), "_referencedType", null);
        setField(term78631, term78631.getClass(), "_superClass", null);
        setField(term78631, term78631.getClass(), "_superInterfaces", null);
        setField(term78631, term78631.getClass(), "_bindings", null);
        setField(term78631, term78631.getClass(), "_canonicalName", null);
        setField(term78631, term78631.getClass(), "_class", null);
        setIntField(term78631, term78631.getClass(), "_hash", 0);
        setField(term78631, term78631.getClass(), "_valueHandler", null);
        setField(term78631, term78631.getClass(), "_typeHandler", null);
        setBooleanField(term78631, term78631.getClass(), "_asStatic", false);
        setElement(term78629, 1, term78631);
        setField(term78632, term78632.getClass(), "_keyType", null);
        setField(term78632, term78632.getClass(), "_valueType", null);
        setField(term78632, term78632.getClass(), "_superClass", null);
        setField(term78632, term78632.getClass(), "_superInterfaces", null);
        setField(term78632, term78632.getClass(), "_bindings", null);
        setField(term78632, term78632.getClass(), "_canonicalName", null);
        setField(term78632, term78632.getClass(), "_class", null);
        setIntField(term78632, term78632.getClass(), "_hash", 0);
        setField(term78632, term78632.getClass(), "_valueHandler", null);
        setField(term78632, term78632.getClass(), "_typeHandler", null);
        setBooleanField(term78632, term78632.getClass(), "_asStatic", false);
        setElement(term78629, 2, term78632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term78110;
        args[1] = term78111;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term78622));
        assertTrue(recursiveEquals(term78110, term78628));
        assertTrue(recursiveEquals(term78111, term78629));
    }

};


