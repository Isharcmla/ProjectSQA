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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class AsWrapperTypeDeserializer_init_198407507341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21956;
     Object term22136;
     Object term22973;
     Object term22989;
     Object term22996;

    public AsWrapperTypeDeserializer_init_198407507341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21842 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term21842, term21842.getClass(), "_baseType", null);
        setField(term21842, term21842.getClass(), "_idResolver", null);
        setField(term21842, term21842.getClass(), "_typePropertyName", null);
        setBooleanField(term21842, term21842.getClass(), "_typeIdVisible", false);
        setField(term21842, term21842.getClass(), "_deserializers", null);
        term21956 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term22062 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term21956, term21956.getClass(), "_class", null);
        setField(term21956, term21956.getClass(), "_elementType", term22062);
        setField(term21956, term21956.getClass(), "_valueHandler", null);
        setField(term21956, term21956.getClass(), "_typeHandler", "byte");
        setBooleanField(term21956, term21956.getClass(), "_asStatic", false);
        term22136 = Class.forName((String) "java.util.Spliterators$EmptySpliterator");
        Class<? extends Object> term22979 = Class.forName((String) "com.fasterxml.jackson.databind.JsonSerializer$None");
        HashMap term22988 = new HashMap();
        term22973 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term22974 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term22975 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term22978 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term22973, term22973.getClass(), "_idResolver", null);
        setField(term22975, term22975.getClass(), "_elementType", null);
        setField(term22975, term22975.getClass(), "_canonicalName", null);
        setField(term22975, term22975.getClass(), "_class", null);
        setIntField(term22975, term22975.getClass(), "_hash", 0);
        setField(term22975, term22975.getClass(), "_valueHandler", null);
        setField(term22975, term22975.getClass(), "_typeHandler", null);
        setBooleanField(term22975, term22975.getClass(), "_asStatic", false);
        setField(term22974, term22974.getClass(), "_elementType", term22975);
        setField(term22974, term22974.getClass(), "_canonicalName", null);
        setField(term22974, term22974.getClass(), "_class", null);
        setIntField(term22974, term22974.getClass(), "_hash", 0);
        setField(term22974, term22974.getClass(), "_valueHandler", null);
        setField(term22974, term22974.getClass(), "_typeHandler", "byte");
        setBooleanField(term22974, term22974.getClass(), "_asStatic", false);
        setField(term22973, term22973.getClass(), "_baseType", term22974);
        setField(term22973, term22973.getClass(), "_property", null);
        setField(term22978, term22978.getClass(), "_elementType", term22975);
        setField(term22978, term22978.getClass(), "_canonicalName", null);
        setField(term22978, term22978.getClass(), "_class", term22979);
        setIntField(term22978, term22978.getClass(), "_hash", 1734253251);
        setField(term22978, term22978.getClass(), "_valueHandler", null);
        setField(term22978, term22978.getClass(), "_typeHandler", "byte");
        setBooleanField(term22978, term22978.getClass(), "_asStatic", false);
        setField(term22973, term22973.getClass(), "_defaultImpl", term22978);
        setField(term22973, term22973.getClass(), "_typePropertyName", null);
        setBooleanField(term22973, term22973.getClass(), "_typeIdVisible", true);
        setField(term22973, term22973.getClass(), "_deserializers", term22988);
        setField(term22973, term22973.getClass(), "_defaultImplDeserializer", null);
        term22989 = Class.forName((String) "com.fasterxml.jackson.databind.JsonSerializer$None");
        term22996 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term22997 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term22997, term22997.getClass(), "_elementType", null);
        setField(term22997, term22997.getClass(), "_canonicalName", null);
        setField(term22997, term22997.getClass(), "_class", null);
        setIntField(term22997, term22997.getClass(), "_hash", 0);
        setField(term22997, term22997.getClass(), "_valueHandler", null);
        setField(term22997, term22997.getClass(), "_typeHandler", null);
        setBooleanField(term22997, term22997.getClass(), "_asStatic", false);
        setField(term22996, term22996.getClass(), "_elementType", term22997);
        setField(term22996, term22996.getClass(), "_canonicalName", null);
        setField(term22996, term22996.getClass(), "_class", null);
        setIntField(term22996, term22996.getClass(), "_hash", 0);
        setField(term22996, term22996.getClass(), "_valueHandler", null);
        setField(term22996, term22996.getClass(), "_typeHandler", "byte");
        setBooleanField(term22996, term22996.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.lang.Class");
        Object[] args = new Object[5];
        args[0] = term21956;
        args[1] = null;
        args[2] = null;
        args[3] = true;
        args[4] = term22136;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22973));
        assertTrue(recursiveEquals(term21956, term22989));
        assertTrue(recursiveEquals(term22136, true));
    }

};


