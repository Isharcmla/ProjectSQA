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

public class ObjectIdValueProperty_init_189141968741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14786;
     Object term14984;
     Object term15011;
     Object term15018;
     Object term15020;

    public ObjectIdValueProperty_init_189141968741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14568 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term14668 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term14568, term14568.getClass(), "_metadata", term14668);
        setIntField(term14568, term14568.getClass(), "_propertyIndex", 0);
        term14786 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term14884 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term14786, term14786.getClass(), "propertyName", null);
        setField(term14786, term14786.getClass(), "_idType", term14884);
        setField(term14786, term14786.getClass(), "_deserializer", null);
        term14984 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        term15011 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term15012 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term15013 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term15014 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term15017 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term15013, term15013.getClass(), "_superClass", null);
        setField(term15013, term15013.getClass(), "_superInterfaces", null);
        setField(term15013, term15013.getClass(), "_bindings", null);
        setField(term15013, term15013.getClass(), "_canonicalName", null);
        setField(term15013, term15013.getClass(), "_class", null);
        setIntField(term15013, term15013.getClass(), "_hash", 0);
        setField(term15013, term15013.getClass(), "_valueHandler", null);
        setField(term15013, term15013.getClass(), "_typeHandler", null);
        setBooleanField(term15013, term15013.getClass(), "_asStatic", false);
        setField(term15012, term15012.getClass(), "_idType", term15013);
        setField(term15012, term15012.getClass(), "propertyName", null);
        setField(term15012, term15012.getClass(), "generator", null);
        setField(term15012, term15012.getClass(), "resolver", null);
        setField(term15012, term15012.getClass(), "_deserializer", null);
        setField(term15012, term15012.getClass(), "idProperty", null);
        setField(term15011, term15011.getClass(), "_objectIdReader", term15012);
        setField(term15014, term15014.getClass(), "_simpleName", "");
        setField(term15014, term15014.getClass(), "_namespace", null);
        setField(term15014, term15014.getClass(), "_encodedSimple", null);
        setField(term15011, term15011.getClass(), "_propName", term15014);
        setField(term15011, term15011.getClass(), "_type", term15013);
        setField(term15011, term15011.getClass(), "_wrapperName", null);
        setField(term15011, term15011.getClass(), "_contextAnnotations", null);
        setField(term15011, term15011.getClass(), "_valueDeserializer", null);
        setField(term15011, term15011.getClass(), "_valueTypeDeserializer", null);
        setField(term15011, term15011.getClass(), "_managedReferenceName", null);
        setField(term15011, term15011.getClass(), "_objectIdInfo", null);
        setField(term15011, term15011.getClass(), "_viewMatcher", null);
        setIntField(term15011, term15011.getClass(), "_propertyIndex", -1);
        setField(term15017, term15017.getClass(), "_required", null);
        setField(term15017, term15017.getClass(), "_description", null);
        setField(term15017, term15017.getClass(), "_index", null);
        setField(term15017, term15017.getClass(), "_defaultValue", null);
        setField(term15011, term15011.getClass(), "_metadata", term15017);
        setField(term15011, term15011.getClass(), "_format", null);
        term15018 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term15019 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term15019, term15019.getClass(), "_superClass", null);
        setField(term15019, term15019.getClass(), "_superInterfaces", null);
        setField(term15019, term15019.getClass(), "_bindings", null);
        setField(term15019, term15019.getClass(), "_canonicalName", null);
        setField(term15019, term15019.getClass(), "_class", null);
        setIntField(term15019, term15019.getClass(), "_hash", 0);
        setField(term15019, term15019.getClass(), "_valueHandler", null);
        setField(term15019, term15019.getClass(), "_typeHandler", null);
        setBooleanField(term15019, term15019.getClass(), "_asStatic", false);
        setField(term15018, term15018.getClass(), "_idType", term15019);
        setField(term15018, term15018.getClass(), "propertyName", null);
        setField(term15018, term15018.getClass(), "generator", null);
        setField(term15018, term15018.getClass(), "resolver", null);
        setField(term15018, term15018.getClass(), "_deserializer", null);
        setField(term15018, term15018.getClass(), "idProperty", null);
        term15020 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term15020, term15020.getClass(), "_required", null);
        setField(term15020, term15020.getClass(), "_description", null);
        setField(term15020, term15020.getClass(), "_index", null);
        setField(term15020, term15020.getClass(), "_defaultValue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term14786;
        args[1] = term14984;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15011));
        assertTrue(recursiveEquals(term14786, term15018));
        assertTrue(recursiveEquals(term14984, term15020));
    }

};


