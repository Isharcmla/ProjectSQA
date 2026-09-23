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

public class ObjectIdValueProperty_init_144421363537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7696;
     Object term8600;

    public ObjectIdValueProperty_init_144421363537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6568 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term6668 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term6772 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term6864 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term6956 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term7114 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        Object term7260 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term7464 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$DoubleDeser"));
        Object term7564 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term6568, term6568.getClass(), "_metadata", term6668);
        setField(term6568, term6568.getClass(), "_propertyFormat", term6772);
        setIntField(term6568, term6568.getClass(), "_propertyIndex", 0);
        setField(term6568, term6568.getClass(), "_propName", term6864);
        setField(term6568, term6568.getClass(), "_type", null);
        setField(term6568, term6568.getClass(), "_wrapperName", term6956);
        setField(term6568, term6568.getClass(), "_contextAnnotations", term7114);
        setField(term6568, term6568.getClass(), "_valueTypeDeserializer", term7260);
        setField(term6568, term6568.getClass(), "_managedReferenceName", "");
        setField(term6568, term6568.getClass(), "_valueDeserializer", term7464);
        setField(term6568, term6568.getClass(), "_viewMatcher", term7564);
        term7696 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term7800 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term7892 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term8006 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term8098 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term8214 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term8362 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        Object term8462 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term7696, term7696.getClass(), "_metadata", null);
        setField(term7696, term7696.getClass(), "_propertyFormat", term7800);
        setField(term7696, term7696.getClass(), "_propName", term7892);
        setField(term7696, term7696.getClass(), "_type", term8006);
        setField(term7696, term7696.getClass(), "_wrapperName", term8098);
        setField(term7696, term7696.getClass(), "_contextAnnotations", term8214);
        setField(term7696, term7696.getClass(), "_valueTypeDeserializer", term8362);
        setField(term7696, term7696.getClass(), "_managedReferenceName", null);
        setIntField(term7696, term7696.getClass(), "_propertyIndex", 0);
        setField(term7696, term7696.getClass(), "_viewMatcher", term8462);
        term8600 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term7696;
        args[1] = null;
        args[2] = term8600;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


