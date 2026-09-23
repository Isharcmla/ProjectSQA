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

public class FieldProperty_init_7956690687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35082;
     Object term35330;
     Object term35486;

    public FieldProperty_init_7956690687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term34600 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term34700 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term34792 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term34948 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        setField(term34600, term34600.getClass(), "_metadata", term34700);
        setIntField(term34600, term34600.getClass(), "_propertyIndex", 0);
        setField(term34600, term34600.getClass(), "_propName", term34792);
        setField(term34600, term34600.getClass(), "_type", null);
        setField(term34600, term34600.getClass(), "_wrapperName", null);
        setField(term34600, term34600.getClass(), "_contextAnnotations", term34948);
        setField(term34600, term34600.getClass(), "_viewMatcher", null);
        term35082 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term35182 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term35082, term35082.getClass(), "_fullName", null);
        setField(term35082, term35082.getClass(), "_annotationIntrospector", null);
        setField(term35082, term35082.getClass(), "_metadata", term35182);
        term35330 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        term35486 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
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
        args[0] = term35082;
        args[1] = null;
        args[2] = term35330;
        args[3] = term35486;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


