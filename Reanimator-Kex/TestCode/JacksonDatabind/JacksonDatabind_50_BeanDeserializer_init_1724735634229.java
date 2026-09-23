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

public class BeanDeserializer_init_1724735634229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144817;
     Object term145083;

    public BeanDeserializer_init_1724735634229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term144337 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term144453 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term144573 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term144691 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        setField(term144337, term144337.getClass(), "_valueClass", null);
        setField(term144337, term144337.getClass(), "_classAnnotations", term144453);
        setField(term144337, term144337.getClass(), "_beanType", term144573);
        setField(term144337, term144337.getClass(), "_valueInstantiator", null);
        setField(term144337, term144337.getClass(), "_beanProperties", null);
        setField(term144337, term144337.getClass(), "_backRefs", null);
        setField(term144337, term144337.getClass(), "_ignorableProps", null);
        setBooleanField(term144337, term144337.getClass(), "_ignoreAllUnknown", false);
        setField(term144337, term144337.getClass(), "_anySetter", term144691);
        setField(term144337, term144337.getClass(), "_injectables", null);
        setField(term144337, term144337.getClass(), "_objectIdReader", null);
        setField(term144337, term144337.getClass(), "_unwrappedPropertyHandler", null);
        term144817 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term144953 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term144817, term144817.getClass(), "_valueInstantiator", term144953);
        setField(term144817, term144817.getClass(), "_anySetter", null);
        setField(term144817, term144817.getClass(), "_injectables", null);
        setField(term144817, term144817.getClass(), "_objectIdReader", null);
        term145083 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term145201 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term145317 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term145083, term145083.getClass(), "_type", null);
        setField(term145201, term145201.getClass(), "_classAnnotations", term145317);
        setField(term145083, term145083.getClass(), "_classInfo", term145201);
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
        args[0] = term144817;
        args[1] = term145083;
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


