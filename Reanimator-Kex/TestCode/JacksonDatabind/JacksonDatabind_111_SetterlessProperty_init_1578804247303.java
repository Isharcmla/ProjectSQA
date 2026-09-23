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

public class SetterlessProperty_init_1578804247303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200621;
     Object term200899;

    public SetterlessProperty_init_1578804247303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term200962 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term201019 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term200962, term200962.getClass(), "_metadata", null);
        setIntField(term200962, term200962.getClass(), "_propertyIndex", 0);
        setField(term200962, term200962.getClass(), "_propName", null);
        setField(term200962, term200962.getClass(), "_type", term201019);
        setField(term200962, term200962.getClass(), "_wrapperName", null);
        setField(term200962, term200962.getClass(), "_contextAnnotations", null);
        setField(term200962, term200962.getClass(), "_viewMatcher", null);
        term200621 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term200713 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term200713, term200713.getClass(), "_simpleName", "");
        setField(term200621, term200621.getClass(), "_fullName", term200713);
        setField(term200621, term200621.getClass(), "_annotationIntrospector", null);
        setField(term200621, term200621.getClass(), "_metadata", null);
        term200899 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(term200899, term200899.getClass(), "_property", term200962);
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
        args[0] = term200621;
        args[1] = null;
        args[2] = term200899;
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


