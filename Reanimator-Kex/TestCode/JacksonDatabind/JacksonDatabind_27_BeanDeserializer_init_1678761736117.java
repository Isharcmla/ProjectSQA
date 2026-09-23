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
import java.lang.String;
import java.lang.Object;
import java.util.HashSet;

public class BeanDeserializer_init_1678761736117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32673;
     Object term32899;

    public BeanDeserializer_init_1678761736117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32691 = Class.forName((String) "java.lang.System$Logger$Level");
        HashSet term32715 = new HashSet();
        term32673 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term32775 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term32673, term32673.getClass(), "_beanType", null);
        setField(term32673, term32673.getClass(), "_valueClass", term32691);
        setField(term32673, term32673.getClass(), "_classAnnotations", null);
        setField(term32673, term32673.getClass(), "_valueInstantiator", null);
        setField(term32673, term32673.getClass(), "_delegateDeserializer", null);
        setField(term32673, term32673.getClass(), "_propertyBasedCreator", null);
        setField(term32673, term32673.getClass(), "_backRefs", null);
        setField(term32673, term32673.getClass(), "_ignorableProps", term32715);
        setBooleanField(term32673, term32673.getClass(), "_ignoreAllUnknown", false);
        setField(term32673, term32673.getClass(), "_anySetter", null);
        setField(term32673, term32673.getClass(), "_injectables", null);
        setField(term32673, term32673.getClass(), "_objectIdReader", null);
        setBooleanField(term32673, term32673.getClass(), "_nonStandardCreation", false);
        setField(term32673, term32673.getClass(), "_unwrappedPropertyHandler", null);
        setField(term32673, term32673.getClass(), "_beanProperties", term32775);
        term32899 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term32673;
        args[1] = term32899;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


