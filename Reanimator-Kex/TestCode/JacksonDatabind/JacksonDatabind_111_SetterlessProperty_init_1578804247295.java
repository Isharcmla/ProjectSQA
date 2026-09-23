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

public class SetterlessProperty_init_1578804247295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193501;
     Object term193701;
     Object term193849;

    public SetterlessProperty_init_1578804247295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term193912 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term193962 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term194008 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term194058 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term193912, term193912.getClass(), "_metadata", term193962);
        setIntField(term193912, term193912.getClass(), "_propertyIndex", 0);
        setField(term193912, term193912.getClass(), "_propName", term194008);
        setField(term193912, term193912.getClass(), "_type", term194058);
        setField(term193912, term193912.getClass(), "_wrapperName", null);
        setField(term193912, term193912.getClass(), "_contextAnnotations", null);
        setField(term193912, term193912.getClass(), "_viewMatcher", null);
        term193501 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term193601 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term193501, term193501.getClass(), "_fullName", null);
        setField(term193501, term193501.getClass(), "_annotationIntrospector", null);
        setField(term193501, term193501.getClass(), "_metadata", term193601);
        term193701 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term193849 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(term193849, term193849.getClass(), "_property", term193912);
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
        args[0] = term193501;
        args[1] = term193701;
        args[2] = term193849;
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


