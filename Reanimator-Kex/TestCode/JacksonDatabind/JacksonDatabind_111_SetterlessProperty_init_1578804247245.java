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

public class SetterlessProperty_init_1578804247245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152466;
     Object term153124;
     Object term153280;

    public SetterlessProperty_init_1578804247245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term151990 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term152090 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term152182 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term152338 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        setField(term151990, term151990.getClass(), "_metadata", term152090);
        setIntField(term151990, term151990.getClass(), "_propertyIndex", 0);
        setField(term151990, term151990.getClass(), "_propName", term152182);
        setField(term151990, term151990.getClass(), "_type", null);
        setField(term151990, term151990.getClass(), "_wrapperName", null);
        setField(term151990, term151990.getClass(), "_contextAnnotations", term152338);
        setField(term151990, term151990.getClass(), "_viewMatcher", null);
        term152466 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term152608 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term152728 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term152876 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term152976 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term152466, term152466.getClass(), "_name", null);
        setBooleanField(term152466, term152466.getClass(), "_forSerialization", false);
        setField(term152466, term152466.getClass(), "_ctorParameters", null);
        setField(term152608, term152608.getClass(), "next", null);
        setField(term152608, term152608.getClass(), "value", term152728);
        setField(term152466, term152466.getClass(), "_setters", term152608);
        setField(term152466, term152466.getClass(), "_annotationIntrospector", term152876);
        setField(term152466, term152466.getClass(), "_metadata", term152976);
        term153124 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        term153280 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
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
        args[0] = term152466;
        args[1] = null;
        args[2] = term153124;
        args[3] = term153280;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


