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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180952;
     Object term181224;
     Object term182163;
     Object term182167;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term182188 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term182187 = ((Class) term182188).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term182187).setAccessible(true);
        Object enum248 = ((Field) term182187).get((Object) null);
        term180952 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term180952, term180952.getClass(), "_appliesFor", enum248);
        Class<? extends Object> term181260 = Class.forName((String) "java.io.Console");
        term181224 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term181224, term181224.getClass(), "_class", term181260);
        Class<? extends Object> term182596 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term182595 = ((Class) term182596).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term182595).setAccessible(true);
        Object enum249 = ((Field) term182595).get((Object) null);
        term182163 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term182163, term182163.getClass(), "_appliesFor", enum249);
        setField(term182163, term182163.getClass(), "_idType", null);
        setField(term182163, term182163.getClass(), "_includeAs", null);
        setField(term182163, term182163.getClass(), "_typeProperty", null);
        setBooleanField(term182163, term182163.getClass(), "_typeIdVisible", false);
        setField(term182163, term182163.getClass(), "_defaultImpl", null);
        setField(term182163, term182163.getClass(), "_customIdResolver", null);
        Class<? extends Object> term182168 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StringSerializer");
        term182167 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term182167, term182167.getClass(), "_elementType", null);
        setField(term182167, term182167.getClass(), "_superClass", null);
        setField(term182167, term182167.getClass(), "_superInterfaces", null);
        setField(term182167, term182167.getClass(), "_bindings", null);
        setField(term182167, term182167.getClass(), "_canonicalName", null);
        setField(term182167, term182167.getClass(), "_class", term182168);
        setIntField(term182167, term182167.getClass(), "_hash", 0);
        setField(term182167, term182167.getClass(), "_valueHandler", null);
        setField(term182167, term182167.getClass(), "_typeHandler", null);
        setBooleanField(term182167, term182167.getClass(), "_asStatic", false);
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
        args[1] = term181224;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term180952, args);
        assertTrue(recursiveEquals(term180952, term182163));
        assertTrue(recursiveEquals(term181224, null));
    }

};


