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

public class ObjectIdValueProperty_init_189141968753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28395;
     Object term28887;
     Object term41789;
     Object term41797;
     Object term41803;

    public ObjectIdValueProperty_init_189141968753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28177 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term28277 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term28177, term28177.getClass(), "_metadata", term28277);
        setIntField(term28177, term28177.getClass(), "_propertyIndex", 0);
        term28395 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term28487 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term28617 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term28787 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer"));
        setField(term28487, term28487.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term28395, term28395.getClass(), "propertyName", term28487);
        setField(term28395, term28395.getClass(), "_idType", term28617);
        setField(term28395, term28395.getClass(), "_deserializer", term28787);
        term28887 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        term41789 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term41790 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term41791 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term41792 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term41795 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer"));
        Object term41796 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term41791, term41791.getClass(), "_keyType", null);
        setField(term41791, term41791.getClass(), "_valueType", null);
        setField(term41791, term41791.getClass(), "_superClass", null);
        setField(term41791, term41791.getClass(), "_superInterfaces", null);
        setField(term41791, term41791.getClass(), "_bindings", null);
        setField(term41791, term41791.getClass(), "_canonicalName", null);
        setField(term41791, term41791.getClass(), "_class", null);
        setIntField(term41791, term41791.getClass(), "_hash", 0);
        setField(term41791, term41791.getClass(), "_valueHandler", null);
        setField(term41791, term41791.getClass(), "_typeHandler", null);
        setBooleanField(term41791, term41791.getClass(), "_asStatic", false);
        setField(term41790, term41790.getClass(), "_idType", term41791);
        setField(term41792, term41792.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term41792, term41792.getClass(), "_namespace", null);
        setField(term41792, term41792.getClass(), "_encodedSimple", null);
        setField(term41790, term41790.getClass(), "propertyName", term41792);
        setField(term41790, term41790.getClass(), "generator", null);
        setField(term41790, term41790.getClass(), "resolver", null);
        setField(term41795, term41795.getClass(), "_nullValue", null);
        setField(term41795, term41795.getClass(), "_emptyValue", null);
        setBooleanField(term41795, term41795.getClass(), "_primitive", false);
        setField(term41795, term41795.getClass(), "_valueClass", null);
        setField(term41790, term41790.getClass(), "_deserializer", term41795);
        setField(term41790, term41790.getClass(), "idProperty", null);
        setField(term41789, term41789.getClass(), "_objectIdReader", term41790);
        setField(term41789, term41789.getClass(), "_propName", term41792);
        setField(term41789, term41789.getClass(), "_type", term41791);
        setField(term41789, term41789.getClass(), "_wrapperName", null);
        setField(term41789, term41789.getClass(), "_contextAnnotations", null);
        setField(term41789, term41789.getClass(), "_valueDeserializer", term41795);
        setField(term41789, term41789.getClass(), "_valueTypeDeserializer", null);
        setField(term41789, term41789.getClass(), "_nullProvider", term41795);
        setField(term41789, term41789.getClass(), "_managedReferenceName", null);
        setField(term41789, term41789.getClass(), "_objectIdInfo", null);
        setField(term41789, term41789.getClass(), "_viewMatcher", null);
        setIntField(term41789, term41789.getClass(), "_propertyIndex", -1);
        setField(term41796, term41796.getClass(), "_required", null);
        setField(term41796, term41796.getClass(), "_description", null);
        setField(term41796, term41796.getClass(), "_index", null);
        setField(term41796, term41796.getClass(), "_defaultValue", null);
        setField(term41796, term41796.getClass(), "_mergeInfo", null);
        setField(term41796, term41796.getClass(), "_valueNulls", null);
        setField(term41796, term41796.getClass(), "_contentNulls", null);
        setField(term41789, term41789.getClass(), "_metadata", term41796);
        setField(term41789, term41789.getClass(), "_propertyFormat", null);
        setField(term41789, term41789.getClass(), "_aliases", null);
        term41797 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term41798 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term41799 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term41802 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer"));
        setField(term41798, term41798.getClass(), "_keyType", null);
        setField(term41798, term41798.getClass(), "_valueType", null);
        setField(term41798, term41798.getClass(), "_superClass", null);
        setField(term41798, term41798.getClass(), "_superInterfaces", null);
        setField(term41798, term41798.getClass(), "_bindings", null);
        setField(term41798, term41798.getClass(), "_canonicalName", null);
        setField(term41798, term41798.getClass(), "_class", null);
        setIntField(term41798, term41798.getClass(), "_hash", 0);
        setField(term41798, term41798.getClass(), "_valueHandler", null);
        setField(term41798, term41798.getClass(), "_typeHandler", null);
        setBooleanField(term41798, term41798.getClass(), "_asStatic", false);
        setField(term41797, term41797.getClass(), "_idType", term41798);
        setField(term41799, term41799.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term41799, term41799.getClass(), "_namespace", null);
        setField(term41799, term41799.getClass(), "_encodedSimple", null);
        setField(term41797, term41797.getClass(), "propertyName", term41799);
        setField(term41797, term41797.getClass(), "generator", null);
        setField(term41797, term41797.getClass(), "resolver", null);
        setField(term41802, term41802.getClass(), "_nullValue", null);
        setField(term41802, term41802.getClass(), "_emptyValue", null);
        setBooleanField(term41802, term41802.getClass(), "_primitive", false);
        setField(term41802, term41802.getClass(), "_valueClass", null);
        setField(term41797, term41797.getClass(), "_deserializer", term41802);
        setField(term41797, term41797.getClass(), "idProperty", null);
        term41803 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term41803, term41803.getClass(), "_required", null);
        setField(term41803, term41803.getClass(), "_description", null);
        setField(term41803, term41803.getClass(), "_index", null);
        setField(term41803, term41803.getClass(), "_defaultValue", null);
        setField(term41803, term41803.getClass(), "_mergeInfo", null);
        setField(term41803, term41803.getClass(), "_valueNulls", null);
        setField(term41803, term41803.getClass(), "_contentNulls", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term28395;
        args[1] = term28887;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term41789));
        assertTrue(recursiveEquals(term28395, term41797));
        assertTrue(recursiveEquals(term28887, term41803));
    }

};


