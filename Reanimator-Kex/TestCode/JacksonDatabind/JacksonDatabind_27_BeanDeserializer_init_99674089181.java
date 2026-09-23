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

public class BeanDeserializer_init_99674089181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97304;
     Object term97808;

    public BeanDeserializer_init_99674089181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term97050 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer");
        Class<? extends Object> term99639 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term99638 = ((Class) term99639).getDeclaredField((String) "ANY");
        ((Field) term99638).setAccessible(true);
        Object enum8 = ((Field) term99638).get((Object) null);
        Object term97014 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term97014, term97014.getClass(), "_valueClass", term97050);
        setField(term97014, term97014.getClass(), "_classAnnotations", null);
        setField(term97014, term97014.getClass(), "_beanType", null);
        setField(term97014, term97014.getClass(), "_valueInstantiator", null);
        setField(term97014, term97014.getClass(), "_delegateDeserializer", null);
        setField(term97014, term97014.getClass(), "_propertyBasedCreator", null);
        setField(term97014, term97014.getClass(), "_backRefs", null);
        setField(term97014, term97014.getClass(), "_ignorableProps", null);
        setBooleanField(term97014, term97014.getClass(), "_ignoreAllUnknown", false);
        setField(term97014, term97014.getClass(), "_anySetter", null);
        setField(term97014, term97014.getClass(), "_injectables", null);
        setBooleanField(term97014, term97014.getClass(), "_nonStandardCreation", false);
        setField(term97014, term97014.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term97014, term97014.getClass(), "_needViewProcesing", false);
        setField(term97014, term97014.getClass(), "_serializationShape", enum8);
        setField(term97014, term97014.getClass(), "_objectIdReader", null);
        Class<? extends Object> term97432 = Class.forName((String) "com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing");
        Class<? extends Object> term100088 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term100087 = ((Class) term100088).getDeclaredField((String) "NUMBER");
        ((Field) term100087).setAccessible(true);
        Object enum9 = ((Field) term100087).get((Object) null);
        term97304 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term97396 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term97548 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term97396, term97396.getClass(), "_class", term97432);
        setField(term97304, term97304.getClass(), "_beanType", term97396);
        setField(term97304, term97304.getClass(), "_classAnnotations", term97548);
        setField(term97304, term97304.getClass(), "_valueInstantiator", null);
        setField(term97304, term97304.getClass(), "_delegateDeserializer", null);
        setField(term97304, term97304.getClass(), "_propertyBasedCreator", null);
        setField(term97304, term97304.getClass(), "_backRefs", null);
        setField(term97304, term97304.getClass(), "_ignorableProps", null);
        setBooleanField(term97304, term97304.getClass(), "_ignoreAllUnknown", false);
        setField(term97304, term97304.getClass(), "_anySetter", null);
        setField(term97304, term97304.getClass(), "_injectables", null);
        setBooleanField(term97304, term97304.getClass(), "_nonStandardCreation", false);
        setField(term97304, term97304.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term97304, term97304.getClass(), "_needViewProcesing", false);
        setField(term97304, term97304.getClass(), "_serializationShape", enum9);
        term97808 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term97304;
        args[1] = term97808;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


