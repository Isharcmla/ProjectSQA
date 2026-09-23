package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class JavaUtilCollectionsDeserializers_converter_180689703492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term508033;
     Object term508573;
     Object term510063;
     Object term510069;
     Object term510060;

    public JavaUtilCollectionsDeserializers_converter_180689703492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term508069 = Class.forName((String) "com.fasterxml.jackson.databind.ser.ContainerSerializer");
        Class<? extends Object> term508197 = Class.forName((String) "java.util.stream.Streams$IntStreamBuilderImpl");
        Class<? extends Object> term508325 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.UUIDDeserializer");
        term508033 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term508161 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term508289 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term508431 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term508537 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term508033, term508033.getClass(), "_class", term508069);
        setField(term508161, term508161.getClass(), "_class", term508197);
        setField(term508289, term508289.getClass(), "_class", term508325);
        setField(term508431, term508431.getClass(), "_class", null);
        setField(term508431, term508431.getClass(), "_superClass", term508537);
        setField(term508289, term508289.getClass(), "_superClass", term508431);
        setField(term508161, term508161.getClass(), "_superClass", term508289);
        setField(term508033, term508033.getClass(), "_superClass", term508161);
        term508573 = Class.forName((String) "java.nio.file.ClosedFileSystemException");
        term510063 = Class.forName((String) "com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException");
        Class<? extends Object> term510074 = Class.forName((String) "java.nio.file.Files");
        Class<? extends Object> term510078 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        Class<? extends Object> term510083 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer");
        term510069 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term510070 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term510071 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term510072 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term510073 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term510069, term510069.getClass(), "_keyType", null);
        setField(term510069, term510069.getClass(), "_valueType", null);
        setField(term510070, term510070.getClass(), "_keyType", null);
        setField(term510070, term510070.getClass(), "_valueType", null);
        setField(term510071, term510071.getClass(), "_keyType", null);
        setField(term510071, term510071.getClass(), "_valueType", null);
        setField(term510072, term510072.getClass(), "_elementType", null);
        setField(term510073, term510073.getClass(), "_elementType", null);
        setField(term510073, term510073.getClass(), "_superClass", null);
        setField(term510073, term510073.getClass(), "_superInterfaces", null);
        setField(term510073, term510073.getClass(), "_bindings", null);
        setField(term510073, term510073.getClass(), "_canonicalName", null);
        setField(term510073, term510073.getClass(), "_class", null);
        setIntField(term510073, term510073.getClass(), "_hash", 0);
        setField(term510073, term510073.getClass(), "_valueHandler", null);
        setField(term510073, term510073.getClass(), "_typeHandler", null);
        setBooleanField(term510073, term510073.getClass(), "_asStatic", false);
        setField(term510072, term510072.getClass(), "_superClass", term510073);
        setField(term510072, term510072.getClass(), "_superInterfaces", null);
        setField(term510072, term510072.getClass(), "_bindings", null);
        setField(term510072, term510072.getClass(), "_canonicalName", null);
        setField(term510072, term510072.getClass(), "_class", null);
        setIntField(term510072, term510072.getClass(), "_hash", 0);
        setField(term510072, term510072.getClass(), "_valueHandler", null);
        setField(term510072, term510072.getClass(), "_typeHandler", null);
        setBooleanField(term510072, term510072.getClass(), "_asStatic", false);
        setField(term510071, term510071.getClass(), "_superClass", term510072);
        setField(term510071, term510071.getClass(), "_superInterfaces", null);
        setField(term510071, term510071.getClass(), "_bindings", null);
        setField(term510071, term510071.getClass(), "_canonicalName", null);
        setField(term510071, term510071.getClass(), "_class", term510074);
        setIntField(term510071, term510071.getClass(), "_hash", 0);
        setField(term510071, term510071.getClass(), "_valueHandler", null);
        setField(term510071, term510071.getClass(), "_typeHandler", null);
        setBooleanField(term510071, term510071.getClass(), "_asStatic", false);
        setField(term510070, term510070.getClass(), "_superClass", term510071);
        setField(term510070, term510070.getClass(), "_superInterfaces", null);
        setField(term510070, term510070.getClass(), "_bindings", null);
        setField(term510070, term510070.getClass(), "_canonicalName", null);
        setField(term510070, term510070.getClass(), "_class", term510078);
        setIntField(term510070, term510070.getClass(), "_hash", 0);
        setField(term510070, term510070.getClass(), "_valueHandler", null);
        setField(term510070, term510070.getClass(), "_typeHandler", null);
        setBooleanField(term510070, term510070.getClass(), "_asStatic", false);
        setField(term510069, term510069.getClass(), "_superClass", term510070);
        setField(term510069, term510069.getClass(), "_superInterfaces", null);
        setField(term510069, term510069.getClass(), "_bindings", null);
        setField(term510069, term510069.getClass(), "_canonicalName", null);
        setField(term510069, term510069.getClass(), "_class", term510083);
        setIntField(term510069, term510069.getClass(), "_hash", 0);
        setField(term510069, term510069.getClass(), "_valueHandler", null);
        setField(term510069, term510069.getClass(), "_typeHandler", null);
        setBooleanField(term510069, term510069.getClass(), "_asStatic", false);
        term510060 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term510060, term510060.getClass(), "_inputType", null);
        setIntField(term510060, term510060.getClass(), "_kind", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = term508033;
        args[2] = term508573;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term508033, term510069));
        assertTrue(recursiveEquals(term508573, 0));
        assertTrue(recursiveEquals(retValue, term510060));
    }

};


