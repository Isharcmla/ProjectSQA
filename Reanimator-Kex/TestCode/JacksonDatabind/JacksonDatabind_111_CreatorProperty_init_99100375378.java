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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.EqualityUtils.*;
import java.lang.Object;

public class CreatorProperty_init_99100375378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21161;
     Object term21399;
     Object term22594;
     Object term22597;
     Object term22599;

    public CreatorProperty_init_99100375378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20623 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term20723 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term20827 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term20919 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term21051 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer"));
        setField(term20623, term20623.getClass(), "_metadata", term20723);
        setField(term20623, term20623.getClass(), "_propertyFormat", term20827);
        setIntField(term20623, term20623.getClass(), "_propertyIndex", 0);
        setField(term20623, term20623.getClass(), "_propName", term20919);
        setField(term20623, term20623.getClass(), "_type", null);
        setField(term20623, term20623.getClass(), "_wrapperName", null);
        setField(term20623, term20623.getClass(), "_contextAnnotations", null);
        setField(term20623, term20623.getClass(), "_valueTypeDeserializer", null);
        setField(term20623, term20623.getClass(), "_managedReferenceName", null);
        setField(term20623, term20623.getClass(), "_valueDeserializer", term21051);
        setField(term20623, term20623.getClass(), "_viewMatcher", null);
        term21161 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term21261 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term21161, term21161.getClass(), "_metadata", null);
        setField(term21161, term21161.getClass(), "_propertyFormat", null);
        setField(term21161, term21161.getClass(), "_propName", null);
        setField(term21161, term21161.getClass(), "_type", term21261);
        setField(term21161, term21161.getClass(), "_wrapperName", null);
        setField(term21161, term21161.getClass(), "_contextAnnotations", null);
        setField(term21161, term21161.getClass(), "_valueTypeDeserializer", null);
        setField(term21161, term21161.getClass(), "_managedReferenceName", null);
        setIntField(term21161, term21161.getClass(), "_propertyIndex", 0);
        setField(term21161, term21161.getClass(), "_viewMatcher", null);
        term21399 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer"));
        term22594 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term22595 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term22596 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer"));
        setField(term22594, term22594.getClass(), "_annotated", null);
        setField(term22594, term22594.getClass(), "_injectableValueId", null);
        setField(term22594, term22594.getClass(), "_fallbackSetter", null);
        setIntField(term22594, term22594.getClass(), "_creatorIndex", 0);
        setBooleanField(term22594, term22594.getClass(), "_ignorable", false);
        setField(term22594, term22594.getClass(), "_propName", null);
        setField(term22595, term22595.getClass(), "_keyType", null);
        setField(term22595, term22595.getClass(), "_valueType", null);
        setField(term22595, term22595.getClass(), "_superClass", null);
        setField(term22595, term22595.getClass(), "_superInterfaces", null);
        setField(term22595, term22595.getClass(), "_bindings", null);
        setField(term22595, term22595.getClass(), "_canonicalName", null);
        setField(term22595, term22595.getClass(), "_class", null);
        setIntField(term22595, term22595.getClass(), "_hash", 0);
        setField(term22595, term22595.getClass(), "_valueHandler", null);
        setField(term22595, term22595.getClass(), "_typeHandler", null);
        setBooleanField(term22595, term22595.getClass(), "_asStatic", false);
        setField(term22594, term22594.getClass(), "_type", term22595);
        setField(term22594, term22594.getClass(), "_wrapperName", null);
        setField(term22594, term22594.getClass(), "_contextAnnotations", null);
        setField(term22596, term22596.getClass(), "_valueClass", null);
        setField(term22594, term22594.getClass(), "_valueDeserializer", term22596);
        setField(term22594, term22594.getClass(), "_valueTypeDeserializer", null);
        setField(term22594, term22594.getClass(), "_nullProvider", null);
        setField(term22594, term22594.getClass(), "_managedReferenceName", null);
        setField(term22594, term22594.getClass(), "_objectIdInfo", null);
        setField(term22594, term22594.getClass(), "_viewMatcher", null);
        setIntField(term22594, term22594.getClass(), "_propertyIndex", 0);
        setField(term22594, term22594.getClass(), "_metadata", null);
        setField(term22594, term22594.getClass(), "_propertyFormat", null);
        setField(term22594, term22594.getClass(), "_aliases", null);
        term22597 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term22598 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term22597, term22597.getClass(), "_annotated", null);
        setField(term22597, term22597.getClass(), "_injectableValueId", null);
        setField(term22597, term22597.getClass(), "_fallbackSetter", null);
        setIntField(term22597, term22597.getClass(), "_creatorIndex", 0);
        setBooleanField(term22597, term22597.getClass(), "_ignorable", false);
        setField(term22597, term22597.getClass(), "_propName", null);
        setField(term22598, term22598.getClass(), "_keyType", null);
        setField(term22598, term22598.getClass(), "_valueType", null);
        setField(term22598, term22598.getClass(), "_superClass", null);
        setField(term22598, term22598.getClass(), "_superInterfaces", null);
        setField(term22598, term22598.getClass(), "_bindings", null);
        setField(term22598, term22598.getClass(), "_canonicalName", null);
        setField(term22598, term22598.getClass(), "_class", null);
        setIntField(term22598, term22598.getClass(), "_hash", 0);
        setField(term22598, term22598.getClass(), "_valueHandler", null);
        setField(term22598, term22598.getClass(), "_typeHandler", null);
        setBooleanField(term22598, term22598.getClass(), "_asStatic", false);
        setField(term22597, term22597.getClass(), "_type", term22598);
        setField(term22597, term22597.getClass(), "_wrapperName", null);
        setField(term22597, term22597.getClass(), "_contextAnnotations", null);
        setField(term22597, term22597.getClass(), "_valueDeserializer", null);
        setField(term22597, term22597.getClass(), "_valueTypeDeserializer", null);
        setField(term22597, term22597.getClass(), "_nullProvider", null);
        setField(term22597, term22597.getClass(), "_managedReferenceName", null);
        setField(term22597, term22597.getClass(), "_objectIdInfo", null);
        setField(term22597, term22597.getClass(), "_viewMatcher", null);
        setIntField(term22597, term22597.getClass(), "_propertyIndex", 0);
        setField(term22597, term22597.getClass(), "_metadata", null);
        setField(term22597, term22597.getClass(), "_propertyFormat", null);
        setField(term22597, term22597.getClass(), "_aliases", null);
        term22599 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer"));
        setField(term22599, term22599.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term21161;
        args[1] = term21399;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22594));
        assertTrue(recursiveEquals(term21161, term22597));
        assertTrue(recursiveEquals(term21399, term22599));
    }

};


