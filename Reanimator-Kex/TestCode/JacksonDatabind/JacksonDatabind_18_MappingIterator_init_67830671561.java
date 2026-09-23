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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MappingIterator_init_67830671561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24735;
     Object term24841;
     Object term24989;
     Object term25151;

    public MappingIterator_init_67830671561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term24071 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term24177 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term24283 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object term24431 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term24593 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$CharDeser"));
        Object term24631 = newInstance(Class.forName("java.lang.Object"));
        setField(term24071, term24071.getClass(), "_type", term24177);
        setField(term24071, term24071.getClass(), "_parser", term24283);
        setField(term24071, term24071.getClass(), "_context", term24431);
        setField(term24071, term24071.getClass(), "_deserializer", term24593);
        setBooleanField(term24071, term24071.getClass(), "_closeParser", false);
        setField(term24071, term24071.getClass(), "_updatedValue", term24631);
        term24735 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term24841 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        term24989 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        term25151 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
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
        args[0] = term24735;
        args[1] = term24841;
        args[2] = term24989;
        args[3] = term25151;
        args[4] = true;
        args[5] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


