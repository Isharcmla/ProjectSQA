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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.lang.Object;

public class ObjectIdValueProperty_init_120889015736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7233;
     Object term7747;
     Object term8517;
     Object term8524;
     Object term8530;

    public ObjectIdValueProperty_init_120889015736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6689 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term6789 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term7285 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term6985 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term7101 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term6689, term6689.getClass(), "_metadata", term6789);
        setField(term6689, term6689.getClass(), "_format", term7285);
        setIntField(term6689, term6689.getClass(), "_propertyIndex", 0);
        setField(term6689, term6689.getClass(), "_propName", null);
        setField(term6689, term6689.getClass(), "_type", null);
        setField(term6689, term6689.getClass(), "_wrapperName", term6985);
        setField(term6689, term6689.getClass(), "_contextAnnotations", term7101);
        setField(term6689, term6689.getClass(), "_valueTypeDeserializer", null);
        setField(term6689, term6689.getClass(), "_managedReferenceName", null);
        term7233 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term7401 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term7549 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(term7233, term7233.getClass(), "_metadata", null);
        setField(term7233, term7233.getClass(), "_format", term7285);
        setField(term7233, term7233.getClass(), "_propName", null);
        setField(term7233, term7233.getClass(), "_type", null);
        setField(term7233, term7233.getClass(), "_wrapperName", null);
        setField(term7233, term7233.getClass(), "_contextAnnotations", term7401);
        setField(term7233, term7233.getClass(), "_valueTypeDeserializer", term7549);
        setField(term7233, term7233.getClass(), "_managedReferenceName", "");
        setIntField(term7233, term7233.getClass(), "_propertyIndex", 0);
        term7747 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer"));
        term8517 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term8518 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term8519 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer"));
        Object term8520 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term8523 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term8517, term8517.getClass(), "_objectIdReader", null);
        setField(term8517, term8517.getClass(), "_propName", null);
        setField(term8517, term8517.getClass(), "_type", null);
        setField(term8517, term8517.getClass(), "_wrapperName", null);
        setField(term8518, term8518.getClass(), "_annotations", null);
        setField(term8517, term8517.getClass(), "_contextAnnotations", term8518);
        setField(term8519, term8519.getClass(), "_nullValue", null);
        setBooleanField(term8519, term8519.getClass(), "_primitive", false);
        setField(term8519, term8519.getClass(), "_valueClass", null);
        setField(term8517, term8517.getClass(), "_valueDeserializer", term8519);
        setField(term8520, term8520.getClass(), "_inclusion", null);
        setField(term8520, term8520.getClass(), "_idResolver", null);
        setField(term8520, term8520.getClass(), "_baseType", null);
        setField(term8520, term8520.getClass(), "_property", null);
        setField(term8520, term8520.getClass(), "_defaultImpl", null);
        setField(term8520, term8520.getClass(), "_typePropertyName", null);
        setBooleanField(term8520, term8520.getClass(), "_typeIdVisible", false);
        setField(term8520, term8520.getClass(), "_deserializers", null);
        setField(term8520, term8520.getClass(), "_defaultImplDeserializer", null);
        setField(term8517, term8517.getClass(), "_valueTypeDeserializer", term8520);
        setField(term8517, term8517.getClass(), "_managedReferenceName", "");
        setField(term8517, term8517.getClass(), "_objectIdInfo", null);
        setField(term8517, term8517.getClass(), "_viewMatcher", null);
        setIntField(term8517, term8517.getClass(), "_propertyIndex", 0);
        setField(term8517, term8517.getClass(), "_metadata", null);
        setField(term8523, term8523.getClass(), "_pattern", null);
        setField(term8523, term8523.getClass(), "_shape", null);
        setField(term8523, term8523.getClass(), "_locale", null);
        setField(term8523, term8523.getClass(), "_timezoneStr", null);
        setField(term8523, term8523.getClass(), "_features", null);
        setField(term8523, term8523.getClass(), "_timezone", null);
        setField(term8517, term8517.getClass(), "_format", term8523);
        term8524 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term8525 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term8526 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term8529 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term8524, term8524.getClass(), "_objectIdReader", null);
        setField(term8524, term8524.getClass(), "_propName", null);
        setField(term8524, term8524.getClass(), "_type", null);
        setField(term8524, term8524.getClass(), "_wrapperName", null);
        setField(term8525, term8525.getClass(), "_annotations", null);
        setField(term8524, term8524.getClass(), "_contextAnnotations", term8525);
        setField(term8524, term8524.getClass(), "_valueDeserializer", null);
        setField(term8526, term8526.getClass(), "_inclusion", null);
        setField(term8526, term8526.getClass(), "_idResolver", null);
        setField(term8526, term8526.getClass(), "_baseType", null);
        setField(term8526, term8526.getClass(), "_property", null);
        setField(term8526, term8526.getClass(), "_defaultImpl", null);
        setField(term8526, term8526.getClass(), "_typePropertyName", null);
        setBooleanField(term8526, term8526.getClass(), "_typeIdVisible", false);
        setField(term8526, term8526.getClass(), "_deserializers", null);
        setField(term8526, term8526.getClass(), "_defaultImplDeserializer", null);
        setField(term8524, term8524.getClass(), "_valueTypeDeserializer", term8526);
        setField(term8524, term8524.getClass(), "_managedReferenceName", "");
        setField(term8524, term8524.getClass(), "_objectIdInfo", null);
        setField(term8524, term8524.getClass(), "_viewMatcher", null);
        setIntField(term8524, term8524.getClass(), "_propertyIndex", 0);
        setField(term8524, term8524.getClass(), "_metadata", null);
        setField(term8529, term8529.getClass(), "_pattern", null);
        setField(term8529, term8529.getClass(), "_shape", null);
        setField(term8529, term8529.getClass(), "_locale", null);
        setField(term8529, term8529.getClass(), "_timezoneStr", null);
        setField(term8529, term8529.getClass(), "_features", null);
        setField(term8529, term8529.getClass(), "_timezone", null);
        setField(term8524, term8524.getClass(), "_format", term8529);
        term8530 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer"));
        setField(term8530, term8530.getClass(), "_nullValue", null);
        setBooleanField(term8530, term8530.getClass(), "_primitive", false);
        setField(term8530, term8530.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Object[] args = new Object[2];
        args[0] = term7233;
        args[1] = term7747;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8517));
        assertTrue(recursiveEquals(term7233, term8524));
        assertTrue(recursiveEquals(term7747, term8530));
    }

};


