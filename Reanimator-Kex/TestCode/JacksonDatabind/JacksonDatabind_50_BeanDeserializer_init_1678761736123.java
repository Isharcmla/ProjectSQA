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

public class BeanDeserializer_init_1678761736123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43307;
     Object term43434;
     Object term43436;

    public BeanDeserializer_init_1678761736123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43195 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term43307 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term43413 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term43307, term43307.getClass(), "_beanType", term43413);
        term43434 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term43435 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term43434, term43434.getClass(), "_nullFromCreator", null);
        setField(term43434, term43434.getClass(), "_classAnnotations", null);
        setField(term43435, term43435.getClass(), "_elementType", null);
        setField(term43435, term43435.getClass(), "_superClass", null);
        setField(term43435, term43435.getClass(), "_superInterfaces", null);
        setField(term43435, term43435.getClass(), "_bindings", null);
        setField(term43435, term43435.getClass(), "_canonicalName", null);
        setField(term43435, term43435.getClass(), "_class", null);
        setIntField(term43435, term43435.getClass(), "_hash", 0);
        setField(term43435, term43435.getClass(), "_valueHandler", null);
        setField(term43435, term43435.getClass(), "_typeHandler", null);
        setBooleanField(term43435, term43435.getClass(), "_asStatic", false);
        setField(term43434, term43434.getClass(), "_beanType", term43435);
        setField(term43434, term43434.getClass(), "_serializationShape", null);
        setField(term43434, term43434.getClass(), "_valueInstantiator", null);
        setField(term43434, term43434.getClass(), "_delegateDeserializer", null);
        setField(term43434, term43434.getClass(), "_arrayDelegateDeserializer", null);
        setField(term43434, term43434.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term43434, term43434.getClass(), "_nonStandardCreation", false);
        setBooleanField(term43434, term43434.getClass(), "_vanillaProcessing", false);
        setField(term43434, term43434.getClass(), "_beanProperties", null);
        setField(term43434, term43434.getClass(), "_injectables", null);
        setField(term43434, term43434.getClass(), "_anySetter", null);
        setField(term43434, term43434.getClass(), "_ignorableProps", null);
        setBooleanField(term43434, term43434.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term43434, term43434.getClass(), "_needViewProcesing", false);
        setField(term43434, term43434.getClass(), "_backRefs", null);
        setField(term43434, term43434.getClass(), "_subDeserializers", null);
        setField(term43434, term43434.getClass(), "_unwrappedPropertyHandler", null);
        setField(term43434, term43434.getClass(), "_externalTypeIdHandler", null);
        setField(term43434, term43434.getClass(), "_objectIdReader", null);
        setField(term43434, term43434.getClass(), "_valueClass", null);
        term43436 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term43437 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term43436, term43436.getClass(), "_nullFromCreator", null);
        setField(term43436, term43436.getClass(), "_classAnnotations", null);
        setField(term43437, term43437.getClass(), "_elementType", null);
        setField(term43437, term43437.getClass(), "_superClass", null);
        setField(term43437, term43437.getClass(), "_superInterfaces", null);
        setField(term43437, term43437.getClass(), "_bindings", null);
        setField(term43437, term43437.getClass(), "_canonicalName", null);
        setField(term43437, term43437.getClass(), "_class", null);
        setIntField(term43437, term43437.getClass(), "_hash", 0);
        setField(term43437, term43437.getClass(), "_valueHandler", null);
        setField(term43437, term43437.getClass(), "_typeHandler", null);
        setBooleanField(term43437, term43437.getClass(), "_asStatic", false);
        setField(term43436, term43436.getClass(), "_beanType", term43437);
        setField(term43436, term43436.getClass(), "_serializationShape", null);
        setField(term43436, term43436.getClass(), "_valueInstantiator", null);
        setField(term43436, term43436.getClass(), "_delegateDeserializer", null);
        setField(term43436, term43436.getClass(), "_arrayDelegateDeserializer", null);
        setField(term43436, term43436.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term43436, term43436.getClass(), "_nonStandardCreation", false);
        setBooleanField(term43436, term43436.getClass(), "_vanillaProcessing", false);
        setField(term43436, term43436.getClass(), "_beanProperties", null);
        setField(term43436, term43436.getClass(), "_injectables", null);
        setField(term43436, term43436.getClass(), "_anySetter", null);
        setField(term43436, term43436.getClass(), "_ignorableProps", null);
        setBooleanField(term43436, term43436.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term43436, term43436.getClass(), "_needViewProcesing", false);
        setField(term43436, term43436.getClass(), "_backRefs", null);
        setField(term43436, term43436.getClass(), "_subDeserializers", null);
        setField(term43436, term43436.getClass(), "_unwrappedPropertyHandler", null);
        setField(term43436, term43436.getClass(), "_externalTypeIdHandler", null);
        setField(term43436, term43436.getClass(), "_objectIdReader", null);
        setField(term43436, term43436.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term43307;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term43434));
        assertTrue(recursiveEquals(term43307, term43436));
    }

};


