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

public class BeanDeserializer_init_1678761736239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148898;
     Object term149288;

    public BeanDeserializer_init_1678761736239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term148644 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term148768 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(term148644, term148644.getClass(), "_valueClass", null);
        setField(term148644, term148644.getClass(), "_beanType", null);
        setField(term148644, term148644.getClass(), "_valueInstantiator", term148768);
        setField(term148644, term148644.getClass(), "_delegateDeserializer", null);
        setField(term148644, term148644.getClass(), "_propertyBasedCreator", null);
        setField(term148644, term148644.getClass(), "_backRefs", null);
        setField(term148644, term148644.getClass(), "_ignorableProps", null);
        setBooleanField(term148644, term148644.getClass(), "_ignoreAllUnknown", false);
        setField(term148644, term148644.getClass(), "_anySetter", null);
        setField(term148644, term148644.getClass(), "_injectables", null);
        setField(term148644, term148644.getClass(), "_objectIdReader", null);
        setBooleanField(term148644, term148644.getClass(), "_nonStandardCreation", false);
        Class<? extends Object> term149026 = Class.forName((String) "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor");
        term148898 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Object term148990 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term149164 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        setField(term148990, term148990.getClass(), "_class", term149026);
        setField(term148898, term148898.getClass(), "_beanType", term148990);
        setField(term148898, term148898.getClass(), "_valueInstantiator", null);
        setField(term148898, term148898.getClass(), "_delegateDeserializer", null);
        setField(term148898, term148898.getClass(), "_propertyBasedCreator", null);
        setField(term148898, term148898.getClass(), "_backRefs", null);
        setField(term148898, term148898.getClass(), "_ignorableProps", null);
        setField(term148898, term148898.getClass(), "_anySetter", null);
        setField(term148898, term148898.getClass(), "_injectables", null);
        setField(term148898, term148898.getClass(), "_objectIdReader", null);
        setBooleanField(term148898, term148898.getClass(), "_nonStandardCreation", false);
        setField(term148898, term148898.getClass(), "_unwrappedPropertyHandler", term149164);
        term149288 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term148898;
        args[1] = term149288;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


