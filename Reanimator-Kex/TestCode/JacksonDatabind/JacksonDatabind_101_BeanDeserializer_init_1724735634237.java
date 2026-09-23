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
import java.util.HashMap;
import java.lang.String;

public class BeanDeserializer_init_1724735634237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145125;
     Object term145391;

    public BeanDeserializer_init_1724735634237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term144881 = new HashMap();
        Object term144719 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term144833 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term144999 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        Object[] term144499 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ValueInjector", 0);
        setField(term144719, term144719.getClass(), "_valueClass", null);
        setField(term144719, term144719.getClass(), "_beanType", term144833);
        setField(term144719, term144719.getClass(), "_valueInstantiator", null);
        setField(term144719, term144719.getClass(), "_beanProperties", null);
        setField(term144719, term144719.getClass(), "_backRefs", term144881);
        setField(term144719, term144719.getClass(), "_ignorableProps", null);
        setBooleanField(term144719, term144719.getClass(), "_ignoreAllUnknown", false);
        setField(term144719, term144719.getClass(), "_anySetter", term144999);
        setField(term144719, term144719.getClass(), "_injectables", term144499);
        setField(term144719, term144719.getClass(), "_objectIdReader", null);
        setField(term144719, term144719.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term144719, term144719.getClass(), "_nonStandardCreation", false);
        term145125 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term145261 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term145125, term145125.getClass(), "_valueInstantiator", term145261);
        setField(term145125, term145125.getClass(), "_anySetter", null);
        setField(term145125, term145125.getClass(), "_injectables", null);
        setField(term145125, term145125.getClass(), "_objectIdReader", null);
        Class<? extends Object> term145519 = Class.forName((String) "com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder");
        term145391 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term145483 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term145629 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term145747 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term145483, term145483.getClass(), "_class", term145519);
        setField(term145391, term145391.getClass(), "_type", term145483);
        setField(term145391, term145391.getClass(), "_annotationIntrospector", null);
        setField(term145391, term145391.getClass(), "_config", term145629);
        setField(term145747, term145747.getClass(), "_class", null);
        setField(term145391, term145391.getClass(), "_classInfo", term145747);
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
        args[0] = term145125;
        args[1] = term145391;
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


