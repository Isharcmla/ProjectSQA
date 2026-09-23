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

public class SetterlessProperty_init_1578804247291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191050;
     Object term191254;
     Object term191400;

    public SetterlessProperty_init_1578804247291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term191463 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term191513 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term191559 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term191612 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term191463, term191463.getClass(), "_metadata", term191513);
        setIntField(term191463, term191463.getClass(), "_propertyIndex", 0);
        setField(term191463, term191463.getClass(), "_propName", term191559);
        setField(term191463, term191463.getClass(), "_type", term191612);
        setField(term191463, term191463.getClass(), "_wrapperName", null);
        setField(term191463, term191463.getClass(), "_contextAnnotations", null);
        setField(term191463, term191463.getClass(), "_viewMatcher", null);
        term191050 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term191150 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term191050, term191050.getClass(), "_fullName", null);
        setField(term191050, term191050.getClass(), "_annotationIntrospector", null);
        setField(term191050, term191050.getClass(), "_metadata", term191150);
        term191254 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term191400 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term191400, term191400.getClass(), "_property", term191463);
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
        args[0] = term191050;
        args[1] = term191254;
        args[2] = term191400;
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


