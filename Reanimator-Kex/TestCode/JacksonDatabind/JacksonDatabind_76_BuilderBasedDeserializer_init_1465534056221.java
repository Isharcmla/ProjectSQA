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
import java.util.HashMap;

public class BuilderBasedDeserializer_init_1465534056221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130995;
     Object term131372;
     Object term131654;

    public BuilderBasedDeserializer_init_1465534056221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term130751 = Class.forName((String) "java.util.Collections$UnmodifiableSortedMap");
        Object term130715 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term131190 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        setField(term130715, term130715.getClass(), "_valueClass", term130751);
        setField(term130715, term130715.getClass(), "_classAnnotations", null);
        setField(term130715, term130715.getClass(), "_beanType", null);
        setField(term130715, term130715.getClass(), "_valueInstantiator", null);
        setField(term130715, term130715.getClass(), "_beanProperties", null);
        setField(term130715, term130715.getClass(), "_backRefs", null);
        setField(term130715, term130715.getClass(), "_ignorableProps", null);
        setBooleanField(term130715, term130715.getClass(), "_ignoreAllUnknown", false);
        setField(term130715, term130715.getClass(), "_anySetter", term131190);
        setField(term130715, term130715.getClass(), "_injectables", null);
        setField(term130715, term130715.getClass(), "_objectIdReader", null);
        setField(term130715, term130715.getClass(), "_unwrappedPropertyHandler", null);
        ArrayList term131242 = new ArrayList();
        term130995 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term131131 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term130995, term130995.getClass(), "_valueInstantiator", term131131);
        setField(term130995, term130995.getClass(), "_anySetter", term131190);
        setField(term130995, term130995.getClass(), "_injectables", term131242);
        setField(term130995, term130995.getClass(), "_objectIdReader", null);
        term131372 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term131490 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term131606 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term131372, term131372.getClass(), "_type", null);
        setField(term131490, term131490.getClass(), "_classAnnotations", term131606);
        setField(term131372, term131372.getClass(), "_classInfo", term131490);
        term131654 = new HashMap();
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
        args[0] = term130995;
        args[1] = term131372;
        args[2] = null;
        args[3] = term131654;
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


