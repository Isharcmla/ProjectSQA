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

public class BeanDeserializer_init_9967408989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21805;
     Object term22065;

    public BeanDeserializer_init_9967408989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21693 = Class.forName((String) "java.lang.invoke.MethodType$ConcurrentWeakInternSet");
        Object term21657 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term21657, term21657.getClass(), "_valueClass", term21693);
        setField(term21657, term21657.getClass(), "_classAnnotations", null);
        setField(term21657, term21657.getClass(), "_beanType", null);
        setField(term21657, term21657.getClass(), "_valueInstantiator", null);
        setField(term21657, term21657.getClass(), "_delegateDeserializer", null);
        setField(term21657, term21657.getClass(), "_propertyBasedCreator", null);
        setField(term21657, term21657.getClass(), "_backRefs", null);
        setField(term21657, term21657.getClass(), "_ignorableProps", null);
        setBooleanField(term21657, term21657.getClass(), "_ignoreAllUnknown", false);
        setField(term21657, term21657.getClass(), "_anySetter", null);
        setField(term21657, term21657.getClass(), "_injectables", null);
        setBooleanField(term21657, term21657.getClass(), "_nonStandardCreation", false);
        setField(term21657, term21657.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term21657, term21657.getClass(), "_needViewProcesing", false);
        setField(term21657, term21657.getClass(), "_serializationShape", null);
        setField(term21657, term21657.getClass(), "_objectIdReader", null);
        Class<? extends Object> term23122 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term23121 = ((Class) term23122).getDeclaredField((String) "BOOLEAN");
        ((Field) term23121).setAccessible(true);
        Object enum1 = ((Field) term23121).get((Object) null);
        term21805 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term21805, term21805.getClass(), "_beanType", null);
        setField(term21805, term21805.getClass(), "_classAnnotations", null);
        setField(term21805, term21805.getClass(), "_valueInstantiator", null);
        setField(term21805, term21805.getClass(), "_delegateDeserializer", null);
        setField(term21805, term21805.getClass(), "_propertyBasedCreator", null);
        setField(term21805, term21805.getClass(), "_backRefs", null);
        setField(term21805, term21805.getClass(), "_ignorableProps", null);
        setBooleanField(term21805, term21805.getClass(), "_ignoreAllUnknown", false);
        setField(term21805, term21805.getClass(), "_anySetter", null);
        setField(term21805, term21805.getClass(), "_injectables", null);
        setBooleanField(term21805, term21805.getClass(), "_nonStandardCreation", false);
        setField(term21805, term21805.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term21805, term21805.getClass(), "_needViewProcesing", false);
        setField(term21805, term21805.getClass(), "_serializationShape", enum1);
        term22065 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term21805;
        args[1] = term22065;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


