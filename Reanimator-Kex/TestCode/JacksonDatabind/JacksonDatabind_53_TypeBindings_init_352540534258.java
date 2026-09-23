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

public class TypeBindings_init_352540534258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83930;
     Object term83931;
     Object term85127;
     Object term85134;
     Object term85135;

    public TypeBindings_init_352540534258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term84096 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term84096, term84096.getClass(), "_names", null);
        setField(term84096, term84096.getClass(), "_types", null);
        term83930 = (Object[]) newArray("java.lang.String", 4);
        term83931 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term84216 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term84320 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term84424 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term84524 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setIntField(term84216, term84216.getClass(), "_hash", 0);
        setElement(term83931, 0, term84216);
        setIntField(term84320, term84320.getClass(), "_hash", 0);
        setElement(term83931, 1, term84320);
        setIntField(term84424, term84424.getClass(), "_hash", 0);
        setElement(term83931, 2, term84424);
        setElement(term83931, 3, term84524);
        term85127 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term85128 = (Object[]) newArray("java.lang.String", 4);
        Object[] term85129 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term85130 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term85131 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term85132 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term85133 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term85127, term85127.getClass(), "_names", term85128);
        setField(term85130, term85130.getClass(), "_referencedType", null);
        setField(term85130, term85130.getClass(), "_superClass", null);
        setField(term85130, term85130.getClass(), "_superInterfaces", null);
        setField(term85130, term85130.getClass(), "_bindings", null);
        setField(term85130, term85130.getClass(), "_canonicalName", null);
        setField(term85130, term85130.getClass(), "_class", null);
        setIntField(term85130, term85130.getClass(), "_hash", 0);
        setField(term85130, term85130.getClass(), "_valueHandler", null);
        setField(term85130, term85130.getClass(), "_typeHandler", null);
        setBooleanField(term85130, term85130.getClass(), "_asStatic", false);
        setElement(term85129, 0, term85130);
        setField(term85131, term85131.getClass(), "_referencedType", null);
        setField(term85131, term85131.getClass(), "_superClass", null);
        setField(term85131, term85131.getClass(), "_superInterfaces", null);
        setField(term85131, term85131.getClass(), "_bindings", null);
        setField(term85131, term85131.getClass(), "_canonicalName", null);
        setField(term85131, term85131.getClass(), "_class", null);
        setIntField(term85131, term85131.getClass(), "_hash", 0);
        setField(term85131, term85131.getClass(), "_valueHandler", null);
        setField(term85131, term85131.getClass(), "_typeHandler", null);
        setBooleanField(term85131, term85131.getClass(), "_asStatic", false);
        setElement(term85129, 1, term85131);
        setField(term85132, term85132.getClass(), "_referencedType", null);
        setField(term85132, term85132.getClass(), "_superClass", null);
        setField(term85132, term85132.getClass(), "_superInterfaces", null);
        setField(term85132, term85132.getClass(), "_bindings", null);
        setField(term85132, term85132.getClass(), "_canonicalName", null);
        setField(term85132, term85132.getClass(), "_class", null);
        setIntField(term85132, term85132.getClass(), "_hash", 0);
        setField(term85132, term85132.getClass(), "_valueHandler", null);
        setField(term85132, term85132.getClass(), "_typeHandler", null);
        setBooleanField(term85132, term85132.getClass(), "_asStatic", false);
        setElement(term85129, 2, term85132);
        setField(term85133, term85133.getClass(), "_keyType", null);
        setField(term85133, term85133.getClass(), "_valueType", null);
        setField(term85133, term85133.getClass(), "_superClass", null);
        setField(term85133, term85133.getClass(), "_superInterfaces", null);
        setField(term85133, term85133.getClass(), "_bindings", null);
        setField(term85133, term85133.getClass(), "_canonicalName", null);
        setField(term85133, term85133.getClass(), "_class", null);
        setIntField(term85133, term85133.getClass(), "_hash", 0);
        setField(term85133, term85133.getClass(), "_valueHandler", null);
        setField(term85133, term85133.getClass(), "_typeHandler", null);
        setBooleanField(term85133, term85133.getClass(), "_asStatic", false);
        setElement(term85129, 3, term85133);
        setField(term85127, term85127.getClass(), "_types", term85129);
        setField(term85127, term85127.getClass(), "_unboundVariables", null);
        setIntField(term85127, term85127.getClass(), "_hashCode", 1);
        term85134 = (Object[]) newArray("java.lang.String", 4);
        term85135 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term85136 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term85137 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term85138 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term85139 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term85136, term85136.getClass(), "_referencedType", null);
        setField(term85136, term85136.getClass(), "_superClass", null);
        setField(term85136, term85136.getClass(), "_superInterfaces", null);
        setField(term85136, term85136.getClass(), "_bindings", null);
        setField(term85136, term85136.getClass(), "_canonicalName", null);
        setField(term85136, term85136.getClass(), "_class", null);
        setIntField(term85136, term85136.getClass(), "_hash", 0);
        setField(term85136, term85136.getClass(), "_valueHandler", null);
        setField(term85136, term85136.getClass(), "_typeHandler", null);
        setBooleanField(term85136, term85136.getClass(), "_asStatic", false);
        setElement(term85135, 0, term85136);
        setField(term85137, term85137.getClass(), "_referencedType", null);
        setField(term85137, term85137.getClass(), "_superClass", null);
        setField(term85137, term85137.getClass(), "_superInterfaces", null);
        setField(term85137, term85137.getClass(), "_bindings", null);
        setField(term85137, term85137.getClass(), "_canonicalName", null);
        setField(term85137, term85137.getClass(), "_class", null);
        setIntField(term85137, term85137.getClass(), "_hash", 0);
        setField(term85137, term85137.getClass(), "_valueHandler", null);
        setField(term85137, term85137.getClass(), "_typeHandler", null);
        setBooleanField(term85137, term85137.getClass(), "_asStatic", false);
        setElement(term85135, 1, term85137);
        setField(term85138, term85138.getClass(), "_referencedType", null);
        setField(term85138, term85138.getClass(), "_superClass", null);
        setField(term85138, term85138.getClass(), "_superInterfaces", null);
        setField(term85138, term85138.getClass(), "_bindings", null);
        setField(term85138, term85138.getClass(), "_canonicalName", null);
        setField(term85138, term85138.getClass(), "_class", null);
        setIntField(term85138, term85138.getClass(), "_hash", 0);
        setField(term85138, term85138.getClass(), "_valueHandler", null);
        setField(term85138, term85138.getClass(), "_typeHandler", null);
        setBooleanField(term85138, term85138.getClass(), "_asStatic", false);
        setElement(term85135, 2, term85138);
        setField(term85139, term85139.getClass(), "_keyType", null);
        setField(term85139, term85139.getClass(), "_valueType", null);
        setField(term85139, term85139.getClass(), "_superClass", null);
        setField(term85139, term85139.getClass(), "_superInterfaces", null);
        setField(term85139, term85139.getClass(), "_bindings", null);
        setField(term85139, term85139.getClass(), "_canonicalName", null);
        setField(term85139, term85139.getClass(), "_class", null);
        setIntField(term85139, term85139.getClass(), "_hash", 0);
        setField(term85139, term85139.getClass(), "_valueHandler", null);
        setField(term85139, term85139.getClass(), "_typeHandler", null);
        setBooleanField(term85139, term85139.getClass(), "_asStatic", false);
        setElement(term85135, 3, term85139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term83930;
        args[1] = term83931;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term85127));
        assertTrue(recursiveEquals(term83930, term85134));
        assertTrue(recursiveEquals(term83931, term85135));
    }

};


