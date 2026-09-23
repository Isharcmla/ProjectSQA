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

public class BeanDeserializer_init_99674089163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40563;
     Object term40674;
     Object term40676;

    public BeanDeserializer_init_99674089163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term40451 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term40563 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term40655 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term40563, term40563.getClass(), "_beanType", term40655);
        term40674 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term40675 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term40674, term40674.getClass(), "_nullFromCreator", null);
        setField(term40674, term40674.getClass(), "_currentlyTransforming", null);
        setField(term40675, term40675.getClass(), "_keyType", null);
        setField(term40675, term40675.getClass(), "_valueType", null);
        setField(term40675, term40675.getClass(), "_superClass", null);
        setField(term40675, term40675.getClass(), "_superInterfaces", null);
        setField(term40675, term40675.getClass(), "_bindings", null);
        setField(term40675, term40675.getClass(), "_canonicalName", null);
        setField(term40675, term40675.getClass(), "_class", null);
        setIntField(term40675, term40675.getClass(), "_hash", 0);
        setField(term40675, term40675.getClass(), "_valueHandler", null);
        setField(term40675, term40675.getClass(), "_typeHandler", null);
        setBooleanField(term40675, term40675.getClass(), "_asStatic", false);
        setField(term40674, term40674.getClass(), "_beanType", term40675);
        setField(term40674, term40674.getClass(), "_serializationShape", null);
        setField(term40674, term40674.getClass(), "_valueInstantiator", null);
        setField(term40674, term40674.getClass(), "_delegateDeserializer", null);
        setField(term40674, term40674.getClass(), "_arrayDelegateDeserializer", null);
        setField(term40674, term40674.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term40674, term40674.getClass(), "_nonStandardCreation", false);
        setBooleanField(term40674, term40674.getClass(), "_vanillaProcessing", false);
        setField(term40674, term40674.getClass(), "_beanProperties", null);
        setField(term40674, term40674.getClass(), "_injectables", null);
        setField(term40674, term40674.getClass(), "_anySetter", null);
        setField(term40674, term40674.getClass(), "_ignorableProps", null);
        setBooleanField(term40674, term40674.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term40674, term40674.getClass(), "_needViewProcesing", false);
        setField(term40674, term40674.getClass(), "_backRefs", null);
        setField(term40674, term40674.getClass(), "_subDeserializers", null);
        setField(term40674, term40674.getClass(), "_unwrappedPropertyHandler", null);
        setField(term40674, term40674.getClass(), "_externalTypeIdHandler", null);
        setField(term40674, term40674.getClass(), "_objectIdReader", null);
        setField(term40674, term40674.getClass(), "_valueClass", null);
        term40676 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term40677 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term40676, term40676.getClass(), "_nullFromCreator", null);
        setField(term40676, term40676.getClass(), "_currentlyTransforming", null);
        setField(term40677, term40677.getClass(), "_keyType", null);
        setField(term40677, term40677.getClass(), "_valueType", null);
        setField(term40677, term40677.getClass(), "_superClass", null);
        setField(term40677, term40677.getClass(), "_superInterfaces", null);
        setField(term40677, term40677.getClass(), "_bindings", null);
        setField(term40677, term40677.getClass(), "_canonicalName", null);
        setField(term40677, term40677.getClass(), "_class", null);
        setIntField(term40677, term40677.getClass(), "_hash", 0);
        setField(term40677, term40677.getClass(), "_valueHandler", null);
        setField(term40677, term40677.getClass(), "_typeHandler", null);
        setBooleanField(term40677, term40677.getClass(), "_asStatic", false);
        setField(term40676, term40676.getClass(), "_beanType", term40677);
        setField(term40676, term40676.getClass(), "_serializationShape", null);
        setField(term40676, term40676.getClass(), "_valueInstantiator", null);
        setField(term40676, term40676.getClass(), "_delegateDeserializer", null);
        setField(term40676, term40676.getClass(), "_arrayDelegateDeserializer", null);
        setField(term40676, term40676.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term40676, term40676.getClass(), "_nonStandardCreation", false);
        setBooleanField(term40676, term40676.getClass(), "_vanillaProcessing", false);
        setField(term40676, term40676.getClass(), "_beanProperties", null);
        setField(term40676, term40676.getClass(), "_injectables", null);
        setField(term40676, term40676.getClass(), "_anySetter", null);
        setField(term40676, term40676.getClass(), "_ignorableProps", null);
        setBooleanField(term40676, term40676.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term40676, term40676.getClass(), "_needViewProcesing", false);
        setField(term40676, term40676.getClass(), "_backRefs", null);
        setField(term40676, term40676.getClass(), "_subDeserializers", null);
        setField(term40676, term40676.getClass(), "_unwrappedPropertyHandler", null);
        setField(term40676, term40676.getClass(), "_externalTypeIdHandler", null);
        setField(term40676, term40676.getClass(), "_objectIdReader", null);
        setField(term40676, term40676.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term40563;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term40674));
        assertTrue(recursiveEquals(term40563, term40676));
    }

};


