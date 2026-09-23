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

public class AsWrapperTypeDeserializer_init_198407507375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58745;
     Object term58911;
     Object term59973;
     Object term59989;
     Object term59996;

    public AsWrapperTypeDeserializer_init_198407507375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term58601 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term58601, term58601.getClass(), "_baseType", null);
        setField(term58601, term58601.getClass(), "_idResolver", null);
        setField(term58601, term58601.getClass(), "_typePropertyName", "byte");
        setBooleanField(term58601, term58601.getClass(), "_typeIdVisible", false);
        setField(term58601, term58601.getClass(), "_deserializers", null);
        term58745 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term58837 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term58745, term58745.getClass(), "_class", null);
        setField(term58745, term58745.getClass(), "_elementType", term58837);
        setField(term58745, term58745.getClass(), "_valueHandler", "byte[]");
        setField(term58745, term58745.getClass(), "_typeHandler", null);
        setBooleanField(term58745, term58745.getClass(), "_asStatic", false);
        term58911 = Class.forName((String) "java.nio.channels.spi.AsynchronousChannelProvider$ProviderHolder");
        Class<? extends Object> term59979 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$2");
        HashMap term59988 = new HashMap();
        term59973 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term59974 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term59975 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term59978 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term59973, term59973.getClass(), "_idResolver", null);
        setField(term59975, term59975.getClass(), "_keyType", null);
        setField(term59975, term59975.getClass(), "_valueType", null);
        setField(term59975, term59975.getClass(), "_canonicalName", null);
        setField(term59975, term59975.getClass(), "_class", null);
        setIntField(term59975, term59975.getClass(), "_hash", 0);
        setField(term59975, term59975.getClass(), "_valueHandler", null);
        setField(term59975, term59975.getClass(), "_typeHandler", null);
        setBooleanField(term59975, term59975.getClass(), "_asStatic", false);
        setField(term59974, term59974.getClass(), "_elementType", term59975);
        setField(term59974, term59974.getClass(), "_canonicalName", null);
        setField(term59974, term59974.getClass(), "_class", null);
        setIntField(term59974, term59974.getClass(), "_hash", 0);
        setField(term59974, term59974.getClass(), "_valueHandler", "byte[]");
        setField(term59974, term59974.getClass(), "_typeHandler", null);
        setBooleanField(term59974, term59974.getClass(), "_asStatic", false);
        setField(term59973, term59973.getClass(), "_baseType", term59974);
        setField(term59973, term59973.getClass(), "_property", null);
        setField(term59978, term59978.getClass(), "_elementType", term59975);
        setField(term59978, term59978.getClass(), "_canonicalName", null);
        setField(term59978, term59978.getClass(), "_class", term59979);
        setIntField(term59978, term59978.getClass(), "_hash", -1995753299);
        setField(term59978, term59978.getClass(), "_valueHandler", "byte[]");
        setField(term59978, term59978.getClass(), "_typeHandler", null);
        setBooleanField(term59978, term59978.getClass(), "_asStatic", false);
        setField(term59973, term59973.getClass(), "_defaultImpl", term59978);
        setField(term59973, term59973.getClass(), "_typePropertyName", null);
        setBooleanField(term59973, term59973.getClass(), "_typeIdVisible", true);
        setField(term59973, term59973.getClass(), "_deserializers", term59988);
        setField(term59973, term59973.getClass(), "_defaultImplDeserializer", null);
        term59989 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$2");
        term59996 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term59997 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term59997, term59997.getClass(), "_keyType", null);
        setField(term59997, term59997.getClass(), "_valueType", null);
        setField(term59997, term59997.getClass(), "_canonicalName", null);
        setField(term59997, term59997.getClass(), "_class", null);
        setIntField(term59997, term59997.getClass(), "_hash", 0);
        setField(term59997, term59997.getClass(), "_valueHandler", null);
        setField(term59997, term59997.getClass(), "_typeHandler", null);
        setBooleanField(term59997, term59997.getClass(), "_asStatic", false);
        setField(term59996, term59996.getClass(), "_elementType", term59997);
        setField(term59996, term59996.getClass(), "_canonicalName", null);
        setField(term59996, term59996.getClass(), "_class", null);
        setIntField(term59996, term59996.getClass(), "_hash", 0);
        setField(term59996, term59996.getClass(), "_valueHandler", "byte[]");
        setField(term59996, term59996.getClass(), "_typeHandler", null);
        setBooleanField(term59996, term59996.getClass(), "_asStatic", false);
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
        args[0] = term58745;
        args[1] = null;
        args[2] = null;
        args[3] = true;
        args[4] = term58911;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term59973));
        assertTrue(recursiveEquals(term58745, term59989));
        assertTrue(recursiveEquals(term58911, true));
    }

};


