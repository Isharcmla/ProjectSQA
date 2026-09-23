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

public class SetterlessProperty_init_1578804247411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317387;
     Object term317733;
     Object term317881;
     Object term318037;

    public SetterlessProperty_init_1578804247411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term316787 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term316887 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term317001 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term317159 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        Object term317259 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term316787, term316787.getClass(), "_metadata", term316887);
        setIntField(term316787, term316787.getClass(), "_propertyIndex", 0);
        setField(term316787, term316787.getClass(), "_propName", null);
        setField(term316787, term316787.getClass(), "_type", term317001);
        setField(term316787, term316787.getClass(), "_wrapperName", null);
        setField(term316787, term316787.getClass(), "_contextAnnotations", term317159);
        setField(term316787, term316787.getClass(), "_viewMatcher", term317259);
        term317387 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term317529 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term317629 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term317387, term317387.getClass(), "_name", null);
        setBooleanField(term317387, term317387.getClass(), "_forSerialization", false);
        setField(term317387, term317387.getClass(), "_ctorParameters", null);
        setField(term317529, term317529.getClass(), "next", null);
        setField(term317529, term317529.getClass(), "value", null);
        setField(term317387, term317387.getClass(), "_setters", term317529);
        setField(term317387, term317387.getClass(), "_fields", null);
        setField(term317387, term317387.getClass(), "_getters", null);
        setField(term317387, term317387.getClass(), "_metadata", term317629);
        term317733 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term317881 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        term318037 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
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
        args[0] = term317387;
        args[1] = term317733;
        args[2] = term317881;
        args[3] = term318037;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


