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
import java.util.HashMap;

public class BeanDeserializer_init_167876173669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11137;
     Object term11753;
     Object term11758;

    public BeanDeserializer_init_167876173669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10909 = Class.forName((String) "java.util.WeakHashMap$KeyIterator");
        Object term10873 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term11025 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term10873, term10873.getClass(), "_valueClass", term10909);
        setField(term10873, term10873.getClass(), "_classAnnotations", term11025);
        setField(term10873, term10873.getClass(), "_beanType", null);
        setField(term10873, term10873.getClass(), "_valueInstantiator", null);
        setField(term10873, term10873.getClass(), "_delegateDeserializer", null);
        setField(term10873, term10873.getClass(), "_propertyBasedCreator", null);
        setField(term10873, term10873.getClass(), "_backRefs", null);
        setField(term10873, term10873.getClass(), "_ignorableProps", null);
        HashMap term11543 = new HashMap();
        term11137 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term11253 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term11365 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term11495 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(term11137, term11137.getClass(), "_beanType", null);
        setField(term11137, term11137.getClass(), "_classAnnotations", term11253);
        setField(term11137, term11137.getClass(), "_valueInstantiator", null);
        setField(term11137, term11137.getClass(), "_delegateDeserializer", term11365);
        setField(term11137, term11137.getClass(), "_propertyBasedCreator", term11495);
        setField(term11137, term11137.getClass(), "_backRefs", term11543);
        setField(term11137, term11137.getClass(), "_ignorableProps", null);
        setBooleanField(term11137, term11137.getClass(), "_ignoreAllUnknown", true);
        HashMap term11757 = new HashMap();
        term11753 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term11754 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term11755 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term11756 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(term11754, term11754.getClass(), "_annotations", null);
        setField(term11753, term11753.getClass(), "_classAnnotations", term11754);
        setField(term11753, term11753.getClass(), "_beanType", null);
        setField(term11753, term11753.getClass(), "_serializationShape", null);
        setField(term11753, term11753.getClass(), "_valueInstantiator", null);
        setField(term11755, term11755.getClass(), "_classAnnotations", null);
        setField(term11755, term11755.getClass(), "_beanType", null);
        setField(term11755, term11755.getClass(), "_serializationShape", null);
        setField(term11755, term11755.getClass(), "_valueInstantiator", null);
        setField(term11755, term11755.getClass(), "_delegateDeserializer", null);
        setField(term11755, term11755.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term11755, term11755.getClass(), "_nonStandardCreation", false);
        setBooleanField(term11755, term11755.getClass(), "_vanillaProcessing", false);
        setField(term11755, term11755.getClass(), "_beanProperties", null);
        setField(term11755, term11755.getClass(), "_injectables", null);
        setField(term11755, term11755.getClass(), "_anySetter", null);
        setField(term11755, term11755.getClass(), "_ignorableProps", null);
        setBooleanField(term11755, term11755.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term11755, term11755.getClass(), "_needViewProcesing", false);
        setField(term11755, term11755.getClass(), "_backRefs", null);
        setField(term11755, term11755.getClass(), "_subDeserializers", null);
        setField(term11755, term11755.getClass(), "_unwrappedPropertyHandler", null);
        setField(term11755, term11755.getClass(), "_externalTypeIdHandler", null);
        setField(term11755, term11755.getClass(), "_objectIdReader", null);
        setField(term11755, term11755.getClass(), "_valueClass", null);
        setField(term11753, term11753.getClass(), "_delegateDeserializer", term11755);
        setField(term11756, term11756.getClass(), "_valueInstantiator", null);
        setField(term11756, term11756.getClass(), "_propertyLookup", null);
        setIntField(term11756, term11756.getClass(), "_propertyCount", 0);
        setField(term11756, term11756.getClass(), "_allProperties", null);
        setField(term11753, term11753.getClass(), "_propertyBasedCreator", term11756);
        setBooleanField(term11753, term11753.getClass(), "_nonStandardCreation", false);
        setBooleanField(term11753, term11753.getClass(), "_vanillaProcessing", false);
        setField(term11753, term11753.getClass(), "_beanProperties", null);
        setField(term11753, term11753.getClass(), "_injectables", null);
        setField(term11753, term11753.getClass(), "_anySetter", null);
        setField(term11753, term11753.getClass(), "_ignorableProps", null);
        setBooleanField(term11753, term11753.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term11753, term11753.getClass(), "_needViewProcesing", false);
        setField(term11753, term11753.getClass(), "_backRefs", term11757);
        setField(term11753, term11753.getClass(), "_subDeserializers", null);
        setField(term11753, term11753.getClass(), "_unwrappedPropertyHandler", null);
        setField(term11753, term11753.getClass(), "_externalTypeIdHandler", null);
        setField(term11753, term11753.getClass(), "_objectIdReader", null);
        setField(term11753, term11753.getClass(), "_valueClass", null);
        HashMap term11762 = new HashMap();
        term11758 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term11759 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term11760 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term11761 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(term11759, term11759.getClass(), "_annotations", null);
        setField(term11758, term11758.getClass(), "_classAnnotations", term11759);
        setField(term11758, term11758.getClass(), "_beanType", null);
        setField(term11758, term11758.getClass(), "_serializationShape", null);
        setField(term11758, term11758.getClass(), "_valueInstantiator", null);
        setField(term11760, term11760.getClass(), "_classAnnotations", null);
        setField(term11760, term11760.getClass(), "_beanType", null);
        setField(term11760, term11760.getClass(), "_serializationShape", null);
        setField(term11760, term11760.getClass(), "_valueInstantiator", null);
        setField(term11760, term11760.getClass(), "_delegateDeserializer", null);
        setField(term11760, term11760.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term11760, term11760.getClass(), "_nonStandardCreation", false);
        setBooleanField(term11760, term11760.getClass(), "_vanillaProcessing", false);
        setField(term11760, term11760.getClass(), "_beanProperties", null);
        setField(term11760, term11760.getClass(), "_injectables", null);
        setField(term11760, term11760.getClass(), "_anySetter", null);
        setField(term11760, term11760.getClass(), "_ignorableProps", null);
        setBooleanField(term11760, term11760.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term11760, term11760.getClass(), "_needViewProcesing", false);
        setField(term11760, term11760.getClass(), "_backRefs", null);
        setField(term11760, term11760.getClass(), "_subDeserializers", null);
        setField(term11760, term11760.getClass(), "_unwrappedPropertyHandler", null);
        setField(term11760, term11760.getClass(), "_externalTypeIdHandler", null);
        setField(term11760, term11760.getClass(), "_objectIdReader", null);
        setField(term11760, term11760.getClass(), "_valueClass", null);
        setField(term11758, term11758.getClass(), "_delegateDeserializer", term11760);
        setField(term11761, term11761.getClass(), "_valueInstantiator", null);
        setField(term11761, term11761.getClass(), "_propertyLookup", null);
        setIntField(term11761, term11761.getClass(), "_propertyCount", 0);
        setField(term11761, term11761.getClass(), "_allProperties", null);
        setField(term11758, term11758.getClass(), "_propertyBasedCreator", term11761);
        setBooleanField(term11758, term11758.getClass(), "_nonStandardCreation", false);
        setBooleanField(term11758, term11758.getClass(), "_vanillaProcessing", false);
        setField(term11758, term11758.getClass(), "_beanProperties", null);
        setField(term11758, term11758.getClass(), "_injectables", null);
        setField(term11758, term11758.getClass(), "_anySetter", null);
        setField(term11758, term11758.getClass(), "_ignorableProps", null);
        setBooleanField(term11758, term11758.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term11758, term11758.getClass(), "_needViewProcesing", false);
        setField(term11758, term11758.getClass(), "_backRefs", term11762);
        setField(term11758, term11758.getClass(), "_subDeserializers", null);
        setField(term11758, term11758.getClass(), "_unwrappedPropertyHandler", null);
        setField(term11758, term11758.getClass(), "_externalTypeIdHandler", null);
        setField(term11758, term11758.getClass(), "_objectIdReader", null);
        setField(term11758, term11758.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term11137;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11753));
        assertTrue(recursiveEquals(term11137, term11758));
    }

};


