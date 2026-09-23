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

public class SetterlessProperty_init_1578804247344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238213;
     Object term238453;
     Object term238599;
     Object term238757;

    public SetterlessProperty_init_1578804247344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term237425 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term237525 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term237617 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term237737 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term237829 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term237985 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        Object term238085 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term237425, term237425.getClass(), "_metadata", term237525);
        setIntField(term237425, term237425.getClass(), "_propertyIndex", 0);
        setField(term237425, term237425.getClass(), "_propName", term237617);
        setField(term237425, term237425.getClass(), "_type", term237737);
        setField(term237425, term237425.getClass(), "_wrapperName", term237829);
        setField(term237425, term237425.getClass(), "_contextAnnotations", term237985);
        setField(term237425, term237425.getClass(), "_viewMatcher", term238085);
        term238213 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term238357 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term238213, term238213.getClass(), "_name", null);
        setBooleanField(term238213, term238213.getClass(), "_forSerialization", true);
        setField(term238213, term238213.getClass(), "_getters", null);
        setField(term238213, term238213.getClass(), "_fields", null);
        setField(term238213, term238213.getClass(), "_metadata", null);
        setField(term238213, term238213.getClass(), "_annotationIntrospector", term238357);
        term238453 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term238599 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        term238757 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
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
        args[0] = term238213;
        args[1] = term238453;
        args[2] = term238599;
        args[3] = term238757;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


