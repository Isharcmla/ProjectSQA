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

public class SetterlessProperty_init_1578804247241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149338;
     Object term149584;
     Object term149740;

    public SetterlessProperty_init_1578804247241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term148856 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term148956 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term149048 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term149204 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        setField(term148856, term148856.getClass(), "_metadata", term148956);
        setIntField(term148856, term148856.getClass(), "_propertyIndex", 0);
        setField(term148856, term148856.getClass(), "_propName", term149048);
        setField(term148856, term148856.getClass(), "_type", null);
        setField(term148856, term148856.getClass(), "_wrapperName", null);
        setField(term148856, term148856.getClass(), "_contextAnnotations", term149204);
        setField(term148856, term148856.getClass(), "_viewMatcher", null);
        term149338 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term149438 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term149338, term149338.getClass(), "_fullName", null);
        setField(term149338, term149338.getClass(), "_annotationIntrospector", null);
        setField(term149338, term149338.getClass(), "_metadata", term149438);
        term149584 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        term149740 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        Object[] args = new Object[5];
        args[0] = term149338;
        args[1] = null;
        args[2] = term149584;
        args[3] = term149740;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


