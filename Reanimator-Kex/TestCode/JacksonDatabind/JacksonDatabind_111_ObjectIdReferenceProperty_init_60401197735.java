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

public class ObjectIdReferenceProperty_init_60401197735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5444;
     Object term5653;
     Object term5666;
     Object term5671;
     Object term5675;

    public ObjectIdReferenceProperty_init_60401197735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5444 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        Object term5494 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term5444, term5444.getClass(), "_metadata", term5494);
        setField(term5444, term5444.getClass(), "_propertyFormat", null);
        setIntField(term5444, term5444.getClass(), "_propertyIndex", 0);
        setField(term5444, term5444.getClass(), "_propName", null);
        setField(term5444, term5444.getClass(), "_type", null);
        setField(term5444, term5444.getClass(), "_wrapperName", null);
        setField(term5444, term5444.getClass(), "_contextAnnotations", null);
        setField(term5444, term5444.getClass(), "_valueTypeDeserializer", null);
        setField(term5444, term5444.getClass(), "_managedReferenceName", "");
        term5653 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer"));
        term5666 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        Object term5667 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer"));
        Object term5670 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term5666, term5666.getClass(), "_forward", null);
        setField(term5666, term5666.getClass(), "_propName", null);
        setField(term5666, term5666.getClass(), "_type", null);
        setField(term5666, term5666.getClass(), "_wrapperName", null);
        setField(term5666, term5666.getClass(), "_contextAnnotations", null);
        setField(term5667, term5667.getClass(), "_cause", null);
        setField(term5666, term5666.getClass(), "_valueDeserializer", term5667);
        setField(term5666, term5666.getClass(), "_valueTypeDeserializer", null);
        setField(term5666, term5666.getClass(), "_nullProvider", null);
        setField(term5666, term5666.getClass(), "_managedReferenceName", "");
        setField(term5666, term5666.getClass(), "_objectIdInfo", null);
        setField(term5666, term5666.getClass(), "_viewMatcher", null);
        setIntField(term5666, term5666.getClass(), "_propertyIndex", 0);
        setField(term5670, term5670.getClass(), "_required", null);
        setField(term5670, term5670.getClass(), "_description", null);
        setField(term5670, term5670.getClass(), "_index", null);
        setField(term5670, term5670.getClass(), "_defaultValue", null);
        setField(term5670, term5670.getClass(), "_mergeInfo", null);
        setField(term5670, term5670.getClass(), "_valueNulls", null);
        setField(term5670, term5670.getClass(), "_contentNulls", null);
        setField(term5666, term5666.getClass(), "_metadata", term5670);
        setField(term5666, term5666.getClass(), "_propertyFormat", null);
        setField(term5666, term5666.getClass(), "_aliases", null);
        term5671 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        Object term5674 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term5671, term5671.getClass(), "_forward", null);
        setField(term5671, term5671.getClass(), "_propName", null);
        setField(term5671, term5671.getClass(), "_type", null);
        setField(term5671, term5671.getClass(), "_wrapperName", null);
        setField(term5671, term5671.getClass(), "_contextAnnotations", null);
        setField(term5671, term5671.getClass(), "_valueDeserializer", null);
        setField(term5671, term5671.getClass(), "_valueTypeDeserializer", null);
        setField(term5671, term5671.getClass(), "_nullProvider", null);
        setField(term5671, term5671.getClass(), "_managedReferenceName", "");
        setField(term5671, term5671.getClass(), "_objectIdInfo", null);
        setField(term5671, term5671.getClass(), "_viewMatcher", null);
        setIntField(term5671, term5671.getClass(), "_propertyIndex", 0);
        setField(term5674, term5674.getClass(), "_required", null);
        setField(term5674, term5674.getClass(), "_description", null);
        setField(term5674, term5674.getClass(), "_index", null);
        setField(term5674, term5674.getClass(), "_defaultValue", null);
        setField(term5674, term5674.getClass(), "_mergeInfo", null);
        setField(term5674, term5674.getClass(), "_valueNulls", null);
        setField(term5674, term5674.getClass(), "_contentNulls", null);
        setField(term5671, term5671.getClass(), "_metadata", term5674);
        setField(term5671, term5671.getClass(), "_propertyFormat", null);
        setField(term5671, term5671.getClass(), "_aliases", null);
        term5675 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer"));
        setField(term5675, term5675.getClass(), "_cause", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term5444;
        args[1] = term5653;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5666));
        assertTrue(recursiveEquals(term5444, term5671));
        assertTrue(recursiveEquals(term5653, term5675));
    }

};


