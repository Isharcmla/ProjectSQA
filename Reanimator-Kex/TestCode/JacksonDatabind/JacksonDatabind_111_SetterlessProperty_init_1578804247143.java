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

public class SetterlessProperty_init_1578804247143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71675;
     Object term71823;

    public SetterlessProperty_init_1578804247143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term71249 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term71349 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term71441 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term71541 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term71249, term71249.getClass(), "_metadata", term71349);
        setIntField(term71249, term71249.getClass(), "_propertyIndex", 0);
        setField(term71249, term71249.getClass(), "_propName", term71441);
        setField(term71249, term71249.getClass(), "_type", term71541);
        setField(term71249, term71249.getClass(), "_wrapperName", null);
        setField(term71249, term71249.getClass(), "_contextAnnotations", null);
        setField(term71249, term71249.getClass(), "_viewMatcher", null);
        term71675 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term71675, term71675.getClass(), "_fullName", null);
        setField(term71675, term71675.getClass(), "_annotationIntrospector", null);
        setField(term71675, term71675.getClass(), "_metadata", null);
        term71823 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
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
        args[0] = term71675;
        args[1] = null;
        args[2] = term71823;
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


