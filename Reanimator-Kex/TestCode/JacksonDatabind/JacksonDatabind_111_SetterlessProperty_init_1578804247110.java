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

public class SetterlessProperty_init_1578804247110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48571;
     Object term49097;
     Object term49253;

    public SetterlessProperty_init_1578804247110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term47787 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term47887 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term47979 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term48093 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term48185 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term48343 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        Object term48443 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term47787, term47787.getClass(), "_metadata", term47887);
        setIntField(term47787, term47787.getClass(), "_propertyIndex", 0);
        setField(term47787, term47787.getClass(), "_propName", term47979);
        setField(term47787, term47787.getClass(), "_type", term48093);
        setField(term47787, term47787.getClass(), "_wrapperName", term48185);
        setField(term47787, term47787.getClass(), "_contextAnnotations", term48343);
        setField(term47787, term47787.getClass(), "_viewMatcher", term48443);
        term48571 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term48713 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term48855 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term48955 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term48571, term48571.getClass(), "_name", null);
        setBooleanField(term48571, term48571.getClass(), "_forSerialization", false);
        setField(term48571, term48571.getClass(), "_ctorParameters", null);
        setField(term48713, term48713.getClass(), "next", null);
        setField(term48713, term48713.getClass(), "value", null);
        setField(term48571, term48571.getClass(), "_setters", term48713);
        setField(term48571, term48571.getClass(), "_fields", null);
        setField(term48855, term48855.getClass(), "next", null);
        setField(term48855, term48855.getClass(), "value", null);
        setField(term48571, term48571.getClass(), "_getters", term48855);
        setField(term48571, term48571.getClass(), "_metadata", term48955);
        term49097 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        term49253 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
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
        args[0] = term48571;
        args[1] = null;
        args[2] = term49097;
        args[3] = term49253;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


