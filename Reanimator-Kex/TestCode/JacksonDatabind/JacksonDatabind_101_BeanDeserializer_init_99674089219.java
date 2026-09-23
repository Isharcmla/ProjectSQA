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

public class BeanDeserializer_init_99674089219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117345;
     Object term117630;

    public BeanDeserializer_init_99674089219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term117423 = Class.forName((String) "java.util.stream.StreamSpliterators$SliceSpliterator$OfPrimitive");
        Class<? extends Object> term117441 = Class.forName((String) "java.util.stream.LongPipeline$6");
        Class<? extends Object> term119053 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term119052 = ((Class) term119053).getDeclaredField((String) "NUMBER_FLOAT");
        ((Field) term119052).setAccessible(true);
        Object enum19 = ((Field) term119052).get((Object) null);
        term117345 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term117405 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term117405, term117405.getClass(), "_class", term117423);
        setField(term117345, term117345.getClass(), "_beanType", term117405);
        setField(term117345, term117345.getClass(), "_valueClass", term117441);
        setField(term117345, term117345.getClass(), "_valueInstantiator", null);
        setField(term117345, term117345.getClass(), "_delegateDeserializer", null);
        setField(term117345, term117345.getClass(), "_propertyBasedCreator", null);
        setField(term117345, term117345.getClass(), "_backRefs", null);
        setField(term117345, term117345.getClass(), "_ignorableProps", null);
        setBooleanField(term117345, term117345.getClass(), "_ignoreAllUnknown", false);
        setField(term117345, term117345.getClass(), "_anySetter", null);
        setField(term117345, term117345.getClass(), "_injectables", null);
        setBooleanField(term117345, term117345.getClass(), "_nonStandardCreation", false);
        setField(term117345, term117345.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term117345, term117345.getClass(), "_needViewProcesing", false);
        setField(term117345, term117345.getClass(), "_serializationShape", enum19);
        setField(term117345, term117345.getClass(), "_objectIdReader", null);
        term117630 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term117345;
        args[1] = term117630;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


