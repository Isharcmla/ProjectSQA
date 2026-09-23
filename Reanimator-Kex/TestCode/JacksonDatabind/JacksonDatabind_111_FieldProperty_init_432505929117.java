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

public class FieldProperty_init_432505929117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73638;
     Object term74586;

    public FieldProperty_init_432505929117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term72566 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term72666 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term72770 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term72862 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term72954 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term73112 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        Object term73260 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term73422 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        Object term73522 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term72566, term72566.getClass(), "_metadata", term72666);
        setField(term72566, term72566.getClass(), "_propertyFormat", term72770);
        setIntField(term72566, term72566.getClass(), "_propertyIndex", 0);
        setField(term72566, term72566.getClass(), "_propName", term72862);
        setField(term72566, term72566.getClass(), "_type", null);
        setField(term72566, term72566.getClass(), "_wrapperName", term72954);
        setField(term72566, term72566.getClass(), "_contextAnnotations", term73112);
        setField(term72566, term72566.getClass(), "_valueTypeDeserializer", term73260);
        setField(term72566, term72566.getClass(), "_managedReferenceName", "");
        setField(term72566, term72566.getClass(), "_valueDeserializer", term73422);
        setField(term72566, term72566.getClass(), "_viewMatcher", term73522);
        term73638 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term73742 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term73834 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term73930 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term74022 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term74178 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        Object term74324 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term74424 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term73638, term73638.getClass(), "_metadata", null);
        setField(term73638, term73638.getClass(), "_propertyFormat", term73742);
        setField(term73638, term73638.getClass(), "_propName", term73834);
        setField(term73638, term73638.getClass(), "_type", term73930);
        setField(term73638, term73638.getClass(), "_wrapperName", term74022);
        setField(term73638, term73638.getClass(), "_contextAnnotations", term74178);
        setField(term73638, term73638.getClass(), "_valueTypeDeserializer", term74324);
        setField(term73638, term73638.getClass(), "_managedReferenceName", null);
        setIntField(term73638, term73638.getClass(), "_propertyIndex", 0);
        setField(term73638, term73638.getClass(), "_viewMatcher", term74424);
        term74586 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term73638;
        args[1] = null;
        args[2] = term74586;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


