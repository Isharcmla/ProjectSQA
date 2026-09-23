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

public class SetterlessProperty_init_1578804247410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315677;
     Object term316099;

    public SetterlessProperty_init_1578804247410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term315343 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term315443 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term315543 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term315343, term315343.getClass(), "_metadata", term315443);
        setIntField(term315343, term315343.getClass(), "_propertyIndex", 0);
        setField(term315343, term315343.getClass(), "_propName", null);
        setField(term315343, term315343.getClass(), "_type", term315543);
        setField(term315343, term315343.getClass(), "_wrapperName", null);
        setField(term315343, term315343.getClass(), "_contextAnnotations", null);
        setField(term315343, term315343.getClass(), "_viewMatcher", null);
        term315677 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term315769 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term315951 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term315769, term315769.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term315677, term315677.getClass(), "_fullName", term315769);
        setField(term315677, term315677.getClass(), "_annotationIntrospector", term315951);
        setField(term315677, term315677.getClass(), "_member", null);
        setField(term315677, term315677.getClass(), "_metadata", null);
        term316099 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
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
        args[0] = term315677;
        args[1] = null;
        args[2] = term316099;
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


