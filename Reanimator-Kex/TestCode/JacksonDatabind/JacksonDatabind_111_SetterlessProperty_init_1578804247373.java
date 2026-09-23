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

public class SetterlessProperty_init_1578804247373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270259;
     Object term270637;

    public SetterlessProperty_init_1578804247373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term269875 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term269975 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term270131 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        setField(term269875, term269875.getClass(), "_metadata", term269975);
        setIntField(term269875, term269875.getClass(), "_propertyIndex", 0);
        setField(term269875, term269875.getClass(), "_propName", null);
        setField(term269875, term269875.getClass(), "_type", null);
        setField(term269875, term269875.getClass(), "_wrapperName", null);
        setField(term269875, term269875.getClass(), "_contextAnnotations", term270131);
        setField(term269875, term269875.getClass(), "_viewMatcher", null);
        term270259 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term270351 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term270489 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term270351, term270351.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term270259, term270259.getClass(), "_name", term270351);
        setBooleanField(term270259, term270259.getClass(), "_forSerialization", false);
        setField(term270259, term270259.getClass(), "_ctorParameters", null);
        setField(term270259, term270259.getClass(), "_setters", null);
        setField(term270259, term270259.getClass(), "_fields", null);
        setField(term270259, term270259.getClass(), "_getters", null);
        setField(term270259, term270259.getClass(), "_metadata", term270489);
        term270637 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
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
        args[0] = term270259;
        args[1] = null;
        args[2] = term270637;
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


