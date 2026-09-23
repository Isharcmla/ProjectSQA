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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224270;
     Object term224532;
     Object term225037;
     Object term225041;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term225044 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term225043 = ((Class) term225044).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term225043).setAccessible(true);
        Object enum287 = ((Field) term225043).get((Object) null);
        term224270 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term224270, term224270.getClass(), "_appliesFor", enum287);
        term224532 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term224624 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term224532, term224532.getClass(), "_referencedType", term224624);
        Class<? extends Object> term225384 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term225383 = ((Class) term225384).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term225383).setAccessible(true);
        Object enum288 = ((Field) term225383).get((Object) null);
        term225037 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term225037, term225037.getClass(), "_appliesFor", enum288);
        setField(term225037, term225037.getClass(), "_idType", null);
        setField(term225037, term225037.getClass(), "_includeAs", null);
        setField(term225037, term225037.getClass(), "_typeProperty", null);
        setBooleanField(term225037, term225037.getClass(), "_typeIdVisible", false);
        setField(term225037, term225037.getClass(), "_defaultImpl", null);
        setField(term225037, term225037.getClass(), "_customIdResolver", null);
        term225041 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term225042 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term225042, term225042.getClass(), "_keyType", null);
        setField(term225042, term225042.getClass(), "_valueType", null);
        setField(term225042, term225042.getClass(), "_superClass", null);
        setField(term225042, term225042.getClass(), "_superInterfaces", null);
        setField(term225042, term225042.getClass(), "_bindings", null);
        setField(term225042, term225042.getClass(), "_canonicalName", null);
        setField(term225042, term225042.getClass(), "_class", null);
        setIntField(term225042, term225042.getClass(), "_hash", 0);
        setField(term225042, term225042.getClass(), "_valueHandler", null);
        setField(term225042, term225042.getClass(), "_typeHandler", null);
        setBooleanField(term225042, term225042.getClass(), "_asStatic", false);
        setField(term225041, term225041.getClass(), "_referencedType", term225042);
        setField(term225041, term225041.getClass(), "_anchorType", null);
        setField(term225041, term225041.getClass(), "_superClass", null);
        setField(term225041, term225041.getClass(), "_superInterfaces", null);
        setField(term225041, term225041.getClass(), "_bindings", null);
        setField(term225041, term225041.getClass(), "_canonicalName", null);
        setField(term225041, term225041.getClass(), "_class", null);
        setIntField(term225041, term225041.getClass(), "_hash", 0);
        setField(term225041, term225041.getClass(), "_valueHandler", null);
        setField(term225041, term225041.getClass(), "_typeHandler", null);
        setBooleanField(term225041, term225041.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term224532;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term224270, args);
        assertTrue(recursiveEquals(term224270, term225037));
        assertTrue(recursiveEquals(term224532, null));
    }

};


