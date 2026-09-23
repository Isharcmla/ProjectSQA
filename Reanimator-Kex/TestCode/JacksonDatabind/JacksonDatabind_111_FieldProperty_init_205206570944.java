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
import java.lang.IllegalArgumentException;
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FieldProperty_init_205206570944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8358;

    public FieldProperty_init_205206570944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7250 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term7350 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term7454 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term7550 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term7642 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term7808 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$DoubleDeser"));
        Object term7956 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term8124 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider"));
        Object term9419 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term7250, term7250.getClass(), "_metadata", term7350);
        setField(term7250, term7250.getClass(), "_propertyFormat", term7454);
        setIntField(term7250, term7250.getClass(), "_propertyIndex", 0);
        setField(term7250, term7250.getClass(), "_propName", null);
        setField(term7250, term7250.getClass(), "_type", term7550);
        setField(term7250, term7250.getClass(), "_wrapperName", term7642);
        setField(term7250, term7250.getClass(), "_contextAnnotations", null);
        setField(term7250, term7250.getClass(), "_valueDeserializer", term7808);
        setField(term7250, term7250.getClass(), "_valueTypeDeserializer", term7956);
        setField(term7250, term7250.getClass(), "_managedReferenceName", "");
        setField(term7250, term7250.getClass(), "_viewMatcher", null);
        setField(term7250, term7250.getClass(), "_nullProvider", term8124);
        setField(term7250, term7250.getClass(), "_annotated", term9419);
        term8358 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term8458 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term8562 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term8654 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term8750 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term8842 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term8998 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        Object term9118 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumDeserializer"));
        Object term9260 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        Object term9360 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term8358, term8358.getClass(), "_metadata", term8458);
        setField(term8358, term8358.getClass(), "_propertyFormat", term8562);
        setField(term8358, term8358.getClass(), "_propName", term8654);
        setField(term8358, term8358.getClass(), "_type", term8750);
        setField(term8358, term8358.getClass(), "_wrapperName", term8842);
        setField(term8358, term8358.getClass(), "_contextAnnotations", term8998);
        setField(term8358, term8358.getClass(), "_valueDeserializer", term9118);
        setField(term8358, term8358.getClass(), "_valueTypeDeserializer", term9260);
        setField(term8358, term8358.getClass(), "_managedReferenceName", null);
        setIntField(term8358, term8358.getClass(), "_propertyIndex", 0);
        setField(term8358, term8358.getClass(), "_viewMatcher", term9360);
        setField(term8358, term8358.getClass(), "_nullProvider", null);
        setField(term8358, term8358.getClass(), "_annotated", term9419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        Object[] args = new Object[1];
        args[0] = term8358;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


