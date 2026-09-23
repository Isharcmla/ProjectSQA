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
import java.lang.Object;

public class ObjectIdValueProperty_init_189141968752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26626;
     Object term37319;
     Object term37327;

    public ObjectIdValueProperty_init_189141968752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26408 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term26508 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term26508, term26508.getClass(), "_required", null);
        setField(term26508, term26508.getClass(), "_description", null);
        setField(term26508, term26508.getClass(), "_index", null);
        setField(term26508, term26508.getClass(), "_defaultValue", null);
        setField(term26508, term26508.getClass(), "_mergeInfo", null);
        setField(term26508, term26508.getClass(), "_valueNulls", null);
        setField(term26508, term26508.getClass(), "_contentNulls", null);
        setField(term26408, term26408.getClass(), "_metadata", term26508);
        setIntField(term26408, term26408.getClass(), "_propertyIndex", 0);
        term26626 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term26718 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term26862 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term26994 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer"));
        setField(term26718, term26718.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term26626, term26626.getClass(), "propertyName", term26718);
        setField(term26626, term26626.getClass(), "_idType", term26862);
        setField(term26626, term26626.getClass(), "_deserializer", term26994);
        term37319 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term37320 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term37321 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term37322 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term37325 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer"));
        Object term37326 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term37321, term37321.getClass(), "_elementType", null);
        setField(term37321, term37321.getClass(), "_superClass", null);
        setField(term37321, term37321.getClass(), "_superInterfaces", null);
        setField(term37321, term37321.getClass(), "_bindings", null);
        setField(term37321, term37321.getClass(), "_canonicalName", null);
        setField(term37321, term37321.getClass(), "_class", null);
        setIntField(term37321, term37321.getClass(), "_hash", 0);
        setField(term37321, term37321.getClass(), "_valueHandler", null);
        setField(term37321, term37321.getClass(), "_typeHandler", null);
        setBooleanField(term37321, term37321.getClass(), "_asStatic", false);
        setField(term37320, term37320.getClass(), "_idType", term37321);
        setField(term37322, term37322.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term37322, term37322.getClass(), "_namespace", null);
        setField(term37322, term37322.getClass(), "_encodedSimple", null);
        setField(term37320, term37320.getClass(), "propertyName", term37322);
        setField(term37320, term37320.getClass(), "generator", null);
        setField(term37320, term37320.getClass(), "resolver", null);
        setField(term37325, term37325.getClass(), "_valueClass", null);
        setField(term37320, term37320.getClass(), "_deserializer", term37325);
        setField(term37320, term37320.getClass(), "idProperty", null);
        setField(term37319, term37319.getClass(), "_objectIdReader", term37320);
        setField(term37319, term37319.getClass(), "_propName", term37322);
        setField(term37319, term37319.getClass(), "_type", term37321);
        setField(term37319, term37319.getClass(), "_wrapperName", null);
        setField(term37319, term37319.getClass(), "_contextAnnotations", null);
        setField(term37319, term37319.getClass(), "_valueDeserializer", term37325);
        setField(term37319, term37319.getClass(), "_valueTypeDeserializer", null);
        setField(term37319, term37319.getClass(), "_nullProvider", term37325);
        setField(term37319, term37319.getClass(), "_managedReferenceName", null);
        setField(term37319, term37319.getClass(), "_objectIdInfo", null);
        setField(term37319, term37319.getClass(), "_viewMatcher", null);
        setIntField(term37319, term37319.getClass(), "_propertyIndex", -1);
        setField(term37326, term37326.getClass(), "_required", null);
        setField(term37326, term37326.getClass(), "_description", null);
        setField(term37326, term37326.getClass(), "_index", null);
        setField(term37326, term37326.getClass(), "_defaultValue", null);
        setField(term37326, term37326.getClass(), "_mergeInfo", null);
        setField(term37326, term37326.getClass(), "_valueNulls", null);
        setField(term37326, term37326.getClass(), "_contentNulls", null);
        setField(term37319, term37319.getClass(), "_metadata", term37326);
        setField(term37319, term37319.getClass(), "_propertyFormat", null);
        setField(term37319, term37319.getClass(), "_aliases", null);
        term37327 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term37328 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term37329 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term37332 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer"));
        setField(term37328, term37328.getClass(), "_elementType", null);
        setField(term37328, term37328.getClass(), "_superClass", null);
        setField(term37328, term37328.getClass(), "_superInterfaces", null);
        setField(term37328, term37328.getClass(), "_bindings", null);
        setField(term37328, term37328.getClass(), "_canonicalName", null);
        setField(term37328, term37328.getClass(), "_class", null);
        setIntField(term37328, term37328.getClass(), "_hash", 0);
        setField(term37328, term37328.getClass(), "_valueHandler", null);
        setField(term37328, term37328.getClass(), "_typeHandler", null);
        setBooleanField(term37328, term37328.getClass(), "_asStatic", false);
        setField(term37327, term37327.getClass(), "_idType", term37328);
        setField(term37329, term37329.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term37329, term37329.getClass(), "_namespace", null);
        setField(term37329, term37329.getClass(), "_encodedSimple", null);
        setField(term37327, term37327.getClass(), "propertyName", term37329);
        setField(term37327, term37327.getClass(), "generator", null);
        setField(term37327, term37327.getClass(), "resolver", null);
        setField(term37332, term37332.getClass(), "_valueClass", null);
        setField(term37327, term37327.getClass(), "_deserializer", term37332);
        setField(term37327, term37327.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term26626;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term37319));
        assertTrue(recursiveEquals(term26626, term37327));
    }

};


