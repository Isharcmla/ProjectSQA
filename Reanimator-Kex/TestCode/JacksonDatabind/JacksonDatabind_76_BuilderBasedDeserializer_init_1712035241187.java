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

public class BuilderBasedDeserializer_init_1712035241187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86635;
     Object term86700;
     Object term86702;

    public BuilderBasedDeserializer_init_1712035241187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86635 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term86681 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setBooleanField(term86635, term86635.getClass(), "_ignoreAllUnknown", false);
        setField(term86635, term86635.getClass(), "_beanType", term86681);
        term86700 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term86701 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term86700, term86700.getClass(), "_buildMethod", null);
        setField(term86700, term86700.getClass(), "_classAnnotations", null);
        setField(term86701, term86701.getClass(), "_keyType", null);
        setField(term86701, term86701.getClass(), "_valueType", null);
        setField(term86701, term86701.getClass(), "_superClass", null);
        setField(term86701, term86701.getClass(), "_superInterfaces", null);
        setField(term86701, term86701.getClass(), "_bindings", null);
        setField(term86701, term86701.getClass(), "_canonicalName", null);
        setField(term86701, term86701.getClass(), "_class", null);
        setIntField(term86701, term86701.getClass(), "_hash", 0);
        setField(term86701, term86701.getClass(), "_valueHandler", null);
        setField(term86701, term86701.getClass(), "_typeHandler", null);
        setBooleanField(term86701, term86701.getClass(), "_asStatic", false);
        setField(term86700, term86700.getClass(), "_beanType", term86701);
        setField(term86700, term86700.getClass(), "_serializationShape", null);
        setField(term86700, term86700.getClass(), "_valueInstantiator", null);
        setField(term86700, term86700.getClass(), "_delegateDeserializer", null);
        setField(term86700, term86700.getClass(), "_arrayDelegateDeserializer", null);
        setField(term86700, term86700.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term86700, term86700.getClass(), "_nonStandardCreation", false);
        setBooleanField(term86700, term86700.getClass(), "_vanillaProcessing", false);
        setField(term86700, term86700.getClass(), "_beanProperties", null);
        setField(term86700, term86700.getClass(), "_injectables", null);
        setField(term86700, term86700.getClass(), "_anySetter", null);
        setField(term86700, term86700.getClass(), "_ignorableProps", null);
        setBooleanField(term86700, term86700.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term86700, term86700.getClass(), "_needViewProcesing", false);
        setField(term86700, term86700.getClass(), "_backRefs", null);
        setField(term86700, term86700.getClass(), "_subDeserializers", null);
        setField(term86700, term86700.getClass(), "_unwrappedPropertyHandler", null);
        setField(term86700, term86700.getClass(), "_externalTypeIdHandler", null);
        setField(term86700, term86700.getClass(), "_objectIdReader", null);
        setField(term86700, term86700.getClass(), "_valueClass", null);
        term86702 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term86703 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term86702, term86702.getClass(), "_buildMethod", null);
        setField(term86702, term86702.getClass(), "_classAnnotations", null);
        setField(term86703, term86703.getClass(), "_keyType", null);
        setField(term86703, term86703.getClass(), "_valueType", null);
        setField(term86703, term86703.getClass(), "_superClass", null);
        setField(term86703, term86703.getClass(), "_superInterfaces", null);
        setField(term86703, term86703.getClass(), "_bindings", null);
        setField(term86703, term86703.getClass(), "_canonicalName", null);
        setField(term86703, term86703.getClass(), "_class", null);
        setIntField(term86703, term86703.getClass(), "_hash", 0);
        setField(term86703, term86703.getClass(), "_valueHandler", null);
        setField(term86703, term86703.getClass(), "_typeHandler", null);
        setBooleanField(term86703, term86703.getClass(), "_asStatic", false);
        setField(term86702, term86702.getClass(), "_beanType", term86703);
        setField(term86702, term86702.getClass(), "_serializationShape", null);
        setField(term86702, term86702.getClass(), "_valueInstantiator", null);
        setField(term86702, term86702.getClass(), "_delegateDeserializer", null);
        setField(term86702, term86702.getClass(), "_arrayDelegateDeserializer", null);
        setField(term86702, term86702.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term86702, term86702.getClass(), "_nonStandardCreation", false);
        setBooleanField(term86702, term86702.getClass(), "_vanillaProcessing", false);
        setField(term86702, term86702.getClass(), "_beanProperties", null);
        setField(term86702, term86702.getClass(), "_injectables", null);
        setField(term86702, term86702.getClass(), "_anySetter", null);
        setField(term86702, term86702.getClass(), "_ignorableProps", null);
        setBooleanField(term86702, term86702.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term86702, term86702.getClass(), "_needViewProcesing", false);
        setField(term86702, term86702.getClass(), "_backRefs", null);
        setField(term86702, term86702.getClass(), "_subDeserializers", null);
        setField(term86702, term86702.getClass(), "_unwrappedPropertyHandler", null);
        setField(term86702, term86702.getClass(), "_externalTypeIdHandler", null);
        setField(term86702, term86702.getClass(), "_objectIdReader", null);
        setField(term86702, term86702.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Object[] args = new Object[1];
        args[0] = term86635;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term86700));
        assertTrue(recursiveEquals(term86635, term86702));
    }

};


