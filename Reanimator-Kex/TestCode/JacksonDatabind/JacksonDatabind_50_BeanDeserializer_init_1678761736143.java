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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BeanDeserializer_init_1678761736143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58214;
     Object term58584;

    public BeanDeserializer_init_1678761736143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term58102 = Class.forName((String) "org.vorpal.research.kex.intrinsics.internal.IntConsumer");
        Object term58066 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term58066, term58066.getClass(), "_valueClass", term58102);
        setField(term58066, term58066.getClass(), "_classAnnotations", null);
        setField(term58066, term58066.getClass(), "_beanType", null);
        setField(term58066, term58066.getClass(), "_valueInstantiator", null);
        setField(term58066, term58066.getClass(), "_delegateDeserializer", null);
        setField(term58066, term58066.getClass(), "_propertyBasedCreator", null);
        setField(term58066, term58066.getClass(), "_backRefs", null);
        setField(term58066, term58066.getClass(), "_ignorableProps", null);
        Class<? extends Object> term58356 = Class.forName((String) "java.nio.ByteBufferAsIntBufferL");
        term58214 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term58320 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term58472 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term58320, term58320.getClass(), "_class", term58356);
        setField(term58214, term58214.getClass(), "_beanType", term58320);
        setField(term58214, term58214.getClass(), "_classAnnotations", term58472);
        setField(term58214, term58214.getClass(), "_valueInstantiator", null);
        setField(term58214, term58214.getClass(), "_delegateDeserializer", null);
        setField(term58214, term58214.getClass(), "_propertyBasedCreator", null);
        setField(term58214, term58214.getClass(), "_backRefs", null);
        setField(term58214, term58214.getClass(), "_ignorableProps", null);
        term58584 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term58214;
        args[1] = term58584;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


