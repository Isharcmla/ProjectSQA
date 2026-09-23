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

public class BeanDeserializer_init_1724735634217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128916;
     Object term129182;

    public BeanDeserializer_init_1724735634217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term128790 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term128790, term128790.getClass(), "_valueClass", null);
        setField(term128790, term128790.getClass(), "_classAnnotations", null);
        setField(term128790, term128790.getClass(), "_beanType", null);
        setField(term128790, term128790.getClass(), "_valueInstantiator", null);
        setField(term128790, term128790.getClass(), "_beanProperties", null);
        setField(term128790, term128790.getClass(), "_backRefs", null);
        setField(term128790, term128790.getClass(), "_ignorableProps", null);
        setBooleanField(term128790, term128790.getClass(), "_ignoreAllUnknown", false);
        setField(term128790, term128790.getClass(), "_anySetter", null);
        setField(term128790, term128790.getClass(), "_injectables", null);
        setField(term128790, term128790.getClass(), "_objectIdReader", null);
        setField(term128790, term128790.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term128790, term128790.getClass(), "_nonStandardCreation", false);
        term128916 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term129052 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term128916, term128916.getClass(), "_valueInstantiator", term129052);
        setField(term128916, term128916.getClass(), "_anySetter", null);
        setField(term128916, term128916.getClass(), "_injectables", null);
        setField(term128916, term128916.getClass(), "_objectIdReader", null);
        term129182 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term129300 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term129416 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term129522 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term129182, term129182.getClass(), "_type", null);
        setField(term129300, term129300.getClass(), "_classAnnotations", term129416);
        setField(term129300, term129300.getClass(), "_class", null);
        setField(term129182, term129182.getClass(), "_classInfo", term129300);
        setField(term129182, term129182.getClass(), "_annotationIntrospector", null);
        setField(term129182, term129182.getClass(), "_config", term129522);
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
        args[0] = term128916;
        args[1] = term129182;
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


