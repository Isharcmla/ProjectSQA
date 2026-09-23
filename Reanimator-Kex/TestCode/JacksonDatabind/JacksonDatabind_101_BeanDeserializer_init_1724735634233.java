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

public class BeanDeserializer_init_1724735634233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139406;
     Object term139664;

    public BeanDeserializer_init_1724735634233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term139280 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term139280, term139280.getClass(), "_valueClass", null);
        setField(term139280, term139280.getClass(), "_beanType", null);
        setField(term139280, term139280.getClass(), "_valueInstantiator", null);
        setField(term139280, term139280.getClass(), "_beanProperties", null);
        setField(term139280, term139280.getClass(), "_backRefs", null);
        setField(term139280, term139280.getClass(), "_ignorableProps", null);
        setBooleanField(term139280, term139280.getClass(), "_ignoreAllUnknown", false);
        setField(term139280, term139280.getClass(), "_anySetter", null);
        setField(term139280, term139280.getClass(), "_injectables", null);
        setField(term139280, term139280.getClass(), "_objectIdReader", null);
        setField(term139280, term139280.getClass(), "_unwrappedPropertyHandler", null);
        term139406 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term139534 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term139406, term139406.getClass(), "_valueInstantiator", term139534);
        setField(term139406, term139406.getClass(), "_anySetter", null);
        setField(term139406, term139406.getClass(), "_injectables", null);
        setField(term139406, term139406.getClass(), "_objectIdReader", null);
        Class<? extends Object> term139792 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder");
        term139664 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term139756 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term139756, term139756.getClass(), "_class", term139792);
        setField(term139664, term139664.getClass(), "_type", term139756);
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
        args[0] = term139406;
        args[1] = term139664;
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


