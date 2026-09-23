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

public class BeanDeserializer_init_1678761736197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86042;
     Object term86402;

    public BeanDeserializer_init_1678761736197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85790 = Class.forName((String) "java.lang.invoke.SerializedLambda$1");
        Object term85754 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term85914 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(term85754, term85754.getClass(), "_valueClass", term85790);
        setField(term85754, term85754.getClass(), "_beanType", null);
        setField(term85754, term85754.getClass(), "_valueInstantiator", term85914);
        setField(term85754, term85754.getClass(), "_delegateDeserializer", null);
        setField(term85754, term85754.getClass(), "_propertyBasedCreator", null);
        setField(term85754, term85754.getClass(), "_backRefs", null);
        setField(term85754, term85754.getClass(), "_ignorableProps", null);
        setBooleanField(term85754, term85754.getClass(), "_ignoreAllUnknown", false);
        setField(term85754, term85754.getClass(), "_anySetter", null);
        setField(term85754, term85754.getClass(), "_injectables", null);
        setField(term85754, term85754.getClass(), "_objectIdReader", null);
        setBooleanField(term85754, term85754.getClass(), "_nonStandardCreation", false);
        Class<? extends Object> term86170 = Class.forName((String) "java.lang.StringBuilder");
        term86042 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term86134 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term86290 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term86134, term86134.getClass(), "_class", term86170);
        setField(term86042, term86042.getClass(), "_beanType", term86134);
        setField(term86042, term86042.getClass(), "_valueInstantiator", null);
        setField(term86042, term86042.getClass(), "_delegateDeserializer", null);
        setField(term86042, term86042.getClass(), "_propertyBasedCreator", null);
        setField(term86042, term86042.getClass(), "_backRefs", null);
        setField(term86042, term86042.getClass(), "_ignorableProps", null);
        setField(term86042, term86042.getClass(), "_anySetter", null);
        setField(term86042, term86042.getClass(), "_injectables", null);
        setField(term86042, term86042.getClass(), "_objectIdReader", null);
        setBooleanField(term86042, term86042.getClass(), "_nonStandardCreation", false);
        setField(term86042, term86042.getClass(), "_unwrappedPropertyHandler", null);
        setField(term86042, term86042.getClass(), "_beanProperties", term86290);
        term86402 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term86042;
        args[1] = term86402;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


