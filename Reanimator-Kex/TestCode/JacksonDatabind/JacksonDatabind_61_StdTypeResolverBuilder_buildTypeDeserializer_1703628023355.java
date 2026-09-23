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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380882;
     Object term381300;
     Object term382412;
     Object term382419;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term382440 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term382439 = ((Class) term382440).getDeclaredField((String) "NON_FINAL");
        ((Field) term382439).setAccessible(true);
        Object enum440 = ((Field) term382439).get((Object) null);
        Class<? extends Object> term382759 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term382758 = ((Class) term382759).getDeclaredField((String) "NONE");
        ((Field) term382758).setAccessible(true);
        Object enum441 = ((Field) term382758).get((Object) null);
        term380882 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term380882, term380882.getClass(), "_appliesFor", enum440);
        setField(term380882, term380882.getClass(), "_idType", enum441);
        Class<? extends Object> term381336 = Class.forName((String) "java.io.ExpiringCache");
        term381300 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term381300, term381300.getClass(), "_class", term381336);
        Class<? extends Object> term383093 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term383092 = ((Class) term383093).getDeclaredField((String) "NON_FINAL");
        ((Field) term383092).setAccessible(true);
        Object enum442 = ((Field) term383092).get((Object) null);
        Class<? extends Object> term383412 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term383411 = ((Class) term383412).getDeclaredField((String) "NONE");
        ((Field) term383411).setAccessible(true);
        Object enum443 = ((Field) term383411).get((Object) null);
        term382412 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term382412, term382412.getClass(), "_appliesFor", enum442);
        setField(term382412, term382412.getClass(), "_idType", enum443);
        setField(term382412, term382412.getClass(), "_includeAs", null);
        setField(term382412, term382412.getClass(), "_typeProperty", null);
        setBooleanField(term382412, term382412.getClass(), "_typeIdVisible", false);
        setField(term382412, term382412.getClass(), "_defaultImpl", null);
        setField(term382412, term382412.getClass(), "_customIdResolver", null);
        Class<? extends Object> term382420 = Class.forName((String) "kex.java.util.Arrays");
        term382419 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term382419, term382419.getClass(), "_referencedType", null);
        setField(term382419, term382419.getClass(), "_superClass", null);
        setField(term382419, term382419.getClass(), "_superInterfaces", null);
        setField(term382419, term382419.getClass(), "_bindings", null);
        setField(term382419, term382419.getClass(), "_canonicalName", null);
        setField(term382419, term382419.getClass(), "_class", term382420);
        setIntField(term382419, term382419.getClass(), "_hash", 0);
        setField(term382419, term382419.getClass(), "_valueHandler", null);
        setField(term382419, term382419.getClass(), "_typeHandler", null);
        setBooleanField(term382419, term382419.getClass(), "_asStatic", false);
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
        args[1] = term381300;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term380882, args);
        assertTrue(recursiveEquals(term380882, term382412));
        assertTrue(recursiveEquals(term381300, null));
    }

};


