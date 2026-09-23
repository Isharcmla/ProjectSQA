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

public class BuilderBasedDeserializer_init_1465534056135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40172;
     Object term40354;

    public BuilderBasedDeserializer_init_1465534056135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39930 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy$SnakeCaseStrategy");
        Object term39894 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term40046 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term39894, term39894.getClass(), "_valueClass", term39930);
        setField(term39894, term39894.getClass(), "_classAnnotations", term40046);
        setField(term39894, term39894.getClass(), "_beanType", null);
        setField(term39894, term39894.getClass(), "_valueInstantiator", null);
        setField(term39894, term39894.getClass(), "_beanProperties", null);
        setField(term39894, term39894.getClass(), "_backRefs", null);
        setField(term39894, term39894.getClass(), "_ignorableProps", null);
        setBooleanField(term39894, term39894.getClass(), "_ignoreAllUnknown", false);
        setField(term39894, term39894.getClass(), "_anySetter", null);
        ArrayList term40224 = new ArrayList();
        term40172 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        setField(term40172, term40172.getClass(), "_valueInstantiator", null);
        setField(term40172, term40172.getClass(), "_anySetter", null);
        setField(term40172, term40172.getClass(), "_injectables", term40224);
        term40354 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term40472 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term40588 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term40354, term40354.getClass(), "_type", null);
        setField(term40472, term40472.getClass(), "_classAnnotations", term40588);
        setField(term40354, term40354.getClass(), "_classInfo", term40472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        argTypes[3] = Class.forName("java.util.Map");
        argTypes[4] = Class.forName("java.util.Set");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term40172;
        args[1] = term40354;
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


