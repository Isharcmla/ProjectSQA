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

public class BeanDeserializer_init_1724735634207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115641;
     Object term115907;

    public BeanDeserializer_init_1724735634207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term115515 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term115515, term115515.getClass(), "_valueClass", null);
        setField(term115515, term115515.getClass(), "_classAnnotations", null);
        setField(term115515, term115515.getClass(), "_beanType", null);
        setField(term115515, term115515.getClass(), "_valueInstantiator", null);
        setField(term115515, term115515.getClass(), "_beanProperties", null);
        setField(term115515, term115515.getClass(), "_backRefs", null);
        setField(term115515, term115515.getClass(), "_ignorableProps", null);
        setBooleanField(term115515, term115515.getClass(), "_ignoreAllUnknown", false);
        setField(term115515, term115515.getClass(), "_anySetter", null);
        setField(term115515, term115515.getClass(), "_injectables", null);
        setField(term115515, term115515.getClass(), "_objectIdReader", null);
        setField(term115515, term115515.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term115515, term115515.getClass(), "_nonStandardCreation", false);
        term115641 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term115777 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term115641, term115641.getClass(), "_valueInstantiator", term115777);
        setField(term115641, term115641.getClass(), "_anySetter", null);
        setField(term115641, term115641.getClass(), "_injectables", null);
        setField(term115641, term115641.getClass(), "_objectIdReader", null);
        term115907 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term116025 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term116141 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term116251 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term115907, term115907.getClass(), "_type", null);
        setField(term116025, term116025.getClass(), "_classAnnotations", term116141);
        setField(term116025, term116025.getClass(), "_class", null);
        setField(term115907, term115907.getClass(), "_classInfo", term116025);
        setField(term115907, term115907.getClass(), "_annotationIntrospector", null);
        setField(term115907, term115907.getClass(), "_config", term116251);
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
        args[0] = term115641;
        args[1] = term115907;
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


