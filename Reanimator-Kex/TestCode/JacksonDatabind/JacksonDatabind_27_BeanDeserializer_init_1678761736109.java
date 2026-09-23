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

public class BeanDeserializer_init_1678761736109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29899;
     Object term30026;
     Object term30028;

    public BeanDeserializer_init_1678761736109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29787 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term29899 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term30005 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term29899, term29899.getClass(), "_beanType", term30005);
        term30026 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term30027 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term30026, term30026.getClass(), "_classAnnotations", null);
        setField(term30027, term30027.getClass(), "_elementType", null);
        setField(term30027, term30027.getClass(), "_canonicalName", null);
        setField(term30027, term30027.getClass(), "_class", null);
        setIntField(term30027, term30027.getClass(), "_hash", 0);
        setField(term30027, term30027.getClass(), "_valueHandler", null);
        setField(term30027, term30027.getClass(), "_typeHandler", null);
        setBooleanField(term30027, term30027.getClass(), "_asStatic", false);
        setField(term30026, term30026.getClass(), "_beanType", term30027);
        setField(term30026, term30026.getClass(), "_serializationShape", null);
        setField(term30026, term30026.getClass(), "_valueInstantiator", null);
        setField(term30026, term30026.getClass(), "_delegateDeserializer", null);
        setField(term30026, term30026.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term30026, term30026.getClass(), "_nonStandardCreation", false);
        setBooleanField(term30026, term30026.getClass(), "_vanillaProcessing", false);
        setField(term30026, term30026.getClass(), "_beanProperties", null);
        setField(term30026, term30026.getClass(), "_injectables", null);
        setField(term30026, term30026.getClass(), "_anySetter", null);
        setField(term30026, term30026.getClass(), "_ignorableProps", null);
        setBooleanField(term30026, term30026.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term30026, term30026.getClass(), "_needViewProcesing", false);
        setField(term30026, term30026.getClass(), "_backRefs", null);
        setField(term30026, term30026.getClass(), "_subDeserializers", null);
        setField(term30026, term30026.getClass(), "_unwrappedPropertyHandler", null);
        setField(term30026, term30026.getClass(), "_externalTypeIdHandler", null);
        setField(term30026, term30026.getClass(), "_objectIdReader", null);
        setField(term30026, term30026.getClass(), "_valueClass", null);
        term30028 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term30029 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term30028, term30028.getClass(), "_classAnnotations", null);
        setField(term30029, term30029.getClass(), "_elementType", null);
        setField(term30029, term30029.getClass(), "_canonicalName", null);
        setField(term30029, term30029.getClass(), "_class", null);
        setIntField(term30029, term30029.getClass(), "_hash", 0);
        setField(term30029, term30029.getClass(), "_valueHandler", null);
        setField(term30029, term30029.getClass(), "_typeHandler", null);
        setBooleanField(term30029, term30029.getClass(), "_asStatic", false);
        setField(term30028, term30028.getClass(), "_beanType", term30029);
        setField(term30028, term30028.getClass(), "_serializationShape", null);
        setField(term30028, term30028.getClass(), "_valueInstantiator", null);
        setField(term30028, term30028.getClass(), "_delegateDeserializer", null);
        setField(term30028, term30028.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term30028, term30028.getClass(), "_nonStandardCreation", false);
        setBooleanField(term30028, term30028.getClass(), "_vanillaProcessing", false);
        setField(term30028, term30028.getClass(), "_beanProperties", null);
        setField(term30028, term30028.getClass(), "_injectables", null);
        setField(term30028, term30028.getClass(), "_anySetter", null);
        setField(term30028, term30028.getClass(), "_ignorableProps", null);
        setBooleanField(term30028, term30028.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term30028, term30028.getClass(), "_needViewProcesing", false);
        setField(term30028, term30028.getClass(), "_backRefs", null);
        setField(term30028, term30028.getClass(), "_subDeserializers", null);
        setField(term30028, term30028.getClass(), "_unwrappedPropertyHandler", null);
        setField(term30028, term30028.getClass(), "_externalTypeIdHandler", null);
        setField(term30028, term30028.getClass(), "_objectIdReader", null);
        setField(term30028, term30028.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term29899;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30026));
        assertTrue(recursiveEquals(term29899, term30028));
    }

};


