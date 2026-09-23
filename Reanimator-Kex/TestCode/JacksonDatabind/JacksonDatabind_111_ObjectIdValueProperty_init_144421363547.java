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

public class ObjectIdValueProperty_init_144421363547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23574;
     Object term23807;
     Object term23821;
     Object term23826;
     Object term23830;

    public ObjectIdValueProperty_init_144421363547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23574 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term23624 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term23574, term23574.getClass(), "_metadata", term23624);
        setField(term23574, term23574.getClass(), "_propertyFormat", null);
        setIntField(term23574, term23574.getClass(), "_propertyIndex", 0);
        setField(term23574, term23574.getClass(), "_propName", null);
        setField(term23574, term23574.getClass(), "_type", null);
        setField(term23574, term23574.getClass(), "_wrapperName", null);
        setField(term23574, term23574.getClass(), "_contextAnnotations", null);
        setField(term23574, term23574.getClass(), "_valueTypeDeserializer", null);
        setField(term23574, term23574.getClass(), "_managedReferenceName", "");
        term23807 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer"));
        term23821 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term23822 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer"));
        Object term23825 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term23821, term23821.getClass(), "_objectIdReader", null);
        setField(term23821, term23821.getClass(), "_propName", null);
        setField(term23821, term23821.getClass(), "_type", null);
        setField(term23821, term23821.getClass(), "_wrapperName", null);
        setField(term23821, term23821.getClass(), "_contextAnnotations", null);
        setField(term23822, term23822.getClass(), "_nullValue", null);
        setField(term23822, term23822.getClass(), "_emptyValue", null);
        setBooleanField(term23822, term23822.getClass(), "_primitive", false);
        setField(term23822, term23822.getClass(), "_valueClass", null);
        setField(term23821, term23821.getClass(), "_valueDeserializer", term23822);
        setField(term23821, term23821.getClass(), "_valueTypeDeserializer", null);
        setField(term23821, term23821.getClass(), "_nullProvider", null);
        setField(term23821, term23821.getClass(), "_managedReferenceName", "");
        setField(term23821, term23821.getClass(), "_objectIdInfo", null);
        setField(term23821, term23821.getClass(), "_viewMatcher", null);
        setIntField(term23821, term23821.getClass(), "_propertyIndex", 0);
        setField(term23825, term23825.getClass(), "_required", null);
        setField(term23825, term23825.getClass(), "_description", null);
        setField(term23825, term23825.getClass(), "_index", null);
        setField(term23825, term23825.getClass(), "_defaultValue", null);
        setField(term23825, term23825.getClass(), "_mergeInfo", null);
        setField(term23825, term23825.getClass(), "_valueNulls", null);
        setField(term23825, term23825.getClass(), "_contentNulls", null);
        setField(term23821, term23821.getClass(), "_metadata", term23825);
        setField(term23821, term23821.getClass(), "_propertyFormat", null);
        setField(term23821, term23821.getClass(), "_aliases", null);
        term23826 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term23829 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term23826, term23826.getClass(), "_objectIdReader", null);
        setField(term23826, term23826.getClass(), "_propName", null);
        setField(term23826, term23826.getClass(), "_type", null);
        setField(term23826, term23826.getClass(), "_wrapperName", null);
        setField(term23826, term23826.getClass(), "_contextAnnotations", null);
        setField(term23826, term23826.getClass(), "_valueDeserializer", null);
        setField(term23826, term23826.getClass(), "_valueTypeDeserializer", null);
        setField(term23826, term23826.getClass(), "_nullProvider", null);
        setField(term23826, term23826.getClass(), "_managedReferenceName", "");
        setField(term23826, term23826.getClass(), "_objectIdInfo", null);
        setField(term23826, term23826.getClass(), "_viewMatcher", null);
        setIntField(term23826, term23826.getClass(), "_propertyIndex", 0);
        setField(term23829, term23829.getClass(), "_required", null);
        setField(term23829, term23829.getClass(), "_description", null);
        setField(term23829, term23829.getClass(), "_index", null);
        setField(term23829, term23829.getClass(), "_defaultValue", null);
        setField(term23829, term23829.getClass(), "_mergeInfo", null);
        setField(term23829, term23829.getClass(), "_valueNulls", null);
        setField(term23829, term23829.getClass(), "_contentNulls", null);
        setField(term23826, term23826.getClass(), "_metadata", term23829);
        setField(term23826, term23826.getClass(), "_propertyFormat", null);
        setField(term23826, term23826.getClass(), "_aliases", null);
        term23830 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer"));
        setField(term23830, term23830.getClass(), "_nullValue", null);
        setField(term23830, term23830.getClass(), "_emptyValue", null);
        setBooleanField(term23830, term23830.getClass(), "_primitive", false);
        setField(term23830, term23830.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term23574;
        args[1] = term23807;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term23821));
        assertTrue(recursiveEquals(term23574, term23826));
        assertTrue(recursiveEquals(term23807, term23830));
    }

};


