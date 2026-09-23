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

public class BeanDeserializer_init_476531670179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86932;
     Object term87047;
     Object term87049;

    public BeanDeserializer_init_476531670179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term86820 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term86932 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term87028 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setBooleanField(term86932, term86932.getClass(), "_ignoreAllUnknown", false);
        setField(term86932, term86932.getClass(), "_beanType", term87028);
        term87047 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term87048 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term87047, term87047.getClass(), "_nullFromCreator", null);
        setField(term87047, term87047.getClass(), "_classAnnotations", null);
        setField(term87048, term87048.getClass(), "_componentType", null);
        setField(term87048, term87048.getClass(), "_emptyArray", null);
        setField(term87048, term87048.getClass(), "_superClass", null);
        setField(term87048, term87048.getClass(), "_superInterfaces", null);
        setField(term87048, term87048.getClass(), "_bindings", null);
        setField(term87048, term87048.getClass(), "_canonicalName", null);
        setField(term87048, term87048.getClass(), "_class", null);
        setIntField(term87048, term87048.getClass(), "_hash", 0);
        setField(term87048, term87048.getClass(), "_valueHandler", null);
        setField(term87048, term87048.getClass(), "_typeHandler", null);
        setBooleanField(term87048, term87048.getClass(), "_asStatic", false);
        setField(term87047, term87047.getClass(), "_beanType", term87048);
        setField(term87047, term87047.getClass(), "_serializationShape", null);
        setField(term87047, term87047.getClass(), "_valueInstantiator", null);
        setField(term87047, term87047.getClass(), "_delegateDeserializer", null);
        setField(term87047, term87047.getClass(), "_arrayDelegateDeserializer", null);
        setField(term87047, term87047.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term87047, term87047.getClass(), "_nonStandardCreation", false);
        setBooleanField(term87047, term87047.getClass(), "_vanillaProcessing", false);
        setField(term87047, term87047.getClass(), "_beanProperties", null);
        setField(term87047, term87047.getClass(), "_injectables", null);
        setField(term87047, term87047.getClass(), "_anySetter", null);
        setField(term87047, term87047.getClass(), "_ignorableProps", null);
        setBooleanField(term87047, term87047.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term87047, term87047.getClass(), "_needViewProcesing", false);
        setField(term87047, term87047.getClass(), "_backRefs", null);
        setField(term87047, term87047.getClass(), "_subDeserializers", null);
        setField(term87047, term87047.getClass(), "_unwrappedPropertyHandler", null);
        setField(term87047, term87047.getClass(), "_externalTypeIdHandler", null);
        setField(term87047, term87047.getClass(), "_objectIdReader", null);
        setField(term87047, term87047.getClass(), "_valueClass", null);
        term87049 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term87050 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term87049, term87049.getClass(), "_nullFromCreator", null);
        setField(term87049, term87049.getClass(), "_classAnnotations", null);
        setField(term87050, term87050.getClass(), "_componentType", null);
        setField(term87050, term87050.getClass(), "_emptyArray", null);
        setField(term87050, term87050.getClass(), "_superClass", null);
        setField(term87050, term87050.getClass(), "_superInterfaces", null);
        setField(term87050, term87050.getClass(), "_bindings", null);
        setField(term87050, term87050.getClass(), "_canonicalName", null);
        setField(term87050, term87050.getClass(), "_class", null);
        setIntField(term87050, term87050.getClass(), "_hash", 0);
        setField(term87050, term87050.getClass(), "_valueHandler", null);
        setField(term87050, term87050.getClass(), "_typeHandler", null);
        setBooleanField(term87050, term87050.getClass(), "_asStatic", false);
        setField(term87049, term87049.getClass(), "_beanType", term87050);
        setField(term87049, term87049.getClass(), "_serializationShape", null);
        setField(term87049, term87049.getClass(), "_valueInstantiator", null);
        setField(term87049, term87049.getClass(), "_delegateDeserializer", null);
        setField(term87049, term87049.getClass(), "_arrayDelegateDeserializer", null);
        setField(term87049, term87049.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term87049, term87049.getClass(), "_nonStandardCreation", false);
        setBooleanField(term87049, term87049.getClass(), "_vanillaProcessing", false);
        setField(term87049, term87049.getClass(), "_beanProperties", null);
        setField(term87049, term87049.getClass(), "_injectables", null);
        setField(term87049, term87049.getClass(), "_anySetter", null);
        setField(term87049, term87049.getClass(), "_ignorableProps", null);
        setBooleanField(term87049, term87049.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term87049, term87049.getClass(), "_needViewProcesing", false);
        setField(term87049, term87049.getClass(), "_backRefs", null);
        setField(term87049, term87049.getClass(), "_subDeserializers", null);
        setField(term87049, term87049.getClass(), "_unwrappedPropertyHandler", null);
        setField(term87049, term87049.getClass(), "_externalTypeIdHandler", null);
        setField(term87049, term87049.getClass(), "_objectIdReader", null);
        setField(term87049, term87049.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term86932;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term87047));
        assertTrue(recursiveEquals(term86932, term87049));
    }

};


