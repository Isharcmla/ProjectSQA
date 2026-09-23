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

public class MethodProperty_init_202895332698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42197;
     Object term42581;
     Object term42697;

    public MethodProperty_init_202895332698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41507 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        Object term41607 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term41699 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term41813 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term41969 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        Object term42069 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term41507, term41507.getClass(), "_metadata", term41607);
        setIntField(term41507, term41507.getClass(), "_propertyIndex", 0);
        setField(term41507, term41507.getClass(), "_propName", term41699);
        setField(term41507, term41507.getClass(), "_type", term41813);
        setField(term41507, term41507.getClass(), "_wrapperName", term41699);
        setField(term41507, term41507.getClass(), "_contextAnnotations", term41969);
        setField(term41507, term41507.getClass(), "_viewMatcher", term42069);
        term42197 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term42339 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term42439 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term42197, term42197.getClass(), "_name", null);
        setBooleanField(term42197, term42197.getClass(), "_forSerialization", false);
        setField(term42197, term42197.getClass(), "_ctorParameters", null);
        setField(term42339, term42339.getClass(), "next", null);
        setField(term42339, term42339.getClass(), "value", null);
        setField(term42197, term42197.getClass(), "_setters", term42339);
        setField(term42197, term42197.getClass(), "_fields", null);
        setField(term42197, term42197.getClass(), "_getters", null);
        setField(term42197, term42197.getClass(), "_metadata", term42439);
        term42581 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        term42697 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        Object[] args = new Object[5];
        args[0] = term42197;
        args[1] = null;
        args[2] = term42581;
        args[3] = term42697;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


