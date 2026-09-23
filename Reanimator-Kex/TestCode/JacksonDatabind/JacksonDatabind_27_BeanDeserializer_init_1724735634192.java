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

public class BeanDeserializer_init_1724735634192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109499;
     Object term109885;

    public BeanDeserializer_init_1724735634192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term109001 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term109115 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term109253 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        Object term109373 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term109001, term109001.getClass(), "_valueClass", null);
        setField(term109001, term109001.getClass(), "_classAnnotations", null);
        setField(term109001, term109001.getClass(), "_beanType", term109115);
        setField(term109001, term109001.getClass(), "_valueInstantiator", term109253);
        setField(term109001, term109001.getClass(), "_beanProperties", term109373);
        setField(term109001, term109001.getClass(), "_backRefs", null);
        setField(term109001, term109001.getClass(), "_ignorableProps", null);
        setBooleanField(term109001, term109001.getClass(), "_ignoreAllUnknown", false);
        setField(term109001, term109001.getClass(), "_anySetter", null);
        setField(term109001, term109001.getClass(), "_injectables", null);
        setField(term109001, term109001.getClass(), "_objectIdReader", null);
        setField(term109001, term109001.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term109001, term109001.getClass(), "_nonStandardCreation", false);
        term109499 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term109637 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        Object term109755 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        setField(term109499, term109499.getClass(), "_valueInstantiator", term109637);
        setField(term109499, term109499.getClass(), "_anySetter", term109755);
        setField(term109499, term109499.getClass(), "_injectables", null);
        setField(term109499, term109499.getClass(), "_objectIdReader", null);
        term109885 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term110003 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term110145 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term109885, term109885.getClass(), "_type", null);
        setField(term110003, term110003.getClass(), "_classAnnotations", null);
        setField(term110003, term110003.getClass(), "_annotationIntrospector", null);
        setField(term109885, term109885.getClass(), "_classInfo", term110003);
        setField(term109885, term109885.getClass(), "_annotationIntrospector", term110145);
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
        args[0] = term109499;
        args[1] = term109885;
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


