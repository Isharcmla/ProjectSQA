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

public class BeanDeserializer_init_476531670235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151146;
     Object term151257;
     Object term151259;

    public BeanDeserializer_init_476531670235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term151034 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term151146 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term151238 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setBooleanField(term151146, term151146.getClass(), "_ignoreAllUnknown", false);
        setField(term151146, term151146.getClass(), "_beanType", term151238);
        term151257 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term151258 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term151257, term151257.getClass(), "_nullFromCreator", null);
        setField(term151257, term151257.getClass(), "_classAnnotations", null);
        setField(term151258, term151258.getClass(), "_keyType", null);
        setField(term151258, term151258.getClass(), "_valueType", null);
        setField(term151258, term151258.getClass(), "_superClass", null);
        setField(term151258, term151258.getClass(), "_superInterfaces", null);
        setField(term151258, term151258.getClass(), "_bindings", null);
        setField(term151258, term151258.getClass(), "_canonicalName", null);
        setField(term151258, term151258.getClass(), "_class", null);
        setIntField(term151258, term151258.getClass(), "_hash", 0);
        setField(term151258, term151258.getClass(), "_valueHandler", null);
        setField(term151258, term151258.getClass(), "_typeHandler", null);
        setBooleanField(term151258, term151258.getClass(), "_asStatic", false);
        setField(term151257, term151257.getClass(), "_beanType", term151258);
        setField(term151257, term151257.getClass(), "_serializationShape", null);
        setField(term151257, term151257.getClass(), "_valueInstantiator", null);
        setField(term151257, term151257.getClass(), "_delegateDeserializer", null);
        setField(term151257, term151257.getClass(), "_arrayDelegateDeserializer", null);
        setField(term151257, term151257.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term151257, term151257.getClass(), "_nonStandardCreation", false);
        setBooleanField(term151257, term151257.getClass(), "_vanillaProcessing", false);
        setField(term151257, term151257.getClass(), "_beanProperties", null);
        setField(term151257, term151257.getClass(), "_injectables", null);
        setField(term151257, term151257.getClass(), "_anySetter", null);
        setField(term151257, term151257.getClass(), "_ignorableProps", null);
        setBooleanField(term151257, term151257.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term151257, term151257.getClass(), "_needViewProcesing", false);
        setField(term151257, term151257.getClass(), "_backRefs", null);
        setField(term151257, term151257.getClass(), "_subDeserializers", null);
        setField(term151257, term151257.getClass(), "_unwrappedPropertyHandler", null);
        setField(term151257, term151257.getClass(), "_externalTypeIdHandler", null);
        setField(term151257, term151257.getClass(), "_objectIdReader", null);
        setField(term151257, term151257.getClass(), "_valueClass", null);
        term151259 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term151260 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term151259, term151259.getClass(), "_nullFromCreator", null);
        setField(term151259, term151259.getClass(), "_classAnnotations", null);
        setField(term151260, term151260.getClass(), "_keyType", null);
        setField(term151260, term151260.getClass(), "_valueType", null);
        setField(term151260, term151260.getClass(), "_superClass", null);
        setField(term151260, term151260.getClass(), "_superInterfaces", null);
        setField(term151260, term151260.getClass(), "_bindings", null);
        setField(term151260, term151260.getClass(), "_canonicalName", null);
        setField(term151260, term151260.getClass(), "_class", null);
        setIntField(term151260, term151260.getClass(), "_hash", 0);
        setField(term151260, term151260.getClass(), "_valueHandler", null);
        setField(term151260, term151260.getClass(), "_typeHandler", null);
        setBooleanField(term151260, term151260.getClass(), "_asStatic", false);
        setField(term151259, term151259.getClass(), "_beanType", term151260);
        setField(term151259, term151259.getClass(), "_serializationShape", null);
        setField(term151259, term151259.getClass(), "_valueInstantiator", null);
        setField(term151259, term151259.getClass(), "_delegateDeserializer", null);
        setField(term151259, term151259.getClass(), "_arrayDelegateDeserializer", null);
        setField(term151259, term151259.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term151259, term151259.getClass(), "_nonStandardCreation", false);
        setBooleanField(term151259, term151259.getClass(), "_vanillaProcessing", false);
        setField(term151259, term151259.getClass(), "_beanProperties", null);
        setField(term151259, term151259.getClass(), "_injectables", null);
        setField(term151259, term151259.getClass(), "_anySetter", null);
        setField(term151259, term151259.getClass(), "_ignorableProps", null);
        setBooleanField(term151259, term151259.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term151259, term151259.getClass(), "_needViewProcesing", false);
        setField(term151259, term151259.getClass(), "_backRefs", null);
        setField(term151259, term151259.getClass(), "_subDeserializers", null);
        setField(term151259, term151259.getClass(), "_unwrappedPropertyHandler", null);
        setField(term151259, term151259.getClass(), "_externalTypeIdHandler", null);
        setField(term151259, term151259.getClass(), "_objectIdReader", null);
        setField(term151259, term151259.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term151146;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term151257));
        assertTrue(recursiveEquals(term151146, term151259));
    }

};


