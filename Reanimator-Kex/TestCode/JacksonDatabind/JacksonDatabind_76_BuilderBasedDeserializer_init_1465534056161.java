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

public class BuilderBasedDeserializer_init_1465534056161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64347;
     Object term64595;

    public BuilderBasedDeserializer_init_1465534056161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term63849 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term63965 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term64083 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        Object term64221 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        setField(term63849, term63849.getClass(), "_valueClass", null);
        setField(term63849, term63849.getClass(), "_classAnnotations", term63965);
        setField(term63849, term63849.getClass(), "_beanType", null);
        setField(term63849, term63849.getClass(), "_valueInstantiator", null);
        setField(term63849, term63849.getClass(), "_beanProperties", null);
        setField(term63849, term63849.getClass(), "_backRefs", null);
        setField(term63849, term63849.getClass(), "_ignorableProps", null);
        setBooleanField(term63849, term63849.getClass(), "_ignoreAllUnknown", false);
        setField(term63849, term63849.getClass(), "_anySetter", term64083);
        setField(term63849, term63849.getClass(), "_injectables", null);
        setField(term63849, term63849.getClass(), "_objectIdReader", null);
        setField(term63849, term63849.getClass(), "_unwrappedPropertyHandler", term64221);
        term64347 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term64465 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        setField(term64347, term64347.getClass(), "_valueInstantiator", null);
        setField(term64347, term64347.getClass(), "_anySetter", term64465);
        setField(term64347, term64347.getClass(), "_injectables", null);
        setField(term64347, term64347.getClass(), "_objectIdReader", null);
        term64595 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term64713 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term64595, term64595.getClass(), "_type", null);
        setField(term64713, term64713.getClass(), "_classAnnotations", null);
        setField(term64595, term64595.getClass(), "_classInfo", term64713);
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
        args[0] = term64347;
        args[1] = term64595;
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


