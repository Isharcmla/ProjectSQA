package com.fasterxml.jackson.databind.deser;

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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CreatorProperty_init_1700879389196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322778;
     Object term322908;
     Object term323054;
     Object term323548;
     Object term323648;

    public CreatorProperty_init_1700879389196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term323109 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term323159 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term323205 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term323257 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term323303 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term323382 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        Object term323432 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term323109, term323109.getClass(), "_metadata", term323159);
        setIntField(term323109, term323109.getClass(), "_propertyIndex", 0);
        setField(term323109, term323109.getClass(), "_propName", term323205);
        setField(term323109, term323109.getClass(), "_type", term323257);
        setField(term323109, term323109.getClass(), "_wrapperName", term323303);
        setField(term323109, term323109.getClass(), "_contextAnnotations", term323382);
        setField(term323109, term323109.getClass(), "_viewMatcher", term323432);
        term322778 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term322778, term322778.getClass(), "_simpleName", "");
        term322908 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term323054 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term323054, term323054.getClass(), "_property", term323109);
        term323548 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term323648 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter");
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[9];
        args[0] = term322778;
        args[1] = null;
        args[2] = term322908;
        args[3] = term323054;
        args[4] = term323548;
        args[5] = null;
        args[6] = 0;
        args[7] = null;
        args[8] = term323648;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


