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

public class BuilderBasedDeserializer_init_516859802201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101252;
     Object term101584;

    public BuilderBasedDeserializer_init_516859802201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term102235 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term102234 = ((Class) term102235).getDeclaredField((String) "SCALAR");
        ((Field) term102234).setAccessible(true);
        Object enum15 = ((Field) term102234).get((Object) null);
        term101252 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term101312 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term101395 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$DoubleDeser"));
        setField(term101312, term101312.getClass(), "_class", null);
        setField(term101252, term101252.getClass(), "_beanType", term101312);
        setField(term101252, term101252.getClass(), "_valueClass", null);
        setField(term101252, term101252.getClass(), "_classAnnotations", null);
        setField(term101252, term101252.getClass(), "_valueInstantiator", null);
        setField(term101252, term101252.getClass(), "_delegateDeserializer", term101395);
        setField(term101252, term101252.getClass(), "_propertyBasedCreator", null);
        setField(term101252, term101252.getClass(), "_backRefs", null);
        setField(term101252, term101252.getClass(), "_ignorableProps", null);
        setBooleanField(term101252, term101252.getClass(), "_ignoreAllUnknown", false);
        setField(term101252, term101252.getClass(), "_anySetter", null);
        setField(term101252, term101252.getClass(), "_injectables", null);
        setBooleanField(term101252, term101252.getClass(), "_nonStandardCreation", false);
        setField(term101252, term101252.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term101252, term101252.getClass(), "_needViewProcesing", false);
        setField(term101252, term101252.getClass(), "_serializationShape", enum15);
        setField(term101252, term101252.getClass(), "_objectIdReader", null);
        term101584 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term101252;
        args[1] = term101584;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


