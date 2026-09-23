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

public class BeanDeserializer_init_1415436588169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48202;

    public BeanDeserializer_init_1415436588169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47990 = Class.forName((String) "java.lang.EnumConstantNotPresentException");
        Object term47954 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term48090 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term47954, term47954.getClass(), "_valueClass", term47990);
        setField(term47954, term47954.getClass(), "_beanType", term48090);
        setField(term47954, term47954.getClass(), "_valueInstantiator", null);
        setField(term47954, term47954.getClass(), "_delegateDeserializer", null);
        setField(term47954, term47954.getClass(), "_propertyBasedCreator", null);
        setField(term47954, term47954.getClass(), "_backRefs", null);
        setField(term47954, term47954.getClass(), "_ignorableProps", null);
        setBooleanField(term47954, term47954.getClass(), "_ignoreAllUnknown", false);
        setField(term47954, term47954.getClass(), "_anySetter", null);
        setField(term47954, term47954.getClass(), "_injectables", null);
        setBooleanField(term47954, term47954.getClass(), "_nonStandardCreation", false);
        setField(term47954, term47954.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term47954, term47954.getClass(), "_needViewProcesing", false);
        setField(term47954, term47954.getClass(), "_serializationShape", null);
        setBooleanField(term47954, term47954.getClass(), "_vanillaProcessing", false);
        setField(term47954, term47954.getClass(), "_objectIdReader", null);
        Class<? extends Object> term49515 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term49514 = ((Class) term49515).getDeclaredField((String) "NUMBER");
        ((Field) term49514).setAccessible(true);
        Object enum3 = ((Field) term49514).get((Object) null);
        term48202 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term48322 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term48584 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term48322, term48322.getClass(), "_class", null);
        setField(term48202, term48202.getClass(), "_beanType", term48322);
        setField(term48202, term48202.getClass(), "_valueInstantiator", null);
        setField(term48202, term48202.getClass(), "_delegateDeserializer", null);
        setField(term48202, term48202.getClass(), "_propertyBasedCreator", null);
        setField(term48202, term48202.getClass(), "_backRefs", null);
        setBooleanField(term48202, term48202.getClass(), "_ignoreAllUnknown", false);
        setField(term48202, term48202.getClass(), "_anySetter", null);
        setField(term48202, term48202.getClass(), "_injectables", null);
        setBooleanField(term48202, term48202.getClass(), "_nonStandardCreation", false);
        setField(term48202, term48202.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term48202, term48202.getClass(), "_needViewProcesing", false);
        setField(term48202, term48202.getClass(), "_serializationShape", enum3);
        setBooleanField(term48202, term48202.getClass(), "_vanillaProcessing", false);
        setField(term48202, term48202.getClass(), "_objectIdReader", null);
        setField(term48202, term48202.getClass(), "_beanProperties", term48584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term48202;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


