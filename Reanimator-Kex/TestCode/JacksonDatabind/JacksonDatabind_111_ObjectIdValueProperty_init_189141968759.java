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

public class ObjectIdValueProperty_init_189141968759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46338;
     Object term46568;
     Object term55017;
     Object term55023;
     Object term55027;

    public ObjectIdValueProperty_init_189141968759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46220 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term46220, term46220.getClass(), "_metadata", null);
        setIntField(term46220, term46220.getClass(), "_propertyIndex", 0);
        term46338 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term46430 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term46430, term46430.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term46338, term46338.getClass(), "propertyName", term46430);
        setField(term46338, term46338.getClass(), "_idType", null);
        setField(term46338, term46338.getClass(), "_deserializer", null);
        term46568 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        term55017 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term55018 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term55019 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term55022 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term55018, term55018.getClass(), "_idType", null);
        setField(term55019, term55019.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term55019, term55019.getClass(), "_namespace", null);
        setField(term55019, term55019.getClass(), "_encodedSimple", null);
        setField(term55018, term55018.getClass(), "propertyName", term55019);
        setField(term55018, term55018.getClass(), "generator", null);
        setField(term55018, term55018.getClass(), "resolver", null);
        setField(term55018, term55018.getClass(), "_deserializer", null);
        setField(term55018, term55018.getClass(), "idProperty", null);
        setField(term55017, term55017.getClass(), "_objectIdReader", term55018);
        setField(term55017, term55017.getClass(), "_propName", term55019);
        setField(term55017, term55017.getClass(), "_type", null);
        setField(term55017, term55017.getClass(), "_wrapperName", null);
        setField(term55017, term55017.getClass(), "_contextAnnotations", null);
        setField(term55017, term55017.getClass(), "_valueDeserializer", null);
        setField(term55017, term55017.getClass(), "_valueTypeDeserializer", null);
        setField(term55017, term55017.getClass(), "_nullProvider", null);
        setField(term55017, term55017.getClass(), "_managedReferenceName", null);
        setField(term55017, term55017.getClass(), "_objectIdInfo", null);
        setField(term55017, term55017.getClass(), "_viewMatcher", null);
        setIntField(term55017, term55017.getClass(), "_propertyIndex", -1);
        setField(term55022, term55022.getClass(), "_required", null);
        setField(term55022, term55022.getClass(), "_description", null);
        setField(term55022, term55022.getClass(), "_index", null);
        setField(term55022, term55022.getClass(), "_defaultValue", null);
        setField(term55022, term55022.getClass(), "_mergeInfo", null);
        setField(term55022, term55022.getClass(), "_valueNulls", null);
        setField(term55022, term55022.getClass(), "_contentNulls", null);
        setField(term55017, term55017.getClass(), "_metadata", term55022);
        setField(term55017, term55017.getClass(), "_propertyFormat", null);
        setField(term55017, term55017.getClass(), "_aliases", null);
        term55023 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term55024 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term55023, term55023.getClass(), "_idType", null);
        setField(term55024, term55024.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term55024, term55024.getClass(), "_namespace", null);
        setField(term55024, term55024.getClass(), "_encodedSimple", null);
        setField(term55023, term55023.getClass(), "propertyName", term55024);
        setField(term55023, term55023.getClass(), "generator", null);
        setField(term55023, term55023.getClass(), "resolver", null);
        setField(term55023, term55023.getClass(), "_deserializer", null);
        setField(term55023, term55023.getClass(), "idProperty", null);
        term55027 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term55027, term55027.getClass(), "_required", null);
        setField(term55027, term55027.getClass(), "_description", null);
        setField(term55027, term55027.getClass(), "_index", null);
        setField(term55027, term55027.getClass(), "_defaultValue", null);
        setField(term55027, term55027.getClass(), "_mergeInfo", null);
        setField(term55027, term55027.getClass(), "_valueNulls", null);
        setField(term55027, term55027.getClass(), "_contentNulls", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term46338;
        args[1] = term46568;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term55017));
        assertTrue(recursiveEquals(term46338, term55023));
        assertTrue(recursiveEquals(term46568, term55027));
    }

};


