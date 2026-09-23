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

public class BeanDeserializer_init_99674089115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34781;
     Object term34904;
     Object term34906;

    public BeanDeserializer_init_99674089115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term34669 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term34781 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term34885 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term34781, term34781.getClass(), "_beanType", term34885);
        term34904 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term34905 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term34904, term34904.getClass(), "_nullFromCreator", null);
        setField(term34904, term34904.getClass(), "_classAnnotations", null);
        setField(term34905, term34905.getClass(), "_referencedType", null);
        setField(term34905, term34905.getClass(), "_anchorType", null);
        setField(term34905, term34905.getClass(), "_superClass", null);
        setField(term34905, term34905.getClass(), "_superInterfaces", null);
        setField(term34905, term34905.getClass(), "_bindings", null);
        setField(term34905, term34905.getClass(), "_canonicalName", null);
        setField(term34905, term34905.getClass(), "_class", null);
        setIntField(term34905, term34905.getClass(), "_hash", 0);
        setField(term34905, term34905.getClass(), "_valueHandler", null);
        setField(term34905, term34905.getClass(), "_typeHandler", null);
        setBooleanField(term34905, term34905.getClass(), "_asStatic", false);
        setField(term34904, term34904.getClass(), "_beanType", term34905);
        setField(term34904, term34904.getClass(), "_serializationShape", null);
        setField(term34904, term34904.getClass(), "_valueInstantiator", null);
        setField(term34904, term34904.getClass(), "_delegateDeserializer", null);
        setField(term34904, term34904.getClass(), "_arrayDelegateDeserializer", null);
        setField(term34904, term34904.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term34904, term34904.getClass(), "_nonStandardCreation", false);
        setBooleanField(term34904, term34904.getClass(), "_vanillaProcessing", false);
        setField(term34904, term34904.getClass(), "_beanProperties", null);
        setField(term34904, term34904.getClass(), "_injectables", null);
        setField(term34904, term34904.getClass(), "_anySetter", null);
        setField(term34904, term34904.getClass(), "_ignorableProps", null);
        setBooleanField(term34904, term34904.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term34904, term34904.getClass(), "_needViewProcesing", false);
        setField(term34904, term34904.getClass(), "_backRefs", null);
        setField(term34904, term34904.getClass(), "_subDeserializers", null);
        setField(term34904, term34904.getClass(), "_unwrappedPropertyHandler", null);
        setField(term34904, term34904.getClass(), "_externalTypeIdHandler", null);
        setField(term34904, term34904.getClass(), "_objectIdReader", null);
        setField(term34904, term34904.getClass(), "_valueClass", null);
        term34906 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term34907 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term34906, term34906.getClass(), "_nullFromCreator", null);
        setField(term34906, term34906.getClass(), "_classAnnotations", null);
        setField(term34907, term34907.getClass(), "_referencedType", null);
        setField(term34907, term34907.getClass(), "_anchorType", null);
        setField(term34907, term34907.getClass(), "_superClass", null);
        setField(term34907, term34907.getClass(), "_superInterfaces", null);
        setField(term34907, term34907.getClass(), "_bindings", null);
        setField(term34907, term34907.getClass(), "_canonicalName", null);
        setField(term34907, term34907.getClass(), "_class", null);
        setIntField(term34907, term34907.getClass(), "_hash", 0);
        setField(term34907, term34907.getClass(), "_valueHandler", null);
        setField(term34907, term34907.getClass(), "_typeHandler", null);
        setBooleanField(term34907, term34907.getClass(), "_asStatic", false);
        setField(term34906, term34906.getClass(), "_beanType", term34907);
        setField(term34906, term34906.getClass(), "_serializationShape", null);
        setField(term34906, term34906.getClass(), "_valueInstantiator", null);
        setField(term34906, term34906.getClass(), "_delegateDeserializer", null);
        setField(term34906, term34906.getClass(), "_arrayDelegateDeserializer", null);
        setField(term34906, term34906.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term34906, term34906.getClass(), "_nonStandardCreation", false);
        setBooleanField(term34906, term34906.getClass(), "_vanillaProcessing", false);
        setField(term34906, term34906.getClass(), "_beanProperties", null);
        setField(term34906, term34906.getClass(), "_injectables", null);
        setField(term34906, term34906.getClass(), "_anySetter", null);
        setField(term34906, term34906.getClass(), "_ignorableProps", null);
        setBooleanField(term34906, term34906.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term34906, term34906.getClass(), "_needViewProcesing", false);
        setField(term34906, term34906.getClass(), "_backRefs", null);
        setField(term34906, term34906.getClass(), "_subDeserializers", null);
        setField(term34906, term34906.getClass(), "_unwrappedPropertyHandler", null);
        setField(term34906, term34906.getClass(), "_externalTypeIdHandler", null);
        setField(term34906, term34906.getClass(), "_objectIdReader", null);
        setField(term34906, term34906.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term34781;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34904));
        assertTrue(recursiveEquals(term34781, term34906));
    }

};


