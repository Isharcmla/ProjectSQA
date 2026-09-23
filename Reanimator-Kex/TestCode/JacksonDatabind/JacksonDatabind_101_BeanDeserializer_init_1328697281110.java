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

public class BeanDeserializer_init_1328697281110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22962;
     Object term23449;
     Object term23451;

    public BeanDeserializer_init_1328697281110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22850 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term22962 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term23082 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term22962, term22962.getClass(), "_beanType", term23082);
        term23449 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term23450 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term23449, term23449.getClass(), "_nullFromCreator", null);
        setField(term23449, term23449.getClass(), "_currentlyTransforming", null);
        setField(term23450, term23450.getClass(), "_referencedType", null);
        setField(term23450, term23450.getClass(), "_superClass", null);
        setField(term23450, term23450.getClass(), "_superInterfaces", null);
        setField(term23450, term23450.getClass(), "_bindings", null);
        setField(term23450, term23450.getClass(), "_canonicalName", null);
        setField(term23450, term23450.getClass(), "_class", null);
        setIntField(term23450, term23450.getClass(), "_hash", 0);
        setField(term23450, term23450.getClass(), "_valueHandler", null);
        setField(term23450, term23450.getClass(), "_typeHandler", null);
        setBooleanField(term23450, term23450.getClass(), "_asStatic", false);
        setField(term23449, term23449.getClass(), "_beanType", term23450);
        setField(term23449, term23449.getClass(), "_serializationShape", null);
        setField(term23449, term23449.getClass(), "_valueInstantiator", null);
        setField(term23449, term23449.getClass(), "_delegateDeserializer", null);
        setField(term23449, term23449.getClass(), "_arrayDelegateDeserializer", null);
        setField(term23449, term23449.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term23449, term23449.getClass(), "_nonStandardCreation", false);
        setBooleanField(term23449, term23449.getClass(), "_vanillaProcessing", false);
        setField(term23449, term23449.getClass(), "_beanProperties", null);
        setField(term23449, term23449.getClass(), "_injectables", null);
        setField(term23449, term23449.getClass(), "_anySetter", null);
        setField(term23449, term23449.getClass(), "_ignorableProps", null);
        setBooleanField(term23449, term23449.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term23449, term23449.getClass(), "_needViewProcesing", false);
        setField(term23449, term23449.getClass(), "_backRefs", null);
        setField(term23449, term23449.getClass(), "_subDeserializers", null);
        setField(term23449, term23449.getClass(), "_unwrappedPropertyHandler", null);
        setField(term23449, term23449.getClass(), "_externalTypeIdHandler", null);
        setField(term23449, term23449.getClass(), "_objectIdReader", null);
        setField(term23449, term23449.getClass(), "_valueClass", null);
        term23451 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term23452 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term23451, term23451.getClass(), "_nullFromCreator", null);
        setField(term23451, term23451.getClass(), "_currentlyTransforming", null);
        setField(term23452, term23452.getClass(), "_referencedType", null);
        setField(term23452, term23452.getClass(), "_superClass", null);
        setField(term23452, term23452.getClass(), "_superInterfaces", null);
        setField(term23452, term23452.getClass(), "_bindings", null);
        setField(term23452, term23452.getClass(), "_canonicalName", null);
        setField(term23452, term23452.getClass(), "_class", null);
        setIntField(term23452, term23452.getClass(), "_hash", 0);
        setField(term23452, term23452.getClass(), "_valueHandler", null);
        setField(term23452, term23452.getClass(), "_typeHandler", null);
        setBooleanField(term23452, term23452.getClass(), "_asStatic", false);
        setField(term23451, term23451.getClass(), "_beanType", term23452);
        setField(term23451, term23451.getClass(), "_serializationShape", null);
        setField(term23451, term23451.getClass(), "_valueInstantiator", null);
        setField(term23451, term23451.getClass(), "_delegateDeserializer", null);
        setField(term23451, term23451.getClass(), "_arrayDelegateDeserializer", null);
        setField(term23451, term23451.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term23451, term23451.getClass(), "_nonStandardCreation", false);
        setBooleanField(term23451, term23451.getClass(), "_vanillaProcessing", false);
        setField(term23451, term23451.getClass(), "_beanProperties", null);
        setField(term23451, term23451.getClass(), "_injectables", null);
        setField(term23451, term23451.getClass(), "_anySetter", null);
        setField(term23451, term23451.getClass(), "_ignorableProps", null);
        setBooleanField(term23451, term23451.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term23451, term23451.getClass(), "_needViewProcesing", false);
        setField(term23451, term23451.getClass(), "_backRefs", null);
        setField(term23451, term23451.getClass(), "_subDeserializers", null);
        setField(term23451, term23451.getClass(), "_unwrappedPropertyHandler", null);
        setField(term23451, term23451.getClass(), "_externalTypeIdHandler", null);
        setField(term23451, term23451.getClass(), "_objectIdReader", null);
        setField(term23451, term23451.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term22962;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term23449));
        assertTrue(recursiveEquals(term22962, term23451));
    }

};


