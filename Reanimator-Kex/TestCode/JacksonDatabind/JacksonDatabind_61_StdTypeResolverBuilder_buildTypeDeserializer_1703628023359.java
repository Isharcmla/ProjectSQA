package com.fasterxml.jackson.databind.jsontype.impl;

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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.jsontype.impl.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386406;
     Object term386668;
     Object term387181;
     Object term387185;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term387188 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term387187 = ((Class) term387188).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term387187).setAccessible(true);
        Object enum447 = ((Field) term387187).get((Object) null);
        term386406 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term386406, term386406.getClass(), "_appliesFor", enum447);
        term386668 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term386764 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term386668, term386668.getClass(), "_referencedType", term386764);
        Class<? extends Object> term387549 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term387548 = ((Class) term387549).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term387548).setAccessible(true);
        Object enum448 = ((Field) term387548).get((Object) null);
        term387181 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term387181, term387181.getClass(), "_appliesFor", enum448);
        setField(term387181, term387181.getClass(), "_idType", null);
        setField(term387181, term387181.getClass(), "_includeAs", null);
        setField(term387181, term387181.getClass(), "_typeProperty", null);
        setBooleanField(term387181, term387181.getClass(), "_typeIdVisible", false);
        setField(term387181, term387181.getClass(), "_defaultImpl", null);
        setField(term387181, term387181.getClass(), "_customIdResolver", null);
        term387185 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term387186 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term387186, term387186.getClass(), "_componentType", null);
        setField(term387186, term387186.getClass(), "_emptyArray", null);
        setField(term387186, term387186.getClass(), "_superClass", null);
        setField(term387186, term387186.getClass(), "_superInterfaces", null);
        setField(term387186, term387186.getClass(), "_bindings", null);
        setField(term387186, term387186.getClass(), "_canonicalName", null);
        setField(term387186, term387186.getClass(), "_class", null);
        setIntField(term387186, term387186.getClass(), "_hash", 0);
        setField(term387186, term387186.getClass(), "_valueHandler", null);
        setField(term387186, term387186.getClass(), "_typeHandler", null);
        setBooleanField(term387186, term387186.getClass(), "_asStatic", false);
        setField(term387185, term387185.getClass(), "_referencedType", term387186);
        setField(term387185, term387185.getClass(), "_anchorType", null);
        setField(term387185, term387185.getClass(), "_superClass", null);
        setField(term387185, term387185.getClass(), "_superInterfaces", null);
        setField(term387185, term387185.getClass(), "_bindings", null);
        setField(term387185, term387185.getClass(), "_canonicalName", null);
        setField(term387185, term387185.getClass(), "_class", null);
        setIntField(term387185, term387185.getClass(), "_hash", 0);
        setField(term387185, term387185.getClass(), "_valueHandler", null);
        setField(term387185, term387185.getClass(), "_typeHandler", null);
        setBooleanField(term387185, term387185.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term386668;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term386406, args);
        assertTrue(recursiveEquals(term386406, term387181));
        assertTrue(recursiveEquals(term386668, null));
    }

};


