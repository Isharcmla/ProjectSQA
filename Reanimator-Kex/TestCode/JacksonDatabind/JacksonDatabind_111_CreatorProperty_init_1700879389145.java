package com.fasterxml.jackson.databind.deser;

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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CreatorProperty_init_1700879389145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167200;
     Object term167330;
     Object term167476;
     Object term167592;
     Object term167692;

    public CreatorProperty_init_1700879389145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term166612 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term166704 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term166800 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term166892 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term167008 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term167108 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term166612, term166612.getClass(), "_metadata", null);
        setIntField(term166612, term166612.getClass(), "_propertyIndex", 0);
        setField(term166612, term166612.getClass(), "_propName", term166704);
        setField(term166612, term166612.getClass(), "_type", term166800);
        setField(term166612, term166612.getClass(), "_wrapperName", term166892);
        setField(term166612, term166612.getClass(), "_contextAnnotations", term167008);
        setField(term166612, term166612.getClass(), "_viewMatcher", term167108);
        term167200 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term167200, term167200.getClass(), "_simpleName", "");
        term167330 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term167476 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        term167592 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term167692 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter");
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[9];
        args[0] = term167200;
        args[1] = null;
        args[2] = term167330;
        args[3] = term167476;
        args[4] = term167592;
        args[5] = null;
        args[6] = 0;
        args[7] = null;
        args[8] = term167692;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


