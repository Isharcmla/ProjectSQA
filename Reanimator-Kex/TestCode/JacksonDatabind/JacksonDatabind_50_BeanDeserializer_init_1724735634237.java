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
import java.util.ArrayList;

public class BeanDeserializer_init_1724735634237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152954;
     Object term153212;
     Object term153566;

    public BeanDeserializer_init_1724735634237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term152494 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term152610 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term152708 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term152828 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term152494, term152494.getClass(), "_valueClass", null);
        setField(term152494, term152494.getClass(), "_classAnnotations", term152610);
        setField(term152494, term152494.getClass(), "_beanType", term152708);
        setField(term152494, term152494.getClass(), "_valueInstantiator", null);
        setField(term152494, term152494.getClass(), "_beanProperties", term152828);
        setField(term152494, term152494.getClass(), "_backRefs", null);
        setField(term152494, term152494.getClass(), "_ignorableProps", null);
        setBooleanField(term152494, term152494.getClass(), "_ignoreAllUnknown", false);
        setField(term152494, term152494.getClass(), "_anySetter", null);
        Object term153082 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term153006 = new ArrayList();
        ((ArrayList) term153006).add("byte");
        ((ArrayList) term153006).add(term153082);
        term152954 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        setField(term152954, term152954.getClass(), "_valueInstantiator", null);
        setField(term152954, term152954.getClass(), "_anySetter", null);
        setField(term152954, term152954.getClass(), "_injectables", term153006);
        term153212 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term153330 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term153446 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term153212, term153212.getClass(), "_type", null);
        setField(term153330, term153330.getClass(), "_classAnnotations", term153446);
        setField(term153212, term153212.getClass(), "_classInfo", term153330);
        term153566 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
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
        args[0] = term152954;
        args[1] = term153212;
        args[2] = term153566;
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


