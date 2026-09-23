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

public class BeanDeserializer_init_99674089173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83968;
     Object term84328;

    public BeanDeserializer_init_99674089173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83688 = Class.forName((String) "java.util.TimSort");
        Object term83652 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term83818 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(term83652, term83652.getClass(), "_valueClass", term83688);
        setField(term83652, term83652.getClass(), "_classAnnotations", null);
        setField(term83652, term83652.getClass(), "_beanType", null);
        setField(term83652, term83652.getClass(), "_valueInstantiator", null);
        setField(term83652, term83652.getClass(), "_delegateDeserializer", null);
        setField(term83652, term83652.getClass(), "_propertyBasedCreator", term83818);
        setField(term83652, term83652.getClass(), "_backRefs", null);
        setField(term83652, term83652.getClass(), "_ignorableProps", null);
        setBooleanField(term83652, term83652.getClass(), "_ignoreAllUnknown", false);
        setField(term83652, term83652.getClass(), "_anySetter", null);
        setField(term83652, term83652.getClass(), "_injectables", null);
        setBooleanField(term83652, term83652.getClass(), "_nonStandardCreation", false);
        setField(term83652, term83652.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term83652, term83652.getClass(), "_needViewProcesing", false);
        setField(term83652, term83652.getClass(), "_serializationShape", null);
        setField(term83652, term83652.getClass(), "_objectIdReader", null);
        Class<? extends Object> term85543 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term85542 = ((Class) term85543).getDeclaredField((String) "OBJECT");
        ((Field) term85542).setAccessible(true);
        Object enum23 = ((Field) term85542).get((Object) null);
        term83968 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        Object term84068 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term84068, term84068.getClass(), "_class", null);
        setField(term83968, term83968.getClass(), "_beanType", term84068);
        setField(term83968, term83968.getClass(), "_classAnnotations", null);
        setField(term83968, term83968.getClass(), "_valueInstantiator", null);
        setField(term83968, term83968.getClass(), "_delegateDeserializer", null);
        setField(term83968, term83968.getClass(), "_propertyBasedCreator", null);
        setField(term83968, term83968.getClass(), "_backRefs", null);
        setField(term83968, term83968.getClass(), "_ignorableProps", null);
        setBooleanField(term83968, term83968.getClass(), "_ignoreAllUnknown", false);
        setField(term83968, term83968.getClass(), "_anySetter", null);
        setField(term83968, term83968.getClass(), "_injectables", null);
        setBooleanField(term83968, term83968.getClass(), "_nonStandardCreation", false);
        setField(term83968, term83968.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term83968, term83968.getClass(), "_needViewProcesing", false);
        setField(term83968, term83968.getClass(), "_serializationShape", enum23);
        term84328 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term83968;
        args[1] = term84328;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


