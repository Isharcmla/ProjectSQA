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

public class BeanDeserializer_init_1678761736155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37626;
     Object term37914;

    public BeanDeserializer_init_1678761736155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37414 = Class.forName((String) "java.lang.Process$1");
        Object term37378 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term37514 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term37378, term37378.getClass(), "_valueClass", term37414);
        setField(term37378, term37378.getClass(), "_beanType", term37514);
        setField(term37378, term37378.getClass(), "_valueInstantiator", null);
        setField(term37378, term37378.getClass(), "_delegateDeserializer", null);
        setField(term37378, term37378.getClass(), "_propertyBasedCreator", null);
        setField(term37378, term37378.getClass(), "_backRefs", null);
        setField(term37378, term37378.getClass(), "_ignorableProps", null);
        Class<? extends Object> term37776 = Class.forName((String) "com.fasterxml.jackson.core.io.InputDecorator");
        term37626 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term37740 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term37740, term37740.getClass(), "_class", term37776);
        setField(term37626, term37626.getClass(), "_beanType", term37740);
        setField(term37626, term37626.getClass(), "_valueInstantiator", null);
        setField(term37626, term37626.getClass(), "_delegateDeserializer", null);
        setField(term37626, term37626.getClass(), "_propertyBasedCreator", null);
        setField(term37626, term37626.getClass(), "_backRefs", null);
        setField(term37626, term37626.getClass(), "_ignorableProps", null);
        term37914 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term37626;
        args[1] = term37914;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


