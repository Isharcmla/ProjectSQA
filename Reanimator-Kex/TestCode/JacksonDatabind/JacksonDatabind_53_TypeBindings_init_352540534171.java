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

public class TypeBindings_init_352540534171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57762;
     Object term57763;
     Object term58146;
     Object term58151;
     Object term58152;

    public TypeBindings_init_352540534171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term57907 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term57766 = (Object[]) newArray("java.lang.String", 0);
        Object[] term57767 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term57907, term57907.getClass(), "_names", term57766);
        setField(term57907, term57907.getClass(), "_types", term57767);
        term57762 = (Object[]) newArray("java.lang.String", 2);
        term57763 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term58013 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term58119 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term58013, term58013.getClass(), "_hash", 0);
        setElement(term57763, 0, term58013);
        setElement(term57763, 1, term58119);
        term58146 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term58147 = (Object[]) newArray("java.lang.String", 2);
        Object[] term58148 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term58149 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term58150 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term58146, term58146.getClass(), "_names", term58147);
        setField(term58149, term58149.getClass(), "_elementType", null);
        setField(term58149, term58149.getClass(), "_superClass", null);
        setField(term58149, term58149.getClass(), "_superInterfaces", null);
        setField(term58149, term58149.getClass(), "_bindings", null);
        setField(term58149, term58149.getClass(), "_canonicalName", null);
        setField(term58149, term58149.getClass(), "_class", null);
        setIntField(term58149, term58149.getClass(), "_hash", 0);
        setField(term58149, term58149.getClass(), "_valueHandler", null);
        setField(term58149, term58149.getClass(), "_typeHandler", null);
        setBooleanField(term58149, term58149.getClass(), "_asStatic", false);
        setElement(term58148, 0, term58149);
        setField(term58150, term58150.getClass(), "_elementType", null);
        setField(term58150, term58150.getClass(), "_superClass", null);
        setField(term58150, term58150.getClass(), "_superInterfaces", null);
        setField(term58150, term58150.getClass(), "_bindings", null);
        setField(term58150, term58150.getClass(), "_canonicalName", null);
        setField(term58150, term58150.getClass(), "_class", null);
        setIntField(term58150, term58150.getClass(), "_hash", 0);
        setField(term58150, term58150.getClass(), "_valueHandler", null);
        setField(term58150, term58150.getClass(), "_typeHandler", null);
        setBooleanField(term58150, term58150.getClass(), "_asStatic", false);
        setElement(term58148, 1, term58150);
        setField(term58146, term58146.getClass(), "_types", term58148);
        setField(term58146, term58146.getClass(), "_unboundVariables", null);
        setIntField(term58146, term58146.getClass(), "_hashCode", 1);
        term58151 = (Object[]) newArray("java.lang.String", 2);
        term58152 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term58153 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term58154 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term58153, term58153.getClass(), "_elementType", null);
        setField(term58153, term58153.getClass(), "_superClass", null);
        setField(term58153, term58153.getClass(), "_superInterfaces", null);
        setField(term58153, term58153.getClass(), "_bindings", null);
        setField(term58153, term58153.getClass(), "_canonicalName", null);
        setField(term58153, term58153.getClass(), "_class", null);
        setIntField(term58153, term58153.getClass(), "_hash", 0);
        setField(term58153, term58153.getClass(), "_valueHandler", null);
        setField(term58153, term58153.getClass(), "_typeHandler", null);
        setBooleanField(term58153, term58153.getClass(), "_asStatic", false);
        setElement(term58152, 0, term58153);
        setField(term58154, term58154.getClass(), "_elementType", null);
        setField(term58154, term58154.getClass(), "_superClass", null);
        setField(term58154, term58154.getClass(), "_superInterfaces", null);
        setField(term58154, term58154.getClass(), "_bindings", null);
        setField(term58154, term58154.getClass(), "_canonicalName", null);
        setField(term58154, term58154.getClass(), "_class", null);
        setIntField(term58154, term58154.getClass(), "_hash", 0);
        setField(term58154, term58154.getClass(), "_valueHandler", null);
        setField(term58154, term58154.getClass(), "_typeHandler", null);
        setBooleanField(term58154, term58154.getClass(), "_asStatic", false);
        setElement(term58152, 1, term58154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term57762;
        args[1] = term57763;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term58146));
        assertTrue(recursiveEquals(term57762, term58151));
        assertTrue(recursiveEquals(term57763, term58152));
    }

};


