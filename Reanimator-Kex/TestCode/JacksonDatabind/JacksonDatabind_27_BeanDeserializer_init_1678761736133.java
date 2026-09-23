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

public class BeanDeserializer_init_1678761736133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43092;
     Object term43336;
     Object term43397;
     Object term43401;
     Object term43402;

    public BeanDeserializer_init_1678761736133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42980 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term42980, term42980.getClass(), "_valueClass", null);
        setField(term42980, term42980.getClass(), "_classAnnotations", null);
        setField(term42980, term42980.getClass(), "_beanType", null);
        setField(term42980, term42980.getClass(), "_valueInstantiator", null);
        setField(term42980, term42980.getClass(), "_delegateDeserializer", null);
        setField(term42980, term42980.getClass(), "_propertyBasedCreator", null);
        setField(term42980, term42980.getClass(), "_backRefs", null);
        setField(term42980, term42980.getClass(), "_ignorableProps", null);
        setBooleanField(term42980, term42980.getClass(), "_ignoreAllUnknown", false);
        setField(term42980, term42980.getClass(), "_anySetter", null);
        setField(term42980, term42980.getClass(), "_injectables", null);
        setField(term42980, term42980.getClass(), "_objectIdReader", null);
        setBooleanField(term42980, term42980.getClass(), "_nonStandardCreation", false);
        term43092 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term43212 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        Object[] term42766 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.SettableBeanProperty", 0);
        setField(term43092, term43092.getClass(), "_beanType", null);
        setField(term43092, term43092.getClass(), "_classAnnotations", null);
        setField(term43092, term43092.getClass(), "_valueInstantiator", null);
        setField(term43092, term43092.getClass(), "_delegateDeserializer", null);
        setField(term43092, term43092.getClass(), "_propertyBasedCreator", null);
        setField(term43092, term43092.getClass(), "_backRefs", null);
        setField(term43092, term43092.getClass(), "_ignorableProps", null);
        setField(term43092, term43092.getClass(), "_anySetter", null);
        setField(term43092, term43092.getClass(), "_injectables", null);
        setField(term43092, term43092.getClass(), "_objectIdReader", null);
        setBooleanField(term43092, term43092.getClass(), "_nonStandardCreation", false);
        setField(term43092, term43092.getClass(), "_unwrappedPropertyHandler", null);
        setField(term43212, term43212.getClass(), "_propsInOrder", term42766);
        setField(term43092, term43092.getClass(), "_beanProperties", term43212);
        term43336 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
        term43397 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term43398 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        Object[] term43399 = (Object[]) newArray("java.lang.Object", 24);
        Object[] term43400 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.SettableBeanProperty", 0);
        setField(term43397, term43397.getClass(), "_classAnnotations", null);
        setField(term43397, term43397.getClass(), "_beanType", null);
        setField(term43397, term43397.getClass(), "_serializationShape", null);
        setField(term43397, term43397.getClass(), "_valueInstantiator", null);
        setField(term43397, term43397.getClass(), "_delegateDeserializer", null);
        setField(term43397, term43397.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term43397, term43397.getClass(), "_nonStandardCreation", false);
        setBooleanField(term43397, term43397.getClass(), "_vanillaProcessing", false);
        setBooleanField(term43398, term43398.getClass(), "_caseInsensitive", false);
        setIntField(term43398, term43398.getClass(), "_hashMask", 7);
        setIntField(term43398, term43398.getClass(), "_size", 0);
        setIntField(term43398, term43398.getClass(), "_spillCount", 0);
        setField(term43398, term43398.getClass(), "_hashArea", term43399);
        setField(term43398, term43398.getClass(), "_propsInOrder", term43400);
        setField(term43397, term43397.getClass(), "_beanProperties", term43398);
        setField(term43397, term43397.getClass(), "_injectables", null);
        setField(term43397, term43397.getClass(), "_anySetter", null);
        setField(term43397, term43397.getClass(), "_ignorableProps", null);
        setBooleanField(term43397, term43397.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term43397, term43397.getClass(), "_needViewProcesing", false);
        setField(term43397, term43397.getClass(), "_backRefs", null);
        setField(term43397, term43397.getClass(), "_subDeserializers", null);
        setField(term43397, term43397.getClass(), "_unwrappedPropertyHandler", null);
        setField(term43397, term43397.getClass(), "_externalTypeIdHandler", null);
        setField(term43397, term43397.getClass(), "_objectIdReader", null);
        setField(term43397, term43397.getClass(), "_valueClass", null);
        term43401 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
        setField(term43401, term43401.getClass(), "_t1", null);
        setField(term43401, term43401.getClass(), "_t2", null);
        term43402 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term43403 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        Object[] term43404 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.SettableBeanProperty", 0);
        setField(term43402, term43402.getClass(), "_classAnnotations", null);
        setField(term43402, term43402.getClass(), "_beanType", null);
        setField(term43402, term43402.getClass(), "_serializationShape", null);
        setField(term43402, term43402.getClass(), "_valueInstantiator", null);
        setField(term43402, term43402.getClass(), "_delegateDeserializer", null);
        setField(term43402, term43402.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term43402, term43402.getClass(), "_nonStandardCreation", false);
        setBooleanField(term43402, term43402.getClass(), "_vanillaProcessing", false);
        setBooleanField(term43403, term43403.getClass(), "_caseInsensitive", false);
        setIntField(term43403, term43403.getClass(), "_hashMask", 0);
        setIntField(term43403, term43403.getClass(), "_size", 0);
        setIntField(term43403, term43403.getClass(), "_spillCount", 0);
        setField(term43403, term43403.getClass(), "_hashArea", null);
        setField(term43403, term43403.getClass(), "_propsInOrder", term43404);
        setField(term43402, term43402.getClass(), "_beanProperties", term43403);
        setField(term43402, term43402.getClass(), "_injectables", null);
        setField(term43402, term43402.getClass(), "_anySetter", null);
        setField(term43402, term43402.getClass(), "_ignorableProps", null);
        setBooleanField(term43402, term43402.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term43402, term43402.getClass(), "_needViewProcesing", false);
        setField(term43402, term43402.getClass(), "_backRefs", null);
        setField(term43402, term43402.getClass(), "_subDeserializers", null);
        setField(term43402, term43402.getClass(), "_unwrappedPropertyHandler", null);
        setField(term43402, term43402.getClass(), "_externalTypeIdHandler", null);
        setField(term43402, term43402.getClass(), "_objectIdReader", null);
        setField(term43402, term43402.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term43092;
        args[1] = term43336;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term43397));
        assertTrue(recursiveEquals(term43092, term43401));
        assertTrue(recursiveEquals(term43336, term43402));
    }

};


