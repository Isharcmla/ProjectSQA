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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BeanDeserializer_init_1724735634239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156172;
     Object term156440;

    public BeanDeserializer_init_1724735634239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term155940 = Class.forName((String) "java.io.ObjectOutputStream$PutField");
        Object term155904 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term156046 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term155904, term155904.getClass(), "_valueClass", term155940);
        setField(term155904, term155904.getClass(), "_classAnnotations", null);
        setField(term155904, term155904.getClass(), "_beanType", term156046);
        setField(term155904, term155904.getClass(), "_valueInstantiator", null);
        setField(term155904, term155904.getClass(), "_beanProperties", null);
        setField(term155904, term155904.getClass(), "_backRefs", null);
        setField(term155904, term155904.getClass(), "_ignorableProps", null);
        setBooleanField(term155904, term155904.getClass(), "_ignoreAllUnknown", false);
        setField(term155904, term155904.getClass(), "_anySetter", null);
        setField(term155904, term155904.getClass(), "_injectables", null);
        setField(term155904, term155904.getClass(), "_objectIdReader", null);
        setField(term155904, term155904.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term155904, term155904.getClass(), "_nonStandardCreation", false);
        term156172 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term156310 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(term156172, term156172.getClass(), "_valueInstantiator", term156310);
        setField(term156172, term156172.getClass(), "_anySetter", null);
        setField(term156172, term156172.getClass(), "_injectables", null);
        setField(term156172, term156172.getClass(), "_objectIdReader", null);
        Class<? extends Object> term156710 = Class.forName((String) "java.util.AbstractMap$2");
        term156440 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term156558 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term156674 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term156816 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term156440, term156440.getClass(), "_type", null);
        setField(term156558, term156558.getClass(), "_classAnnotations", term156674);
        setField(term156558, term156558.getClass(), "_class", term156710);
        setField(term156440, term156440.getClass(), "_classInfo", term156558);
        setField(term156440, term156440.getClass(), "_annotationIntrospector", null);
        setField(term156440, term156440.getClass(), "_config", term156816);
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
        args[0] = term156172;
        args[1] = term156440;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


