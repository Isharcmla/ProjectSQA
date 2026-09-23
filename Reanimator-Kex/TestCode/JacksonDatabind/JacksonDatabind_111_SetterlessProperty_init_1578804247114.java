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

public class SetterlessProperty_init_1578804247114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53108;
     Object term53402;

    public SetterlessProperty_init_1578804247114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term52626 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term52726 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term52818 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term52974 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        setField(term52626, term52626.getClass(), "_metadata", term52726);
        setIntField(term52626, term52626.getClass(), "_propertyIndex", 0);
        setField(term52626, term52626.getClass(), "_propName", term52818);
        setField(term52626, term52626.getClass(), "_type", null);
        setField(term52626, term52626.getClass(), "_wrapperName", null);
        setField(term52626, term52626.getClass(), "_contextAnnotations", term52974);
        setField(term52626, term52626.getClass(), "_viewMatcher", null);
        term53108 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term53256 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term53108, term53108.getClass(), "_fullName", null);
        setField(term53108, term53108.getClass(), "_annotationIntrospector", term53256);
        setField(term53108, term53108.getClass(), "_member", null);
        setField(term53108, term53108.getClass(), "_metadata", null);
        term53402 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
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
        args[0] = term53108;
        args[1] = null;
        args[2] = term53402;
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


