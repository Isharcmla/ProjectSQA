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

public class BeanDeserializer_init_1328697281167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79251;
     Object term79375;
     Object term79377;

    public BeanDeserializer_init_1328697281167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term79139 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term79251 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term79357 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term79251, term79251.getClass(), "_beanType", term79357);
        term79375 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term79376 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term79375, term79375.getClass(), "_nullFromCreator", null);
        setField(term79375, term79375.getClass(), "_classAnnotations", null);
        setField(term79376, term79376.getClass(), "_elementType", null);
        setField(term79376, term79376.getClass(), "_superClass", null);
        setField(term79376, term79376.getClass(), "_superInterfaces", null);
        setField(term79376, term79376.getClass(), "_bindings", null);
        setField(term79376, term79376.getClass(), "_canonicalName", null);
        setField(term79376, term79376.getClass(), "_class", null);
        setIntField(term79376, term79376.getClass(), "_hash", 0);
        setField(term79376, term79376.getClass(), "_valueHandler", null);
        setField(term79376, term79376.getClass(), "_typeHandler", null);
        setBooleanField(term79376, term79376.getClass(), "_asStatic", false);
        setField(term79375, term79375.getClass(), "_beanType", term79376);
        setField(term79375, term79375.getClass(), "_serializationShape", null);
        setField(term79375, term79375.getClass(), "_valueInstantiator", null);
        setField(term79375, term79375.getClass(), "_delegateDeserializer", null);
        setField(term79375, term79375.getClass(), "_arrayDelegateDeserializer", null);
        setField(term79375, term79375.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term79375, term79375.getClass(), "_nonStandardCreation", false);
        setBooleanField(term79375, term79375.getClass(), "_vanillaProcessing", false);
        setField(term79375, term79375.getClass(), "_beanProperties", null);
        setField(term79375, term79375.getClass(), "_injectables", null);
        setField(term79375, term79375.getClass(), "_anySetter", null);
        setField(term79375, term79375.getClass(), "_ignorableProps", null);
        setBooleanField(term79375, term79375.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term79375, term79375.getClass(), "_needViewProcesing", false);
        setField(term79375, term79375.getClass(), "_backRefs", null);
        setField(term79375, term79375.getClass(), "_subDeserializers", null);
        setField(term79375, term79375.getClass(), "_unwrappedPropertyHandler", null);
        setField(term79375, term79375.getClass(), "_externalTypeIdHandler", null);
        setField(term79375, term79375.getClass(), "_objectIdReader", null);
        setField(term79375, term79375.getClass(), "_valueClass", null);
        term79377 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term79378 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term79377, term79377.getClass(), "_nullFromCreator", null);
        setField(term79377, term79377.getClass(), "_classAnnotations", null);
        setField(term79378, term79378.getClass(), "_elementType", null);
        setField(term79378, term79378.getClass(), "_superClass", null);
        setField(term79378, term79378.getClass(), "_superInterfaces", null);
        setField(term79378, term79378.getClass(), "_bindings", null);
        setField(term79378, term79378.getClass(), "_canonicalName", null);
        setField(term79378, term79378.getClass(), "_class", null);
        setIntField(term79378, term79378.getClass(), "_hash", 0);
        setField(term79378, term79378.getClass(), "_valueHandler", null);
        setField(term79378, term79378.getClass(), "_typeHandler", null);
        setBooleanField(term79378, term79378.getClass(), "_asStatic", false);
        setField(term79377, term79377.getClass(), "_beanType", term79378);
        setField(term79377, term79377.getClass(), "_serializationShape", null);
        setField(term79377, term79377.getClass(), "_valueInstantiator", null);
        setField(term79377, term79377.getClass(), "_delegateDeserializer", null);
        setField(term79377, term79377.getClass(), "_arrayDelegateDeserializer", null);
        setField(term79377, term79377.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term79377, term79377.getClass(), "_nonStandardCreation", false);
        setBooleanField(term79377, term79377.getClass(), "_vanillaProcessing", false);
        setField(term79377, term79377.getClass(), "_beanProperties", null);
        setField(term79377, term79377.getClass(), "_injectables", null);
        setField(term79377, term79377.getClass(), "_anySetter", null);
        setField(term79377, term79377.getClass(), "_ignorableProps", null);
        setBooleanField(term79377, term79377.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term79377, term79377.getClass(), "_needViewProcesing", false);
        setField(term79377, term79377.getClass(), "_backRefs", null);
        setField(term79377, term79377.getClass(), "_subDeserializers", null);
        setField(term79377, term79377.getClass(), "_unwrappedPropertyHandler", null);
        setField(term79377, term79377.getClass(), "_externalTypeIdHandler", null);
        setField(term79377, term79377.getClass(), "_objectIdReader", null);
        setField(term79377, term79377.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term79251;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term79375));
        assertTrue(recursiveEquals(term79251, term79377));
    }

};


