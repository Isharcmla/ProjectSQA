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

public class SetterlessProperty_init_157880424791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35641;
     Object term35977;
     Object term36119;
     Object term36275;

    public SetterlessProperty_init_157880424791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term34973 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term35073 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term35165 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term35263 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term35355 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term35513 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        setField(term34973, term34973.getClass(), "_metadata", term35073);
        setIntField(term34973, term34973.getClass(), "_propertyIndex", 0);
        setField(term34973, term34973.getClass(), "_propName", term35165);
        setField(term34973, term34973.getClass(), "_type", term35263);
        setField(term34973, term34973.getClass(), "_wrapperName", term35355);
        setField(term34973, term34973.getClass(), "_contextAnnotations", term35513);
        setField(term34973, term34973.getClass(), "_viewMatcher", null);
        term35641 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term35733 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term35871 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term35733, term35733.getClass(), "_simpleName", "");
        setField(term35641, term35641.getClass(), "_name", term35733);
        setBooleanField(term35641, term35641.getClass(), "_forSerialization", false);
        setField(term35641, term35641.getClass(), "_ctorParameters", null);
        setField(term35641, term35641.getClass(), "_setters", null);
        setField(term35641, term35641.getClass(), "_fields", null);
        setField(term35641, term35641.getClass(), "_getters", null);
        setField(term35641, term35641.getClass(), "_metadata", term35871);
        term35977 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term36119 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        term36275 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
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
        args[0] = term35641;
        args[1] = term35977;
        args[2] = term36119;
        args[3] = term36275;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


