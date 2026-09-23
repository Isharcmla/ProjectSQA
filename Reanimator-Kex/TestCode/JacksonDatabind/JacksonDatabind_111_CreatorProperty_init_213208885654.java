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

public class CreatorProperty_init_213208885654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8466;
     Object term8770;
     Object term8771;

    public CreatorProperty_init_213208885654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8466 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        term8770 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(term8770, term8770.getClass(), "_annotated", null);
        setField(term8770, term8770.getClass(), "_injectableValueId", null);
        setField(term8770, term8770.getClass(), "_fallbackSetter", null);
        setIntField(term8770, term8770.getClass(), "_creatorIndex", 0);
        setBooleanField(term8770, term8770.getClass(), "_ignorable", false);
        setField(term8770, term8770.getClass(), "_propName", null);
        setField(term8770, term8770.getClass(), "_type", null);
        setField(term8770, term8770.getClass(), "_wrapperName", null);
        setField(term8770, term8770.getClass(), "_contextAnnotations", null);
        setField(term8770, term8770.getClass(), "_valueDeserializer", null);
        setField(term8770, term8770.getClass(), "_valueTypeDeserializer", null);
        setField(term8770, term8770.getClass(), "_nullProvider", null);
        setField(term8770, term8770.getClass(), "_managedReferenceName", null);
        setField(term8770, term8770.getClass(), "_objectIdInfo", null);
        setField(term8770, term8770.getClass(), "_viewMatcher", null);
        setIntField(term8770, term8770.getClass(), "_propertyIndex", 0);
        setField(term8770, term8770.getClass(), "_metadata", null);
        setField(term8770, term8770.getClass(), "_propertyFormat", null);
        setField(term8770, term8770.getClass(), "_aliases", null);
        term8771 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(term8771, term8771.getClass(), "_annotated", null);
        setField(term8771, term8771.getClass(), "_injectableValueId", null);
        setField(term8771, term8771.getClass(), "_fallbackSetter", null);
        setIntField(term8771, term8771.getClass(), "_creatorIndex", 0);
        setBooleanField(term8771, term8771.getClass(), "_ignorable", false);
        setField(term8771, term8771.getClass(), "_propName", null);
        setField(term8771, term8771.getClass(), "_type", null);
        setField(term8771, term8771.getClass(), "_wrapperName", null);
        setField(term8771, term8771.getClass(), "_contextAnnotations", null);
        setField(term8771, term8771.getClass(), "_valueDeserializer", null);
        setField(term8771, term8771.getClass(), "_valueTypeDeserializer", null);
        setField(term8771, term8771.getClass(), "_nullProvider", null);
        setField(term8771, term8771.getClass(), "_managedReferenceName", null);
        setField(term8771, term8771.getClass(), "_objectIdInfo", null);
        setField(term8771, term8771.getClass(), "_viewMatcher", null);
        setIntField(term8771, term8771.getClass(), "_propertyIndex", 0);
        setField(term8771, term8771.getClass(), "_metadata", null);
        setField(term8771, term8771.getClass(), "_propertyFormat", null);
        setField(term8771, term8771.getClass(), "_aliases", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        Object[] args = new Object[2];
        args[0] = term8466;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8770));
        assertTrue(recursiveEquals(term8466, term8771));
    }

};


