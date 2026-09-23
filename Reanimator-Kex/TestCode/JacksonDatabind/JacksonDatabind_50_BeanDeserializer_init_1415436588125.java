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
import java.lang.String;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class BeanDeserializer_init_1415436588125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44881;
     Object term45321;
     Object term45656;
     Object term45664;
     Object term45666;

    public BeanDeserializer_init_1415436588125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44745 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term44745, term44745.getClass(), "_valueClass", null);
        setField(term44745, term44745.getClass(), "_classAnnotations", null);
        setField(term44745, term44745.getClass(), "_beanType", null);
        setField(term44745, term44745.getClass(), "_valueInstantiator", null);
        setField(term44745, term44745.getClass(), "_delegateDeserializer", null);
        setField(term44745, term44745.getClass(), "_propertyBasedCreator", null);
        setField(term44745, term44745.getClass(), "_backRefs", null);
        setField(term44745, term44745.getClass(), "_ignorableProps", null);
        setBooleanField(term44745, term44745.getClass(), "_ignoreAllUnknown", false);
        setField(term44745, term44745.getClass(), "_anySetter", null);
        setField(term44745, term44745.getClass(), "_injectables", null);
        setBooleanField(term44745, term44745.getClass(), "_nonStandardCreation", false);
        setField(term44745, term44745.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term44745, term44745.getClass(), "_needViewProcesing", false);
        setField(term44745, term44745.getClass(), "_serializationShape", null);
        setBooleanField(term44745, term44745.getClass(), "_vanillaProcessing", false);
        setField(term44745, term44745.getClass(), "_objectIdReader", null);
        Class<? extends Object> term45673 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term45672 = ((Class) term45673).getDeclaredField((String) "NUMBER_FLOAT");
        ((Field) term45672).setAccessible(true);
        Object enum11 = ((Field) term45672).get((Object) null);
        term44881 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        Object term45011 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        Object term45273 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term44881, term44881.getClass(), "_beanType", null);
        setField(term44881, term44881.getClass(), "_classAnnotations", null);
        setField(term44881, term44881.getClass(), "_valueInstantiator", null);
        setField(term44881, term44881.getClass(), "_delegateDeserializer", null);
        setField(term44881, term44881.getClass(), "_propertyBasedCreator", term45011);
        setField(term44881, term44881.getClass(), "_backRefs", null);
        setBooleanField(term44881, term44881.getClass(), "_ignoreAllUnknown", false);
        setField(term44881, term44881.getClass(), "_anySetter", null);
        setField(term44881, term44881.getClass(), "_injectables", null);
        setBooleanField(term44881, term44881.getClass(), "_nonStandardCreation", false);
        setField(term44881, term44881.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term44881, term44881.getClass(), "_needViewProcesing", false);
        setField(term44881, term44881.getClass(), "_serializationShape", enum11);
        setBooleanField(term44881, term44881.getClass(), "_vanillaProcessing", false);
        setField(term44881, term44881.getClass(), "_objectIdReader", null);
        setField(term44881, term44881.getClass(), "_beanProperties", term45273);
        term45321 = new HashSet();
        Class<? extends Object> term45961 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term45960 = ((Class) term45961).getDeclaredField((String) "NUMBER_FLOAT");
        ((Field) term45960).setAccessible(true);
        Object enum12 = ((Field) term45960).get((Object) null);
        HashMap term45663 = new HashMap();
        Set<Object> term46248 =  ((Map) term45663).keySet();
        HashSet term45662 = new HashSet((Collection<? extends Object>) term46248);
        term45656 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term45660 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        Object term45661 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term45656, term45656.getClass(), "_nullFromCreator", null);
        setField(term45656, term45656.getClass(), "_classAnnotations", null);
        setField(term45656, term45656.getClass(), "_beanType", null);
        setField(term45656, term45656.getClass(), "_serializationShape", enum12);
        setField(term45656, term45656.getClass(), "_valueInstantiator", null);
        setField(term45656, term45656.getClass(), "_delegateDeserializer", null);
        setField(term45656, term45656.getClass(), "_arrayDelegateDeserializer", null);
        setField(term45660, term45660.getClass(), "_valueInstantiator", null);
        setField(term45660, term45660.getClass(), "_propertyLookup", null);
        setIntField(term45660, term45660.getClass(), "_propertyCount", 0);
        setField(term45660, term45660.getClass(), "_allProperties", null);
        setField(term45656, term45656.getClass(), "_propertyBasedCreator", term45660);
        setBooleanField(term45656, term45656.getClass(), "_nonStandardCreation", false);
        setBooleanField(term45656, term45656.getClass(), "_vanillaProcessing", false);
        setBooleanField(term45661, term45661.getClass(), "_caseInsensitive", false);
        setIntField(term45661, term45661.getClass(), "_hashMask", 0);
        setIntField(term45661, term45661.getClass(), "_size", 0);
        setIntField(term45661, term45661.getClass(), "_spillCount", 0);
        setField(term45661, term45661.getClass(), "_hashArea", null);
        setField(term45661, term45661.getClass(), "_propsInOrder", null);
        setField(term45656, term45656.getClass(), "_beanProperties", term45661);
        setField(term45656, term45656.getClass(), "_injectables", null);
        setField(term45656, term45656.getClass(), "_anySetter", null);
        setField(term45656, term45656.getClass(), "_ignorableProps", term45662);
        setBooleanField(term45656, term45656.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term45656, term45656.getClass(), "_needViewProcesing", false);
        setField(term45656, term45656.getClass(), "_backRefs", null);
        setField(term45656, term45656.getClass(), "_subDeserializers", null);
        setField(term45656, term45656.getClass(), "_unwrappedPropertyHandler", null);
        setField(term45656, term45656.getClass(), "_externalTypeIdHandler", null);
        setField(term45656, term45656.getClass(), "_objectIdReader", null);
        setField(term45656, term45656.getClass(), "_valueClass", null);
        HashMap term45665 = new HashMap();
        Set<Object> term46249 =  ((Map) term45665).keySet();
        term45664 = new HashSet((Collection<? extends Object>) term46249);
        Class<? extends Object> term46251 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term46250 = ((Class) term46251).getDeclaredField((String) "NUMBER_FLOAT");
        ((Field) term46250).setAccessible(true);
        Object enum13 = ((Field) term46250).get((Object) null);
        term45666 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        Object term45670 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        Object term45671 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term45666, term45666.getClass(), "_delegate", null);
        setField(term45666, term45666.getClass(), "_orderedProperties", null);
        setField(term45666, term45666.getClass(), "_classAnnotations", null);
        setField(term45666, term45666.getClass(), "_beanType", null);
        setField(term45666, term45666.getClass(), "_serializationShape", enum13);
        setField(term45666, term45666.getClass(), "_valueInstantiator", null);
        setField(term45666, term45666.getClass(), "_delegateDeserializer", null);
        setField(term45666, term45666.getClass(), "_arrayDelegateDeserializer", null);
        setField(term45670, term45670.getClass(), "_valueInstantiator", null);
        setField(term45670, term45670.getClass(), "_propertyLookup", null);
        setIntField(term45670, term45670.getClass(), "_propertyCount", 0);
        setField(term45670, term45670.getClass(), "_allProperties", null);
        setField(term45666, term45666.getClass(), "_propertyBasedCreator", term45670);
        setBooleanField(term45666, term45666.getClass(), "_nonStandardCreation", false);
        setBooleanField(term45666, term45666.getClass(), "_vanillaProcessing", false);
        setBooleanField(term45671, term45671.getClass(), "_caseInsensitive", false);
        setIntField(term45671, term45671.getClass(), "_hashMask", 0);
        setIntField(term45671, term45671.getClass(), "_size", 0);
        setIntField(term45671, term45671.getClass(), "_spillCount", 0);
        setField(term45671, term45671.getClass(), "_hashArea", null);
        setField(term45671, term45671.getClass(), "_propsInOrder", null);
        setField(term45666, term45666.getClass(), "_beanProperties", term45671);
        setField(term45666, term45666.getClass(), "_injectables", null);
        setField(term45666, term45666.getClass(), "_anySetter", null);
        setField(term45666, term45666.getClass(), "_ignorableProps", null);
        setBooleanField(term45666, term45666.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term45666, term45666.getClass(), "_needViewProcesing", false);
        setField(term45666, term45666.getClass(), "_backRefs", null);
        setField(term45666, term45666.getClass(), "_subDeserializers", null);
        setField(term45666, term45666.getClass(), "_unwrappedPropertyHandler", null);
        setField(term45666, term45666.getClass(), "_externalTypeIdHandler", null);
        setField(term45666, term45666.getClass(), "_objectIdReader", null);
        setField(term45666, term45666.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term44881;
        args[1] = term45321;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45656));
        assertTrue(recursiveEquals(term44881, term45664));
        assertTrue(recursiveEquals(term45321, term45666));
    }

};


