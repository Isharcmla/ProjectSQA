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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.EqualityUtils.*;
import java.lang.Object;

public class BeanDeserializer_init_1678761736113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30737;
     Object term30854;
     Object term30856;

    public BeanDeserializer_init_1678761736113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30625 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term30737 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term30833 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term30737, term30737.getClass(), "_beanType", term30833);
        term30854 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term30855 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term30854, term30854.getClass(), "_classAnnotations", null);
        setField(term30855, term30855.getClass(), "_componentType", null);
        setField(term30855, term30855.getClass(), "_emptyArray", null);
        setField(term30855, term30855.getClass(), "_canonicalName", null);
        setField(term30855, term30855.getClass(), "_class", null);
        setIntField(term30855, term30855.getClass(), "_hash", 0);
        setField(term30855, term30855.getClass(), "_valueHandler", null);
        setField(term30855, term30855.getClass(), "_typeHandler", null);
        setBooleanField(term30855, term30855.getClass(), "_asStatic", false);
        setField(term30854, term30854.getClass(), "_beanType", term30855);
        setField(term30854, term30854.getClass(), "_serializationShape", null);
        setField(term30854, term30854.getClass(), "_valueInstantiator", null);
        setField(term30854, term30854.getClass(), "_delegateDeserializer", null);
        setField(term30854, term30854.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term30854, term30854.getClass(), "_nonStandardCreation", false);
        setBooleanField(term30854, term30854.getClass(), "_vanillaProcessing", false);
        setField(term30854, term30854.getClass(), "_beanProperties", null);
        setField(term30854, term30854.getClass(), "_injectables", null);
        setField(term30854, term30854.getClass(), "_anySetter", null);
        setField(term30854, term30854.getClass(), "_ignorableProps", null);
        setBooleanField(term30854, term30854.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term30854, term30854.getClass(), "_needViewProcesing", false);
        setField(term30854, term30854.getClass(), "_backRefs", null);
        setField(term30854, term30854.getClass(), "_subDeserializers", null);
        setField(term30854, term30854.getClass(), "_unwrappedPropertyHandler", null);
        setField(term30854, term30854.getClass(), "_externalTypeIdHandler", null);
        setField(term30854, term30854.getClass(), "_objectIdReader", null);
        setField(term30854, term30854.getClass(), "_valueClass", null);
        term30856 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term30857 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term30856, term30856.getClass(), "_classAnnotations", null);
        setField(term30857, term30857.getClass(), "_componentType", null);
        setField(term30857, term30857.getClass(), "_emptyArray", null);
        setField(term30857, term30857.getClass(), "_canonicalName", null);
        setField(term30857, term30857.getClass(), "_class", null);
        setIntField(term30857, term30857.getClass(), "_hash", 0);
        setField(term30857, term30857.getClass(), "_valueHandler", null);
        setField(term30857, term30857.getClass(), "_typeHandler", null);
        setBooleanField(term30857, term30857.getClass(), "_asStatic", false);
        setField(term30856, term30856.getClass(), "_beanType", term30857);
        setField(term30856, term30856.getClass(), "_serializationShape", null);
        setField(term30856, term30856.getClass(), "_valueInstantiator", null);
        setField(term30856, term30856.getClass(), "_delegateDeserializer", null);
        setField(term30856, term30856.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term30856, term30856.getClass(), "_nonStandardCreation", false);
        setBooleanField(term30856, term30856.getClass(), "_vanillaProcessing", false);
        setField(term30856, term30856.getClass(), "_beanProperties", null);
        setField(term30856, term30856.getClass(), "_injectables", null);
        setField(term30856, term30856.getClass(), "_anySetter", null);
        setField(term30856, term30856.getClass(), "_ignorableProps", null);
        setBooleanField(term30856, term30856.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term30856, term30856.getClass(), "_needViewProcesing", false);
        setField(term30856, term30856.getClass(), "_backRefs", null);
        setField(term30856, term30856.getClass(), "_subDeserializers", null);
        setField(term30856, term30856.getClass(), "_unwrappedPropertyHandler", null);
        setField(term30856, term30856.getClass(), "_externalTypeIdHandler", null);
        setField(term30856, term30856.getClass(), "_objectIdReader", null);
        setField(term30856, term30856.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term30737;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30854));
        assertTrue(recursiveEquals(term30737, term30856));
    }

};


