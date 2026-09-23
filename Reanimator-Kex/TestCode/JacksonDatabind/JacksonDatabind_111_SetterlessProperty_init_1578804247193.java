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

public class SetterlessProperty_init_1578804247193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112711;
     Object term112857;

    public SetterlessProperty_init_1578804247193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term112920 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term112970 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term113016 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term113076 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term112920, term112920.getClass(), "_metadata", term112970);
        setIntField(term112920, term112920.getClass(), "_propertyIndex", 0);
        setField(term112920, term112920.getClass(), "_propName", term113016);
        setField(term112920, term112920.getClass(), "_type", term113076);
        setField(term112920, term112920.getClass(), "_wrapperName", null);
        setField(term112920, term112920.getClass(), "_contextAnnotations", null);
        setField(term112920, term112920.getClass(), "_viewMatcher", null);
        term112711 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term112711, term112711.getClass(), "_fullName", null);
        setField(term112711, term112711.getClass(), "_annotationIntrospector", null);
        setField(term112711, term112711.getClass(), "_metadata", null);
        term112857 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term112857, term112857.getClass(), "_property", term112920);
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
        args[0] = term112711;
        args[1] = null;
        args[2] = term112857;
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


