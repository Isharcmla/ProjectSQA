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

public class CreatorProperty_init_1700879389132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118112;
     Object term118279;
     Object term118395;
     Object term118495;

    public CreatorProperty_init_1700879389132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term117388 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term117488 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term117588 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term117680 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term117836 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        Object term117936 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term117388, term117388.getClass(), "_metadata", term117488);
        setIntField(term117388, term117388.getClass(), "_propertyIndex", 0);
        setField(term117388, term117388.getClass(), "_propName", null);
        setField(term117388, term117388.getClass(), "_type", term117588);
        setField(term117388, term117388.getClass(), "_wrapperName", term117680);
        setField(term117388, term117388.getClass(), "_contextAnnotations", term117836);
        setField(term117388, term117388.getClass(), "_viewMatcher", term117936);
        term118112 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term118112, term118112.getClass(), "_simpleName", "");
        term118279 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        term118395 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term118495 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
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
        args[0] = term118112;
        args[1] = null;
        args[2] = term118112;
        args[3] = term118279;
        args[4] = term118395;
        args[5] = null;
        args[6] = 0;
        args[7] = null;
        args[8] = term118495;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


