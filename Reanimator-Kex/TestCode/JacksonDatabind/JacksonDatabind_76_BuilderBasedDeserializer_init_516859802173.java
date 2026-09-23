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

public class BuilderBasedDeserializer_init_516859802173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74610;
     Object term74870;

    public BuilderBasedDeserializer_init_516859802173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term74681 = Class.forName((String) "java.util.function.Consumer");
        Class<? extends Object> term75921 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term75920 = ((Class) term75921).getDeclaredField((String) "BOOLEAN");
        ((Field) term75920).setAccessible(true);
        Object enum11 = ((Field) term75920).get((Object) null);
        term74610 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term74663 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term74663, term74663.getClass(), "_class", term74681);
        setField(term74610, term74610.getClass(), "_beanType", term74663);
        setField(term74610, term74610.getClass(), "_valueClass", null);
        setField(term74610, term74610.getClass(), "_classAnnotations", null);
        setField(term74610, term74610.getClass(), "_valueInstantiator", null);
        setField(term74610, term74610.getClass(), "_delegateDeserializer", null);
        setField(term74610, term74610.getClass(), "_propertyBasedCreator", null);
        setField(term74610, term74610.getClass(), "_backRefs", null);
        setField(term74610, term74610.getClass(), "_ignorableProps", null);
        setBooleanField(term74610, term74610.getClass(), "_ignoreAllUnknown", false);
        setField(term74610, term74610.getClass(), "_anySetter", null);
        setField(term74610, term74610.getClass(), "_injectables", null);
        setBooleanField(term74610, term74610.getClass(), "_nonStandardCreation", false);
        setField(term74610, term74610.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term74610, term74610.getClass(), "_needViewProcesing", false);
        setField(term74610, term74610.getClass(), "_serializationShape", enum11);
        setField(term74610, term74610.getClass(), "_objectIdReader", null);
        term74870 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term74610;
        args[1] = term74870;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


