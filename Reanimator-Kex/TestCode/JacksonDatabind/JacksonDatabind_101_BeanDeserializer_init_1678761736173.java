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
import java.lang.String;

public class BeanDeserializer_init_1678761736173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52935;
     Object term53215;

    public BeanDeserializer_init_1678761736173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52823 = Class.forName((String) "java.util.stream.StreamSpliterators$ArrayBuffer$OfPrimitive");
        Object term52787 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term52787, term52787.getClass(), "_valueClass", term52823);
        setField(term52787, term52787.getClass(), "_beanType", null);
        setField(term52787, term52787.getClass(), "_valueInstantiator", null);
        setField(term52787, term52787.getClass(), "_delegateDeserializer", null);
        setField(term52787, term52787.getClass(), "_propertyBasedCreator", null);
        setField(term52787, term52787.getClass(), "_backRefs", null);
        setField(term52787, term52787.getClass(), "_ignorableProps", null);
        Class<? extends Object> term53077 = Class.forName((String) "java.util.concurrent.BlockingDeque");
        term52935 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term53041 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term53041, term53041.getClass(), "_class", term53077);
        setField(term52935, term52935.getClass(), "_beanType", term53041);
        setField(term52935, term52935.getClass(), "_valueInstantiator", null);
        setField(term52935, term52935.getClass(), "_delegateDeserializer", null);
        setField(term52935, term52935.getClass(), "_propertyBasedCreator", null);
        setField(term52935, term52935.getClass(), "_backRefs", null);
        setField(term52935, term52935.getClass(), "_ignorableProps", null);
        term53215 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term52935;
        args[1] = term53215;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


