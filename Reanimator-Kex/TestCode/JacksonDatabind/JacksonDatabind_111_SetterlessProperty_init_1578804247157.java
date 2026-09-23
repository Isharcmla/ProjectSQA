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

public class SetterlessProperty_init_1578804247157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81094;
     Object term81338;
     Object term81480;

    public SetterlessProperty_init_1578804247157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term81543 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term81593 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term81639 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term81717 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        setField(term81543, term81543.getClass(), "_metadata", term81593);
        setIntField(term81543, term81543.getClass(), "_propertyIndex", 0);
        setField(term81543, term81543.getClass(), "_propName", term81639);
        setField(term81543, term81543.getClass(), "_type", null);
        setField(term81543, term81543.getClass(), "_wrapperName", null);
        setField(term81543, term81543.getClass(), "_contextAnnotations", term81717);
        setField(term81543, term81543.getClass(), "_viewMatcher", null);
        term81094 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term81242 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term81094, term81094.getClass(), "_fullName", null);
        setField(term81094, term81094.getClass(), "_annotationIntrospector", term81242);
        setField(term81094, term81094.getClass(), "_member", null);
        setField(term81094, term81094.getClass(), "_metadata", null);
        term81338 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term81480 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(term81480, term81480.getClass(), "_property", term81543);
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
        args[0] = term81094;
        args[1] = term81338;
        args[2] = term81480;
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


