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

public class BeanDeserializer_init_1724735634227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129559;
     Object term129935;

    public BeanDeserializer_init_1724735634227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term129433 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term129433, term129433.getClass(), "_valueClass", null);
        setField(term129433, term129433.getClass(), "_beanType", null);
        setField(term129433, term129433.getClass(), "_valueInstantiator", null);
        setField(term129433, term129433.getClass(), "_beanProperties", null);
        setField(term129433, term129433.getClass(), "_backRefs", null);
        setField(term129433, term129433.getClass(), "_ignorableProps", null);
        setBooleanField(term129433, term129433.getClass(), "_ignoreAllUnknown", false);
        setField(term129433, term129433.getClass(), "_anySetter", null);
        setField(term129433, term129433.getClass(), "_injectables", null);
        setField(term129433, term129433.getClass(), "_objectIdReader", null);
        setField(term129433, term129433.getClass(), "_unwrappedPropertyHandler", null);
        term129559 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term129687 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        Object term129805 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        setField(term129559, term129559.getClass(), "_valueInstantiator", term129687);
        setField(term129559, term129559.getClass(), "_anySetter", term129805);
        setField(term129559, term129559.getClass(), "_injectables", null);
        setField(term129559, term129559.getClass(), "_objectIdReader", null);
        Class<? extends Object> term130063 = Class.forName((String) "java.util.jar.JarVerifier$VerifierStream");
        term129935 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term130027 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term130027, term130027.getClass(), "_class", term130063);
        setField(term129935, term129935.getClass(), "_type", term130027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        argTypes[3] = Class.forName("java.util.Map");
        argTypes[4] = Class.forName("java.util.HashSet");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term129559;
        args[1] = term129935;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


