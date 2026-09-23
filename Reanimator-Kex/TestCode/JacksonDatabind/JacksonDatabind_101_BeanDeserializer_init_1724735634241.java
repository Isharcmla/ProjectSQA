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

public class BeanDeserializer_init_1724735634241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151802;
     Object term152068;

    public BeanDeserializer_init_1724735634241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term151676 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term151676, term151676.getClass(), "_valueClass", null);
        setField(term151676, term151676.getClass(), "_beanType", null);
        setField(term151676, term151676.getClass(), "_valueInstantiator", null);
        setField(term151676, term151676.getClass(), "_beanProperties", null);
        setField(term151676, term151676.getClass(), "_backRefs", null);
        setField(term151676, term151676.getClass(), "_ignorableProps", null);
        setBooleanField(term151676, term151676.getClass(), "_ignoreAllUnknown", false);
        setField(term151676, term151676.getClass(), "_anySetter", null);
        setField(term151676, term151676.getClass(), "_injectables", null);
        setField(term151676, term151676.getClass(), "_objectIdReader", null);
        setField(term151676, term151676.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term151676, term151676.getClass(), "_nonStandardCreation", false);
        term151802 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term151938 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term151802, term151802.getClass(), "_valueInstantiator", term151938);
        setField(term151802, term151802.getClass(), "_anySetter", null);
        setField(term151802, term151802.getClass(), "_injectables", null);
        setField(term151802, term151802.getClass(), "_objectIdReader", null);
        term152068 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term152182 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term152300 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term152182, term152182.getClass(), "_class", null);
        setField(term152068, term152068.getClass(), "_type", term152182);
        setField(term152068, term152068.getClass(), "_annotationIntrospector", null);
        setField(term152068, term152068.getClass(), "_config", null);
        setField(term152068, term152068.getClass(), "_classInfo", term152300);
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
        args[0] = term151802;
        args[1] = term152068;
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


