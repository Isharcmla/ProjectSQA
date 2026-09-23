package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.EqualityUtils.*;
import java.lang.Object;

public class MappingIterator_init_67830671537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9680;
     Object term9828;
     Object term9926;
     Object term11183;
     Object term11187;
     Object term11188;
     Object term11189;

    public MappingIterator_init_67830671537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9042 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term9142 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term9254 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term9402 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term9544 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        Object term9582 = newInstance(Class.forName("java.lang.Object"));
        setField(term9042, term9042.getClass(), "_type", term9142);
        setField(term9042, term9042.getClass(), "_parser", term9254);
        setField(term9042, term9042.getClass(), "_context", term9402);
        setField(term9042, term9042.getClass(), "_deserializer", term9544);
        setBooleanField(term9042, term9042.getClass(), "_closeParser", false);
        setField(term9042, term9042.getClass(), "_updatedValue", term9582);
        term9680 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term9828 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        term9926 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        term11183 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term11184 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term11185 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term11186 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        setField(term11184, term11184.getClass(), "_typeParametersFor", null);
        setField(term11184, term11184.getClass(), "_typeParameters", null);
        setField(term11184, term11184.getClass(), "_typeNames", null);
        setField(term11184, term11184.getClass(), "_canonicalName", null);
        setField(term11184, term11184.getClass(), "_class", null);
        setIntField(term11184, term11184.getClass(), "_hash", 0);
        setField(term11184, term11184.getClass(), "_valueHandler", null);
        setField(term11184, term11184.getClass(), "_typeHandler", null);
        setBooleanField(term11184, term11184.getClass(), "_asStatic", false);
        setField(term11183, term11183.getClass(), "_type", term11184);
        setField(term11185, term11185.getClass(), "_objectIds", null);
        setField(term11185, term11185.getClass(), "_objectIdResolvers", null);
        setField(term11185, term11185.getClass(), "_cache", null);
        setField(term11185, term11185.getClass(), "_factory", null);
        setField(term11185, term11185.getClass(), "_config", null);
        setIntField(term11185, term11185.getClass(), "_featureFlags", 0);
        setField(term11185, term11185.getClass(), "_view", null);
        setField(term11185, term11185.getClass(), "_parser", null);
        setField(term11185, term11185.getClass(), "_injectableValues", null);
        setField(term11185, term11185.getClass(), "_arrayBuilders", null);
        setField(term11185, term11185.getClass(), "_objectBuffer", null);
        setField(term11185, term11185.getClass(), "_dateFormat", null);
        setField(term11185, term11185.getClass(), "_attributes", null);
        setField(term11185, term11185.getClass(), "_currentType", null);
        setField(term11183, term11183.getClass(), "_context", term11185);
        setField(term11183, term11183.getClass(), "_deserializer", null);
        setField(term11183, term11183.getClass(), "_parser", null);
        setField(term11186, term11186.getClass(), "_type", null);
        setField(term11186, term11186.getClass(), "_context", null);
        setField(term11186, term11186.getClass(), "_deserializer", null);
        setField(term11186, term11186.getClass(), "_parser", null);
        setField(term11186, term11186.getClass(), "_updatedValue", null);
        setBooleanField(term11186, term11186.getClass(), "_closeParser", false);
        setBooleanField(term11186, term11186.getClass(), "_hasNextChecked", false);
        setField(term11183, term11183.getClass(), "_updatedValue", term11186);
        setBooleanField(term11183, term11183.getClass(), "_closeParser", true);
        setBooleanField(term11183, term11183.getClass(), "_hasNextChecked", false);
        term11187 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term11187, term11187.getClass(), "_typeParametersFor", null);
        setField(term11187, term11187.getClass(), "_typeParameters", null);
        setField(term11187, term11187.getClass(), "_typeNames", null);
        setField(term11187, term11187.getClass(), "_canonicalName", null);
        setField(term11187, term11187.getClass(), "_class", null);
        setIntField(term11187, term11187.getClass(), "_hash", 0);
        setField(term11187, term11187.getClass(), "_valueHandler", null);
        setField(term11187, term11187.getClass(), "_typeHandler", null);
        setBooleanField(term11187, term11187.getClass(), "_asStatic", false);
        term11188 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term11188, term11188.getClass(), "_objectIds", null);
        setField(term11188, term11188.getClass(), "_objectIdResolvers", null);
        setField(term11188, term11188.getClass(), "_cache", null);
        setField(term11188, term11188.getClass(), "_factory", null);
        setField(term11188, term11188.getClass(), "_config", null);
        setIntField(term11188, term11188.getClass(), "_featureFlags", 0);
        setField(term11188, term11188.getClass(), "_view", null);
        setField(term11188, term11188.getClass(), "_parser", null);
        setField(term11188, term11188.getClass(), "_injectableValues", null);
        setField(term11188, term11188.getClass(), "_arrayBuilders", null);
        setField(term11188, term11188.getClass(), "_objectBuffer", null);
        setField(term11188, term11188.getClass(), "_dateFormat", null);
        setField(term11188, term11188.getClass(), "_attributes", null);
        setField(term11188, term11188.getClass(), "_currentType", null);
        term11189 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        setField(term11189, term11189.getClass(), "_type", null);
        setField(term11189, term11189.getClass(), "_context", null);
        setField(term11189, term11189.getClass(), "_deserializer", null);
        setField(term11189, term11189.getClass(), "_parser", null);
        setField(term11189, term11189.getClass(), "_updatedValue", null);
        setBooleanField(term11189, term11189.getClass(), "_closeParser", false);
        setBooleanField(term11189, term11189.getClass(), "_hasNextChecked", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = boolean.class;
        argTypes[5] = Class.forName("java.lang.Object");
        Object[] args = new Object[6];
        args[0] = term9680;
        args[1] = null;
        args[2] = term9828;
        args[3] = null;
        args[4] = true;
        args[5] = term9926;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11183));
        assertTrue(recursiveEquals(term9680, term11187));
        assertTrue(recursiveEquals(term9828, term11188));
        assertTrue(recursiveEquals(term9926, term11189));
    }

};


