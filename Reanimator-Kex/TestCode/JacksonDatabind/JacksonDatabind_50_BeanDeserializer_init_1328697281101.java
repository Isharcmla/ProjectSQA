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

public class BeanDeserializer_init_1328697281101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26322;
     Object term26444;
     Object term26446;

    public BeanDeserializer_init_1328697281101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26210 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term26322 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term26426 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term26322, term26322.getClass(), "_beanType", term26426);
        term26444 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term26445 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term26444, term26444.getClass(), "_nullFromCreator", null);
        setField(term26444, term26444.getClass(), "_classAnnotations", null);
        setField(term26445, term26445.getClass(), "_referencedType", null);
        setField(term26445, term26445.getClass(), "_anchorType", null);
        setField(term26445, term26445.getClass(), "_superClass", null);
        setField(term26445, term26445.getClass(), "_superInterfaces", null);
        setField(term26445, term26445.getClass(), "_bindings", null);
        setField(term26445, term26445.getClass(), "_canonicalName", null);
        setField(term26445, term26445.getClass(), "_class", null);
        setIntField(term26445, term26445.getClass(), "_hash", 0);
        setField(term26445, term26445.getClass(), "_valueHandler", null);
        setField(term26445, term26445.getClass(), "_typeHandler", null);
        setBooleanField(term26445, term26445.getClass(), "_asStatic", false);
        setField(term26444, term26444.getClass(), "_beanType", term26445);
        setField(term26444, term26444.getClass(), "_serializationShape", null);
        setField(term26444, term26444.getClass(), "_valueInstantiator", null);
        setField(term26444, term26444.getClass(), "_delegateDeserializer", null);
        setField(term26444, term26444.getClass(), "_arrayDelegateDeserializer", null);
        setField(term26444, term26444.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term26444, term26444.getClass(), "_nonStandardCreation", false);
        setBooleanField(term26444, term26444.getClass(), "_vanillaProcessing", false);
        setField(term26444, term26444.getClass(), "_beanProperties", null);
        setField(term26444, term26444.getClass(), "_injectables", null);
        setField(term26444, term26444.getClass(), "_anySetter", null);
        setField(term26444, term26444.getClass(), "_ignorableProps", null);
        setBooleanField(term26444, term26444.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term26444, term26444.getClass(), "_needViewProcesing", false);
        setField(term26444, term26444.getClass(), "_backRefs", null);
        setField(term26444, term26444.getClass(), "_subDeserializers", null);
        setField(term26444, term26444.getClass(), "_unwrappedPropertyHandler", null);
        setField(term26444, term26444.getClass(), "_externalTypeIdHandler", null);
        setField(term26444, term26444.getClass(), "_objectIdReader", null);
        setField(term26444, term26444.getClass(), "_valueClass", null);
        term26446 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term26447 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term26446, term26446.getClass(), "_nullFromCreator", null);
        setField(term26446, term26446.getClass(), "_classAnnotations", null);
        setField(term26447, term26447.getClass(), "_referencedType", null);
        setField(term26447, term26447.getClass(), "_anchorType", null);
        setField(term26447, term26447.getClass(), "_superClass", null);
        setField(term26447, term26447.getClass(), "_superInterfaces", null);
        setField(term26447, term26447.getClass(), "_bindings", null);
        setField(term26447, term26447.getClass(), "_canonicalName", null);
        setField(term26447, term26447.getClass(), "_class", null);
        setIntField(term26447, term26447.getClass(), "_hash", 0);
        setField(term26447, term26447.getClass(), "_valueHandler", null);
        setField(term26447, term26447.getClass(), "_typeHandler", null);
        setBooleanField(term26447, term26447.getClass(), "_asStatic", false);
        setField(term26446, term26446.getClass(), "_beanType", term26447);
        setField(term26446, term26446.getClass(), "_serializationShape", null);
        setField(term26446, term26446.getClass(), "_valueInstantiator", null);
        setField(term26446, term26446.getClass(), "_delegateDeserializer", null);
        setField(term26446, term26446.getClass(), "_arrayDelegateDeserializer", null);
        setField(term26446, term26446.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term26446, term26446.getClass(), "_nonStandardCreation", false);
        setBooleanField(term26446, term26446.getClass(), "_vanillaProcessing", false);
        setField(term26446, term26446.getClass(), "_beanProperties", null);
        setField(term26446, term26446.getClass(), "_injectables", null);
        setField(term26446, term26446.getClass(), "_anySetter", null);
        setField(term26446, term26446.getClass(), "_ignorableProps", null);
        setBooleanField(term26446, term26446.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term26446, term26446.getClass(), "_needViewProcesing", false);
        setField(term26446, term26446.getClass(), "_backRefs", null);
        setField(term26446, term26446.getClass(), "_subDeserializers", null);
        setField(term26446, term26446.getClass(), "_unwrappedPropertyHandler", null);
        setField(term26446, term26446.getClass(), "_externalTypeIdHandler", null);
        setField(term26446, term26446.getClass(), "_objectIdReader", null);
        setField(term26446, term26446.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term26322;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term26444));
        assertTrue(recursiveEquals(term26322, term26446));
    }

};


