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
import java.util.HashSet;

public class BeanDeserializer_init_1724735634221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121220;
     Object term121486;
     Object term121744;

    public BeanDeserializer_init_1724735634221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term121094 = Class.forName((String) "java.util.stream.SliceOps$3");
        Object term121058 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term121058, term121058.getClass(), "_valueClass", term121094);
        setField(term121058, term121058.getClass(), "_beanType", null);
        setField(term121058, term121058.getClass(), "_valueInstantiator", null);
        setField(term121058, term121058.getClass(), "_beanProperties", null);
        setField(term121058, term121058.getClass(), "_backRefs", null);
        setField(term121058, term121058.getClass(), "_ignorableProps", null);
        setBooleanField(term121058, term121058.getClass(), "_ignoreAllUnknown", false);
        setField(term121058, term121058.getClass(), "_anySetter", null);
        setField(term121058, term121058.getClass(), "_injectables", null);
        setField(term121058, term121058.getClass(), "_objectIdReader", null);
        setField(term121058, term121058.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term121058, term121058.getClass(), "_nonStandardCreation", false);
        term121220 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term121356 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term121220, term121220.getClass(), "_valueInstantiator", term121356);
        setField(term121220, term121220.getClass(), "_anySetter", null);
        setField(term121220, term121220.getClass(), "_injectables", null);
        setField(term121220, term121220.getClass(), "_objectIdReader", null);
        term121486 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term121578 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term121696 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term121578, term121578.getClass(), "_class", null);
        setField(term121486, term121486.getClass(), "_type", term121578);
        setField(term121486, term121486.getClass(), "_annotationIntrospector", null);
        setField(term121486, term121486.getClass(), "_config", null);
        setField(term121486, term121486.getClass(), "_classInfo", term121696);
        term121744 = new HashSet();
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
        args[0] = term121220;
        args[1] = term121486;
        args[2] = null;
        args[3] = null;
        args[4] = term121744;
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


