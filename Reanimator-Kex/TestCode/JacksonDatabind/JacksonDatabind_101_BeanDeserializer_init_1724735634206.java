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

public class BeanDeserializer_init_1724735634206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98014;
     Object term98144;

    public BeanDeserializer_init_1724735634206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term97750 = Class.forName((String) "java.util.concurrent.atomic.AtomicIntegerFieldUpdater$AtomicIntegerFieldUpdaterImpl");
        Object term97714 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term97888 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        setField(term97714, term97714.getClass(), "_valueClass", term97750);
        setField(term97714, term97714.getClass(), "_beanType", null);
        setField(term97714, term97714.getClass(), "_valueInstantiator", null);
        setField(term97714, term97714.getClass(), "_beanProperties", null);
        setField(term97714, term97714.getClass(), "_backRefs", null);
        setField(term97714, term97714.getClass(), "_ignorableProps", null);
        setBooleanField(term97714, term97714.getClass(), "_ignoreAllUnknown", false);
        setField(term97714, term97714.getClass(), "_anySetter", null);
        setField(term97714, term97714.getClass(), "_injectables", null);
        setField(term97714, term97714.getClass(), "_objectIdReader", null);
        setField(term97714, term97714.getClass(), "_unwrappedPropertyHandler", term97888);
        term98014 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        setField(term98014, term98014.getClass(), "_valueInstantiator", null);
        setField(term98014, term98014.getClass(), "_anySetter", null);
        setField(term98014, term98014.getClass(), "_injectables", null);
        setField(term98014, term98014.getClass(), "_objectIdReader", null);
        term98144 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term98258 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term98258, term98258.getClass(), "_class", null);
        setField(term98144, term98144.getClass(), "_type", term98258);
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
        args[0] = term98014;
        args[1] = term98144;
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


