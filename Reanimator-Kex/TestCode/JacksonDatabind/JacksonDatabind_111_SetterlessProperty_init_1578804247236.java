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

public class SetterlessProperty_init_1578804247236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144774;
     Object term144980;
     Object term145122;

    public SetterlessProperty_init_1578804247236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term145185 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term145231 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term145279 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term145357 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        setField(term145185, term145185.getClass(), "_metadata", null);
        setIntField(term145185, term145185.getClass(), "_propertyIndex", 0);
        setField(term145185, term145185.getClass(), "_propName", term145231);
        setField(term145185, term145185.getClass(), "_type", term145279);
        setField(term145185, term145185.getClass(), "_wrapperName", null);
        setField(term145185, term145185.getClass(), "_contextAnnotations", term145357);
        setField(term145185, term145185.getClass(), "_viewMatcher", null);
        term144774 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term144874 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term144774, term144774.getClass(), "_fullName", null);
        setField(term144774, term144774.getClass(), "_annotationIntrospector", null);
        setField(term144774, term144774.getClass(), "_metadata", term144874);
        term144980 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term145122 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(term145122, term145122.getClass(), "_property", term145185);
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
        args[0] = term144774;
        args[1] = term144980;
        args[2] = term145122;
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


