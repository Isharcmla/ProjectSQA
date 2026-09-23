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

public class BeanDeserializer_init_167876173697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22276;
     Object term23184;
     Object term23186;

    public BeanDeserializer_init_167876173697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22164 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term22276 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term22380 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term22276, term22276.getClass(), "_beanType", term22380);
        term23184 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term23185 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term23184, term23184.getClass(), "_nullFromCreator", null);
        setField(term23184, term23184.getClass(), "_classAnnotations", null);
        setField(term23185, term23185.getClass(), "_referencedType", null);
        setField(term23185, term23185.getClass(), "_anchorType", null);
        setField(term23185, term23185.getClass(), "_superClass", null);
        setField(term23185, term23185.getClass(), "_superInterfaces", null);
        setField(term23185, term23185.getClass(), "_bindings", null);
        setField(term23185, term23185.getClass(), "_canonicalName", null);
        setField(term23185, term23185.getClass(), "_class", null);
        setIntField(term23185, term23185.getClass(), "_hash", 0);
        setField(term23185, term23185.getClass(), "_valueHandler", null);
        setField(term23185, term23185.getClass(), "_typeHandler", null);
        setBooleanField(term23185, term23185.getClass(), "_asStatic", false);
        setField(term23184, term23184.getClass(), "_beanType", term23185);
        setField(term23184, term23184.getClass(), "_serializationShape", null);
        setField(term23184, term23184.getClass(), "_valueInstantiator", null);
        setField(term23184, term23184.getClass(), "_delegateDeserializer", null);
        setField(term23184, term23184.getClass(), "_arrayDelegateDeserializer", null);
        setField(term23184, term23184.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term23184, term23184.getClass(), "_nonStandardCreation", false);
        setBooleanField(term23184, term23184.getClass(), "_vanillaProcessing", false);
        setField(term23184, term23184.getClass(), "_beanProperties", null);
        setField(term23184, term23184.getClass(), "_injectables", null);
        setField(term23184, term23184.getClass(), "_anySetter", null);
        setField(term23184, term23184.getClass(), "_ignorableProps", null);
        setBooleanField(term23184, term23184.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term23184, term23184.getClass(), "_needViewProcesing", false);
        setField(term23184, term23184.getClass(), "_backRefs", null);
        setField(term23184, term23184.getClass(), "_subDeserializers", null);
        setField(term23184, term23184.getClass(), "_unwrappedPropertyHandler", null);
        setField(term23184, term23184.getClass(), "_externalTypeIdHandler", null);
        setField(term23184, term23184.getClass(), "_objectIdReader", null);
        setField(term23184, term23184.getClass(), "_valueClass", null);
        term23186 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term23187 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term23186, term23186.getClass(), "_nullFromCreator", null);
        setField(term23186, term23186.getClass(), "_classAnnotations", null);
        setField(term23187, term23187.getClass(), "_referencedType", null);
        setField(term23187, term23187.getClass(), "_anchorType", null);
        setField(term23187, term23187.getClass(), "_superClass", null);
        setField(term23187, term23187.getClass(), "_superInterfaces", null);
        setField(term23187, term23187.getClass(), "_bindings", null);
        setField(term23187, term23187.getClass(), "_canonicalName", null);
        setField(term23187, term23187.getClass(), "_class", null);
        setIntField(term23187, term23187.getClass(), "_hash", 0);
        setField(term23187, term23187.getClass(), "_valueHandler", null);
        setField(term23187, term23187.getClass(), "_typeHandler", null);
        setBooleanField(term23187, term23187.getClass(), "_asStatic", false);
        setField(term23186, term23186.getClass(), "_beanType", term23187);
        setField(term23186, term23186.getClass(), "_serializationShape", null);
        setField(term23186, term23186.getClass(), "_valueInstantiator", null);
        setField(term23186, term23186.getClass(), "_delegateDeserializer", null);
        setField(term23186, term23186.getClass(), "_arrayDelegateDeserializer", null);
        setField(term23186, term23186.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term23186, term23186.getClass(), "_nonStandardCreation", false);
        setBooleanField(term23186, term23186.getClass(), "_vanillaProcessing", false);
        setField(term23186, term23186.getClass(), "_beanProperties", null);
        setField(term23186, term23186.getClass(), "_injectables", null);
        setField(term23186, term23186.getClass(), "_anySetter", null);
        setField(term23186, term23186.getClass(), "_ignorableProps", null);
        setBooleanField(term23186, term23186.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term23186, term23186.getClass(), "_needViewProcesing", false);
        setField(term23186, term23186.getClass(), "_backRefs", null);
        setField(term23186, term23186.getClass(), "_subDeserializers", null);
        setField(term23186, term23186.getClass(), "_unwrappedPropertyHandler", null);
        setField(term23186, term23186.getClass(), "_externalTypeIdHandler", null);
        setField(term23186, term23186.getClass(), "_objectIdReader", null);
        setField(term23186, term23186.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term22276;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term23184));
        assertTrue(recursiveEquals(term22276, term23186));
    }

};


