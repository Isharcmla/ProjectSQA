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

public class BeanDeserializer_init_1724735634249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164476;
     Object term164730;

    public BeanDeserializer_init_1724735634249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term164128 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term164232 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term164350 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(term164128, term164128.getClass(), "_valueClass", null);
        setField(term164128, term164128.getClass(), "_beanType", term164232);
        setField(term164128, term164128.getClass(), "_valueInstantiator", null);
        setField(term164128, term164128.getClass(), "_beanProperties", null);
        setField(term164128, term164128.getClass(), "_backRefs", null);
        setField(term164128, term164128.getClass(), "_ignorableProps", null);
        setBooleanField(term164128, term164128.getClass(), "_ignoreAllUnknown", false);
        setField(term164128, term164128.getClass(), "_anySetter", null);
        setField(term164128, term164128.getClass(), "_injectables", null);
        setField(term164128, term164128.getClass(), "_objectIdReader", term164350);
        setField(term164128, term164128.getClass(), "_unwrappedPropertyHandler", null);
        term164476 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term164600 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(term164476, term164476.getClass(), "_valueInstantiator", term164600);
        setField(term164476, term164476.getClass(), "_anySetter", null);
        setField(term164476, term164476.getClass(), "_injectables", null);
        setField(term164476, term164476.getClass(), "_objectIdReader", null);
        term164730 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term164844 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term164844, term164844.getClass(), "_class", null);
        setField(term164730, term164730.getClass(), "_type", term164844);
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
        args[0] = term164476;
        args[1] = term164730;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


