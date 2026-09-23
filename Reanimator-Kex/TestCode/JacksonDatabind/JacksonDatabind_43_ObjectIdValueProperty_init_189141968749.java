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

public class ObjectIdValueProperty_init_189141968749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29693;
     Object term37645;
     Object term37653;

    public ObjectIdValueProperty_init_189141968749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29475 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term29575 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term29475, term29475.getClass(), "_metadata", term29575);
        setIntField(term29475, term29475.getClass(), "_propertyIndex", 0);
        term29693 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term29785 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term29937 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term30109 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer"));
        setField(term29785, term29785.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                ");
        setField(term29693, term29693.getClass(), "propertyName", term29785);
        setField(term29693, term29693.getClass(), "_idType", term29937);
        setField(term29693, term29693.getClass(), "_deserializer", term30109);
        term37645 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term37646 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term37647 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term37648 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term37651 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer"));
        Object term37652 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term37647, term37647.getClass(), "_elementType", null);
        setField(term37647, term37647.getClass(), "_superClass", null);
        setField(term37647, term37647.getClass(), "_superInterfaces", null);
        setField(term37647, term37647.getClass(), "_bindings", null);
        setField(term37647, term37647.getClass(), "_canonicalName", null);
        setField(term37647, term37647.getClass(), "_class", null);
        setIntField(term37647, term37647.getClass(), "_hash", 0);
        setField(term37647, term37647.getClass(), "_valueHandler", null);
        setField(term37647, term37647.getClass(), "_typeHandler", null);
        setBooleanField(term37647, term37647.getClass(), "_asStatic", false);
        setField(term37646, term37646.getClass(), "_idType", term37647);
        setField(term37648, term37648.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                ");
        setField(term37648, term37648.getClass(), "_namespace", null);
        setField(term37648, term37648.getClass(), "_encodedSimple", null);
        setField(term37646, term37646.getClass(), "propertyName", term37648);
        setField(term37646, term37646.getClass(), "generator", null);
        setField(term37646, term37646.getClass(), "resolver", null);
        setField(term37651, term37651.getClass(), "_valueClass", null);
        setField(term37646, term37646.getClass(), "_deserializer", term37651);
        setField(term37646, term37646.getClass(), "idProperty", null);
        setField(term37645, term37645.getClass(), "_objectIdReader", term37646);
        setField(term37645, term37645.getClass(), "_propName", term37648);
        setField(term37645, term37645.getClass(), "_type", term37647);
        setField(term37645, term37645.getClass(), "_wrapperName", null);
        setField(term37645, term37645.getClass(), "_contextAnnotations", null);
        setField(term37645, term37645.getClass(), "_valueDeserializer", term37651);
        setField(term37645, term37645.getClass(), "_valueTypeDeserializer", null);
        setField(term37645, term37645.getClass(), "_managedReferenceName", null);
        setField(term37645, term37645.getClass(), "_objectIdInfo", null);
        setField(term37645, term37645.getClass(), "_viewMatcher", null);
        setIntField(term37645, term37645.getClass(), "_propertyIndex", -1);
        setField(term37652, term37652.getClass(), "_required", null);
        setField(term37652, term37652.getClass(), "_description", null);
        setField(term37652, term37652.getClass(), "_index", null);
        setField(term37652, term37652.getClass(), "_defaultValue", null);
        setField(term37645, term37645.getClass(), "_metadata", term37652);
        setField(term37645, term37645.getClass(), "_format", null);
        term37653 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term37654 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term37655 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term37658 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer"));
        setField(term37654, term37654.getClass(), "_elementType", null);
        setField(term37654, term37654.getClass(), "_superClass", null);
        setField(term37654, term37654.getClass(), "_superInterfaces", null);
        setField(term37654, term37654.getClass(), "_bindings", null);
        setField(term37654, term37654.getClass(), "_canonicalName", null);
        setField(term37654, term37654.getClass(), "_class", null);
        setIntField(term37654, term37654.getClass(), "_hash", 0);
        setField(term37654, term37654.getClass(), "_valueHandler", null);
        setField(term37654, term37654.getClass(), "_typeHandler", null);
        setBooleanField(term37654, term37654.getClass(), "_asStatic", false);
        setField(term37653, term37653.getClass(), "_idType", term37654);
        setField(term37655, term37655.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                ");
        setField(term37655, term37655.getClass(), "_namespace", null);
        setField(term37655, term37655.getClass(), "_encodedSimple", null);
        setField(term37653, term37653.getClass(), "propertyName", term37655);
        setField(term37653, term37653.getClass(), "generator", null);
        setField(term37653, term37653.getClass(), "resolver", null);
        setField(term37658, term37658.getClass(), "_valueClass", null);
        setField(term37653, term37653.getClass(), "_deserializer", term37658);
        setField(term37653, term37653.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term29693;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term37645));
        assertTrue(recursiveEquals(term29693, term37653));
    }

};


