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

public class BeanDeserializer_init_128587249075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12892;
     Object term13015;
     Object term13017;

    public BeanDeserializer_init_128587249075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12780 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term12892 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term12996 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term12892, term12892.getClass(), "_beanType", term12996);
        term13015 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term13016 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term13015, term13015.getClass(), "_classAnnotations", null);
        setField(term13016, term13016.getClass(), "_referencedType", null);
        setField(term13016, term13016.getClass(), "_typeParametersFor", null);
        setField(term13016, term13016.getClass(), "_typeParameters", null);
        setField(term13016, term13016.getClass(), "_typeNames", null);
        setField(term13016, term13016.getClass(), "_canonicalName", null);
        setField(term13016, term13016.getClass(), "_class", null);
        setIntField(term13016, term13016.getClass(), "_hash", 0);
        setField(term13016, term13016.getClass(), "_valueHandler", null);
        setField(term13016, term13016.getClass(), "_typeHandler", null);
        setBooleanField(term13016, term13016.getClass(), "_asStatic", false);
        setField(term13015, term13015.getClass(), "_beanType", term13016);
        setField(term13015, term13015.getClass(), "_serializationShape", null);
        setField(term13015, term13015.getClass(), "_valueInstantiator", null);
        setField(term13015, term13015.getClass(), "_delegateDeserializer", null);
        setField(term13015, term13015.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term13015, term13015.getClass(), "_nonStandardCreation", false);
        setBooleanField(term13015, term13015.getClass(), "_vanillaProcessing", false);
        setField(term13015, term13015.getClass(), "_beanProperties", null);
        setField(term13015, term13015.getClass(), "_injectables", null);
        setField(term13015, term13015.getClass(), "_anySetter", null);
        setField(term13015, term13015.getClass(), "_ignorableProps", null);
        setBooleanField(term13015, term13015.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term13015, term13015.getClass(), "_needViewProcesing", false);
        setField(term13015, term13015.getClass(), "_backRefs", null);
        setField(term13015, term13015.getClass(), "_subDeserializers", null);
        setField(term13015, term13015.getClass(), "_unwrappedPropertyHandler", null);
        setField(term13015, term13015.getClass(), "_externalTypeIdHandler", null);
        setField(term13015, term13015.getClass(), "_objectIdReader", null);
        setField(term13015, term13015.getClass(), "_valueClass", null);
        term13017 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term13018 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term13017, term13017.getClass(), "_classAnnotations", null);
        setField(term13018, term13018.getClass(), "_referencedType", null);
        setField(term13018, term13018.getClass(), "_typeParametersFor", null);
        setField(term13018, term13018.getClass(), "_typeParameters", null);
        setField(term13018, term13018.getClass(), "_typeNames", null);
        setField(term13018, term13018.getClass(), "_canonicalName", null);
        setField(term13018, term13018.getClass(), "_class", null);
        setIntField(term13018, term13018.getClass(), "_hash", 0);
        setField(term13018, term13018.getClass(), "_valueHandler", null);
        setField(term13018, term13018.getClass(), "_typeHandler", null);
        setBooleanField(term13018, term13018.getClass(), "_asStatic", false);
        setField(term13017, term13017.getClass(), "_beanType", term13018);
        setField(term13017, term13017.getClass(), "_serializationShape", null);
        setField(term13017, term13017.getClass(), "_valueInstantiator", null);
        setField(term13017, term13017.getClass(), "_delegateDeserializer", null);
        setField(term13017, term13017.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term13017, term13017.getClass(), "_nonStandardCreation", false);
        setBooleanField(term13017, term13017.getClass(), "_vanillaProcessing", false);
        setField(term13017, term13017.getClass(), "_beanProperties", null);
        setField(term13017, term13017.getClass(), "_injectables", null);
        setField(term13017, term13017.getClass(), "_anySetter", null);
        setField(term13017, term13017.getClass(), "_ignorableProps", null);
        setBooleanField(term13017, term13017.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term13017, term13017.getClass(), "_needViewProcesing", false);
        setField(term13017, term13017.getClass(), "_backRefs", null);
        setField(term13017, term13017.getClass(), "_subDeserializers", null);
        setField(term13017, term13017.getClass(), "_unwrappedPropertyHandler", null);
        setField(term13017, term13017.getClass(), "_externalTypeIdHandler", null);
        setField(term13017, term13017.getClass(), "_objectIdReader", null);
        setField(term13017, term13017.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term12892;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13015));
        assertTrue(recursiveEquals(term12892, term13017));
    }

};


