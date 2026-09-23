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

public class BeanDeserializer_init_1724735634191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97557;
     Object term97739;

    public BeanDeserializer_init_1724735634191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term97215 = Class.forName((String) "java.util.concurrent.ThreadLocalRandom$RandomDoublesSpliterator");
        Object term97179 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term97331 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term97431 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term97179, term97179.getClass(), "_valueClass", term97215);
        setField(term97179, term97179.getClass(), "_classAnnotations", term97331);
        setField(term97179, term97179.getClass(), "_beanType", term97431);
        setField(term97179, term97179.getClass(), "_valueInstantiator", null);
        setField(term97179, term97179.getClass(), "_beanProperties", null);
        setField(term97179, term97179.getClass(), "_backRefs", null);
        setField(term97179, term97179.getClass(), "_ignorableProps", null);
        setBooleanField(term97179, term97179.getClass(), "_ignoreAllUnknown", false);
        setField(term97179, term97179.getClass(), "_anySetter", null);
        ArrayList term97609 = new ArrayList();
        term97557 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        setField(term97557, term97557.getClass(), "_valueInstantiator", null);
        setField(term97557, term97557.getClass(), "_anySetter", null);
        setField(term97557, term97557.getClass(), "_injectables", term97609);
        term97739 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term97857 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term97739, term97739.getClass(), "_type", null);
        setField(term97857, term97857.getClass(), "_classAnnotations", null);
        setField(term97857, term97857.getClass(), "_annotationIntrospector", null);
        setField(term97739, term97739.getClass(), "_classInfo", term97857);
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
        args[0] = term97557;
        args[1] = term97739;
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


