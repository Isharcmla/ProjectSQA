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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346197;
     Object term346459;
     Object term346928;
     Object term346932;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term346935 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term346934 = ((Class) term346935).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term346934).setAccessible(true);
        Object enum400 = ((Field) term346934).get((Object) null);
        term346197 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term346197, term346197.getClass(), "_appliesFor", enum400);
        term346459 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term346555 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term346459, term346459.getClass(), "_referencedType", term346555);
        Class<? extends Object> term347275 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term347274 = ((Class) term347275).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term347274).setAccessible(true);
        Object enum401 = ((Field) term347274).get((Object) null);
        term346928 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term346928, term346928.getClass(), "_appliesFor", enum401);
        setField(term346928, term346928.getClass(), "_idType", null);
        setField(term346928, term346928.getClass(), "_includeAs", null);
        setField(term346928, term346928.getClass(), "_typeProperty", null);
        setBooleanField(term346928, term346928.getClass(), "_typeIdVisible", false);
        setField(term346928, term346928.getClass(), "_defaultImpl", null);
        setField(term346928, term346928.getClass(), "_customIdResolver", null);
        term346932 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term346933 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term346933, term346933.getClass(), "_componentType", null);
        setField(term346933, term346933.getClass(), "_emptyArray", null);
        setField(term346933, term346933.getClass(), "_superClass", null);
        setField(term346933, term346933.getClass(), "_superInterfaces", null);
        setField(term346933, term346933.getClass(), "_bindings", null);
        setField(term346933, term346933.getClass(), "_canonicalName", null);
        setField(term346933, term346933.getClass(), "_class", null);
        setIntField(term346933, term346933.getClass(), "_hash", 0);
        setField(term346933, term346933.getClass(), "_valueHandler", null);
        setField(term346933, term346933.getClass(), "_typeHandler", null);
        setBooleanField(term346933, term346933.getClass(), "_asStatic", false);
        setField(term346932, term346932.getClass(), "_referencedType", term346933);
        setField(term346932, term346932.getClass(), "_anchorType", null);
        setField(term346932, term346932.getClass(), "_superClass", null);
        setField(term346932, term346932.getClass(), "_superInterfaces", null);
        setField(term346932, term346932.getClass(), "_bindings", null);
        setField(term346932, term346932.getClass(), "_canonicalName", null);
        setField(term346932, term346932.getClass(), "_class", null);
        setIntField(term346932, term346932.getClass(), "_hash", 0);
        setField(term346932, term346932.getClass(), "_valueHandler", null);
        setField(term346932, term346932.getClass(), "_typeHandler", null);
        setBooleanField(term346932, term346932.getClass(), "_asStatic", false);
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
        args[1] = term346459;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term346197, args);
        assertTrue(recursiveEquals(term346197, term346928));
        assertTrue(recursiveEquals(term346459, null));
    }

};


