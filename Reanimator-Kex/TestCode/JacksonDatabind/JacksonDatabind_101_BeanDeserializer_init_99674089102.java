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

public class BeanDeserializer_init_99674089102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20353;
     Object term21217;
     Object term21219;

    public BeanDeserializer_init_99674089102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20241 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term20353 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term20467 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term20353, term20353.getClass(), "_beanType", term20467);
        term21217 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term21218 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term21217, term21217.getClass(), "_nullFromCreator", null);
        setField(term21217, term21217.getClass(), "_currentlyTransforming", null);
        setIntField(term21218, term21218.getClass(), "_ordinal", 0);
        setField(term21218, term21218.getClass(), "_actualType", null);
        setField(term21218, term21218.getClass(), "_superClass", null);
        setField(term21218, term21218.getClass(), "_superInterfaces", null);
        setField(term21218, term21218.getClass(), "_bindings", null);
        setField(term21218, term21218.getClass(), "_canonicalName", null);
        setField(term21218, term21218.getClass(), "_class", null);
        setIntField(term21218, term21218.getClass(), "_hash", 0);
        setField(term21218, term21218.getClass(), "_valueHandler", null);
        setField(term21218, term21218.getClass(), "_typeHandler", null);
        setBooleanField(term21218, term21218.getClass(), "_asStatic", false);
        setField(term21217, term21217.getClass(), "_beanType", term21218);
        setField(term21217, term21217.getClass(), "_serializationShape", null);
        setField(term21217, term21217.getClass(), "_valueInstantiator", null);
        setField(term21217, term21217.getClass(), "_delegateDeserializer", null);
        setField(term21217, term21217.getClass(), "_arrayDelegateDeserializer", null);
        setField(term21217, term21217.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term21217, term21217.getClass(), "_nonStandardCreation", false);
        setBooleanField(term21217, term21217.getClass(), "_vanillaProcessing", false);
        setField(term21217, term21217.getClass(), "_beanProperties", null);
        setField(term21217, term21217.getClass(), "_injectables", null);
        setField(term21217, term21217.getClass(), "_anySetter", null);
        setField(term21217, term21217.getClass(), "_ignorableProps", null);
        setBooleanField(term21217, term21217.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term21217, term21217.getClass(), "_needViewProcesing", false);
        setField(term21217, term21217.getClass(), "_backRefs", null);
        setField(term21217, term21217.getClass(), "_subDeserializers", null);
        setField(term21217, term21217.getClass(), "_unwrappedPropertyHandler", null);
        setField(term21217, term21217.getClass(), "_externalTypeIdHandler", null);
        setField(term21217, term21217.getClass(), "_objectIdReader", null);
        setField(term21217, term21217.getClass(), "_valueClass", null);
        term21219 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term21220 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term21219, term21219.getClass(), "_nullFromCreator", null);
        setField(term21219, term21219.getClass(), "_currentlyTransforming", null);
        setIntField(term21220, term21220.getClass(), "_ordinal", 0);
        setField(term21220, term21220.getClass(), "_actualType", null);
        setField(term21220, term21220.getClass(), "_superClass", null);
        setField(term21220, term21220.getClass(), "_superInterfaces", null);
        setField(term21220, term21220.getClass(), "_bindings", null);
        setField(term21220, term21220.getClass(), "_canonicalName", null);
        setField(term21220, term21220.getClass(), "_class", null);
        setIntField(term21220, term21220.getClass(), "_hash", 0);
        setField(term21220, term21220.getClass(), "_valueHandler", null);
        setField(term21220, term21220.getClass(), "_typeHandler", null);
        setBooleanField(term21220, term21220.getClass(), "_asStatic", false);
        setField(term21219, term21219.getClass(), "_beanType", term21220);
        setField(term21219, term21219.getClass(), "_serializationShape", null);
        setField(term21219, term21219.getClass(), "_valueInstantiator", null);
        setField(term21219, term21219.getClass(), "_delegateDeserializer", null);
        setField(term21219, term21219.getClass(), "_arrayDelegateDeserializer", null);
        setField(term21219, term21219.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term21219, term21219.getClass(), "_nonStandardCreation", false);
        setBooleanField(term21219, term21219.getClass(), "_vanillaProcessing", false);
        setField(term21219, term21219.getClass(), "_beanProperties", null);
        setField(term21219, term21219.getClass(), "_injectables", null);
        setField(term21219, term21219.getClass(), "_anySetter", null);
        setField(term21219, term21219.getClass(), "_ignorableProps", null);
        setBooleanField(term21219, term21219.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term21219, term21219.getClass(), "_needViewProcesing", false);
        setField(term21219, term21219.getClass(), "_backRefs", null);
        setField(term21219, term21219.getClass(), "_subDeserializers", null);
        setField(term21219, term21219.getClass(), "_unwrappedPropertyHandler", null);
        setField(term21219, term21219.getClass(), "_externalTypeIdHandler", null);
        setField(term21219, term21219.getClass(), "_objectIdReader", null);
        setField(term21219, term21219.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term20353;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term21217));
        assertTrue(recursiveEquals(term20353, term21219));
    }

};


