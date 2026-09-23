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

public class ObjectIdValueProperty_init_189141968745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13133;
     Object term13583;
     Object term22161;
     Object term22169;
     Object term22175;

    public ObjectIdValueProperty_init_189141968745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13015 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term13015, term13015.getClass(), "_metadata", null);
        setIntField(term13015, term13015.getClass(), "_propertyIndex", 0);
        term13133 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term13225 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term13355 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term13483 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(term13225, term13225.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term13133, term13133.getClass(), "propertyName", term13225);
        setField(term13133, term13133.getClass(), "_idType", term13355);
        setField(term13133, term13133.getClass(), "_deserializer", term13483);
        term13583 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        term22161 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term22162 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term22163 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term22164 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term22167 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        Object term22168 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term22163, term22163.getClass(), "_keyType", null);
        setField(term22163, term22163.getClass(), "_valueType", null);
        setField(term22163, term22163.getClass(), "_superClass", null);
        setField(term22163, term22163.getClass(), "_superInterfaces", null);
        setField(term22163, term22163.getClass(), "_bindings", null);
        setField(term22163, term22163.getClass(), "_canonicalName", null);
        setField(term22163, term22163.getClass(), "_class", null);
        setIntField(term22163, term22163.getClass(), "_hash", 0);
        setField(term22163, term22163.getClass(), "_valueHandler", null);
        setField(term22163, term22163.getClass(), "_typeHandler", null);
        setBooleanField(term22163, term22163.getClass(), "_asStatic", false);
        setField(term22162, term22162.getClass(), "_idType", term22163);
        setField(term22164, term22164.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term22164, term22164.getClass(), "_namespace", null);
        setField(term22164, term22164.getClass(), "_encodedSimple", null);
        setField(term22162, term22162.getClass(), "propertyName", term22164);
        setField(term22162, term22162.getClass(), "generator", null);
        setField(term22162, term22162.getClass(), "resolver", null);
        setField(term22167, term22167.getClass(), "_message", null);
        setField(term22167, term22167.getClass(), "_valueClass", null);
        setField(term22162, term22162.getClass(), "_deserializer", term22167);
        setField(term22162, term22162.getClass(), "idProperty", null);
        setField(term22161, term22161.getClass(), "_objectIdReader", term22162);
        setField(term22161, term22161.getClass(), "_propName", term22164);
        setField(term22161, term22161.getClass(), "_type", term22163);
        setField(term22161, term22161.getClass(), "_wrapperName", null);
        setField(term22161, term22161.getClass(), "_contextAnnotations", null);
        setField(term22161, term22161.getClass(), "_valueDeserializer", term22167);
        setField(term22161, term22161.getClass(), "_valueTypeDeserializer", null);
        setField(term22161, term22161.getClass(), "_nullProvider", term22167);
        setField(term22161, term22161.getClass(), "_managedReferenceName", null);
        setField(term22161, term22161.getClass(), "_objectIdInfo", null);
        setField(term22161, term22161.getClass(), "_viewMatcher", null);
        setIntField(term22161, term22161.getClass(), "_propertyIndex", -1);
        setField(term22168, term22168.getClass(), "_required", null);
        setField(term22168, term22168.getClass(), "_description", null);
        setField(term22168, term22168.getClass(), "_index", null);
        setField(term22168, term22168.getClass(), "_defaultValue", null);
        setField(term22168, term22168.getClass(), "_mergeInfo", null);
        setField(term22168, term22168.getClass(), "_valueNulls", null);
        setField(term22168, term22168.getClass(), "_contentNulls", null);
        setField(term22161, term22161.getClass(), "_metadata", term22168);
        setField(term22161, term22161.getClass(), "_propertyFormat", null);
        setField(term22161, term22161.getClass(), "_aliases", null);
        term22169 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term22170 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term22171 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term22174 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(term22170, term22170.getClass(), "_keyType", null);
        setField(term22170, term22170.getClass(), "_valueType", null);
        setField(term22170, term22170.getClass(), "_superClass", null);
        setField(term22170, term22170.getClass(), "_superInterfaces", null);
        setField(term22170, term22170.getClass(), "_bindings", null);
        setField(term22170, term22170.getClass(), "_canonicalName", null);
        setField(term22170, term22170.getClass(), "_class", null);
        setIntField(term22170, term22170.getClass(), "_hash", 0);
        setField(term22170, term22170.getClass(), "_valueHandler", null);
        setField(term22170, term22170.getClass(), "_typeHandler", null);
        setBooleanField(term22170, term22170.getClass(), "_asStatic", false);
        setField(term22169, term22169.getClass(), "_idType", term22170);
        setField(term22171, term22171.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term22171, term22171.getClass(), "_namespace", null);
        setField(term22171, term22171.getClass(), "_encodedSimple", null);
        setField(term22169, term22169.getClass(), "propertyName", term22171);
        setField(term22169, term22169.getClass(), "generator", null);
        setField(term22169, term22169.getClass(), "resolver", null);
        setField(term22174, term22174.getClass(), "_message", null);
        setField(term22174, term22174.getClass(), "_valueClass", null);
        setField(term22169, term22169.getClass(), "_deserializer", term22174);
        setField(term22169, term22169.getClass(), "idProperty", null);
        term22175 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term22175, term22175.getClass(), "_required", null);
        setField(term22175, term22175.getClass(), "_description", null);
        setField(term22175, term22175.getClass(), "_index", null);
        setField(term22175, term22175.getClass(), "_defaultValue", null);
        setField(term22175, term22175.getClass(), "_mergeInfo", null);
        setField(term22175, term22175.getClass(), "_valueNulls", null);
        setField(term22175, term22175.getClass(), "_contentNulls", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term13133;
        args[1] = term13583;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22161));
        assertTrue(recursiveEquals(term13133, term22169));
        assertTrue(recursiveEquals(term13583, term22175));
    }

};


