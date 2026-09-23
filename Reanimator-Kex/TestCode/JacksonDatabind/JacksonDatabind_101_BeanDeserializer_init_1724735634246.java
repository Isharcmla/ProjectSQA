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

public class BeanDeserializer_init_1724735634246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157942;
     Object term158208;

    public BeanDeserializer_init_1724735634246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term157486 = Class.forName((String) "java.io.ObjectInputStream$ValidationList$1");
        Object term157450 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term157578 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term157698 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        Object term157816 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        setField(term157450, term157450.getClass(), "_valueClass", term157486);
        setField(term157450, term157450.getClass(), "_beanType", term157578);
        setField(term157450, term157450.getClass(), "_valueInstantiator", null);
        setField(term157450, term157450.getClass(), "_beanProperties", term157698);
        setField(term157450, term157450.getClass(), "_backRefs", null);
        setField(term157450, term157450.getClass(), "_ignorableProps", null);
        setBooleanField(term157450, term157450.getClass(), "_ignoreAllUnknown", false);
        setField(term157450, term157450.getClass(), "_anySetter", term157816);
        setField(term157450, term157450.getClass(), "_injectables", null);
        setField(term157450, term157450.getClass(), "_objectIdReader", null);
        setField(term157450, term157450.getClass(), "_unwrappedPropertyHandler", null);
        term157942 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term158078 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term157942, term157942.getClass(), "_valueInstantiator", term158078);
        setField(term157942, term157942.getClass(), "_anySetter", null);
        setField(term157942, term157942.getClass(), "_injectables", null);
        setField(term157942, term157942.getClass(), "_objectIdReader", null);
        Class<? extends Object> term158336 = Class.forName((String) "java.nio.channels.WritePendingException");
        term158208 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term158300 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term158300, term158300.getClass(), "_class", term158336);
        setField(term158208, term158208.getClass(), "_type", term158300);
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
        args[0] = term157942;
        args[1] = term158208;
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


