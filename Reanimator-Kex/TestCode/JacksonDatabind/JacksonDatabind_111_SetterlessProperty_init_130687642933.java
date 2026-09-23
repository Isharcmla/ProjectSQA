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

public class SetterlessProperty_init_130687642933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5517;
     Object term5716;
     Object term5733;
     Object term5738;
     Object term5742;

    public SetterlessProperty_init_130687642933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5517 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term5567 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term5517, term5517.getClass(), "_metadata", term5567);
        setField(term5517, term5517.getClass(), "_propertyFormat", null);
        setIntField(term5517, term5517.getClass(), "_propertyIndex", 0);
        setField(term5517, term5517.getClass(), "_propName", null);
        setField(term5517, term5517.getClass(), "_type", null);
        setField(term5517, term5517.getClass(), "_wrapperName", null);
        setField(term5517, term5517.getClass(), "_contextAnnotations", null);
        setField(term5517, term5517.getClass(), "_valueTypeDeserializer", null);
        setField(term5517, term5517.getClass(), "_managedReferenceName", "");
        term5716 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        term5733 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term5734 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Object term5737 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term5733, term5733.getClass(), "_annotated", null);
        setField(term5733, term5733.getClass(), "_getter", null);
        setField(term5733, term5733.getClass(), "_propName", null);
        setField(term5733, term5733.getClass(), "_type", null);
        setField(term5733, term5733.getClass(), "_wrapperName", null);
        setField(term5733, term5733.getClass(), "_contextAnnotations", null);
        setField(term5734, term5734.getClass(), "_nullFromCreator", null);
        setField(term5734, term5734.getClass(), "_currentlyTransforming", null);
        setField(term5734, term5734.getClass(), "_beanType", null);
        setField(term5734, term5734.getClass(), "_serializationShape", null);
        setField(term5734, term5734.getClass(), "_valueInstantiator", null);
        setField(term5734, term5734.getClass(), "_delegateDeserializer", null);
        setField(term5734, term5734.getClass(), "_arrayDelegateDeserializer", null);
        setField(term5734, term5734.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term5734, term5734.getClass(), "_nonStandardCreation", false);
        setBooleanField(term5734, term5734.getClass(), "_vanillaProcessing", false);
        setField(term5734, term5734.getClass(), "_beanProperties", null);
        setField(term5734, term5734.getClass(), "_injectables", null);
        setField(term5734, term5734.getClass(), "_anySetter", null);
        setField(term5734, term5734.getClass(), "_ignorableProps", null);
        setBooleanField(term5734, term5734.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term5734, term5734.getClass(), "_needViewProcesing", false);
        setField(term5734, term5734.getClass(), "_backRefs", null);
        setField(term5734, term5734.getClass(), "_subDeserializers", null);
        setField(term5734, term5734.getClass(), "_unwrappedPropertyHandler", null);
        setField(term5734, term5734.getClass(), "_externalTypeIdHandler", null);
        setField(term5734, term5734.getClass(), "_objectIdReader", null);
        setField(term5734, term5734.getClass(), "_valueClass", null);
        setField(term5733, term5733.getClass(), "_valueDeserializer", term5734);
        setField(term5733, term5733.getClass(), "_valueTypeDeserializer", null);
        setField(term5733, term5733.getClass(), "_nullProvider", null);
        setField(term5733, term5733.getClass(), "_managedReferenceName", "");
        setField(term5733, term5733.getClass(), "_objectIdInfo", null);
        setField(term5733, term5733.getClass(), "_viewMatcher", null);
        setIntField(term5733, term5733.getClass(), "_propertyIndex", 0);
        setField(term5737, term5737.getClass(), "_required", null);
        setField(term5737, term5737.getClass(), "_description", null);
        setField(term5737, term5737.getClass(), "_index", null);
        setField(term5737, term5737.getClass(), "_defaultValue", null);
        setField(term5737, term5737.getClass(), "_mergeInfo", null);
        setField(term5737, term5737.getClass(), "_valueNulls", null);
        setField(term5737, term5737.getClass(), "_contentNulls", null);
        setField(term5733, term5733.getClass(), "_metadata", term5737);
        setField(term5733, term5733.getClass(), "_propertyFormat", null);
        setField(term5733, term5733.getClass(), "_aliases", null);
        term5738 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term5741 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term5738, term5738.getClass(), "_annotated", null);
        setField(term5738, term5738.getClass(), "_getter", null);
        setField(term5738, term5738.getClass(), "_propName", null);
        setField(term5738, term5738.getClass(), "_type", null);
        setField(term5738, term5738.getClass(), "_wrapperName", null);
        setField(term5738, term5738.getClass(), "_contextAnnotations", null);
        setField(term5738, term5738.getClass(), "_valueDeserializer", null);
        setField(term5738, term5738.getClass(), "_valueTypeDeserializer", null);
        setField(term5738, term5738.getClass(), "_nullProvider", null);
        setField(term5738, term5738.getClass(), "_managedReferenceName", "");
        setField(term5738, term5738.getClass(), "_objectIdInfo", null);
        setField(term5738, term5738.getClass(), "_viewMatcher", null);
        setIntField(term5738, term5738.getClass(), "_propertyIndex", 0);
        setField(term5741, term5741.getClass(), "_required", null);
        setField(term5741, term5741.getClass(), "_description", null);
        setField(term5741, term5741.getClass(), "_index", null);
        setField(term5741, term5741.getClass(), "_defaultValue", null);
        setField(term5741, term5741.getClass(), "_mergeInfo", null);
        setField(term5741, term5741.getClass(), "_valueNulls", null);
        setField(term5741, term5741.getClass(), "_contentNulls", null);
        setField(term5738, term5738.getClass(), "_metadata", term5741);
        setField(term5738, term5738.getClass(), "_propertyFormat", null);
        setField(term5738, term5738.getClass(), "_aliases", null);
        term5742 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(term5742, term5742.getClass(), "_nullFromCreator", null);
        setField(term5742, term5742.getClass(), "_currentlyTransforming", null);
        setField(term5742, term5742.getClass(), "_beanType", null);
        setField(term5742, term5742.getClass(), "_serializationShape", null);
        setField(term5742, term5742.getClass(), "_valueInstantiator", null);
        setField(term5742, term5742.getClass(), "_delegateDeserializer", null);
        setField(term5742, term5742.getClass(), "_arrayDelegateDeserializer", null);
        setField(term5742, term5742.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term5742, term5742.getClass(), "_nonStandardCreation", false);
        setBooleanField(term5742, term5742.getClass(), "_vanillaProcessing", false);
        setField(term5742, term5742.getClass(), "_beanProperties", null);
        setField(term5742, term5742.getClass(), "_injectables", null);
        setField(term5742, term5742.getClass(), "_anySetter", null);
        setField(term5742, term5742.getClass(), "_ignorableProps", null);
        setBooleanField(term5742, term5742.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term5742, term5742.getClass(), "_needViewProcesing", false);
        setField(term5742, term5742.getClass(), "_backRefs", null);
        setField(term5742, term5742.getClass(), "_subDeserializers", null);
        setField(term5742, term5742.getClass(), "_unwrappedPropertyHandler", null);
        setField(term5742, term5742.getClass(), "_externalTypeIdHandler", null);
        setField(term5742, term5742.getClass(), "_objectIdReader", null);
        setField(term5742, term5742.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term5517;
        args[1] = term5716;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5733));
        assertTrue(recursiveEquals(term5517, term5738));
        assertTrue(recursiveEquals(term5716, term5742));
    }

};


