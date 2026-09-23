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
import java.util.ArrayList;

public class BeanDeserializer_init_1724735634201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109844;
     Object term110026;

    public BeanDeserializer_init_1724735634201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term109602 = Class.forName((String) "kex.java.util.Arrays$NaturalOrder");
        Object term109566 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term109718 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term109566, term109566.getClass(), "_valueClass", term109602);
        setField(term109566, term109566.getClass(), "_classAnnotations", term109718);
        setField(term109566, term109566.getClass(), "_beanType", null);
        setField(term109566, term109566.getClass(), "_valueInstantiator", null);
        setField(term109566, term109566.getClass(), "_beanProperties", null);
        setField(term109566, term109566.getClass(), "_backRefs", null);
        setField(term109566, term109566.getClass(), "_ignorableProps", null);
        setBooleanField(term109566, term109566.getClass(), "_ignoreAllUnknown", false);
        setField(term109566, term109566.getClass(), "_anySetter", null);
        ArrayList term109896 = new ArrayList();
        term109844 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        setField(term109844, term109844.getClass(), "_valueInstantiator", null);
        setField(term109844, term109844.getClass(), "_anySetter", null);
        setField(term109844, term109844.getClass(), "_injectables", term109896);
        term110026 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term110144 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term110260 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term110026, term110026.getClass(), "_type", null);
        setField(term110144, term110144.getClass(), "_classAnnotations", term110260);
        setField(term110026, term110026.getClass(), "_classInfo", term110144);
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
        args[0] = term109844;
        args[1] = term110026;
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


