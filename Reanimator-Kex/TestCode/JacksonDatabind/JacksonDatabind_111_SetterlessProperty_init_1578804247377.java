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

public class SetterlessProperty_init_1578804247377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279342;
     Object term279698;
     Object term279844;
     Object term280002;

    public SetterlessProperty_init_1578804247377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term278666 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term278766 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term278858 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term278958 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term279114 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        Object term279214 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term278666, term278666.getClass(), "_metadata", term278766);
        setIntField(term278666, term278666.getClass(), "_propertyIndex", 0);
        setField(term278666, term278666.getClass(), "_propName", term278858);
        setField(term278666, term278666.getClass(), "_type", term278958);
        setField(term278666, term278666.getClass(), "_wrapperName", term278858);
        setField(term278666, term278666.getClass(), "_contextAnnotations", term279114);
        setField(term278666, term278666.getClass(), "_viewMatcher", term279214);
        term279342 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term279484 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term279584 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term279342, term279342.getClass(), "_name", null);
        setBooleanField(term279342, term279342.getClass(), "_forSerialization", true);
        setField(term279342, term279342.getClass(), "_getters", null);
        setField(term279484, term279484.getClass(), "value", null);
        setField(term279484, term279484.getClass(), "next", null);
        setField(term279342, term279342.getClass(), "_fields", term279484);
        setField(term279342, term279342.getClass(), "_metadata", term279584);
        term279698 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term279844 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        term280002 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
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
        args[0] = term279342;
        args[1] = term279698;
        args[2] = term279844;
        args[3] = term280002;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


