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

public class FieldProperty_init_7956690651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14807;
     Object term14999;
     Object term15145;

    public FieldProperty_init_7956690651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14389 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term14489 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term14581 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term14673 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term14389, term14389.getClass(), "_metadata", term14489);
        setIntField(term14389, term14389.getClass(), "_propertyIndex", 0);
        setField(term14389, term14389.getClass(), "_propName", term14581);
        setField(term14389, term14389.getClass(), "_type", null);
        setField(term14389, term14389.getClass(), "_wrapperName", term14673);
        setField(term14389, term14389.getClass(), "_contextAnnotations", null);
        setField(term14389, term14389.getClass(), "_viewMatcher", null);
        term14807 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term14907 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term14807, term14807.getClass(), "_fullName", null);
        setField(term14807, term14807.getClass(), "_annotationIntrospector", null);
        setField(term14807, term14807.getClass(), "_metadata", term14907);
        term14999 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term15145 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
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
        args[0] = term14807;
        args[1] = term14999;
        args[2] = term15145;
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


