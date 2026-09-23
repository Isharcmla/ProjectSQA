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

public class ObjectIdValueProperty_init_189141968747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12894;
     Object term17482;
     Object term17489;

    public ObjectIdValueProperty_init_189141968747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12776 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setIntField(term12776, term12776.getClass(), "_propertyIndex", 0);
        term12894 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term12986 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term13138 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term13302 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer"));
        setField(term12986, term12986.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term12894, term12894.getClass(), "propertyName", term12986);
        setField(term12894, term12894.getClass(), "_idType", term13138);
        setField(term12894, term12894.getClass(), "_deserializer", term13302);
        term17482 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term17483 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term17484 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term17485 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term17488 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer"));
        setField(term17484, term17484.getClass(), "_elementType", null);
        setField(term17484, term17484.getClass(), "_canonicalName", null);
        setField(term17484, term17484.getClass(), "_class", null);
        setIntField(term17484, term17484.getClass(), "_hash", 0);
        setField(term17484, term17484.getClass(), "_valueHandler", null);
        setField(term17484, term17484.getClass(), "_typeHandler", null);
        setBooleanField(term17484, term17484.getClass(), "_asStatic", false);
        setField(term17483, term17483.getClass(), "_idType", term17484);
        setField(term17485, term17485.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term17485, term17485.getClass(), "_namespace", null);
        setField(term17485, term17485.getClass(), "_encodedSimple", null);
        setField(term17483, term17483.getClass(), "propertyName", term17485);
        setField(term17483, term17483.getClass(), "generator", null);
        setField(term17483, term17483.getClass(), "resolver", null);
        setField(term17488, term17488.getClass(), "_nullValue", null);
        setField(term17488, term17488.getClass(), "_valueClass", null);
        setField(term17483, term17483.getClass(), "_deserializer", term17488);
        setField(term17483, term17483.getClass(), "idProperty", null);
        setField(term17482, term17482.getClass(), "_objectIdReader", term17483);
        setField(term17482, term17482.getClass(), "_propName", term17485);
        setField(term17482, term17482.getClass(), "_type", term17484);
        setField(term17482, term17482.getClass(), "_wrapperName", null);
        setField(term17482, term17482.getClass(), "_contextAnnotations", null);
        setField(term17482, term17482.getClass(), "_valueDeserializer", term17488);
        setField(term17482, term17482.getClass(), "_valueTypeDeserializer", null);
        setField(term17482, term17482.getClass(), "_nullProvider", null);
        setField(term17482, term17482.getClass(), "_metadata", null);
        setField(term17482, term17482.getClass(), "_managedReferenceName", null);
        setField(term17482, term17482.getClass(), "_objectIdInfo", null);
        setField(term17482, term17482.getClass(), "_viewMatcher", null);
        setIntField(term17482, term17482.getClass(), "_propertyIndex", -1);
        term17489 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term17490 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term17491 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term17494 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer"));
        setField(term17490, term17490.getClass(), "_elementType", null);
        setField(term17490, term17490.getClass(), "_canonicalName", null);
        setField(term17490, term17490.getClass(), "_class", null);
        setIntField(term17490, term17490.getClass(), "_hash", 0);
        setField(term17490, term17490.getClass(), "_valueHandler", null);
        setField(term17490, term17490.getClass(), "_typeHandler", null);
        setBooleanField(term17490, term17490.getClass(), "_asStatic", false);
        setField(term17489, term17489.getClass(), "_idType", term17490);
        setField(term17491, term17491.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term17491, term17491.getClass(), "_namespace", null);
        setField(term17491, term17491.getClass(), "_encodedSimple", null);
        setField(term17489, term17489.getClass(), "propertyName", term17491);
        setField(term17489, term17489.getClass(), "generator", null);
        setField(term17489, term17489.getClass(), "resolver", null);
        setField(term17494, term17494.getClass(), "_nullValue", null);
        setField(term17494, term17494.getClass(), "_valueClass", null);
        setField(term17489, term17489.getClass(), "_deserializer", term17494);
        setField(term17489, term17489.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term12894;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17482));
        assertTrue(recursiveEquals(term12894, term17489));
    }

};


