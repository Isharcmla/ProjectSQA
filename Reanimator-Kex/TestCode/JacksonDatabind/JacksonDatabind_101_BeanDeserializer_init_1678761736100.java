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

public class BeanDeserializer_init_1678761736100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20020;
     Object term20854;
     Object term20856;

    public BeanDeserializer_init_1678761736100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19908 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term20020 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term20112 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term20020, term20020.getClass(), "_beanType", term20112);
        term20854 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term20855 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term20854, term20854.getClass(), "_nullFromCreator", null);
        setField(term20854, term20854.getClass(), "_currentlyTransforming", null);
        setField(term20855, term20855.getClass(), "_keyType", null);
        setField(term20855, term20855.getClass(), "_valueType", null);
        setField(term20855, term20855.getClass(), "_superClass", null);
        setField(term20855, term20855.getClass(), "_superInterfaces", null);
        setField(term20855, term20855.getClass(), "_bindings", null);
        setField(term20855, term20855.getClass(), "_canonicalName", null);
        setField(term20855, term20855.getClass(), "_class", null);
        setIntField(term20855, term20855.getClass(), "_hash", 0);
        setField(term20855, term20855.getClass(), "_valueHandler", null);
        setField(term20855, term20855.getClass(), "_typeHandler", null);
        setBooleanField(term20855, term20855.getClass(), "_asStatic", false);
        setField(term20854, term20854.getClass(), "_beanType", term20855);
        setField(term20854, term20854.getClass(), "_serializationShape", null);
        setField(term20854, term20854.getClass(), "_valueInstantiator", null);
        setField(term20854, term20854.getClass(), "_delegateDeserializer", null);
        setField(term20854, term20854.getClass(), "_arrayDelegateDeserializer", null);
        setField(term20854, term20854.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term20854, term20854.getClass(), "_nonStandardCreation", false);
        setBooleanField(term20854, term20854.getClass(), "_vanillaProcessing", false);
        setField(term20854, term20854.getClass(), "_beanProperties", null);
        setField(term20854, term20854.getClass(), "_injectables", null);
        setField(term20854, term20854.getClass(), "_anySetter", null);
        setField(term20854, term20854.getClass(), "_ignorableProps", null);
        setBooleanField(term20854, term20854.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term20854, term20854.getClass(), "_needViewProcesing", false);
        setField(term20854, term20854.getClass(), "_backRefs", null);
        setField(term20854, term20854.getClass(), "_subDeserializers", null);
        setField(term20854, term20854.getClass(), "_unwrappedPropertyHandler", null);
        setField(term20854, term20854.getClass(), "_externalTypeIdHandler", null);
        setField(term20854, term20854.getClass(), "_objectIdReader", null);
        setField(term20854, term20854.getClass(), "_valueClass", null);
        term20856 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term20857 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term20856, term20856.getClass(), "_nullFromCreator", null);
        setField(term20856, term20856.getClass(), "_currentlyTransforming", null);
        setField(term20857, term20857.getClass(), "_keyType", null);
        setField(term20857, term20857.getClass(), "_valueType", null);
        setField(term20857, term20857.getClass(), "_superClass", null);
        setField(term20857, term20857.getClass(), "_superInterfaces", null);
        setField(term20857, term20857.getClass(), "_bindings", null);
        setField(term20857, term20857.getClass(), "_canonicalName", null);
        setField(term20857, term20857.getClass(), "_class", null);
        setIntField(term20857, term20857.getClass(), "_hash", 0);
        setField(term20857, term20857.getClass(), "_valueHandler", null);
        setField(term20857, term20857.getClass(), "_typeHandler", null);
        setBooleanField(term20857, term20857.getClass(), "_asStatic", false);
        setField(term20856, term20856.getClass(), "_beanType", term20857);
        setField(term20856, term20856.getClass(), "_serializationShape", null);
        setField(term20856, term20856.getClass(), "_valueInstantiator", null);
        setField(term20856, term20856.getClass(), "_delegateDeserializer", null);
        setField(term20856, term20856.getClass(), "_arrayDelegateDeserializer", null);
        setField(term20856, term20856.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term20856, term20856.getClass(), "_nonStandardCreation", false);
        setBooleanField(term20856, term20856.getClass(), "_vanillaProcessing", false);
        setField(term20856, term20856.getClass(), "_beanProperties", null);
        setField(term20856, term20856.getClass(), "_injectables", null);
        setField(term20856, term20856.getClass(), "_anySetter", null);
        setField(term20856, term20856.getClass(), "_ignorableProps", null);
        setBooleanField(term20856, term20856.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term20856, term20856.getClass(), "_needViewProcesing", false);
        setField(term20856, term20856.getClass(), "_backRefs", null);
        setField(term20856, term20856.getClass(), "_subDeserializers", null);
        setField(term20856, term20856.getClass(), "_unwrappedPropertyHandler", null);
        setField(term20856, term20856.getClass(), "_externalTypeIdHandler", null);
        setField(term20856, term20856.getClass(), "_objectIdReader", null);
        setField(term20856, term20856.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term20020;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term20854));
        assertTrue(recursiveEquals(term20020, term20856));
    }

};


