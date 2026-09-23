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

public class TypeBindings_init_352540534281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91460;
     Object term91463;
     Object term92236;
     Object term92251;
     Object term92260;

    public TypeBindings_init_352540534281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term91628 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term91468 = (Object[]) newArray("java.lang.String", 0);
        setField(term91628, term91628.getClass(), "_names", term91468);
        setField(term91628, term91628.getClass(), "_types", null);
        term91460 = (Object[]) newArray("java.lang.String", 4);
        setElement(term91460, 0, "");
        setElement(term91460, 1, "");
        setElement(term91460, 2, "");
        setElement(term91460, 3, "");
        term91463 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term91810 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term91906 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term91998 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term92112 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setIntField(term91810, term91810.getClass(), "_hash", 0);
        setElement(term91463, 0, term91810);
        setIntField(term91906, term91906.getClass(), "_hash", 0);
        setElement(term91463, 1, term91906);
        setIntField(term91998, term91998.getClass(), "_hash", 0);
        setElement(term91463, 2, term91998);
        setElement(term91463, 3, term92112);
        term92236 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term92237 = (Object[]) newArray("java.lang.String", 4);
        Object[] term92246 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term92247 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term92248 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term92249 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term92250 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setElement(term92237, 0, "");
        setElement(term92237, 1, "");
        setElement(term92237, 2, "");
        setElement(term92237, 3, "");
        setField(term92236, term92236.getClass(), "_names", term92237);
        setField(term92247, term92247.getClass(), "_elementType", null);
        setField(term92247, term92247.getClass(), "_superClass", null);
        setField(term92247, term92247.getClass(), "_superInterfaces", null);
        setField(term92247, term92247.getClass(), "_bindings", null);
        setField(term92247, term92247.getClass(), "_canonicalName", null);
        setField(term92247, term92247.getClass(), "_class", null);
        setIntField(term92247, term92247.getClass(), "_hash", 0);
        setField(term92247, term92247.getClass(), "_valueHandler", null);
        setField(term92247, term92247.getClass(), "_typeHandler", null);
        setBooleanField(term92247, term92247.getClass(), "_asStatic", false);
        setElement(term92246, 0, term92247);
        setField(term92248, term92248.getClass(), "_componentType", null);
        setField(term92248, term92248.getClass(), "_emptyArray", null);
        setField(term92248, term92248.getClass(), "_superClass", null);
        setField(term92248, term92248.getClass(), "_superInterfaces", null);
        setField(term92248, term92248.getClass(), "_bindings", null);
        setField(term92248, term92248.getClass(), "_canonicalName", null);
        setField(term92248, term92248.getClass(), "_class", null);
        setIntField(term92248, term92248.getClass(), "_hash", 0);
        setField(term92248, term92248.getClass(), "_valueHandler", null);
        setField(term92248, term92248.getClass(), "_typeHandler", null);
        setBooleanField(term92248, term92248.getClass(), "_asStatic", false);
        setElement(term92246, 1, term92248);
        setField(term92249, term92249.getClass(), "_keyType", null);
        setField(term92249, term92249.getClass(), "_valueType", null);
        setField(term92249, term92249.getClass(), "_superClass", null);
        setField(term92249, term92249.getClass(), "_superInterfaces", null);
        setField(term92249, term92249.getClass(), "_bindings", null);
        setField(term92249, term92249.getClass(), "_canonicalName", null);
        setField(term92249, term92249.getClass(), "_class", null);
        setIntField(term92249, term92249.getClass(), "_hash", 0);
        setField(term92249, term92249.getClass(), "_valueHandler", null);
        setField(term92249, term92249.getClass(), "_typeHandler", null);
        setBooleanField(term92249, term92249.getClass(), "_asStatic", false);
        setElement(term92246, 2, term92249);
        setField(term92250, term92250.getClass(), "_elementType", null);
        setField(term92250, term92250.getClass(), "_superClass", null);
        setField(term92250, term92250.getClass(), "_superInterfaces", null);
        setField(term92250, term92250.getClass(), "_bindings", null);
        setField(term92250, term92250.getClass(), "_canonicalName", null);
        setField(term92250, term92250.getClass(), "_class", null);
        setIntField(term92250, term92250.getClass(), "_hash", 0);
        setField(term92250, term92250.getClass(), "_valueHandler", null);
        setField(term92250, term92250.getClass(), "_typeHandler", null);
        setBooleanField(term92250, term92250.getClass(), "_asStatic", false);
        setElement(term92246, 3, term92250);
        setField(term92236, term92236.getClass(), "_types", term92246);
        setField(term92236, term92236.getClass(), "_unboundVariables", null);
        setIntField(term92236, term92236.getClass(), "_hashCode", 1);
        term92251 = (Object[]) newArray("java.lang.String", 4);
        setElement(term92251, 0, "");
        setElement(term92251, 1, "");
        setElement(term92251, 2, "");
        setElement(term92251, 3, "");
        term92260 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term92261 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term92262 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term92263 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term92264 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term92261, term92261.getClass(), "_elementType", null);
        setField(term92261, term92261.getClass(), "_superClass", null);
        setField(term92261, term92261.getClass(), "_superInterfaces", null);
        setField(term92261, term92261.getClass(), "_bindings", null);
        setField(term92261, term92261.getClass(), "_canonicalName", null);
        setField(term92261, term92261.getClass(), "_class", null);
        setIntField(term92261, term92261.getClass(), "_hash", 0);
        setField(term92261, term92261.getClass(), "_valueHandler", null);
        setField(term92261, term92261.getClass(), "_typeHandler", null);
        setBooleanField(term92261, term92261.getClass(), "_asStatic", false);
        setElement(term92260, 0, term92261);
        setField(term92262, term92262.getClass(), "_componentType", null);
        setField(term92262, term92262.getClass(), "_emptyArray", null);
        setField(term92262, term92262.getClass(), "_superClass", null);
        setField(term92262, term92262.getClass(), "_superInterfaces", null);
        setField(term92262, term92262.getClass(), "_bindings", null);
        setField(term92262, term92262.getClass(), "_canonicalName", null);
        setField(term92262, term92262.getClass(), "_class", null);
        setIntField(term92262, term92262.getClass(), "_hash", 0);
        setField(term92262, term92262.getClass(), "_valueHandler", null);
        setField(term92262, term92262.getClass(), "_typeHandler", null);
        setBooleanField(term92262, term92262.getClass(), "_asStatic", false);
        setElement(term92260, 1, term92262);
        setField(term92263, term92263.getClass(), "_keyType", null);
        setField(term92263, term92263.getClass(), "_valueType", null);
        setField(term92263, term92263.getClass(), "_superClass", null);
        setField(term92263, term92263.getClass(), "_superInterfaces", null);
        setField(term92263, term92263.getClass(), "_bindings", null);
        setField(term92263, term92263.getClass(), "_canonicalName", null);
        setField(term92263, term92263.getClass(), "_class", null);
        setIntField(term92263, term92263.getClass(), "_hash", 0);
        setField(term92263, term92263.getClass(), "_valueHandler", null);
        setField(term92263, term92263.getClass(), "_typeHandler", null);
        setBooleanField(term92263, term92263.getClass(), "_asStatic", false);
        setElement(term92260, 2, term92263);
        setField(term92264, term92264.getClass(), "_elementType", null);
        setField(term92264, term92264.getClass(), "_superClass", null);
        setField(term92264, term92264.getClass(), "_superInterfaces", null);
        setField(term92264, term92264.getClass(), "_bindings", null);
        setField(term92264, term92264.getClass(), "_canonicalName", null);
        setField(term92264, term92264.getClass(), "_class", null);
        setIntField(term92264, term92264.getClass(), "_hash", 0);
        setField(term92264, term92264.getClass(), "_valueHandler", null);
        setField(term92264, term92264.getClass(), "_typeHandler", null);
        setBooleanField(term92264, term92264.getClass(), "_asStatic", false);
        setElement(term92260, 3, term92264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term91460;
        args[1] = term91463;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term92236));
        assertTrue(recursiveEquals(term91460, term92251));
        assertTrue(recursiveEquals(term91463, term92260));
    }

};


