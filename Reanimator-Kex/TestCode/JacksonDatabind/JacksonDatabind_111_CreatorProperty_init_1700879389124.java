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

public class CreatorProperty_init_1700879389124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87803;
     Object term87939;
     Object term88031;
     Object term88173;
     Object term88329;

    public CreatorProperty_init_1700879389124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term87419 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term87519 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term87611 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term87711 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term87419, term87419.getClass(), "_metadata", term87519);
        setIntField(term87419, term87419.getClass(), "_propertyIndex", 0);
        setField(term87419, term87419.getClass(), "_propName", null);
        setField(term87419, term87419.getClass(), "_type", null);
        setField(term87419, term87419.getClass(), "_wrapperName", term87611);
        setField(term87419, term87419.getClass(), "_contextAnnotations", null);
        setField(term87419, term87419.getClass(), "_viewMatcher", term87711);
        term87803 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term87803, term87803.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        term87939 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term88031 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term88173 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        term88329 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
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
        args[0] = term87803;
        args[1] = term87939;
        args[2] = term88031;
        args[3] = term88173;
        args[4] = term88329;
        args[5] = null;
        args[6] = 0;
        args[7] = null;
        args[8] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


