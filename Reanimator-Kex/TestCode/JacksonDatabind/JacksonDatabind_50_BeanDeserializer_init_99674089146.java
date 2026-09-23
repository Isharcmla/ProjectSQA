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

public class BeanDeserializer_init_99674089146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62700;
     Object term63208;

    public BeanDeserializer_init_99674089146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62446 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy");
        Class<? extends Object> term65333 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term65332 = ((Class) term65333).getDeclaredField((String) "ANY");
        ((Field) term65332).setAccessible(true);
        Object enum16 = ((Field) term65332).get((Object) null);
        Object term62410 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term62410, term62410.getClass(), "_valueClass", term62446);
        setField(term62410, term62410.getClass(), "_classAnnotations", null);
        setField(term62410, term62410.getClass(), "_beanType", null);
        setField(term62410, term62410.getClass(), "_valueInstantiator", null);
        setField(term62410, term62410.getClass(), "_delegateDeserializer", null);
        setField(term62410, term62410.getClass(), "_propertyBasedCreator", null);
        setField(term62410, term62410.getClass(), "_backRefs", null);
        setField(term62410, term62410.getClass(), "_ignorableProps", null);
        setBooleanField(term62410, term62410.getClass(), "_ignoreAllUnknown", false);
        setField(term62410, term62410.getClass(), "_anySetter", null);
        setField(term62410, term62410.getClass(), "_injectables", null);
        setBooleanField(term62410, term62410.getClass(), "_nonStandardCreation", false);
        setField(term62410, term62410.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term62410, term62410.getClass(), "_needViewProcesing", false);
        setField(term62410, term62410.getClass(), "_serializationShape", enum16);
        setField(term62410, term62410.getClass(), "_objectIdReader", null);
        Class<? extends Object> term62832 = Class.forName((String) "java.io.FilePermission$1");
        Class<? extends Object> term65668 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term65667 = ((Class) term65668).getDeclaredField((String) "STRING");
        ((Field) term65667).setAccessible(true);
        Object enum17 = ((Field) term65667).get((Object) null);
        term62700 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term62796 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term62948 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term62796, term62796.getClass(), "_class", term62832);
        setField(term62700, term62700.getClass(), "_beanType", term62796);
        setField(term62700, term62700.getClass(), "_classAnnotations", term62948);
        setField(term62700, term62700.getClass(), "_valueInstantiator", null);
        setField(term62700, term62700.getClass(), "_delegateDeserializer", null);
        setField(term62700, term62700.getClass(), "_propertyBasedCreator", null);
        setField(term62700, term62700.getClass(), "_backRefs", null);
        setField(term62700, term62700.getClass(), "_ignorableProps", null);
        setBooleanField(term62700, term62700.getClass(), "_ignoreAllUnknown", false);
        setField(term62700, term62700.getClass(), "_anySetter", null);
        setField(term62700, term62700.getClass(), "_injectables", null);
        setBooleanField(term62700, term62700.getClass(), "_nonStandardCreation", false);
        setField(term62700, term62700.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term62700, term62700.getClass(), "_needViewProcesing", false);
        setField(term62700, term62700.getClass(), "_serializationShape", enum17);
        term63208 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term62700;
        args[1] = term63208;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


