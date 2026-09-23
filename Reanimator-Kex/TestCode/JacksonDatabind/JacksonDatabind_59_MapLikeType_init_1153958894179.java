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
import java.lang.String;

public class MapLikeType_init_1153958894179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64624;
     Object term64730;
     Object term64822;
     Object term65731;
     Object term65756;
     Object term65757;
     Object term65758;

    public MapLikeType_init_1153958894179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64588 = Class.forName((String) "java.lang.reflect.AnnotatedElement");
        Object term64552 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term64552, term64552.getClass(), "_class", term64588);
        term64624 = Class.forName((String) "java.util.zip.InflaterInputStream");
        term64730 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term64730, term64730.getClass(), "_hash", 0);
        term64822 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term64822, term64822.getClass(), "_hash", 0);
        Class<? extends Object> term65737 = Class.forName((String) "com.fasterxml.jackson.databind.ext.CoreXMLDeserializers");
        term65731 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term65732 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term65733 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term65734 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term65735 = (Object[]) newArray("java.lang.String", 0);
        Object[] term65736 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term65732, term65732.getClass(), "_elementType", null);
        setField(term65732, term65732.getClass(), "_superClass", null);
        setField(term65732, term65732.getClass(), "_superInterfaces", null);
        setField(term65732, term65732.getClass(), "_bindings", null);
        setField(term65732, term65732.getClass(), "_canonicalName", null);
        setField(term65732, term65732.getClass(), "_class", null);
        setIntField(term65732, term65732.getClass(), "_hash", 0);
        setField(term65732, term65732.getClass(), "_valueHandler", null);
        setField(term65732, term65732.getClass(), "_typeHandler", null);
        setBooleanField(term65732, term65732.getClass(), "_asStatic", false);
        setField(term65731, term65731.getClass(), "_keyType", term65732);
        setField(term65733, term65733.getClass(), "_keyType", null);
        setField(term65733, term65733.getClass(), "_valueType", null);
        setField(term65733, term65733.getClass(), "_superClass", null);
        setField(term65733, term65733.getClass(), "_superInterfaces", null);
        setField(term65733, term65733.getClass(), "_bindings", null);
        setField(term65733, term65733.getClass(), "_canonicalName", null);
        setField(term65733, term65733.getClass(), "_class", null);
        setIntField(term65733, term65733.getClass(), "_hash", 0);
        setField(term65733, term65733.getClass(), "_valueHandler", null);
        setField(term65733, term65733.getClass(), "_typeHandler", null);
        setBooleanField(term65733, term65733.getClass(), "_asStatic", false);
        setField(term65731, term65731.getClass(), "_valueType", term65733);
        setField(term65731, term65731.getClass(), "_superClass", null);
        setField(term65731, term65731.getClass(), "_superInterfaces", null);
        setField(term65734, term65734.getClass(), "_names", term65735);
        setField(term65734, term65734.getClass(), "_types", term65736);
        setField(term65734, term65734.getClass(), "_unboundVariables", null);
        setIntField(term65734, term65734.getClass(), "_hashCode", 1);
        setField(term65731, term65731.getClass(), "_bindings", term65734);
        setField(term65731, term65731.getClass(), "_canonicalName", null);
        setField(term65731, term65731.getClass(), "_class", term65737);
        setIntField(term65731, term65731.getClass(), "_hash", 444962196);
        setField(term65731, term65731.getClass(), "_valueHandler", null);
        setField(term65731, term65731.getClass(), "_typeHandler", null);
        setBooleanField(term65731, term65731.getClass(), "_asStatic", false);
        term65756 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term65756, term65756.getClass(), "_elementType", null);
        setField(term65756, term65756.getClass(), "_superClass", null);
        setField(term65756, term65756.getClass(), "_superInterfaces", null);
        setField(term65756, term65756.getClass(), "_bindings", null);
        setField(term65756, term65756.getClass(), "_canonicalName", null);
        setField(term65756, term65756.getClass(), "_class", null);
        setIntField(term65756, term65756.getClass(), "_hash", 0);
        setField(term65756, term65756.getClass(), "_valueHandler", null);
        setField(term65756, term65756.getClass(), "_typeHandler", null);
        setBooleanField(term65756, term65756.getClass(), "_asStatic", false);
        term65757 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term65757, term65757.getClass(), "_keyType", null);
        setField(term65757, term65757.getClass(), "_valueType", null);
        setField(term65757, term65757.getClass(), "_superClass", null);
        setField(term65757, term65757.getClass(), "_superInterfaces", null);
        setField(term65757, term65757.getClass(), "_bindings", null);
        setField(term65757, term65757.getClass(), "_canonicalName", null);
        setField(term65757, term65757.getClass(), "_class", null);
        setIntField(term65757, term65757.getClass(), "_hash", 0);
        setField(term65757, term65757.getClass(), "_valueHandler", null);
        setField(term65757, term65757.getClass(), "_typeHandler", null);
        setBooleanField(term65757, term65757.getClass(), "_asStatic", false);
        term65758 = Class.forName((String) "com.fasterxml.jackson.databind.ext.CoreXMLDeserializers");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapLikeType");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term64624;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term64730;
        args[5] = term64822;
        args[6] = null;
        args[7] = null;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term65731));
        assertTrue(recursiveEquals(term64624, term65756));
        assertTrue(recursiveEquals(term64730, null));
        assertTrue(recursiveEquals(term64822, false));
    }

};


