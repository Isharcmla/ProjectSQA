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

public class FieldProperty_init_79566906145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105029;
     Object term105419;

    public FieldProperty_init_79566906145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term104547 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term104647 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term104739 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term104895 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        setField(term104547, term104547.getClass(), "_metadata", term104647);
        setIntField(term104547, term104547.getClass(), "_propertyIndex", 0);
        setField(term104547, term104547.getClass(), "_propName", term104739);
        setField(term104547, term104547.getClass(), "_type", null);
        setField(term104547, term104547.getClass(), "_wrapperName", null);
        setField(term104547, term104547.getClass(), "_contextAnnotations", term104895);
        setField(term104547, term104547.getClass(), "_viewMatcher", null);
        term105029 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term105171 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term105271 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term105029, term105029.getClass(), "_fullName", null);
        setField(term105029, term105029.getClass(), "_annotationIntrospector", term105171);
        setField(term105029, term105029.getClass(), "_member", null);
        setField(term105029, term105029.getClass(), "_metadata", term105271);
        term105419 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField");
        Object[] args = new Object[5];
        args[0] = term105029;
        args[1] = null;
        args[2] = term105419;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


