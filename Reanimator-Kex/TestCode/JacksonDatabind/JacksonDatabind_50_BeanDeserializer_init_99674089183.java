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

public class BeanDeserializer_init_99674089183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89531;
     Object term89931;

    public BeanDeserializer_init_99674089183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term89189 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$KeySpliterator");
        Object term89153 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term89289 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term89419 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(term89153, term89153.getClass(), "_valueClass", term89189);
        setField(term89153, term89153.getClass(), "_classAnnotations", null);
        setField(term89153, term89153.getClass(), "_beanType", term89289);
        setField(term89153, term89153.getClass(), "_valueInstantiator", null);
        setField(term89153, term89153.getClass(), "_delegateDeserializer", null);
        setField(term89153, term89153.getClass(), "_propertyBasedCreator", term89419);
        setField(term89153, term89153.getClass(), "_backRefs", null);
        setField(term89153, term89153.getClass(), "_ignorableProps", null);
        setBooleanField(term89153, term89153.getClass(), "_ignoreAllUnknown", false);
        setField(term89153, term89153.getClass(), "_anySetter", null);
        setField(term89153, term89153.getClass(), "_injectables", null);
        setBooleanField(term89153, term89153.getClass(), "_nonStandardCreation", false);
        setField(term89153, term89153.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term89153, term89153.getClass(), "_needViewProcesing", false);
        setField(term89153, term89153.getClass(), "_serializationShape", null);
        setField(term89153, term89153.getClass(), "_objectIdReader", null);
        Class<? extends Object> term89671 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsFloats$ArrayHandle");
        Class<? extends Object> term91364 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term91363 = ((Class) term91364).getDeclaredField((String) "ARRAY");
        ((Field) term91363).setAccessible(true);
        Object enum25 = ((Field) term91363).get((Object) null);
        term89531 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term89635 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term89635, term89635.getClass(), "_class", term89671);
        setField(term89531, term89531.getClass(), "_beanType", term89635);
        setField(term89531, term89531.getClass(), "_classAnnotations", null);
        setField(term89531, term89531.getClass(), "_valueInstantiator", null);
        setField(term89531, term89531.getClass(), "_delegateDeserializer", null);
        setField(term89531, term89531.getClass(), "_propertyBasedCreator", null);
        setField(term89531, term89531.getClass(), "_backRefs", null);
        setField(term89531, term89531.getClass(), "_ignorableProps", null);
        setBooleanField(term89531, term89531.getClass(), "_ignoreAllUnknown", false);
        setField(term89531, term89531.getClass(), "_anySetter", null);
        setField(term89531, term89531.getClass(), "_injectables", null);
        setBooleanField(term89531, term89531.getClass(), "_nonStandardCreation", false);
        setField(term89531, term89531.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term89531, term89531.getClass(), "_needViewProcesing", false);
        setField(term89531, term89531.getClass(), "_serializationShape", enum25);
        term89931 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term89531;
        args[1] = term89931;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


