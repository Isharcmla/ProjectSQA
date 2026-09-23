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

public class FieldProperty_init_79566906183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248762;
     Object term249186;

    public FieldProperty_init_79566906183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term248088 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term248188 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term248280 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term248378 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term248470 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term248628 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        setField(term248088, term248088.getClass(), "_metadata", term248188);
        setIntField(term248088, term248088.getClass(), "_propertyIndex", 0);
        setField(term248088, term248088.getClass(), "_propName", term248280);
        setField(term248088, term248088.getClass(), "_type", term248378);
        setField(term248088, term248088.getClass(), "_wrapperName", term248470);
        setField(term248088, term248088.getClass(), "_contextAnnotations", term248628);
        setField(term248088, term248088.getClass(), "_viewMatcher", null);
        term248762 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term248910 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term249040 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(term248762, term248762.getClass(), "_fullName", null);
        setField(term248762, term248762.getClass(), "_annotationIntrospector", term248910);
        setField(term248762, term248762.getClass(), "_member", term249040);
        setField(term248762, term248762.getClass(), "_metadata", null);
        term249186 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
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
        args[0] = term248762;
        args[1] = null;
        args[2] = term249186;
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


