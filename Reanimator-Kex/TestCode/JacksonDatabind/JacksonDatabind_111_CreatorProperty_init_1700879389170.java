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

public class CreatorProperty_init_1700879389170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244959;
     Object term245103;
     Object term245251;
     Object term245367;

    public CreatorProperty_init_1700879389170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term244327 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term244427 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term244519 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term244611 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term244767 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        Object term244867 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term244327, term244327.getClass(), "_metadata", term244427);
        setIntField(term244327, term244327.getClass(), "_propertyIndex", 0);
        setField(term244327, term244327.getClass(), "_propName", term244519);
        setField(term244327, term244327.getClass(), "_type", null);
        setField(term244327, term244327.getClass(), "_wrapperName", term244611);
        setField(term244327, term244327.getClass(), "_contextAnnotations", term244767);
        setField(term244327, term244327.getClass(), "_viewMatcher", term244867);
        term244959 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term244959, term244959.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        term245103 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term245251 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        term245367 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
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
        args[0] = term244959;
        args[1] = term245103;
        args[2] = null;
        args[3] = term245251;
        args[4] = term245367;
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


