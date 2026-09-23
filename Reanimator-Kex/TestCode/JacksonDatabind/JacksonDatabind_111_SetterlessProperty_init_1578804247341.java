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

public class SetterlessProperty_init_1578804247341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236297;
     Object term236439;
     Object term236587;

    public SetterlessProperty_init_1578804247341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term235977 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term236347 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term236169 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term235977, term235977.getClass(), "_metadata", term236347);
        setIntField(term235977, term235977.getClass(), "_propertyIndex", 0);
        setField(term235977, term235977.getClass(), "_propName", null);
        setField(term235977, term235977.getClass(), "_type", term236169);
        setField(term235977, term235977.getClass(), "_wrapperName", null);
        setField(term235977, term235977.getClass(), "_contextAnnotations", null);
        setField(term235977, term235977.getClass(), "_viewMatcher", null);
        term236297 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term236297, term236297.getClass(), "_name", null);
        setBooleanField(term236297, term236297.getClass(), "_forSerialization", false);
        setField(term236297, term236297.getClass(), "_ctorParameters", null);
        setField(term236297, term236297.getClass(), "_setters", null);
        setField(term236297, term236297.getClass(), "_fields", null);
        setField(term236297, term236297.getClass(), "_getters", null);
        setField(term236297, term236297.getClass(), "_metadata", term236347);
        term236439 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term236587 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
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
        args[0] = term236297;
        args[1] = term236439;
        args[2] = term236587;
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


