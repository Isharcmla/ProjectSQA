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

public class BeanDeserializer_init_99674089165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42246;
     Object term42638;

    public BeanDeserializer_init_99674089165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42006 = Class.forName((String) "java.util.stream.SortedOps");
        Object term41970 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term42134 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
        setField(term41970, term41970.getClass(), "_valueClass", term42006);
        setField(term41970, term41970.getClass(), "_beanType", null);
        setField(term41970, term41970.getClass(), "_valueInstantiator", null);
        setField(term41970, term41970.getClass(), "_delegateDeserializer", term42134);
        setField(term41970, term41970.getClass(), "_propertyBasedCreator", null);
        setField(term41970, term41970.getClass(), "_backRefs", null);
        setField(term41970, term41970.getClass(), "_ignorableProps", null);
        setBooleanField(term41970, term41970.getClass(), "_ignoreAllUnknown", false);
        setField(term41970, term41970.getClass(), "_anySetter", null);
        setField(term41970, term41970.getClass(), "_injectables", null);
        setBooleanField(term41970, term41970.getClass(), "_nonStandardCreation", false);
        setField(term41970, term41970.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term41970, term41970.getClass(), "_needViewProcesing", false);
        setField(term41970, term41970.getClass(), "_serializationShape", null);
        setField(term41970, term41970.getClass(), "_objectIdReader", null);
        Class<? extends Object> term42378 = Class.forName((String) "java.math.MutableBigInteger");
        Class<? extends Object> term43991 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term43990 = ((Class) term43991).getDeclaredField((String) "NUMBER_INT");
        ((Field) term43990).setAccessible(true);
        Object enum1 = ((Field) term43990).get((Object) null);
        term42246 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term42342 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term42342, term42342.getClass(), "_class", term42378);
        setField(term42246, term42246.getClass(), "_beanType", term42342);
        setField(term42246, term42246.getClass(), "_valueInstantiator", null);
        setField(term42246, term42246.getClass(), "_delegateDeserializer", null);
        setField(term42246, term42246.getClass(), "_propertyBasedCreator", null);
        setField(term42246, term42246.getClass(), "_backRefs", null);
        setField(term42246, term42246.getClass(), "_ignorableProps", null);
        setBooleanField(term42246, term42246.getClass(), "_ignoreAllUnknown", false);
        setField(term42246, term42246.getClass(), "_anySetter", null);
        setField(term42246, term42246.getClass(), "_injectables", null);
        setBooleanField(term42246, term42246.getClass(), "_nonStandardCreation", false);
        setField(term42246, term42246.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term42246, term42246.getClass(), "_needViewProcesing", false);
        setField(term42246, term42246.getClass(), "_serializationShape", enum1);
        term42638 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term42246;
        args[1] = term42638;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


