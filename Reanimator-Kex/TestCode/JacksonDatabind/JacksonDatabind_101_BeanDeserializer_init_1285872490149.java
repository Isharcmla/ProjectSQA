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

public class BeanDeserializer_init_1285872490149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35681;
     Object term35792;
     Object term35794;

    public BeanDeserializer_init_1285872490149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term35569 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term35681 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term35773 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term35681, term35681.getClass(), "_beanType", term35773);
        term35792 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term35793 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term35792, term35792.getClass(), "_nullFromCreator", null);
        setField(term35792, term35792.getClass(), "_currentlyTransforming", null);
        setField(term35793, term35793.getClass(), "_keyType", null);
        setField(term35793, term35793.getClass(), "_valueType", null);
        setField(term35793, term35793.getClass(), "_superClass", null);
        setField(term35793, term35793.getClass(), "_superInterfaces", null);
        setField(term35793, term35793.getClass(), "_bindings", null);
        setField(term35793, term35793.getClass(), "_canonicalName", null);
        setField(term35793, term35793.getClass(), "_class", null);
        setIntField(term35793, term35793.getClass(), "_hash", 0);
        setField(term35793, term35793.getClass(), "_valueHandler", null);
        setField(term35793, term35793.getClass(), "_typeHandler", null);
        setBooleanField(term35793, term35793.getClass(), "_asStatic", false);
        setField(term35792, term35792.getClass(), "_beanType", term35793);
        setField(term35792, term35792.getClass(), "_serializationShape", null);
        setField(term35792, term35792.getClass(), "_valueInstantiator", null);
        setField(term35792, term35792.getClass(), "_delegateDeserializer", null);
        setField(term35792, term35792.getClass(), "_arrayDelegateDeserializer", null);
        setField(term35792, term35792.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term35792, term35792.getClass(), "_nonStandardCreation", false);
        setBooleanField(term35792, term35792.getClass(), "_vanillaProcessing", false);
        setField(term35792, term35792.getClass(), "_beanProperties", null);
        setField(term35792, term35792.getClass(), "_injectables", null);
        setField(term35792, term35792.getClass(), "_anySetter", null);
        setField(term35792, term35792.getClass(), "_ignorableProps", null);
        setBooleanField(term35792, term35792.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term35792, term35792.getClass(), "_needViewProcesing", false);
        setField(term35792, term35792.getClass(), "_backRefs", null);
        setField(term35792, term35792.getClass(), "_subDeserializers", null);
        setField(term35792, term35792.getClass(), "_unwrappedPropertyHandler", null);
        setField(term35792, term35792.getClass(), "_externalTypeIdHandler", null);
        setField(term35792, term35792.getClass(), "_objectIdReader", null);
        setField(term35792, term35792.getClass(), "_valueClass", null);
        term35794 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term35795 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term35794, term35794.getClass(), "_nullFromCreator", null);
        setField(term35794, term35794.getClass(), "_currentlyTransforming", null);
        setField(term35795, term35795.getClass(), "_keyType", null);
        setField(term35795, term35795.getClass(), "_valueType", null);
        setField(term35795, term35795.getClass(), "_superClass", null);
        setField(term35795, term35795.getClass(), "_superInterfaces", null);
        setField(term35795, term35795.getClass(), "_bindings", null);
        setField(term35795, term35795.getClass(), "_canonicalName", null);
        setField(term35795, term35795.getClass(), "_class", null);
        setIntField(term35795, term35795.getClass(), "_hash", 0);
        setField(term35795, term35795.getClass(), "_valueHandler", null);
        setField(term35795, term35795.getClass(), "_typeHandler", null);
        setBooleanField(term35795, term35795.getClass(), "_asStatic", false);
        setField(term35794, term35794.getClass(), "_beanType", term35795);
        setField(term35794, term35794.getClass(), "_serializationShape", null);
        setField(term35794, term35794.getClass(), "_valueInstantiator", null);
        setField(term35794, term35794.getClass(), "_delegateDeserializer", null);
        setField(term35794, term35794.getClass(), "_arrayDelegateDeserializer", null);
        setField(term35794, term35794.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term35794, term35794.getClass(), "_nonStandardCreation", false);
        setBooleanField(term35794, term35794.getClass(), "_vanillaProcessing", false);
        setField(term35794, term35794.getClass(), "_beanProperties", null);
        setField(term35794, term35794.getClass(), "_injectables", null);
        setField(term35794, term35794.getClass(), "_anySetter", null);
        setField(term35794, term35794.getClass(), "_ignorableProps", null);
        setBooleanField(term35794, term35794.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term35794, term35794.getClass(), "_needViewProcesing", false);
        setField(term35794, term35794.getClass(), "_backRefs", null);
        setField(term35794, term35794.getClass(), "_subDeserializers", null);
        setField(term35794, term35794.getClass(), "_unwrappedPropertyHandler", null);
        setField(term35794, term35794.getClass(), "_externalTypeIdHandler", null);
        setField(term35794, term35794.getClass(), "_objectIdReader", null);
        setField(term35794, term35794.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term35681;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term35792));
        assertTrue(recursiveEquals(term35681, term35794));
    }

};


