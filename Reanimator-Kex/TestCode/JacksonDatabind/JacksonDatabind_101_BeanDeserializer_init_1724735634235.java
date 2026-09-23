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

public class BeanDeserializer_init_1724735634235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142330;
     Object term142702;

    public BeanDeserializer_init_1724735634235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term142112 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term142748 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term142112, term142112.getClass(), "_valueClass", null);
        setField(term142748, term142748.getClass(), "_class", null);
        setField(term142112, term142112.getClass(), "_beanType", term142748);
        setField(term142112, term142112.getClass(), "_valueInstantiator", null);
        setField(term142112, term142112.getClass(), "_beanProperties", null);
        setField(term142112, term142112.getClass(), "_backRefs", null);
        setField(term142112, term142112.getClass(), "_ignorableProps", null);
        setBooleanField(term142112, term142112.getClass(), "_ignoreAllUnknown", false);
        setField(term142112, term142112.getClass(), "_anySetter", null);
        setField(term142112, term142112.getClass(), "_injectables", null);
        setField(term142112, term142112.getClass(), "_objectIdReader", null);
        setField(term142112, term142112.getClass(), "_unwrappedPropertyHandler", null);
        term142330 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term142454 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        Object term142572 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(term142330, term142330.getClass(), "_valueInstantiator", term142454);
        setField(term142330, term142330.getClass(), "_anySetter", null);
        setField(term142330, term142330.getClass(), "_injectables", null);
        setField(term142330, term142330.getClass(), "_objectIdReader", term142572);
        term142702 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term142702, term142702.getClass(), "_type", term142748);
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
        args[0] = term142330;
        args[1] = term142702;
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


