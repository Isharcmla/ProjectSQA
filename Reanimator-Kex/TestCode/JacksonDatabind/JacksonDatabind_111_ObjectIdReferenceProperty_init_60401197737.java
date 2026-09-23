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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ObjectIdReferenceProperty_init_60401197737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6929;
     Object term7845;

    public ObjectIdReferenceProperty_init_60401197737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5869 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        Object term5969 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term6073 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term6165 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term6257 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term6373 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term6519 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term6689 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer"));
        Object term6789 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term5869, term5869.getClass(), "_metadata", term5969);
        setField(term5869, term5869.getClass(), "_propertyFormat", term6073);
        setIntField(term5869, term5869.getClass(), "_propertyIndex", 0);
        setField(term5869, term5869.getClass(), "_propName", term6165);
        setField(term5869, term5869.getClass(), "_type", null);
        setField(term5869, term5869.getClass(), "_wrapperName", term6257);
        setField(term5869, term5869.getClass(), "_contextAnnotations", term6373);
        setField(term5869, term5869.getClass(), "_valueTypeDeserializer", term6519);
        setField(term5869, term5869.getClass(), "_managedReferenceName", "");
        setField(term5869, term5869.getClass(), "_valueDeserializer", term6689);
        setField(term5869, term5869.getClass(), "_viewMatcher", term6789);
        term6929 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        Object term7033 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term7125 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term7221 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term7313 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term7469 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        Object term7617 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term7717 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term6929, term6929.getClass(), "_metadata", null);
        setField(term6929, term6929.getClass(), "_propertyFormat", term7033);
        setField(term6929, term6929.getClass(), "_propName", term7125);
        setField(term6929, term6929.getClass(), "_type", term7221);
        setField(term6929, term6929.getClass(), "_wrapperName", term7313);
        setField(term6929, term6929.getClass(), "_contextAnnotations", term7469);
        setField(term6929, term6929.getClass(), "_valueTypeDeserializer", term7617);
        setField(term6929, term6929.getClass(), "_managedReferenceName", null);
        setIntField(term6929, term6929.getClass(), "_propertyIndex", 0);
        setField(term6929, term6929.getClass(), "_viewMatcher", term7717);
        term7845 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term6929;
        args[1] = null;
        args[2] = term7845;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


