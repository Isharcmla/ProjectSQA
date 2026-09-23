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

public class FieldProperty_init_79566906137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98658;
     Object term98850;
     Object term98996;

    public FieldProperty_init_79566906137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term99054 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term99104 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term99150 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term99196 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term99054, term99054.getClass(), "_metadata", term99104);
        setIntField(term99054, term99054.getClass(), "_propertyIndex", 0);
        setField(term99054, term99054.getClass(), "_propName", term99150);
        setField(term99054, term99054.getClass(), "_type", term99196);
        setField(term99054, term99054.getClass(), "_wrapperName", null);
        setField(term99054, term99054.getClass(), "_contextAnnotations", null);
        setField(term99054, term99054.getClass(), "_viewMatcher", null);
        term98658 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term98758 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term98658, term98658.getClass(), "_fullName", null);
        setField(term98658, term98658.getClass(), "_annotationIntrospector", null);
        setField(term98658, term98658.getClass(), "_metadata", term98758);
        term98850 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term98996 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term98996, term98996.getClass(), "_property", term99054);
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
        args[0] = term98658;
        args[1] = term98850;
        args[2] = term98996;
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


