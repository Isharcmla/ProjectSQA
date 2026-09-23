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

public class BeanDeserializer_init_1724735634203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95574;
     Object term95958;

    public BeanDeserializer_init_1724735634203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term95344 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term95448 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term95344, term95344.getClass(), "_valueClass", null);
        setField(term95344, term95344.getClass(), "_beanType", term95448);
        setField(term95344, term95344.getClass(), "_valueInstantiator", null);
        setField(term95344, term95344.getClass(), "_beanProperties", null);
        setField(term95344, term95344.getClass(), "_backRefs", null);
        setField(term95344, term95344.getClass(), "_ignorableProps", null);
        setBooleanField(term95344, term95344.getClass(), "_ignoreAllUnknown", false);
        setField(term95344, term95344.getClass(), "_anySetter", null);
        setField(term95344, term95344.getClass(), "_injectables", null);
        setField(term95344, term95344.getClass(), "_objectIdReader", null);
        setField(term95344, term95344.getClass(), "_unwrappedPropertyHandler", null);
        term95574 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term95710 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        Object term95828 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(term95574, term95574.getClass(), "_valueInstantiator", term95710);
        setField(term95574, term95574.getClass(), "_anySetter", null);
        setField(term95574, term95574.getClass(), "_injectables", null);
        setField(term95574, term95574.getClass(), "_objectIdReader", term95828);
        term95958 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term96050 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term96050, term96050.getClass(), "_class", null);
        setField(term95958, term95958.getClass(), "_type", term96050);
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
        args[0] = term95574;
        args[1] = term95958;
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


