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

public class BeanDeserializer_init_167876173687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18875;
     Object term19237;

    public BeanDeserializer_init_167876173687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18763 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer");
        Object term18727 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term18727, term18727.getClass(), "_valueClass", term18763);
        setField(term18727, term18727.getClass(), "_classAnnotations", null);
        setField(term18727, term18727.getClass(), "_beanType", null);
        setField(term18727, term18727.getClass(), "_valueInstantiator", null);
        setField(term18727, term18727.getClass(), "_delegateDeserializer", null);
        setField(term18727, term18727.getClass(), "_propertyBasedCreator", null);
        setField(term18727, term18727.getClass(), "_backRefs", null);
        setField(term18727, term18727.getClass(), "_ignorableProps", null);
        Class<? extends Object> term19009 = Class.forName((String) "java.io.StringWriter");
        term18875 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term18973 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term19125 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term18973, term18973.getClass(), "_class", term19009);
        setField(term18875, term18875.getClass(), "_beanType", term18973);
        setField(term18875, term18875.getClass(), "_classAnnotations", term19125);
        setField(term18875, term18875.getClass(), "_valueInstantiator", null);
        setField(term18875, term18875.getClass(), "_delegateDeserializer", null);
        setField(term18875, term18875.getClass(), "_propertyBasedCreator", null);
        setField(term18875, term18875.getClass(), "_backRefs", null);
        setField(term18875, term18875.getClass(), "_ignorableProps", null);
        term19237 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term18875;
        args[1] = term19237;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


