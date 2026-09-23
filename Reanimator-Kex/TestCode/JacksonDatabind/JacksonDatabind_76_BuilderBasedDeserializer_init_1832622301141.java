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

public class BuilderBasedDeserializer_init_1832622301141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43752;

    public BuilderBasedDeserializer_init_1832622301141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43508 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term43624 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object[] term43259 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ValueInjector", 0);
        setField(term43508, term43508.getClass(), "_valueClass", null);
        setField(term43508, term43508.getClass(), "_classAnnotations", term43624);
        setField(term43508, term43508.getClass(), "_beanType", null);
        setField(term43508, term43508.getClass(), "_valueInstantiator", null);
        setField(term43508, term43508.getClass(), "_delegateDeserializer", null);
        setField(term43508, term43508.getClass(), "_propertyBasedCreator", null);
        setField(term43508, term43508.getClass(), "_backRefs", null);
        setField(term43508, term43508.getClass(), "_ignorableProps", null);
        setBooleanField(term43508, term43508.getClass(), "_ignoreAllUnknown", false);
        setField(term43508, term43508.getClass(), "_anySetter", null);
        setField(term43508, term43508.getClass(), "_injectables", term43259);
        setBooleanField(term43508, term43508.getClass(), "_nonStandardCreation", false);
        setField(term43508, term43508.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term43508, term43508.getClass(), "_needViewProcesing", false);
        setField(term43508, term43508.getClass(), "_serializationShape", null);
        setBooleanField(term43508, term43508.getClass(), "_vanillaProcessing", false);
        setField(term43508, term43508.getClass(), "_objectIdReader", null);
        Class<? extends Object> term44905 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term44904 = ((Class) term44905).getDeclaredField((String) "SCALAR");
        ((Field) term44904).setAccessible(true);
        Object enum3 = ((Field) term44904).get((Object) null);
        term43752 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object[] term43258 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ValueInjector", 0);
        Object term43890 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        Object term44150 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term44270 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term43752, term43752.getClass(), "_beanType", null);
        setField(term43752, term43752.getClass(), "_classAnnotations", null);
        setField(term43752, term43752.getClass(), "_valueInstantiator", null);
        setField(term43752, term43752.getClass(), "_delegateDeserializer", null);
        setField(term43752, term43752.getClass(), "_propertyBasedCreator", null);
        setField(term43752, term43752.getClass(), "_backRefs", null);
        setBooleanField(term43752, term43752.getClass(), "_ignoreAllUnknown", false);
        setField(term43752, term43752.getClass(), "_anySetter", null);
        setField(term43752, term43752.getClass(), "_injectables", term43258);
        setBooleanField(term43752, term43752.getClass(), "_nonStandardCreation", false);
        setField(term43752, term43752.getClass(), "_unwrappedPropertyHandler", term43890);
        setBooleanField(term43752, term43752.getClass(), "_needViewProcesing", false);
        setField(term43752, term43752.getClass(), "_serializationShape", enum3);
        setBooleanField(term43752, term43752.getClass(), "_vanillaProcessing", false);
        setField(term43752, term43752.getClass(), "_objectIdReader", term44150);
        setField(term43752, term43752.getClass(), "_beanProperties", term44270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term43752;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


