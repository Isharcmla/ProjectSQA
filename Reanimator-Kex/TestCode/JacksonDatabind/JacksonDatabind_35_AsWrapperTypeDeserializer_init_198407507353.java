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

public class AsWrapperTypeDeserializer_init_198407507353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34559;
     Object term34869;
     Object term36060;
     Object term36081;
     Object term36088;

    public AsWrapperTypeDeserializer_init_198407507353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term34467 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term34467, term34467.getClass(), "_baseType", null);
        setField(term34467, term34467.getClass(), "_idResolver", null);
        setField(term34467, term34467.getClass(), "_typePropertyName", null);
        setBooleanField(term34467, term34467.getClass(), "_typeIdVisible", false);
        setField(term34467, term34467.getClass(), "_deserializers", null);
        term34559 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term34651 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term34757 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term34559, term34559.getClass(), "_class", null);
        setIntField(term34651, term34651.getClass(), "_hash", 0);
        setField(term34559, term34559.getClass(), "_keyType", term34651);
        setField(term34559, term34559.getClass(), "_valueType", term34757);
        setField(term34559, term34559.getClass(), "_valueHandler", "byte[]");
        setField(term34559, term34559.getClass(), "_typeHandler", "java.util.AbstractCollection");
        setBooleanField(term34559, term34559.getClass(), "_asStatic", false);
        term34869 = Class.forName((String) "module-info");
        Class<? extends Object> term36069 = Class.forName((String) "com.fasterxml.jackson.databind.util.NameTransformer$2");
        HashMap term36080 = new HashMap();
        term36060 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term36061 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term36062 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term36063 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term36068 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term36060, term36060.getClass(), "_idResolver", null);
        setField(term36062, term36062.getClass(), "_keyType", null);
        setField(term36062, term36062.getClass(), "_valueType", null);
        setField(term36062, term36062.getClass(), "_canonicalName", null);
        setField(term36062, term36062.getClass(), "_class", null);
        setIntField(term36062, term36062.getClass(), "_hash", 0);
        setField(term36062, term36062.getClass(), "_valueHandler", null);
        setField(term36062, term36062.getClass(), "_typeHandler", null);
        setBooleanField(term36062, term36062.getClass(), "_asStatic", false);
        setField(term36061, term36061.getClass(), "_keyType", term36062);
        setField(term36063, term36063.getClass(), "_elementType", null);
        setField(term36063, term36063.getClass(), "_canonicalName", null);
        setField(term36063, term36063.getClass(), "_class", null);
        setIntField(term36063, term36063.getClass(), "_hash", 0);
        setField(term36063, term36063.getClass(), "_valueHandler", null);
        setField(term36063, term36063.getClass(), "_typeHandler", null);
        setBooleanField(term36063, term36063.getClass(), "_asStatic", false);
        setField(term36061, term36061.getClass(), "_valueType", term36063);
        setField(term36061, term36061.getClass(), "_canonicalName", null);
        setField(term36061, term36061.getClass(), "_class", null);
        setIntField(term36061, term36061.getClass(), "_hash", 0);
        setField(term36061, term36061.getClass(), "_valueHandler", "byte[]");
        setField(term36061, term36061.getClass(), "_typeHandler", "java.util.AbstractCollection");
        setBooleanField(term36061, term36061.getClass(), "_asStatic", false);
        setField(term36060, term36060.getClass(), "_baseType", term36061);
        setField(term36060, term36060.getClass(), "_property", null);
        setField(term36068, term36068.getClass(), "_keyType", term36062);
        setField(term36068, term36068.getClass(), "_valueType", term36063);
        setField(term36068, term36068.getClass(), "_canonicalName", null);
        setField(term36068, term36068.getClass(), "_class", term36069);
        setIntField(term36068, term36068.getClass(), "_hash", 1246708271);
        setField(term36068, term36068.getClass(), "_valueHandler", "byte[]");
        setField(term36068, term36068.getClass(), "_typeHandler", "java.util.AbstractCollection");
        setBooleanField(term36068, term36068.getClass(), "_asStatic", false);
        setField(term36060, term36060.getClass(), "_defaultImpl", term36068);
        setField(term36060, term36060.getClass(), "_typePropertyName", null);
        setBooleanField(term36060, term36060.getClass(), "_typeIdVisible", true);
        setField(term36060, term36060.getClass(), "_deserializers", term36080);
        setField(term36060, term36060.getClass(), "_defaultImplDeserializer", null);
        term36081 = Class.forName((String) "com.fasterxml.jackson.databind.util.NameTransformer$2");
        term36088 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term36089 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term36090 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term36089, term36089.getClass(), "_keyType", null);
        setField(term36089, term36089.getClass(), "_valueType", null);
        setField(term36089, term36089.getClass(), "_canonicalName", null);
        setField(term36089, term36089.getClass(), "_class", null);
        setIntField(term36089, term36089.getClass(), "_hash", 0);
        setField(term36089, term36089.getClass(), "_valueHandler", null);
        setField(term36089, term36089.getClass(), "_typeHandler", null);
        setBooleanField(term36089, term36089.getClass(), "_asStatic", false);
        setField(term36088, term36088.getClass(), "_keyType", term36089);
        setField(term36090, term36090.getClass(), "_elementType", null);
        setField(term36090, term36090.getClass(), "_canonicalName", null);
        setField(term36090, term36090.getClass(), "_class", null);
        setIntField(term36090, term36090.getClass(), "_hash", 0);
        setField(term36090, term36090.getClass(), "_valueHandler", null);
        setField(term36090, term36090.getClass(), "_typeHandler", null);
        setBooleanField(term36090, term36090.getClass(), "_asStatic", false);
        setField(term36088, term36088.getClass(), "_valueType", term36090);
        setField(term36088, term36088.getClass(), "_canonicalName", null);
        setField(term36088, term36088.getClass(), "_class", null);
        setIntField(term36088, term36088.getClass(), "_hash", 0);
        setField(term36088, term36088.getClass(), "_valueHandler", "byte[]");
        setField(term36088, term36088.getClass(), "_typeHandler", "java.util.AbstractCollection");
        setBooleanField(term36088, term36088.getClass(), "_asStatic", false);
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
        args[0] = term34559;
        args[1] = null;
        args[2] = null;
        args[3] = true;
        args[4] = term34869;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term36060));
        assertTrue(recursiveEquals(term34559, term36081));
        assertTrue(recursiveEquals(term34869, true));
    }

};


