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
import java.util.HashMap;
import java.util.HashSet;
import java.lang.String;

public class BeanDeserializer_init_1678761736207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99602;
     Object term100032;

    public BeanDeserializer_init_1678761736207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term99442 = new HashMap();
        HashSet term99490 = new HashSet();
        Object term99166 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term99264 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term99394 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(term99166, term99166.getClass(), "_valueClass", null);
        setField(term99166, term99166.getClass(), "_beanType", term99264);
        setField(term99166, term99166.getClass(), "_valueInstantiator", null);
        setField(term99166, term99166.getClass(), "_delegateDeserializer", null);
        setField(term99166, term99166.getClass(), "_propertyBasedCreator", term99394);
        setField(term99166, term99166.getClass(), "_backRefs", term99442);
        setField(term99166, term99166.getClass(), "_ignorableProps", term99490);
        Class<? extends Object> term99742 = Class.forName((String) "java.util.TreeMap$DescendingKeySpliterator");
        HashMap term99920 = new HashMap();
        term99602 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term99706 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term99872 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(term99706, term99706.getClass(), "_class", term99742);
        setField(term99602, term99602.getClass(), "_beanType", term99706);
        setField(term99602, term99602.getClass(), "_valueInstantiator", null);
        setField(term99602, term99602.getClass(), "_delegateDeserializer", null);
        setField(term99602, term99602.getClass(), "_propertyBasedCreator", term99872);
        setField(term99602, term99602.getClass(), "_backRefs", term99920);
        setField(term99602, term99602.getClass(), "_ignorableProps", null);
        term100032 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term99602;
        args[1] = term100032;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


