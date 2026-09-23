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

public class BeanDeserializer_init_1678761736187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73156;
     Object term73400;

    public BeanDeserializer_init_1678761736187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term72940 = Class.forName((String) "java.io.BufferedOutputStream");
        Object term72904 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term73044 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term72904, term72904.getClass(), "_valueClass", term72940);
        setField(term72904, term72904.getClass(), "_beanType", term73044);
        setField(term72904, term72904.getClass(), "_valueInstantiator", null);
        setField(term72904, term72904.getClass(), "_delegateDeserializer", null);
        setField(term72904, term72904.getClass(), "_propertyBasedCreator", null);
        setField(term72904, term72904.getClass(), "_backRefs", null);
        setField(term72904, term72904.getClass(), "_ignorableProps", null);
        Class<? extends Object> term73288 = Class.forName((String) "java.nio.HeapByteBufferR");
        term73156 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term73252 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term73252, term73252.getClass(), "_class", term73288);
        setField(term73156, term73156.getClass(), "_beanType", term73252);
        setField(term73156, term73156.getClass(), "_valueInstantiator", null);
        setField(term73156, term73156.getClass(), "_delegateDeserializer", null);
        setField(term73156, term73156.getClass(), "_propertyBasedCreator", null);
        setField(term73156, term73156.getClass(), "_backRefs", null);
        setField(term73156, term73156.getClass(), "_ignorableProps", null);
        term73400 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term73156;
        args[1] = term73400;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


