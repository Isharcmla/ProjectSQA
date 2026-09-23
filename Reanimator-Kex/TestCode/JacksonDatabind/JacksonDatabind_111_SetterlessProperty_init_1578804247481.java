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

public class SetterlessProperty_init_1578804247481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404567;
     Object term404987;

    public SetterlessProperty_init_1578804247481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term403987 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term404087 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term404179 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term404275 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term404433 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        setField(term403987, term403987.getClass(), "_metadata", term404087);
        setIntField(term403987, term403987.getClass(), "_propertyIndex", 0);
        setField(term403987, term403987.getClass(), "_propName", term404179);
        setField(term403987, term403987.getClass(), "_type", term404275);
        setField(term403987, term403987.getClass(), "_wrapperName", null);
        setField(term403987, term403987.getClass(), "_contextAnnotations", term404433);
        setField(term403987, term403987.getClass(), "_viewMatcher", null);
        term404567 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term404659 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term404845 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term404659, term404659.getClass(), "_simpleName", "");
        setField(term404567, term404567.getClass(), "_fullName", term404659);
        setField(term404567, term404567.getClass(), "_annotationIntrospector", term404845);
        setField(term404567, term404567.getClass(), "_member", null);
        setField(term404567, term404567.getClass(), "_metadata", null);
        term404987 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
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
        args[0] = term404567;
        args[1] = null;
        args[2] = term404987;
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


