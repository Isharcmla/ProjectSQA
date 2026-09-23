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

public class SetterlessProperty_init_1578804247362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260397;
     Object term260687;
     Object term260843;

    public SetterlessProperty_init_1578804247362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term259721 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term259821 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term259913 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term260013 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term260169 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        Object term260269 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term259721, term259721.getClass(), "_metadata", term259821);
        setIntField(term259721, term259721.getClass(), "_propertyIndex", 0);
        setField(term259721, term259721.getClass(), "_propName", term259913);
        setField(term259721, term259721.getClass(), "_type", term260013);
        setField(term259721, term259721.getClass(), "_wrapperName", term259913);
        setField(term259721, term259721.getClass(), "_contextAnnotations", term260169);
        setField(term259721, term259721.getClass(), "_viewMatcher", term260269);
        term260397 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term260539 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term260397, term260397.getClass(), "_name", null);
        setBooleanField(term260397, term260397.getClass(), "_forSerialization", true);
        setField(term260397, term260397.getClass(), "_getters", null);
        setField(term260397, term260397.getClass(), "_fields", null);
        setField(term260397, term260397.getClass(), "_metadata", null);
        setField(term260397, term260397.getClass(), "_annotationIntrospector", term260539);
        term260687 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        term260843 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
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
        args[0] = term260397;
        args[1] = null;
        args[2] = term260687;
        args[3] = term260843;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


