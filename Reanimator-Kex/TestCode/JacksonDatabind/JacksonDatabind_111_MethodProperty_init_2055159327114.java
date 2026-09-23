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

public class MethodProperty_init_2055159327114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52627;
     Object term53563;

    public MethodProperty_init_2055159327114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term51539 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        Object term51639 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term51743 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term51835 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term51927 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term52085 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        Object term52233 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        Object term52409 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer"));
        Object term52509 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term51539, term51539.getClass(), "_metadata", term51639);
        setField(term51539, term51539.getClass(), "_propertyFormat", term51743);
        setIntField(term51539, term51539.getClass(), "_propertyIndex", 0);
        setField(term51539, term51539.getClass(), "_propName", term51835);
        setField(term51539, term51539.getClass(), "_type", null);
        setField(term51539, term51539.getClass(), "_wrapperName", term51927);
        setField(term51539, term51539.getClass(), "_contextAnnotations", term52085);
        setField(term51539, term51539.getClass(), "_valueTypeDeserializer", term52233);
        setField(term51539, term51539.getClass(), "_managedReferenceName", "");
        setField(term51539, term51539.getClass(), "_valueDeserializer", term52409);
        setField(term51539, term51539.getClass(), "_viewMatcher", term52509);
        term52627 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        Object term52731 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term52823 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term52943 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term53035 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term53191 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        Object term53339 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term53439 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term52627, term52627.getClass(), "_metadata", null);
        setField(term52627, term52627.getClass(), "_propertyFormat", term52731);
        setField(term52627, term52627.getClass(), "_propName", term52823);
        setField(term52627, term52627.getClass(), "_type", term52943);
        setField(term52627, term52627.getClass(), "_wrapperName", term53035);
        setField(term52627, term52627.getClass(), "_contextAnnotations", term53191);
        setField(term52627, term52627.getClass(), "_valueTypeDeserializer", term53339);
        setField(term52627, term52627.getClass(), "_managedReferenceName", null);
        setIntField(term52627, term52627.getClass(), "_propertyIndex", 0);
        setField(term52627, term52627.getClass(), "_viewMatcher", term53439);
        term53563 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term52627;
        args[1] = null;
        args[2] = term53563;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


