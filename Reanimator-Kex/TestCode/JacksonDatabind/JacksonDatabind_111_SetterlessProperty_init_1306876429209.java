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

public class SetterlessProperty_init_1306876429209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126672;
     Object term127640;

    public SetterlessProperty_init_1306876429209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term125568 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term125668 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term125772 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term125864 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term125956 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term126114 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        Object term126262 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        Object term126446 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer"));
        Object term126546 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term125568, term125568.getClass(), "_metadata", term125668);
        setField(term125568, term125568.getClass(), "_propertyFormat", term125772);
        setIntField(term125568, term125568.getClass(), "_propertyIndex", 0);
        setField(term125568, term125568.getClass(), "_propName", term125864);
        setField(term125568, term125568.getClass(), "_type", null);
        setField(term125568, term125568.getClass(), "_wrapperName", term125956);
        setField(term125568, term125568.getClass(), "_contextAnnotations", term126114);
        setField(term125568, term125568.getClass(), "_valueTypeDeserializer", term126262);
        setField(term125568, term125568.getClass(), "_managedReferenceName", "");
        setField(term125568, term125568.getClass(), "_valueDeserializer", term126446);
        setField(term125568, term125568.getClass(), "_viewMatcher", term126546);
        term126672 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term126776 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term126868 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term126982 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term127074 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term127230 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        Object term127378 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        Object term127478 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term126672, term126672.getClass(), "_metadata", null);
        setField(term126672, term126672.getClass(), "_propertyFormat", term126776);
        setField(term126672, term126672.getClass(), "_propName", term126868);
        setField(term126672, term126672.getClass(), "_type", term126982);
        setField(term126672, term126672.getClass(), "_wrapperName", term127074);
        setField(term126672, term126672.getClass(), "_contextAnnotations", term127230);
        setField(term126672, term126672.getClass(), "_valueTypeDeserializer", term127378);
        setField(term126672, term126672.getClass(), "_managedReferenceName", null);
        setIntField(term126672, term126672.getClass(), "_propertyIndex", 0);
        setField(term126672, term126672.getClass(), "_viewMatcher", term127478);
        term127640 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term126672;
        args[1] = null;
        args[2] = term127640;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


