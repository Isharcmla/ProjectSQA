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

public class ObjectIdValueProperty_init_189141968760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36297;
     Object term42115;
     Object term42122;

    public ObjectIdValueProperty_init_189141968760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term36179 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setIntField(term36179, term36179.getClass(), "_propertyIndex", 0);
        term36297 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term36389 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term36519 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term36685 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        setField(term36389, term36389.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term36297, term36297.getClass(), "propertyName", term36389);
        setField(term36297, term36297.getClass(), "_idType", term36519);
        setField(term36297, term36297.getClass(), "_deserializer", term36685);
        term42115 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term42116 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term42117 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term42118 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term42121 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        setField(term42117, term42117.getClass(), "_keyType", null);
        setField(term42117, term42117.getClass(), "_valueType", null);
        setField(term42117, term42117.getClass(), "_canonicalName", null);
        setField(term42117, term42117.getClass(), "_class", null);
        setIntField(term42117, term42117.getClass(), "_hash", 0);
        setField(term42117, term42117.getClass(), "_valueHandler", null);
        setField(term42117, term42117.getClass(), "_typeHandler", null);
        setBooleanField(term42117, term42117.getClass(), "_asStatic", false);
        setField(term42116, term42116.getClass(), "_idType", term42117);
        setField(term42118, term42118.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term42118, term42118.getClass(), "_namespace", null);
        setField(term42118, term42118.getClass(), "_encodedSimple", null);
        setField(term42116, term42116.getClass(), "propertyName", term42118);
        setField(term42116, term42116.getClass(), "generator", null);
        setField(term42116, term42116.getClass(), "resolver", null);
        setField(term42121, term42121.getClass(), "_valueClass", null);
        setField(term42116, term42116.getClass(), "_deserializer", term42121);
        setField(term42116, term42116.getClass(), "idProperty", null);
        setField(term42115, term42115.getClass(), "_objectIdReader", term42116);
        setField(term42115, term42115.getClass(), "_propName", term42118);
        setField(term42115, term42115.getClass(), "_type", term42117);
        setField(term42115, term42115.getClass(), "_wrapperName", null);
        setField(term42115, term42115.getClass(), "_contextAnnotations", null);
        setField(term42115, term42115.getClass(), "_valueDeserializer", term42121);
        setField(term42115, term42115.getClass(), "_valueTypeDeserializer", null);
        setField(term42115, term42115.getClass(), "_nullProvider", null);
        setField(term42115, term42115.getClass(), "_metadata", null);
        setField(term42115, term42115.getClass(), "_managedReferenceName", null);
        setField(term42115, term42115.getClass(), "_objectIdInfo", null);
        setField(term42115, term42115.getClass(), "_viewMatcher", null);
        setIntField(term42115, term42115.getClass(), "_propertyIndex", -1);
        term42122 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term42123 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term42124 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term42127 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        setField(term42123, term42123.getClass(), "_keyType", null);
        setField(term42123, term42123.getClass(), "_valueType", null);
        setField(term42123, term42123.getClass(), "_canonicalName", null);
        setField(term42123, term42123.getClass(), "_class", null);
        setIntField(term42123, term42123.getClass(), "_hash", 0);
        setField(term42123, term42123.getClass(), "_valueHandler", null);
        setField(term42123, term42123.getClass(), "_typeHandler", null);
        setBooleanField(term42123, term42123.getClass(), "_asStatic", false);
        setField(term42122, term42122.getClass(), "_idType", term42123);
        setField(term42124, term42124.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term42124, term42124.getClass(), "_namespace", null);
        setField(term42124, term42124.getClass(), "_encodedSimple", null);
        setField(term42122, term42122.getClass(), "propertyName", term42124);
        setField(term42122, term42122.getClass(), "generator", null);
        setField(term42122, term42122.getClass(), "resolver", null);
        setField(term42127, term42127.getClass(), "_valueClass", null);
        setField(term42122, term42122.getClass(), "_deserializer", term42127);
        setField(term42122, term42122.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term36297;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term42115));
        assertTrue(recursiveEquals(term36297, term42122));
    }

};


