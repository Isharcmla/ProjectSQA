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
import java.lang.String;

public class FieldProperty_init_205206570950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13615;

    public FieldProperty_init_205206570950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13011 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term13111 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term13227 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term13811 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        Object term13499 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer"));
        setField(term13011, term13011.getClass(), "_metadata", term13111);
        setField(term13011, term13011.getClass(), "_propertyFormat", null);
        setIntField(term13011, term13011.getClass(), "_propertyIndex", 0);
        setField(term13011, term13011.getClass(), "_propName", null);
        setField(term13011, term13011.getClass(), "_type", null);
        setField(term13011, term13011.getClass(), "_wrapperName", null);
        setField(term13011, term13011.getClass(), "_contextAnnotations", term13227);
        setField(term13011, term13011.getClass(), "_valueDeserializer", null);
        setField(term13011, term13011.getClass(), "_valueTypeDeserializer", null);
        setField(term13011, term13011.getClass(), "_managedReferenceName", null);
        setField(term13011, term13011.getClass(), "_viewMatcher", term13811);
        setField(term13011, term13011.getClass(), "_nullProvider", term13499);
        setField(term13011, term13011.getClass(), "_annotated", null);
        Class<? extends Object> term15758 = Class.forName((String) "java.util.stream.Streams$IntStreamBuilderImpl");
        Field term13981 = ((Class) term15758).getDeclaredField((String) "first");
        ((Field) term13981).setAccessible(false);
        term13615 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term13761 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term13929 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term13615, term13615.getClass(), "_metadata", null);
        setField(term13615, term13615.getClass(), "_propertyFormat", null);
        setField(term13615, term13615.getClass(), "_propName", null);
        setField(term13615, term13615.getClass(), "_type", null);
        setField(term13615, term13615.getClass(), "_wrapperName", null);
        setField(term13615, term13615.getClass(), "_contextAnnotations", null);
        setField(term13615, term13615.getClass(), "_valueDeserializer", null);
        setField(term13615, term13615.getClass(), "_valueTypeDeserializer", term13761);
        setField(term13615, term13615.getClass(), "_managedReferenceName", null);
        setIntField(term13615, term13615.getClass(), "_propertyIndex", 0);
        setField(term13615, term13615.getClass(), "_viewMatcher", term13811);
        setField(term13615, term13615.getClass(), "_nullProvider", null);
        setField(term13929, term13929.getClass(), "_field", term13981);
        setField(term13615, term13615.getClass(), "_annotated", term13929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        Object[] args = new Object[1];
        args[0] = term13615;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


