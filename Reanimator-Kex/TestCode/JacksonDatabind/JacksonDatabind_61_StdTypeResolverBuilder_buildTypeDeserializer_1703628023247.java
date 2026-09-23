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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244815;
     Object term245073;
     Object term246127;
     Object term246131;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term246152 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term246151 = ((Class) term246152).getDeclaredField((String) "NON_FINAL");
        ((Field) term246151).setAccessible(true);
        Object enum305 = ((Field) term246151).get((Object) null);
        term244815 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term244815, term244815.getClass(), "_appliesFor", enum305);
        Class<? extends Object> term245109 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator");
        term245073 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term245073, term245073.getClass(), "_class", term245109);
        Class<? extends Object> term246683 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term246682 = ((Class) term246683).getDeclaredField((String) "NON_FINAL");
        ((Field) term246682).setAccessible(true);
        Object enum306 = ((Field) term246682).get((Object) null);
        term246127 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term246127, term246127.getClass(), "_appliesFor", enum306);
        setField(term246127, term246127.getClass(), "_idType", null);
        setField(term246127, term246127.getClass(), "_includeAs", null);
        setField(term246127, term246127.getClass(), "_typeProperty", null);
        setBooleanField(term246127, term246127.getClass(), "_typeIdVisible", false);
        setField(term246127, term246127.getClass(), "_defaultImpl", null);
        setField(term246127, term246127.getClass(), "_customIdResolver", null);
        Class<? extends Object> term246132 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        term246131 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term246131, term246131.getClass(), "_keyType", null);
        setField(term246131, term246131.getClass(), "_valueType", null);
        setField(term246131, term246131.getClass(), "_superClass", null);
        setField(term246131, term246131.getClass(), "_superInterfaces", null);
        setField(term246131, term246131.getClass(), "_bindings", null);
        setField(term246131, term246131.getClass(), "_canonicalName", null);
        setField(term246131, term246131.getClass(), "_class", term246132);
        setIntField(term246131, term246131.getClass(), "_hash", 0);
        setField(term246131, term246131.getClass(), "_valueHandler", null);
        setField(term246131, term246131.getClass(), "_typeHandler", null);
        setBooleanField(term246131, term246131.getClass(), "_asStatic", false);
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
        args[1] = term245073;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term244815, args);
        assertTrue(recursiveEquals(term244815, term246127));
        assertTrue(recursiveEquals(term245073, null));
    }

};


