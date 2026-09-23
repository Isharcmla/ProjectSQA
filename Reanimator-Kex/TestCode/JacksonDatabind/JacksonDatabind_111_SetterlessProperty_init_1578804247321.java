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

public class SetterlessProperty_init_1578804247321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215674;
     Object term215766;
     Object term215914;
     Object term216374;

    public SetterlessProperty_init_1578804247321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term215977 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term216027 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term216073 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term216130 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term216208 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        Object term216258 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term215977, term215977.getClass(), "_metadata", term216027);
        setIntField(term215977, term215977.getClass(), "_propertyIndex", 0);
        setField(term215977, term215977.getClass(), "_propName", term216073);
        setField(term215977, term215977.getClass(), "_type", term216130);
        setField(term215977, term215977.getClass(), "_wrapperName", term216073);
        setField(term215977, term215977.getClass(), "_contextAnnotations", term216208);
        setField(term215977, term215977.getClass(), "_viewMatcher", term216258);
        term215674 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term215674, term215674.getClass(), "_name", null);
        setBooleanField(term215674, term215674.getClass(), "_forSerialization", true);
        setField(term215674, term215674.getClass(), "_getters", null);
        setField(term215674, term215674.getClass(), "_fields", null);
        setField(term215674, term215674.getClass(), "_metadata", null);
        setField(term215674, term215674.getClass(), "_annotationIntrospector", null);
        term215766 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term215914 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(term215914, term215914.getClass(), "_property", term215977);
        term216374 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
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
        args[0] = term215674;
        args[1] = term215766;
        args[2] = term215914;
        args[3] = term216374;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


