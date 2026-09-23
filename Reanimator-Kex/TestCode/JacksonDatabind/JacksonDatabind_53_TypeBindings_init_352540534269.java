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

public class TypeBindings_init_352540534269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87404;
     Object term87405;
     Object term87897;
     Object term87903;
     Object term87904;

    public TypeBindings_init_352540534269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term87555 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term87409 = (Object[]) newArray("java.lang.String", 0);
        Object[] term87410 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term87555, term87555.getClass(), "_names", term87409);
        setField(term87555, term87555.getClass(), "_types", term87410);
        term87404 = (Object[]) newArray("java.lang.String", 4);
        term87405 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term87659 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term87765 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term87857 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term87659, term87659.getClass(), "_hash", 0);
        setElement(term87405, 0, term87659);
        setIntField(term87765, term87765.getClass(), "_hash", 0);
        setElement(term87405, 1, term87765);
        setElement(term87405, 2, term87857);
        setElement(term87405, 3, term87659);
        term87897 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term87898 = (Object[]) newArray("java.lang.String", 4);
        Object[] term87899 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term87900 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term87901 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term87902 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term87897, term87897.getClass(), "_names", term87898);
        setField(term87900, term87900.getClass(), "_referencedType", null);
        setField(term87900, term87900.getClass(), "_superClass", null);
        setField(term87900, term87900.getClass(), "_superInterfaces", null);
        setField(term87900, term87900.getClass(), "_bindings", null);
        setField(term87900, term87900.getClass(), "_canonicalName", null);
        setField(term87900, term87900.getClass(), "_class", null);
        setIntField(term87900, term87900.getClass(), "_hash", 0);
        setField(term87900, term87900.getClass(), "_valueHandler", null);
        setField(term87900, term87900.getClass(), "_typeHandler", null);
        setBooleanField(term87900, term87900.getClass(), "_asStatic", false);
        setElement(term87899, 0, term87900);
        setField(term87901, term87901.getClass(), "_elementType", null);
        setField(term87901, term87901.getClass(), "_superClass", null);
        setField(term87901, term87901.getClass(), "_superInterfaces", null);
        setField(term87901, term87901.getClass(), "_bindings", null);
        setField(term87901, term87901.getClass(), "_canonicalName", null);
        setField(term87901, term87901.getClass(), "_class", null);
        setIntField(term87901, term87901.getClass(), "_hash", 0);
        setField(term87901, term87901.getClass(), "_valueHandler", null);
        setField(term87901, term87901.getClass(), "_typeHandler", null);
        setBooleanField(term87901, term87901.getClass(), "_asStatic", false);
        setElement(term87899, 1, term87901);
        setField(term87902, term87902.getClass(), "_keyType", null);
        setField(term87902, term87902.getClass(), "_valueType", null);
        setField(term87902, term87902.getClass(), "_superClass", null);
        setField(term87902, term87902.getClass(), "_superInterfaces", null);
        setField(term87902, term87902.getClass(), "_bindings", null);
        setField(term87902, term87902.getClass(), "_canonicalName", null);
        setField(term87902, term87902.getClass(), "_class", null);
        setIntField(term87902, term87902.getClass(), "_hash", 0);
        setField(term87902, term87902.getClass(), "_valueHandler", null);
        setField(term87902, term87902.getClass(), "_typeHandler", null);
        setBooleanField(term87902, term87902.getClass(), "_asStatic", false);
        setElement(term87899, 2, term87902);
        setElement(term87899, 3, term87900);
        setField(term87897, term87897.getClass(), "_types", term87899);
        setField(term87897, term87897.getClass(), "_unboundVariables", null);
        setIntField(term87897, term87897.getClass(), "_hashCode", 1);
        term87903 = (Object[]) newArray("java.lang.String", 4);
        term87904 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term87905 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term87906 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term87907 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term87905, term87905.getClass(), "_referencedType", null);
        setField(term87905, term87905.getClass(), "_superClass", null);
        setField(term87905, term87905.getClass(), "_superInterfaces", null);
        setField(term87905, term87905.getClass(), "_bindings", null);
        setField(term87905, term87905.getClass(), "_canonicalName", null);
        setField(term87905, term87905.getClass(), "_class", null);
        setIntField(term87905, term87905.getClass(), "_hash", 0);
        setField(term87905, term87905.getClass(), "_valueHandler", null);
        setField(term87905, term87905.getClass(), "_typeHandler", null);
        setBooleanField(term87905, term87905.getClass(), "_asStatic", false);
        setElement(term87904, 0, term87905);
        setField(term87906, term87906.getClass(), "_elementType", null);
        setField(term87906, term87906.getClass(), "_superClass", null);
        setField(term87906, term87906.getClass(), "_superInterfaces", null);
        setField(term87906, term87906.getClass(), "_bindings", null);
        setField(term87906, term87906.getClass(), "_canonicalName", null);
        setField(term87906, term87906.getClass(), "_class", null);
        setIntField(term87906, term87906.getClass(), "_hash", 0);
        setField(term87906, term87906.getClass(), "_valueHandler", null);
        setField(term87906, term87906.getClass(), "_typeHandler", null);
        setBooleanField(term87906, term87906.getClass(), "_asStatic", false);
        setElement(term87904, 1, term87906);
        setField(term87907, term87907.getClass(), "_keyType", null);
        setField(term87907, term87907.getClass(), "_valueType", null);
        setField(term87907, term87907.getClass(), "_superClass", null);
        setField(term87907, term87907.getClass(), "_superInterfaces", null);
        setField(term87907, term87907.getClass(), "_bindings", null);
        setField(term87907, term87907.getClass(), "_canonicalName", null);
        setField(term87907, term87907.getClass(), "_class", null);
        setIntField(term87907, term87907.getClass(), "_hash", 0);
        setField(term87907, term87907.getClass(), "_valueHandler", null);
        setField(term87907, term87907.getClass(), "_typeHandler", null);
        setBooleanField(term87907, term87907.getClass(), "_asStatic", false);
        setElement(term87904, 2, term87907);
        setElement(term87904, 3, term87905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term87404;
        args[1] = term87405;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term87897));
        assertTrue(recursiveEquals(term87404, term87903));
        assertTrue(recursiveEquals(term87405, term87904));
    }

};


