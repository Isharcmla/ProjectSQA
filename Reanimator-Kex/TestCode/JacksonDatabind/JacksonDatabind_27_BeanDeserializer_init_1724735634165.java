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

public class BeanDeserializer_init_1724735634165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77404;
     Object term77662;

    public BeanDeserializer_init_1724735634165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77026 = Class.forName((String) "com.fasterxml.jackson.databind.exc.PropertyBindingException");
        Object term76990 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term77142 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term77278 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term76990, term76990.getClass(), "_valueClass", term77026);
        setField(term76990, term76990.getClass(), "_classAnnotations", term77142);
        setField(term76990, term76990.getClass(), "_beanType", null);
        setField(term76990, term76990.getClass(), "_valueInstantiator", term77278);
        setField(term76990, term76990.getClass(), "_beanProperties", null);
        setField(term76990, term76990.getClass(), "_backRefs", null);
        setField(term76990, term76990.getClass(), "_ignorableProps", null);
        setBooleanField(term76990, term76990.getClass(), "_ignoreAllUnknown", false);
        setField(term76990, term76990.getClass(), "_anySetter", null);
        setField(term76990, term76990.getClass(), "_injectables", null);
        setField(term76990, term76990.getClass(), "_objectIdReader", null);
        setField(term76990, term76990.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term76990, term76990.getClass(), "_nonStandardCreation", false);
        term77404 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term77532 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term77532, term77532.getClass(), "_delegateType", null);
        setField(term77532, term77532.getClass(), "_withArgsCreator", null);
        setField(term77532, term77532.getClass(), "_defaultCreator", null);
        setField(term77404, term77404.getClass(), "_valueInstantiator", term77532);
        setField(term77404, term77404.getClass(), "_anySetter", null);
        setField(term77404, term77404.getClass(), "_injectables", null);
        setField(term77404, term77404.getClass(), "_objectIdReader", null);
        term77662 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term77780 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term77922 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term77662, term77662.getClass(), "_type", null);
        setField(term77780, term77780.getClass(), "_classAnnotations", null);
        setField(term77780, term77780.getClass(), "_annotationIntrospector", null);
        setField(term77662, term77662.getClass(), "_classInfo", term77780);
        setField(term77662, term77662.getClass(), "_annotationIntrospector", term77922);
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
        args[0] = term77404;
        args[1] = term77662;
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


