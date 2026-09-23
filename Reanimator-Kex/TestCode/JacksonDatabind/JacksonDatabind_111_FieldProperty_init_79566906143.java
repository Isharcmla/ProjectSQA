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

public class FieldProperty_init_79566906143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103353;
     Object term103777;

    public FieldProperty_init_79566906143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term102763 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term102863 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term102955 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term103061 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term103219 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        setField(term102763, term102763.getClass(), "_metadata", term102863);
        setIntField(term102763, term102763.getClass(), "_propertyIndex", 0);
        setField(term102763, term102763.getClass(), "_propName", term102955);
        setField(term102763, term102763.getClass(), "_type", term103061);
        setField(term102763, term102763.getClass(), "_wrapperName", null);
        setField(term102763, term102763.getClass(), "_contextAnnotations", term103219);
        setField(term102763, term102763.getClass(), "_viewMatcher", null);
        term103353 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term103445 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term103631 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term103445, term103445.getClass(), "_simpleName", "");
        setField(term103353, term103353.getClass(), "_fullName", term103445);
        setField(term103353, term103353.getClass(), "_annotationIntrospector", term103631);
        setField(term103353, term103353.getClass(), "_member", null);
        setField(term103353, term103353.getClass(), "_metadata", null);
        term103777 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField");
        Object[] args = new Object[5];
        args[0] = term103353;
        args[1] = null;
        args[2] = term103777;
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


