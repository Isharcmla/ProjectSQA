package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.lang.Object;

public class FieldProperty_init_43250592977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28388;
     Object term28569;
     Object term30181;
     Object term30186;
     Object term30190;

    public FieldProperty_init_43250592977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28388 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term28438 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term28388, term28388.getClass(), "_metadata", term28438);
        setField(term28388, term28388.getClass(), "_propertyFormat", null);
        setIntField(term28388, term28388.getClass(), "_propertyIndex", 0);
        setField(term28388, term28388.getClass(), "_propName", null);
        setField(term28388, term28388.getClass(), "_type", null);
        setField(term28388, term28388.getClass(), "_wrapperName", null);
        setField(term28388, term28388.getClass(), "_contextAnnotations", null);
        setField(term28388, term28388.getClass(), "_valueTypeDeserializer", null);
        setField(term28388, term28388.getClass(), "_managedReferenceName", "");
        term28569 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term30181 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term30182 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term30185 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term30181, term30181.getClass(), "_annotated", null);
        setField(term30181, term30181.getClass(), "_field", null);
        setBooleanField(term30181, term30181.getClass(), "_skipNulls", false);
        setField(term30181, term30181.getClass(), "_propName", null);
        setField(term30181, term30181.getClass(), "_type", null);
        setField(term30181, term30181.getClass(), "_wrapperName", null);
        setField(term30181, term30181.getClass(), "_contextAnnotations", null);
        setField(term30182, term30182.getClass(), "_nullFromCreator", null);
        setField(term30182, term30182.getClass(), "_currentlyTransforming", null);
        setField(term30182, term30182.getClass(), "_beanType", null);
        setField(term30182, term30182.getClass(), "_serializationShape", null);
        setField(term30182, term30182.getClass(), "_valueInstantiator", null);
        setField(term30182, term30182.getClass(), "_delegateDeserializer", null);
        setField(term30182, term30182.getClass(), "_arrayDelegateDeserializer", null);
        setField(term30182, term30182.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term30182, term30182.getClass(), "_nonStandardCreation", false);
        setBooleanField(term30182, term30182.getClass(), "_vanillaProcessing", false);
        setField(term30182, term30182.getClass(), "_beanProperties", null);
        setField(term30182, term30182.getClass(), "_injectables", null);
        setField(term30182, term30182.getClass(), "_anySetter", null);
        setField(term30182, term30182.getClass(), "_ignorableProps", null);
        setBooleanField(term30182, term30182.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term30182, term30182.getClass(), "_needViewProcesing", false);
        setField(term30182, term30182.getClass(), "_backRefs", null);
        setField(term30182, term30182.getClass(), "_subDeserializers", null);
        setField(term30182, term30182.getClass(), "_unwrappedPropertyHandler", null);
        setField(term30182, term30182.getClass(), "_externalTypeIdHandler", null);
        setField(term30182, term30182.getClass(), "_objectIdReader", null);
        setField(term30182, term30182.getClass(), "_valueClass", null);
        setField(term30181, term30181.getClass(), "_valueDeserializer", term30182);
        setField(term30181, term30181.getClass(), "_valueTypeDeserializer", null);
        setField(term30181, term30181.getClass(), "_nullProvider", null);
        setField(term30181, term30181.getClass(), "_managedReferenceName", "");
        setField(term30181, term30181.getClass(), "_objectIdInfo", null);
        setField(term30181, term30181.getClass(), "_viewMatcher", null);
        setIntField(term30181, term30181.getClass(), "_propertyIndex", 0);
        setField(term30185, term30185.getClass(), "_required", null);
        setField(term30185, term30185.getClass(), "_description", null);
        setField(term30185, term30185.getClass(), "_index", null);
        setField(term30185, term30185.getClass(), "_defaultValue", null);
        setField(term30185, term30185.getClass(), "_mergeInfo", null);
        setField(term30185, term30185.getClass(), "_valueNulls", null);
        setField(term30185, term30185.getClass(), "_contentNulls", null);
        setField(term30181, term30181.getClass(), "_metadata", term30185);
        setField(term30181, term30181.getClass(), "_propertyFormat", null);
        setField(term30181, term30181.getClass(), "_aliases", null);
        term30186 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term30189 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term30186, term30186.getClass(), "_annotated", null);
        setField(term30186, term30186.getClass(), "_field", null);
        setBooleanField(term30186, term30186.getClass(), "_skipNulls", false);
        setField(term30186, term30186.getClass(), "_propName", null);
        setField(term30186, term30186.getClass(), "_type", null);
        setField(term30186, term30186.getClass(), "_wrapperName", null);
        setField(term30186, term30186.getClass(), "_contextAnnotations", null);
        setField(term30186, term30186.getClass(), "_valueDeserializer", null);
        setField(term30186, term30186.getClass(), "_valueTypeDeserializer", null);
        setField(term30186, term30186.getClass(), "_nullProvider", null);
        setField(term30186, term30186.getClass(), "_managedReferenceName", "");
        setField(term30186, term30186.getClass(), "_objectIdInfo", null);
        setField(term30186, term30186.getClass(), "_viewMatcher", null);
        setIntField(term30186, term30186.getClass(), "_propertyIndex", 0);
        setField(term30189, term30189.getClass(), "_required", null);
        setField(term30189, term30189.getClass(), "_description", null);
        setField(term30189, term30189.getClass(), "_index", null);
        setField(term30189, term30189.getClass(), "_defaultValue", null);
        setField(term30189, term30189.getClass(), "_mergeInfo", null);
        setField(term30189, term30189.getClass(), "_valueNulls", null);
        setField(term30189, term30189.getClass(), "_contentNulls", null);
        setField(term30186, term30186.getClass(), "_metadata", term30189);
        setField(term30186, term30186.getClass(), "_propertyFormat", null);
        setField(term30186, term30186.getClass(), "_aliases", null);
        term30190 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term30190, term30190.getClass(), "_nullFromCreator", null);
        setField(term30190, term30190.getClass(), "_currentlyTransforming", null);
        setField(term30190, term30190.getClass(), "_beanType", null);
        setField(term30190, term30190.getClass(), "_serializationShape", null);
        setField(term30190, term30190.getClass(), "_valueInstantiator", null);
        setField(term30190, term30190.getClass(), "_delegateDeserializer", null);
        setField(term30190, term30190.getClass(), "_arrayDelegateDeserializer", null);
        setField(term30190, term30190.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term30190, term30190.getClass(), "_nonStandardCreation", false);
        setBooleanField(term30190, term30190.getClass(), "_vanillaProcessing", false);
        setField(term30190, term30190.getClass(), "_beanProperties", null);
        setField(term30190, term30190.getClass(), "_injectables", null);
        setField(term30190, term30190.getClass(), "_anySetter", null);
        setField(term30190, term30190.getClass(), "_ignorableProps", null);
        setBooleanField(term30190, term30190.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term30190, term30190.getClass(), "_needViewProcesing", false);
        setField(term30190, term30190.getClass(), "_backRefs", null);
        setField(term30190, term30190.getClass(), "_subDeserializers", null);
        setField(term30190, term30190.getClass(), "_unwrappedPropertyHandler", null);
        setField(term30190, term30190.getClass(), "_externalTypeIdHandler", null);
        setField(term30190, term30190.getClass(), "_objectIdReader", null);
        setField(term30190, term30190.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term28388;
        args[1] = term28569;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30181));
        assertTrue(recursiveEquals(term28388, term30186));
        assertTrue(recursiveEquals(term28569, term30190));
    }

};


