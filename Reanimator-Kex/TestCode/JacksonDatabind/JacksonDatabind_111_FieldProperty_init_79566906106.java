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

public class FieldProperty_init_79566906106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48081;
     Object term48295;
     Object term48437;

    public FieldProperty_init_79566906106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term47739 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term47831 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term47947 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term47739, term47739.getClass(), "_metadata", null);
        setIntField(term47739, term47739.getClass(), "_propertyIndex", 0);
        setField(term47739, term47739.getClass(), "_propName", term47831);
        setField(term47739, term47739.getClass(), "_type", null);
        setField(term47739, term47739.getClass(), "_wrapperName", null);
        setField(term47739, term47739.getClass(), "_contextAnnotations", term47947);
        setField(term47739, term47739.getClass(), "_viewMatcher", null);
        term48081 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term48181 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term48081, term48081.getClass(), "_fullName", null);
        setField(term48081, term48081.getClass(), "_annotationIntrospector", null);
        setField(term48081, term48081.getClass(), "_metadata", term48181);
        term48295 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term48437 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField");
        Object[] args = new Object[5];
        args[0] = term48081;
        args[1] = term48295;
        args[2] = term48437;
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


