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

public class FieldProperty_init_79566906156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116572;
     Object term116990;

    public FieldProperty_init_79566906156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term115878 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term115978 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term116070 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term116190 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term116282 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term116438 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        setField(term115878, term115878.getClass(), "_metadata", term115978);
        setIntField(term115878, term115878.getClass(), "_propertyIndex", 0);
        setField(term115878, term115878.getClass(), "_propName", term116070);
        setField(term115878, term115878.getClass(), "_type", term116190);
        setField(term115878, term115878.getClass(), "_wrapperName", term116282);
        setField(term115878, term115878.getClass(), "_contextAnnotations", term116438);
        setField(term115878, term115878.getClass(), "_viewMatcher", null);
        term116572 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term116716 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term116842 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(term116572, term116572.getClass(), "_fullName", null);
        setField(term116572, term116572.getClass(), "_annotationIntrospector", term116716);
        setField(term116572, term116572.getClass(), "_member", term116842);
        setField(term116572, term116572.getClass(), "_metadata", null);
        term116990 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
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
        args[0] = term116572;
        args[1] = null;
        args[2] = term116990;
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


