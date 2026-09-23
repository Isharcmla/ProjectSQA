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

public class CreatorProperty_init_99100375361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12085;
     Object term12314;
     Object term13459;
     Object term13464;
     Object term13468;

    public CreatorProperty_init_99100375361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12085 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term12135 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term12085, term12085.getClass(), "_metadata", term12135);
        setField(term12085, term12085.getClass(), "_propertyFormat", null);
        setIntField(term12085, term12085.getClass(), "_propertyIndex", 0);
        setField(term12085, term12085.getClass(), "_propName", null);
        setField(term12085, term12085.getClass(), "_type", null);
        setField(term12085, term12085.getClass(), "_wrapperName", null);
        setField(term12085, term12085.getClass(), "_contextAnnotations", null);
        setField(term12085, term12085.getClass(), "_valueTypeDeserializer", null);
        setField(term12085, term12085.getClass(), "_managedReferenceName", "");
        term12314 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer"));
        term13459 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term13460 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer"));
        Object term13463 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term13459, term13459.getClass(), "_annotated", null);
        setField(term13459, term13459.getClass(), "_injectableValueId", null);
        setField(term13459, term13459.getClass(), "_fallbackSetter", null);
        setIntField(term13459, term13459.getClass(), "_creatorIndex", 0);
        setBooleanField(term13459, term13459.getClass(), "_ignorable", false);
        setField(term13459, term13459.getClass(), "_propName", null);
        setField(term13459, term13459.getClass(), "_type", null);
        setField(term13459, term13459.getClass(), "_wrapperName", null);
        setField(term13459, term13459.getClass(), "_contextAnnotations", null);
        setField(term13460, term13460.getClass(), "_nullValue", null);
        setField(term13460, term13460.getClass(), "_emptyValue", null);
        setBooleanField(term13460, term13460.getClass(), "_primitive", false);
        setField(term13460, term13460.getClass(), "_valueClass", null);
        setField(term13459, term13459.getClass(), "_valueDeserializer", term13460);
        setField(term13459, term13459.getClass(), "_valueTypeDeserializer", null);
        setField(term13459, term13459.getClass(), "_nullProvider", null);
        setField(term13459, term13459.getClass(), "_managedReferenceName", "");
        setField(term13459, term13459.getClass(), "_objectIdInfo", null);
        setField(term13459, term13459.getClass(), "_viewMatcher", null);
        setIntField(term13459, term13459.getClass(), "_propertyIndex", 0);
        setField(term13463, term13463.getClass(), "_required", null);
        setField(term13463, term13463.getClass(), "_description", null);
        setField(term13463, term13463.getClass(), "_index", null);
        setField(term13463, term13463.getClass(), "_defaultValue", null);
        setField(term13463, term13463.getClass(), "_mergeInfo", null);
        setField(term13463, term13463.getClass(), "_valueNulls", null);
        setField(term13463, term13463.getClass(), "_contentNulls", null);
        setField(term13459, term13459.getClass(), "_metadata", term13463);
        setField(term13459, term13459.getClass(), "_propertyFormat", null);
        setField(term13459, term13459.getClass(), "_aliases", null);
        term13464 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term13467 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term13464, term13464.getClass(), "_annotated", null);
        setField(term13464, term13464.getClass(), "_injectableValueId", null);
        setField(term13464, term13464.getClass(), "_fallbackSetter", null);
        setIntField(term13464, term13464.getClass(), "_creatorIndex", 0);
        setBooleanField(term13464, term13464.getClass(), "_ignorable", false);
        setField(term13464, term13464.getClass(), "_propName", null);
        setField(term13464, term13464.getClass(), "_type", null);
        setField(term13464, term13464.getClass(), "_wrapperName", null);
        setField(term13464, term13464.getClass(), "_contextAnnotations", null);
        setField(term13464, term13464.getClass(), "_valueDeserializer", null);
        setField(term13464, term13464.getClass(), "_valueTypeDeserializer", null);
        setField(term13464, term13464.getClass(), "_nullProvider", null);
        setField(term13464, term13464.getClass(), "_managedReferenceName", "");
        setField(term13464, term13464.getClass(), "_objectIdInfo", null);
        setField(term13464, term13464.getClass(), "_viewMatcher", null);
        setIntField(term13464, term13464.getClass(), "_propertyIndex", 0);
        setField(term13467, term13467.getClass(), "_required", null);
        setField(term13467, term13467.getClass(), "_description", null);
        setField(term13467, term13467.getClass(), "_index", null);
        setField(term13467, term13467.getClass(), "_defaultValue", null);
        setField(term13467, term13467.getClass(), "_mergeInfo", null);
        setField(term13467, term13467.getClass(), "_valueNulls", null);
        setField(term13467, term13467.getClass(), "_contentNulls", null);
        setField(term13464, term13464.getClass(), "_metadata", term13467);
        setField(term13464, term13464.getClass(), "_propertyFormat", null);
        setField(term13464, term13464.getClass(), "_aliases", null);
        term13468 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer"));
        setField(term13468, term13468.getClass(), "_nullValue", null);
        setField(term13468, term13468.getClass(), "_emptyValue", null);
        setBooleanField(term13468, term13468.getClass(), "_primitive", false);
        setField(term13468, term13468.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term12085;
        args[1] = term12314;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13459));
        assertTrue(recursiveEquals(term12085, term13464));
        assertTrue(recursiveEquals(term12314, term13468));
    }

};


