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

public class BeanDeserializer_init_1678761736131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50414;
     Object term50690;

    public BeanDeserializer_init_1678761736131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term50284 = new HashMap();
        Object term50236 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term50236, term50236.getClass(), "_valueClass", null);
        setField(term50236, term50236.getClass(), "_classAnnotations", null);
        setField(term50236, term50236.getClass(), "_beanType", null);
        setField(term50236, term50236.getClass(), "_valueInstantiator", null);
        setField(term50236, term50236.getClass(), "_delegateDeserializer", null);
        setField(term50236, term50236.getClass(), "_propertyBasedCreator", null);
        setField(term50236, term50236.getClass(), "_backRefs", term50284);
        setField(term50236, term50236.getClass(), "_ignorableProps", null);
        setBooleanField(term50236, term50236.getClass(), "_ignoreAllUnknown", false);
        setField(term50236, term50236.getClass(), "_anySetter", null);
        setField(term50236, term50236.getClass(), "_injectables", null);
        setField(term50236, term50236.getClass(), "_objectIdReader", null);
        setBooleanField(term50236, term50236.getClass(), "_nonStandardCreation", false);
        term50414 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Object term50552 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        setField(term50414, term50414.getClass(), "_beanType", null);
        setField(term50414, term50414.getClass(), "_classAnnotations", null);
        setField(term50414, term50414.getClass(), "_valueInstantiator", null);
        setField(term50414, term50414.getClass(), "_delegateDeserializer", null);
        setField(term50414, term50414.getClass(), "_propertyBasedCreator", null);
        setField(term50414, term50414.getClass(), "_backRefs", null);
        setField(term50414, term50414.getClass(), "_ignorableProps", null);
        setField(term50414, term50414.getClass(), "_anySetter", null);
        setField(term50414, term50414.getClass(), "_injectables", null);
        setField(term50414, term50414.getClass(), "_objectIdReader", null);
        setBooleanField(term50414, term50414.getClass(), "_nonStandardCreation", false);
        setField(term50414, term50414.getClass(), "_unwrappedPropertyHandler", term50552);
        term50690 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term50414;
        args[1] = term50690;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


