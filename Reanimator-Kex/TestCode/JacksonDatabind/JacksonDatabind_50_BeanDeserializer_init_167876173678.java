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

public class BeanDeserializer_init_167876173678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11596;
     Object term12426;
     Object term12428;

    public BeanDeserializer_init_167876173678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11484 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term11596 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term11700 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term11596, term11596.getClass(), "_beanType", term11700);
        term12426 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term12427 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term12426, term12426.getClass(), "_nullFromCreator", null);
        setField(term12426, term12426.getClass(), "_classAnnotations", null);
        setField(term12427, term12427.getClass(), "_referencedType", null);
        setField(term12427, term12427.getClass(), "_anchorType", null);
        setField(term12427, term12427.getClass(), "_superClass", null);
        setField(term12427, term12427.getClass(), "_superInterfaces", null);
        setField(term12427, term12427.getClass(), "_bindings", null);
        setField(term12427, term12427.getClass(), "_canonicalName", null);
        setField(term12427, term12427.getClass(), "_class", null);
        setIntField(term12427, term12427.getClass(), "_hash", 0);
        setField(term12427, term12427.getClass(), "_valueHandler", null);
        setField(term12427, term12427.getClass(), "_typeHandler", null);
        setBooleanField(term12427, term12427.getClass(), "_asStatic", false);
        setField(term12426, term12426.getClass(), "_beanType", term12427);
        setField(term12426, term12426.getClass(), "_serializationShape", null);
        setField(term12426, term12426.getClass(), "_valueInstantiator", null);
        setField(term12426, term12426.getClass(), "_delegateDeserializer", null);
        setField(term12426, term12426.getClass(), "_arrayDelegateDeserializer", null);
        setField(term12426, term12426.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term12426, term12426.getClass(), "_nonStandardCreation", false);
        setBooleanField(term12426, term12426.getClass(), "_vanillaProcessing", false);
        setField(term12426, term12426.getClass(), "_beanProperties", null);
        setField(term12426, term12426.getClass(), "_injectables", null);
        setField(term12426, term12426.getClass(), "_anySetter", null);
        setField(term12426, term12426.getClass(), "_ignorableProps", null);
        setBooleanField(term12426, term12426.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term12426, term12426.getClass(), "_needViewProcesing", false);
        setField(term12426, term12426.getClass(), "_backRefs", null);
        setField(term12426, term12426.getClass(), "_subDeserializers", null);
        setField(term12426, term12426.getClass(), "_unwrappedPropertyHandler", null);
        setField(term12426, term12426.getClass(), "_externalTypeIdHandler", null);
        setField(term12426, term12426.getClass(), "_objectIdReader", null);
        setField(term12426, term12426.getClass(), "_valueClass", null);
        term12428 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term12429 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term12428, term12428.getClass(), "_nullFromCreator", null);
        setField(term12428, term12428.getClass(), "_classAnnotations", null);
        setField(term12429, term12429.getClass(), "_referencedType", null);
        setField(term12429, term12429.getClass(), "_anchorType", null);
        setField(term12429, term12429.getClass(), "_superClass", null);
        setField(term12429, term12429.getClass(), "_superInterfaces", null);
        setField(term12429, term12429.getClass(), "_bindings", null);
        setField(term12429, term12429.getClass(), "_canonicalName", null);
        setField(term12429, term12429.getClass(), "_class", null);
        setIntField(term12429, term12429.getClass(), "_hash", 0);
        setField(term12429, term12429.getClass(), "_valueHandler", null);
        setField(term12429, term12429.getClass(), "_typeHandler", null);
        setBooleanField(term12429, term12429.getClass(), "_asStatic", false);
        setField(term12428, term12428.getClass(), "_beanType", term12429);
        setField(term12428, term12428.getClass(), "_serializationShape", null);
        setField(term12428, term12428.getClass(), "_valueInstantiator", null);
        setField(term12428, term12428.getClass(), "_delegateDeserializer", null);
        setField(term12428, term12428.getClass(), "_arrayDelegateDeserializer", null);
        setField(term12428, term12428.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term12428, term12428.getClass(), "_nonStandardCreation", false);
        setBooleanField(term12428, term12428.getClass(), "_vanillaProcessing", false);
        setField(term12428, term12428.getClass(), "_beanProperties", null);
        setField(term12428, term12428.getClass(), "_injectables", null);
        setField(term12428, term12428.getClass(), "_anySetter", null);
        setField(term12428, term12428.getClass(), "_ignorableProps", null);
        setBooleanField(term12428, term12428.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term12428, term12428.getClass(), "_needViewProcesing", false);
        setField(term12428, term12428.getClass(), "_backRefs", null);
        setField(term12428, term12428.getClass(), "_subDeserializers", null);
        setField(term12428, term12428.getClass(), "_unwrappedPropertyHandler", null);
        setField(term12428, term12428.getClass(), "_externalTypeIdHandler", null);
        setField(term12428, term12428.getClass(), "_objectIdReader", null);
        setField(term12428, term12428.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term11596;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12426));
        assertTrue(recursiveEquals(term11596, term12428));
    }

};


