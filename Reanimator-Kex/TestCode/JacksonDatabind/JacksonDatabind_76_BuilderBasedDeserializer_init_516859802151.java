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

public class BuilderBasedDeserializer_init_516859802151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53143;
     Object term53421;

    public BuilderBasedDeserializer_init_516859802151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53214 = Class.forName((String) "java.lang.invoke.StringConcatFactory$MethodHandleInlineCopyStrategy$2");
        Class<? extends Object> term53232 = Class.forName((String) "java.util.function.DoubleConsumer");
        Class<? extends Object> term54733 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term54732 = ((Class) term54733).getDeclaredField((String) "ANY");
        ((Field) term54732).setAccessible(true);
        Object enum5 = ((Field) term54732).get((Object) null);
        term53143 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term53196 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term53196, term53196.getClass(), "_class", term53214);
        setField(term53143, term53143.getClass(), "_beanType", term53196);
        setField(term53143, term53143.getClass(), "_valueClass", term53232);
        setField(term53143, term53143.getClass(), "_classAnnotations", null);
        setField(term53143, term53143.getClass(), "_valueInstantiator", null);
        setField(term53143, term53143.getClass(), "_delegateDeserializer", null);
        setField(term53143, term53143.getClass(), "_propertyBasedCreator", null);
        setField(term53143, term53143.getClass(), "_backRefs", null);
        setField(term53143, term53143.getClass(), "_ignorableProps", null);
        setBooleanField(term53143, term53143.getClass(), "_ignoreAllUnknown", false);
        setField(term53143, term53143.getClass(), "_anySetter", null);
        setField(term53143, term53143.getClass(), "_injectables", null);
        setBooleanField(term53143, term53143.getClass(), "_nonStandardCreation", false);
        setField(term53143, term53143.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term53143, term53143.getClass(), "_needViewProcesing", false);
        setField(term53143, term53143.getClass(), "_serializationShape", enum5);
        setField(term53143, term53143.getClass(), "_objectIdReader", null);
        term53421 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term53143;
        args[1] = term53421;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


