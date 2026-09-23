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
import java.util.HashMap;

public class BeanDeserializer_init_1724735634217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114741;
     Object term115125;

    public BeanDeserializer_init_1724735634217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term114497 = new HashMap();
        Object term114449 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term114615 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        setField(term114449, term114449.getClass(), "_valueClass", null);
        setField(term114449, term114449.getClass(), "_beanType", null);
        setField(term114449, term114449.getClass(), "_valueInstantiator", null);
        setField(term114449, term114449.getClass(), "_beanProperties", null);
        setField(term114449, term114449.getClass(), "_backRefs", term114497);
        setField(term114449, term114449.getClass(), "_ignorableProps", null);
        setBooleanField(term114449, term114449.getClass(), "_ignoreAllUnknown", false);
        setField(term114449, term114449.getClass(), "_anySetter", term114615);
        setField(term114449, term114449.getClass(), "_injectables", null);
        setField(term114449, term114449.getClass(), "_objectIdReader", null);
        setField(term114449, term114449.getClass(), "_unwrappedPropertyHandler", null);
        term114741 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term114877 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        Object term114995 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        setField(term114741, term114741.getClass(), "_valueInstantiator", term114877);
        setField(term114741, term114741.getClass(), "_anySetter", term114995);
        setField(term114741, term114741.getClass(), "_injectables", null);
        setField(term114741, term114741.getClass(), "_objectIdReader", null);
        term115125 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term115217 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term115217, term115217.getClass(), "_class", null);
        setField(term115125, term115125.getClass(), "_type", term115217);
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
        args[0] = term114741;
        args[1] = term115125;
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


