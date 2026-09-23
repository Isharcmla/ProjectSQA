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

public class SetterlessProperty_init_1578804247469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395726;
     Object term396064;
     Object term396206;
     Object term396362;

    public SetterlessProperty_init_1578804247469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term394962 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term395062 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term395154 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term395250 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term395342 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term395498 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        Object term395598 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term394962, term394962.getClass(), "_metadata", term395062);
        setIntField(term394962, term394962.getClass(), "_propertyIndex", 0);
        setField(term394962, term394962.getClass(), "_propName", term395154);
        setField(term394962, term394962.getClass(), "_type", term395250);
        setField(term394962, term394962.getClass(), "_wrapperName", term395342);
        setField(term394962, term394962.getClass(), "_contextAnnotations", term395498);
        setField(term394962, term394962.getClass(), "_viewMatcher", term395598);
        term395726 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term395868 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term395968 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term395726, term395726.getClass(), "_name", null);
        setBooleanField(term395726, term395726.getClass(), "_forSerialization", false);
        setField(term395726, term395726.getClass(), "_ctorParameters", null);
        setField(term395868, term395868.getClass(), "next", null);
        setField(term395868, term395868.getClass(), "value", null);
        setField(term395726, term395726.getClass(), "_setters", term395868);
        setField(term395726, term395726.getClass(), "_fields", null);
        setField(term395726, term395726.getClass(), "_getters", null);
        setField(term395726, term395726.getClass(), "_metadata", term395968);
        term396064 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term396206 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        term396362 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
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
        args[0] = term395726;
        args[1] = term396064;
        args[2] = term396206;
        args[3] = term396362;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


