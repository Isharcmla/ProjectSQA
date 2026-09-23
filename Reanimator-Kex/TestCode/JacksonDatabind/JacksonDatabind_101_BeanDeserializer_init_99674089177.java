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

public class BeanDeserializer_init_99674089177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58174;
     Object term58433;

    public BeanDeserializer_init_99674089177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term58244 = Class.forName((String) "java.util.concurrent.Executors$PrivilegedThreadFactory$1");
        Class<? extends Object> term59492 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term59491 = ((Class) term59492).getDeclaredField((String) "ARRAY");
        ((Field) term59491).setAccessible(true);
        Object enum5 = ((Field) term59491).get((Object) null);
        term58174 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term58226 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term58226, term58226.getClass(), "_class", term58244);
        setField(term58174, term58174.getClass(), "_beanType", term58226);
        setField(term58174, term58174.getClass(), "_valueClass", null);
        setField(term58174, term58174.getClass(), "_valueInstantiator", null);
        setField(term58174, term58174.getClass(), "_delegateDeserializer", null);
        setField(term58174, term58174.getClass(), "_propertyBasedCreator", null);
        setField(term58174, term58174.getClass(), "_backRefs", null);
        setField(term58174, term58174.getClass(), "_ignorableProps", null);
        setBooleanField(term58174, term58174.getClass(), "_ignoreAllUnknown", false);
        setField(term58174, term58174.getClass(), "_anySetter", null);
        setField(term58174, term58174.getClass(), "_injectables", null);
        setBooleanField(term58174, term58174.getClass(), "_nonStandardCreation", false);
        setField(term58174, term58174.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term58174, term58174.getClass(), "_needViewProcesing", false);
        setField(term58174, term58174.getClass(), "_serializationShape", enum5);
        setField(term58174, term58174.getClass(), "_objectIdReader", null);
        term58433 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term58174;
        args[1] = term58433;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


