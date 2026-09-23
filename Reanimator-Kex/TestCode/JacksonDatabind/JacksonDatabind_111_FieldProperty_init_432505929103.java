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

public class FieldProperty_init_432505929103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44325;
     Object term45507;

    public FieldProperty_init_432505929103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47288 = Class.forName((String) "java.lang.FdLibm$Exp");
        Field term44209 = ((Class) term47288).getDeclaredField((String) "one");
        ((Field) term44209).setAccessible(false);
        Object term42931 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term43031 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term43123 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term43223 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term43315 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term43471 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        Object term43617 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term43819 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$FloatDeser"));
        Object term43919 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        Object term44039 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumDeserializer"));
        Object term44157 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term42931, term42931.getClass(), "_metadata", term43031);
        setField(term42931, term42931.getClass(), "_propertyFormat", null);
        setIntField(term42931, term42931.getClass(), "_propertyIndex", 0);
        setField(term42931, term42931.getClass(), "_propName", term43123);
        setField(term42931, term42931.getClass(), "_type", term43223);
        setField(term42931, term42931.getClass(), "_wrapperName", term43315);
        setField(term42931, term42931.getClass(), "_contextAnnotations", term43471);
        setField(term42931, term42931.getClass(), "_valueTypeDeserializer", term43617);
        setField(term42931, term42931.getClass(), "_managedReferenceName", "");
        setField(term42931, term42931.getClass(), "_valueDeserializer", term43819);
        setField(term42931, term42931.getClass(), "_viewMatcher", term43919);
        setField(term42931, term42931.getClass(), "_nullProvider", term44039);
        setField(term42931, term42931.getClass(), "_annotated", term44157);
        setField(term42931, term42931.getClass(), "_field", term44209);
        Class<? extends Object> term47380 = Class.forName((String) "java.util.regex.Matcher$1MatchResultIterator");
        Field term45337 = ((Class) term47380).getDeclaredField((String) "this$0");
        ((Field) term45337).setAccessible(false);
        term44325 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term44425 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term44529 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term44621 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term44735 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term44827 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term44983 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        Object term45129 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term45285 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term44325, term44325.getClass(), "_metadata", term44425);
        setField(term44325, term44325.getClass(), "_propertyFormat", term44529);
        setField(term44325, term44325.getClass(), "_propName", term44621);
        setField(term44325, term44325.getClass(), "_type", term44735);
        setField(term44325, term44325.getClass(), "_wrapperName", term44827);
        setField(term44325, term44325.getClass(), "_contextAnnotations", term44983);
        setField(term44325, term44325.getClass(), "_valueTypeDeserializer", term45129);
        setField(term44325, term44325.getClass(), "_managedReferenceName", "");
        setIntField(term44325, term44325.getClass(), "_propertyIndex", 0);
        setField(term44325, term44325.getClass(), "_viewMatcher", null);
        setField(term44325, term44325.getClass(), "_annotated", term45285);
        setField(term44325, term44325.getClass(), "_field", term45337);
        term45507 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term44325;
        args[1] = term45507;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


