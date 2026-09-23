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
import java.lang.ArrayStoreException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class BeanDeserializer_init_1724735634231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147133;
     Object term147391;

    public BeanDeserializer_init_1724735634231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term147007 = Class.forName((String) "java.lang.Exception");
        Object term146971 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term146971, term146971.getClass(), "_valueClass", term147007);
        setField(term146971, term146971.getClass(), "_classAnnotations", null);
        setField(term146971, term146971.getClass(), "_beanType", null);
        setField(term146971, term146971.getClass(), "_valueInstantiator", null);
        setField(term146971, term146971.getClass(), "_beanProperties", null);
        setField(term146971, term146971.getClass(), "_backRefs", null);
        setField(term146971, term146971.getClass(), "_ignorableProps", null);
        setBooleanField(term146971, term146971.getClass(), "_ignoreAllUnknown", false);
        setField(term146971, term146971.getClass(), "_anySetter", null);
        Object term147223 = newInstance(Class.forName("java.lang.Object"));
        Object term147261 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term147185 = new ArrayList();
        ((ArrayList) term147185).add(term147223);
        ((ArrayList) term147185).add(term147261);
        term147133 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        setField(term147133, term147133.getClass(), "_valueInstantiator", null);
        setField(term147133, term147133.getClass(), "_anySetter", null);
        setField(term147133, term147133.getClass(), "_injectables", term147185);
        term147391 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term147509 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term147391, term147391.getClass(), "_type", null);
        setField(term147509, term147509.getClass(), "_classAnnotations", null);
        setField(term147509, term147509.getClass(), "_annotationIntrospector", null);
        setField(term147391, term147391.getClass(), "_classInfo", term147509);
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
        args[0] = term147133;
        args[1] = term147391;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayStoreException e) {
        }

    }

};


