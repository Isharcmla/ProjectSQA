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

public class BeanDeserializer_init_1724735634169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82756;
     Object term82886;
     Object term83124;

    public BeanDeserializer_init_1724735634169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term82400 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term82492 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term82630 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        setField(term82400, term82400.getClass(), "_valueClass", null);
        setField(term82400, term82400.getClass(), "_classAnnotations", null);
        setField(term82400, term82400.getClass(), "_beanType", term82492);
        setField(term82400, term82400.getClass(), "_valueInstantiator", null);
        setField(term82400, term82400.getClass(), "_beanProperties", null);
        setField(term82400, term82400.getClass(), "_backRefs", null);
        setField(term82400, term82400.getClass(), "_ignorableProps", null);
        setBooleanField(term82400, term82400.getClass(), "_ignoreAllUnknown", false);
        setField(term82400, term82400.getClass(), "_anySetter", null);
        setField(term82400, term82400.getClass(), "_injectables", null);
        setField(term82400, term82400.getClass(), "_objectIdReader", null);
        setField(term82400, term82400.getClass(), "_unwrappedPropertyHandler", term82630);
        term82756 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        setField(term82756, term82756.getClass(), "_valueInstantiator", null);
        setField(term82756, term82756.getClass(), "_anySetter", null);
        setField(term82756, term82756.getClass(), "_injectables", null);
        setField(term82756, term82756.getClass(), "_objectIdReader", null);
        term82886 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term83004 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term82886, term82886.getClass(), "_type", null);
        setField(term83004, term83004.getClass(), "_classAnnotations", null);
        setField(term83004, term83004.getClass(), "_annotationIntrospector", null);
        setField(term82886, term82886.getClass(), "_classInfo", term83004);
        term83124 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
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
        args[0] = term82756;
        args[1] = term82886;
        args[2] = term83124;
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


