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

public class BeanDeserializer_init_1415436588225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126298;

    public BeanDeserializer_init_1415436588225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term125906 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term126010 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term126148 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(term125906, term125906.getClass(), "_valueClass", null);
        setField(term125906, term125906.getClass(), "_beanType", term126010);
        setField(term125906, term125906.getClass(), "_valueInstantiator", null);
        setField(term125906, term125906.getClass(), "_delegateDeserializer", term126148);
        setField(term125906, term125906.getClass(), "_propertyBasedCreator", null);
        setField(term125906, term125906.getClass(), "_backRefs", null);
        setField(term125906, term125906.getClass(), "_ignorableProps", null);
        setBooleanField(term125906, term125906.getClass(), "_ignoreAllUnknown", false);
        setField(term125906, term125906.getClass(), "_anySetter", null);
        setField(term125906, term125906.getClass(), "_injectables", null);
        setBooleanField(term125906, term125906.getClass(), "_nonStandardCreation", false);
        setField(term125906, term125906.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term125906, term125906.getClass(), "_needViewProcesing", false);
        setField(term125906, term125906.getClass(), "_serializationShape", null);
        setBooleanField(term125906, term125906.getClass(), "_vanillaProcessing", false);
        setField(term125906, term125906.getClass(), "_objectIdReader", null);
        Class<? extends Object> term126426 = Class.forName((String) "java.util.concurrent.Phaser$QNode");
        Class<? extends Object> term127826 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term127825 = ((Class) term127826).getDeclaredField((String) "OBJECT");
        ((Field) term127825).setAccessible(true);
        Object enum21 = ((Field) term127825).get((Object) null);
        term126298 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        Object term126390 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term126686 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term126806 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term126390, term126390.getClass(), "_class", term126426);
        setField(term126298, term126298.getClass(), "_beanType", term126390);
        setField(term126298, term126298.getClass(), "_valueInstantiator", null);
        setField(term126298, term126298.getClass(), "_delegateDeserializer", null);
        setField(term126298, term126298.getClass(), "_propertyBasedCreator", null);
        setField(term126298, term126298.getClass(), "_backRefs", null);
        setBooleanField(term126298, term126298.getClass(), "_ignoreAllUnknown", false);
        setField(term126298, term126298.getClass(), "_anySetter", null);
        setField(term126298, term126298.getClass(), "_injectables", null);
        setBooleanField(term126298, term126298.getClass(), "_nonStandardCreation", false);
        setField(term126298, term126298.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term126298, term126298.getClass(), "_needViewProcesing", false);
        setField(term126298, term126298.getClass(), "_serializationShape", enum21);
        setBooleanField(term126298, term126298.getClass(), "_vanillaProcessing", false);
        setField(term126298, term126298.getClass(), "_objectIdReader", term126686);
        setField(term126298, term126298.getClass(), "_beanProperties", term126806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term126298;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


