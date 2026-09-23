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

public class TypeBindings_init_352540534183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60757;
     Object term60758;
     Object term61388;
     Object term61395;
     Object term61396;

    public TypeBindings_init_352540534183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term60911 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term60763 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term60911, term60911.getClass(), "_names", null);
        setField(term60911, term60911.getClass(), "_types", term60763);
        term60757 = (Object[]) newArray("java.lang.String", 4);
        term60758 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term61017 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term61121 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term61225 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term61345 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term61017, term61017.getClass(), "_hash", 0);
        setElement(term60758, 0, term61017);
        setIntField(term61121, term61121.getClass(), "_hash", 0);
        setElement(term60758, 1, term61121);
        setElement(term60758, 2, term61225);
        setElement(term60758, 3, term61345);
        term61388 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term61389 = (Object[]) newArray("java.lang.String", 4);
        Object[] term61390 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term61391 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term61392 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term61393 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term61394 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term61388, term61388.getClass(), "_names", term61389);
        setField(term61391, term61391.getClass(), "_elementType", null);
        setField(term61391, term61391.getClass(), "_superClass", null);
        setField(term61391, term61391.getClass(), "_superInterfaces", null);
        setField(term61391, term61391.getClass(), "_bindings", null);
        setField(term61391, term61391.getClass(), "_canonicalName", null);
        setField(term61391, term61391.getClass(), "_class", null);
        setIntField(term61391, term61391.getClass(), "_hash", 0);
        setField(term61391, term61391.getClass(), "_valueHandler", null);
        setField(term61391, term61391.getClass(), "_typeHandler", null);
        setBooleanField(term61391, term61391.getClass(), "_asStatic", false);
        setElement(term61390, 0, term61391);
        setField(term61392, term61392.getClass(), "_referencedType", null);
        setField(term61392, term61392.getClass(), "_superClass", null);
        setField(term61392, term61392.getClass(), "_superInterfaces", null);
        setField(term61392, term61392.getClass(), "_bindings", null);
        setField(term61392, term61392.getClass(), "_canonicalName", null);
        setField(term61392, term61392.getClass(), "_class", null);
        setIntField(term61392, term61392.getClass(), "_hash", 0);
        setField(term61392, term61392.getClass(), "_valueHandler", null);
        setField(term61392, term61392.getClass(), "_typeHandler", null);
        setBooleanField(term61392, term61392.getClass(), "_asStatic", false);
        setElement(term61390, 1, term61392);
        setField(term61393, term61393.getClass(), "_referencedType", null);
        setField(term61393, term61393.getClass(), "_superClass", null);
        setField(term61393, term61393.getClass(), "_superInterfaces", null);
        setField(term61393, term61393.getClass(), "_bindings", null);
        setField(term61393, term61393.getClass(), "_canonicalName", null);
        setField(term61393, term61393.getClass(), "_class", null);
        setIntField(term61393, term61393.getClass(), "_hash", 0);
        setField(term61393, term61393.getClass(), "_valueHandler", null);
        setField(term61393, term61393.getClass(), "_typeHandler", null);
        setBooleanField(term61393, term61393.getClass(), "_asStatic", false);
        setElement(term61390, 2, term61393);
        setField(term61394, term61394.getClass(), "_referencedType", null);
        setField(term61394, term61394.getClass(), "_superClass", null);
        setField(term61394, term61394.getClass(), "_superInterfaces", null);
        setField(term61394, term61394.getClass(), "_bindings", null);
        setField(term61394, term61394.getClass(), "_canonicalName", null);
        setField(term61394, term61394.getClass(), "_class", null);
        setIntField(term61394, term61394.getClass(), "_hash", 0);
        setField(term61394, term61394.getClass(), "_valueHandler", null);
        setField(term61394, term61394.getClass(), "_typeHandler", null);
        setBooleanField(term61394, term61394.getClass(), "_asStatic", false);
        setElement(term61390, 3, term61394);
        setField(term61388, term61388.getClass(), "_types", term61390);
        setField(term61388, term61388.getClass(), "_unboundVariables", null);
        setIntField(term61388, term61388.getClass(), "_hashCode", 1);
        term61395 = (Object[]) newArray("java.lang.String", 4);
        term61396 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term61397 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term61398 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term61399 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term61400 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term61397, term61397.getClass(), "_elementType", null);
        setField(term61397, term61397.getClass(), "_superClass", null);
        setField(term61397, term61397.getClass(), "_superInterfaces", null);
        setField(term61397, term61397.getClass(), "_bindings", null);
        setField(term61397, term61397.getClass(), "_canonicalName", null);
        setField(term61397, term61397.getClass(), "_class", null);
        setIntField(term61397, term61397.getClass(), "_hash", 0);
        setField(term61397, term61397.getClass(), "_valueHandler", null);
        setField(term61397, term61397.getClass(), "_typeHandler", null);
        setBooleanField(term61397, term61397.getClass(), "_asStatic", false);
        setElement(term61396, 0, term61397);
        setField(term61398, term61398.getClass(), "_referencedType", null);
        setField(term61398, term61398.getClass(), "_superClass", null);
        setField(term61398, term61398.getClass(), "_superInterfaces", null);
        setField(term61398, term61398.getClass(), "_bindings", null);
        setField(term61398, term61398.getClass(), "_canonicalName", null);
        setField(term61398, term61398.getClass(), "_class", null);
        setIntField(term61398, term61398.getClass(), "_hash", 0);
        setField(term61398, term61398.getClass(), "_valueHandler", null);
        setField(term61398, term61398.getClass(), "_typeHandler", null);
        setBooleanField(term61398, term61398.getClass(), "_asStatic", false);
        setElement(term61396, 1, term61398);
        setField(term61399, term61399.getClass(), "_referencedType", null);
        setField(term61399, term61399.getClass(), "_superClass", null);
        setField(term61399, term61399.getClass(), "_superInterfaces", null);
        setField(term61399, term61399.getClass(), "_bindings", null);
        setField(term61399, term61399.getClass(), "_canonicalName", null);
        setField(term61399, term61399.getClass(), "_class", null);
        setIntField(term61399, term61399.getClass(), "_hash", 0);
        setField(term61399, term61399.getClass(), "_valueHandler", null);
        setField(term61399, term61399.getClass(), "_typeHandler", null);
        setBooleanField(term61399, term61399.getClass(), "_asStatic", false);
        setElement(term61396, 2, term61399);
        setField(term61400, term61400.getClass(), "_referencedType", null);
        setField(term61400, term61400.getClass(), "_superClass", null);
        setField(term61400, term61400.getClass(), "_superInterfaces", null);
        setField(term61400, term61400.getClass(), "_bindings", null);
        setField(term61400, term61400.getClass(), "_canonicalName", null);
        setField(term61400, term61400.getClass(), "_class", null);
        setIntField(term61400, term61400.getClass(), "_hash", 0);
        setField(term61400, term61400.getClass(), "_valueHandler", null);
        setField(term61400, term61400.getClass(), "_typeHandler", null);
        setBooleanField(term61400, term61400.getClass(), "_asStatic", false);
        setElement(term61396, 3, term61400);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term60757;
        args[1] = term60758;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term61388));
        assertTrue(recursiveEquals(term60757, term61395));
        assertTrue(recursiveEquals(term60758, term61396));
    }

};


