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

public class CreatorProperty_init_99100375359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10003;
     Object term10911;

    public CreatorProperty_init_99100375359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8935 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term9035 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term9139 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term9231 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term9323 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term9481 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        Object term9627 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term9793 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        Object term9893 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term8935, term8935.getClass(), "_metadata", term9035);
        setField(term8935, term8935.getClass(), "_propertyFormat", term9139);
        setIntField(term8935, term8935.getClass(), "_propertyIndex", 0);
        setField(term8935, term8935.getClass(), "_propName", term9231);
        setField(term8935, term8935.getClass(), "_type", null);
        setField(term8935, term8935.getClass(), "_wrapperName", term9323);
        setField(term8935, term8935.getClass(), "_contextAnnotations", term9481);
        setField(term8935, term8935.getClass(), "_valueTypeDeserializer", term9627);
        setField(term8935, term8935.getClass(), "_managedReferenceName", "");
        setField(term8935, term8935.getClass(), "_valueDeserializer", term9793);
        setField(term8935, term8935.getClass(), "_viewMatcher", term9893);
        term10003 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term10107 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term10199 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term10295 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term10387 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term10543 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        Object term10691 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term10791 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term10003, term10003.getClass(), "_metadata", null);
        setField(term10003, term10003.getClass(), "_propertyFormat", term10107);
        setField(term10003, term10003.getClass(), "_propName", term10199);
        setField(term10003, term10003.getClass(), "_type", term10295);
        setField(term10003, term10003.getClass(), "_wrapperName", term10387);
        setField(term10003, term10003.getClass(), "_contextAnnotations", term10543);
        setField(term10003, term10003.getClass(), "_valueTypeDeserializer", term10691);
        setField(term10003, term10003.getClass(), "_managedReferenceName", null);
        setIntField(term10003, term10003.getClass(), "_propertyIndex", 0);
        setField(term10003, term10003.getClass(), "_viewMatcher", term10791);
        term10911 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumDeserializer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term10003;
        args[1] = null;
        args[2] = term10911;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


