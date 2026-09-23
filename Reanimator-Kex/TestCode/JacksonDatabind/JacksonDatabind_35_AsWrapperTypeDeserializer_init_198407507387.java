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

public class AsWrapperTypeDeserializer_init_198407507387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73610;
     Object term74056;
     Object term74092;
     Object term75037;
     Object term75052;
     Object term75059;
     Object term75063;

    public AsWrapperTypeDeserializer_init_198407507387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term73480 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term73480, term73480.getClass(), "_baseType", null);
        setField(term73480, term73480.getClass(), "_idResolver", null);
        setField(term73480, term73480.getClass(), "_typePropertyName", "");
        setBooleanField(term73480, term73480.getClass(), "_typeIdVisible", false);
        setField(term73480, term73480.getClass(), "_deserializers", null);
        term73610 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term73716 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term73812 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term73908 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term73610, term73610.getClass(), "_class", null);
        setIntField(term73716, term73716.getClass(), "_hash", 0);
        setField(term73610, term73610.getClass(), "_keyType", term73716);
        setField(term73610, term73610.getClass(), "_valueType", term73812);
        setField(term73610, term73610.getClass(), "_valueHandler", term73908);
        setField(term73610, term73610.getClass(), "_typeHandler", null);
        setBooleanField(term73610, term73610.getClass(), "_asStatic", false);
        term74056 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        term74092 = Class.forName((String) "java.lang.reflect.ParameterizedType");
        Class<? extends Object> term75044 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StringDeserializer");
        HashMap term75051 = new HashMap();
        term75037 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term75038 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        Object term75039 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term75040 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term75041 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term75042 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term75043 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term75038, term75038.getClass(), "_basePackageName", null);
        setField(term75038, term75038.getClass(), "_basePackagePrefix", null);
        setField(term75038, term75038.getClass(), "_typeFactory", null);
        setField(term75038, term75038.getClass(), "_baseType", null);
        setField(term75037, term75037.getClass(), "_idResolver", term75038);
        setField(term75040, term75040.getClass(), "_elementType", null);
        setField(term75040, term75040.getClass(), "_canonicalName", null);
        setField(term75040, term75040.getClass(), "_class", null);
        setIntField(term75040, term75040.getClass(), "_hash", 0);
        setField(term75040, term75040.getClass(), "_valueHandler", null);
        setField(term75040, term75040.getClass(), "_typeHandler", null);
        setBooleanField(term75040, term75040.getClass(), "_asStatic", false);
        setField(term75039, term75039.getClass(), "_keyType", term75040);
        setField(term75041, term75041.getClass(), "_componentType", null);
        setField(term75041, term75041.getClass(), "_emptyArray", null);
        setField(term75041, term75041.getClass(), "_canonicalName", null);
        setField(term75041, term75041.getClass(), "_class", null);
        setIntField(term75041, term75041.getClass(), "_hash", 0);
        setField(term75041, term75041.getClass(), "_valueHandler", null);
        setField(term75041, term75041.getClass(), "_typeHandler", null);
        setBooleanField(term75041, term75041.getClass(), "_asStatic", false);
        setField(term75039, term75039.getClass(), "_valueType", term75041);
        setField(term75039, term75039.getClass(), "_canonicalName", null);
        setField(term75039, term75039.getClass(), "_class", null);
        setIntField(term75039, term75039.getClass(), "_hash", 0);
        setField(term75042, term75042.getClass(), "_componentType", null);
        setField(term75042, term75042.getClass(), "_emptyArray", null);
        setField(term75042, term75042.getClass(), "_canonicalName", null);
        setField(term75042, term75042.getClass(), "_class", null);
        setIntField(term75042, term75042.getClass(), "_hash", 0);
        setField(term75042, term75042.getClass(), "_valueHandler", null);
        setField(term75042, term75042.getClass(), "_typeHandler", null);
        setBooleanField(term75042, term75042.getClass(), "_asStatic", false);
        setField(term75039, term75039.getClass(), "_valueHandler", term75042);
        setField(term75039, term75039.getClass(), "_typeHandler", null);
        setBooleanField(term75039, term75039.getClass(), "_asStatic", false);
        setField(term75037, term75037.getClass(), "_baseType", term75039);
        setField(term75037, term75037.getClass(), "_property", null);
        setField(term75043, term75043.getClass(), "_keyType", term75040);
        setField(term75043, term75043.getClass(), "_valueType", term75041);
        setField(term75043, term75043.getClass(), "_canonicalName", null);
        setField(term75043, term75043.getClass(), "_class", term75044);
        setIntField(term75043, term75043.getClass(), "_hash", -1850323139);
        setField(term75043, term75043.getClass(), "_valueHandler", term75042);
        setField(term75043, term75043.getClass(), "_typeHandler", null);
        setBooleanField(term75043, term75043.getClass(), "_asStatic", false);
        setField(term75037, term75037.getClass(), "_defaultImpl", term75043);
        setField(term75037, term75037.getClass(), "_typePropertyName", null);
        setBooleanField(term75037, term75037.getClass(), "_typeIdVisible", true);
        setField(term75037, term75037.getClass(), "_deserializers", term75051);
        setField(term75037, term75037.getClass(), "_defaultImplDeserializer", null);
        term75052 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StringDeserializer");
        term75059 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term75060 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term75061 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term75062 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term75060, term75060.getClass(), "_elementType", null);
        setField(term75060, term75060.getClass(), "_canonicalName", null);
        setField(term75060, term75060.getClass(), "_class", null);
        setIntField(term75060, term75060.getClass(), "_hash", 0);
        setField(term75060, term75060.getClass(), "_valueHandler", null);
        setField(term75060, term75060.getClass(), "_typeHandler", null);
        setBooleanField(term75060, term75060.getClass(), "_asStatic", false);
        setField(term75059, term75059.getClass(), "_keyType", term75060);
        setField(term75061, term75061.getClass(), "_componentType", null);
        setField(term75061, term75061.getClass(), "_emptyArray", null);
        setField(term75061, term75061.getClass(), "_canonicalName", null);
        setField(term75061, term75061.getClass(), "_class", null);
        setIntField(term75061, term75061.getClass(), "_hash", 0);
        setField(term75061, term75061.getClass(), "_valueHandler", null);
        setField(term75061, term75061.getClass(), "_typeHandler", null);
        setBooleanField(term75061, term75061.getClass(), "_asStatic", false);
        setField(term75059, term75059.getClass(), "_valueType", term75061);
        setField(term75059, term75059.getClass(), "_canonicalName", null);
        setField(term75059, term75059.getClass(), "_class", null);
        setIntField(term75059, term75059.getClass(), "_hash", 0);
        setField(term75062, term75062.getClass(), "_componentType", null);
        setField(term75062, term75062.getClass(), "_emptyArray", null);
        setField(term75062, term75062.getClass(), "_canonicalName", null);
        setField(term75062, term75062.getClass(), "_class", null);
        setIntField(term75062, term75062.getClass(), "_hash", 0);
        setField(term75062, term75062.getClass(), "_valueHandler", null);
        setField(term75062, term75062.getClass(), "_typeHandler", null);
        setBooleanField(term75062, term75062.getClass(), "_asStatic", false);
        setField(term75059, term75059.getClass(), "_valueHandler", term75062);
        setField(term75059, term75059.getClass(), "_typeHandler", null);
        setBooleanField(term75059, term75059.getClass(), "_asStatic", false);
        term75063 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term75063, term75063.getClass(), "_basePackageName", null);
        setField(term75063, term75063.getClass(), "_basePackagePrefix", null);
        setField(term75063, term75063.getClass(), "_typeFactory", null);
        setField(term75063, term75063.getClass(), "_baseType", null);
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
        args[0] = term73610;
        args[1] = term74056;
        args[2] = null;
        args[3] = true;
        args[4] = term74092;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term75037));
        assertTrue(recursiveEquals(term73610, term75052));
        assertTrue(recursiveEquals(term74056, term75059));
        assertTrue(recursiveEquals(term74092, true));
    }

};


