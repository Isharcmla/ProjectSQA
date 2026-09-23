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

public class BeanDeserializer_init_99674089195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114673;
     Object term115039;

    public BeanDeserializer_init_99674089195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term114435 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term114561 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer"));
        setField(term114435, term114435.getClass(), "_valueClass", null);
        setField(term114435, term114435.getClass(), "_classAnnotations", null);
        setField(term114435, term114435.getClass(), "_beanType", null);
        setField(term114435, term114435.getClass(), "_valueInstantiator", null);
        setField(term114435, term114435.getClass(), "_delegateDeserializer", term114561);
        setField(term114435, term114435.getClass(), "_propertyBasedCreator", null);
        setField(term114435, term114435.getClass(), "_backRefs", null);
        setField(term114435, term114435.getClass(), "_ignorableProps", null);
        setBooleanField(term114435, term114435.getClass(), "_ignoreAllUnknown", false);
        setField(term114435, term114435.getClass(), "_anySetter", null);
        setField(term114435, term114435.getClass(), "_injectables", null);
        setBooleanField(term114435, term114435.getClass(), "_nonStandardCreation", false);
        setField(term114435, term114435.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term114435, term114435.getClass(), "_needViewProcesing", false);
        setField(term114435, term114435.getClass(), "_serializationShape", null);
        setField(term114435, term114435.getClass(), "_objectIdReader", null);
        Class<? extends Object> term116170 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term116169 = ((Class) term116170).getDeclaredField((String) "NUMBER");
        ((Field) term116169).setAccessible(true);
        Object enum11 = ((Field) term116169).get((Object) null);
        term114673 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term114779 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term114779, term114779.getClass(), "_class", null);
        setField(term114673, term114673.getClass(), "_beanType", term114779);
        setField(term114673, term114673.getClass(), "_classAnnotations", null);
        setField(term114673, term114673.getClass(), "_valueInstantiator", null);
        setField(term114673, term114673.getClass(), "_delegateDeserializer", null);
        setField(term114673, term114673.getClass(), "_propertyBasedCreator", null);
        setField(term114673, term114673.getClass(), "_backRefs", null);
        setField(term114673, term114673.getClass(), "_ignorableProps", null);
        setBooleanField(term114673, term114673.getClass(), "_ignoreAllUnknown", false);
        setField(term114673, term114673.getClass(), "_anySetter", null);
        setField(term114673, term114673.getClass(), "_injectables", null);
        setBooleanField(term114673, term114673.getClass(), "_nonStandardCreation", false);
        setField(term114673, term114673.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term114673, term114673.getClass(), "_needViewProcesing", false);
        setField(term114673, term114673.getClass(), "_serializationShape", enum11);
        term115039 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term114673;
        args[1] = term115039;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


