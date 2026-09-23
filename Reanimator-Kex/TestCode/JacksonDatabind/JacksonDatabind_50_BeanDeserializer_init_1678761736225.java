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
import java.util.HashMap;

public class BeanDeserializer_init_1678761736225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141037;
     Object term141477;

    public BeanDeserializer_init_1678761736225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term140909 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term140909, term140909.getClass(), "_valueClass", null);
        setField(term140909, term140909.getClass(), "_classAnnotations", null);
        setField(term140909, term140909.getClass(), "_beanType", null);
        setField(term140909, term140909.getClass(), "_valueInstantiator", null);
        setField(term140909, term140909.getClass(), "_delegateDeserializer", null);
        setField(term140909, term140909.getClass(), "_propertyBasedCreator", null);
        setField(term140909, term140909.getClass(), "_backRefs", null);
        setField(term140909, term140909.getClass(), "_ignorableProps", null);
        setBooleanField(term140909, term140909.getClass(), "_ignoreAllUnknown", false);
        setField(term140909, term140909.getClass(), "_anySetter", null);
        setField(term140909, term140909.getClass(), "_injectables", null);
        setField(term140909, term140909.getClass(), "_objectIdReader", null);
        setBooleanField(term140909, term140909.getClass(), "_nonStandardCreation", false);
        Class<? extends Object> term141179 = Class.forName((String) "java.lang.FdLibm$Pow");
        HashMap term141227 = new HashMap();
        term141037 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term141143 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term141365 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        setField(term141143, term141143.getClass(), "_class", term141179);
        setField(term141037, term141037.getClass(), "_beanType", term141143);
        setField(term141037, term141037.getClass(), "_classAnnotations", null);
        setField(term141037, term141037.getClass(), "_valueInstantiator", null);
        setField(term141037, term141037.getClass(), "_delegateDeserializer", null);
        setField(term141037, term141037.getClass(), "_propertyBasedCreator", null);
        setField(term141037, term141037.getClass(), "_backRefs", term141227);
        setField(term141037, term141037.getClass(), "_ignorableProps", null);
        setField(term141037, term141037.getClass(), "_anySetter", null);
        setField(term141037, term141037.getClass(), "_injectables", null);
        setField(term141037, term141037.getClass(), "_objectIdReader", null);
        setBooleanField(term141037, term141037.getClass(), "_nonStandardCreation", false);
        setField(term141037, term141037.getClass(), "_unwrappedPropertyHandler", term141365);
        term141477 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term141037;
        args[1] = term141477;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


