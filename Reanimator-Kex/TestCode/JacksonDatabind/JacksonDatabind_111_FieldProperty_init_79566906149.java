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

public class FieldProperty_init_79566906149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112803;
     Object term113051;
     Object term113199;

    public FieldProperty_init_79566906149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term112301 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term112393 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term112513 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term112669 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        setField(term112301, term112301.getClass(), "_metadata", null);
        setIntField(term112301, term112301.getClass(), "_propertyIndex", 0);
        setField(term112301, term112301.getClass(), "_propName", term112393);
        setField(term112301, term112301.getClass(), "_type", term112513);
        setField(term112301, term112301.getClass(), "_wrapperName", null);
        setField(term112301, term112301.getClass(), "_contextAnnotations", term112669);
        setField(term112301, term112301.getClass(), "_viewMatcher", null);
        term112803 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term112951 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term112803, term112803.getClass(), "_fullName", null);
        setField(term112803, term112803.getClass(), "_annotationIntrospector", term112951);
        setField(term112803, term112803.getClass(), "_member", null);
        setField(term112803, term112803.getClass(), "_metadata", null);
        term113051 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term113199 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
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
        args[0] = term112803;
        args[1] = term113051;
        args[2] = term113199;
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


