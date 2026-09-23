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

public class BeanDeserializer_init_99674089231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136468;
     Object term136778;

    public BeanDeserializer_init_99674089231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term137520 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term137519 = ((Class) term137520).getDeclaredField((String) "OBJECT");
        ((Field) term137519).setAccessible(true);
        Object enum23 = ((Field) term137519).get((Object) null);
        term136468 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term136521 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term136589 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        Object[] term135757 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ValueInjector", 0);
        setField(term136521, term136521.getClass(), "_class", null);
        setField(term136468, term136468.getClass(), "_beanType", term136521);
        setField(term136468, term136468.getClass(), "_valueClass", null);
        setField(term136468, term136468.getClass(), "_valueInstantiator", term136589);
        setField(term136468, term136468.getClass(), "_delegateDeserializer", null);
        setField(term136468, term136468.getClass(), "_propertyBasedCreator", null);
        setField(term136468, term136468.getClass(), "_backRefs", null);
        setField(term136468, term136468.getClass(), "_ignorableProps", null);
        setBooleanField(term136468, term136468.getClass(), "_ignoreAllUnknown", false);
        setField(term136468, term136468.getClass(), "_anySetter", null);
        setField(term136468, term136468.getClass(), "_injectables", term135757);
        setBooleanField(term136468, term136468.getClass(), "_nonStandardCreation", false);
        setField(term136468, term136468.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term136468, term136468.getClass(), "_needViewProcesing", false);
        setField(term136468, term136468.getClass(), "_serializationShape", enum23);
        setField(term136468, term136468.getClass(), "_objectIdReader", null);
        term136778 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term136870 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term136778, term136778.getClass(), "propertyName", term136870);
        setField(term136778, term136778.getClass(), "_idType", null);
        setField(term136778, term136778.getClass(), "_deserializer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term136468;
        args[1] = term136778;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


