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

public class TypeBindings_init_352540534143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46175;
     Object term46176;
     Object term46569;
     Object term46574;
     Object term46575;

    public TypeBindings_init_352540534143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46316 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term46179 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term46316, term46316.getClass(), "_names", null);
        setField(term46316, term46316.getClass(), "_types", term46179);
        term46175 = (Object[]) newArray("java.lang.String", 2);
        term46176 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term46422 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term46542 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setIntField(term46422, term46422.getClass(), "_hash", 0);
        setElement(term46176, 0, term46422);
        setElement(term46176, 1, term46542);
        term46569 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term46570 = (Object[]) newArray("java.lang.String", 2);
        Object[] term46571 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term46572 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term46573 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term46569, term46569.getClass(), "_names", term46570);
        setField(term46572, term46572.getClass(), "_elementType", null);
        setField(term46572, term46572.getClass(), "_superClass", null);
        setField(term46572, term46572.getClass(), "_superInterfaces", null);
        setField(term46572, term46572.getClass(), "_bindings", null);
        setField(term46572, term46572.getClass(), "_canonicalName", null);
        setField(term46572, term46572.getClass(), "_class", null);
        setIntField(term46572, term46572.getClass(), "_hash", 0);
        setField(term46572, term46572.getClass(), "_valueHandler", null);
        setField(term46572, term46572.getClass(), "_typeHandler", null);
        setBooleanField(term46572, term46572.getClass(), "_asStatic", false);
        setElement(term46571, 0, term46572);
        setField(term46573, term46573.getClass(), "_referencedType", null);
        setField(term46573, term46573.getClass(), "_superClass", null);
        setField(term46573, term46573.getClass(), "_superInterfaces", null);
        setField(term46573, term46573.getClass(), "_bindings", null);
        setField(term46573, term46573.getClass(), "_canonicalName", null);
        setField(term46573, term46573.getClass(), "_class", null);
        setIntField(term46573, term46573.getClass(), "_hash", 0);
        setField(term46573, term46573.getClass(), "_valueHandler", null);
        setField(term46573, term46573.getClass(), "_typeHandler", null);
        setBooleanField(term46573, term46573.getClass(), "_asStatic", false);
        setElement(term46571, 1, term46573);
        setField(term46569, term46569.getClass(), "_types", term46571);
        setField(term46569, term46569.getClass(), "_unboundVariables", null);
        setIntField(term46569, term46569.getClass(), "_hashCode", 1);
        term46574 = (Object[]) newArray("java.lang.String", 2);
        term46575 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term46576 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term46577 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term46576, term46576.getClass(), "_elementType", null);
        setField(term46576, term46576.getClass(), "_superClass", null);
        setField(term46576, term46576.getClass(), "_superInterfaces", null);
        setField(term46576, term46576.getClass(), "_bindings", null);
        setField(term46576, term46576.getClass(), "_canonicalName", null);
        setField(term46576, term46576.getClass(), "_class", null);
        setIntField(term46576, term46576.getClass(), "_hash", 0);
        setField(term46576, term46576.getClass(), "_valueHandler", null);
        setField(term46576, term46576.getClass(), "_typeHandler", null);
        setBooleanField(term46576, term46576.getClass(), "_asStatic", false);
        setElement(term46575, 0, term46576);
        setField(term46577, term46577.getClass(), "_referencedType", null);
        setField(term46577, term46577.getClass(), "_superClass", null);
        setField(term46577, term46577.getClass(), "_superInterfaces", null);
        setField(term46577, term46577.getClass(), "_bindings", null);
        setField(term46577, term46577.getClass(), "_canonicalName", null);
        setField(term46577, term46577.getClass(), "_class", null);
        setIntField(term46577, term46577.getClass(), "_hash", 0);
        setField(term46577, term46577.getClass(), "_valueHandler", null);
        setField(term46577, term46577.getClass(), "_typeHandler", null);
        setBooleanField(term46577, term46577.getClass(), "_asStatic", false);
        setElement(term46575, 1, term46577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term46175;
        args[1] = term46176;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term46569));
        assertTrue(recursiveEquals(term46175, term46574));
        assertTrue(recursiveEquals(term46176, term46575));
    }

};


