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

public class ObjectIdValueProperty_init_189141968757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43700;
     Object term50544;
     Object term50552;

    public ObjectIdValueProperty_init_189141968757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43482 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term43582 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term43482, term43482.getClass(), "_metadata", term43582);
        setIntField(term43482, term43482.getClass(), "_propertyIndex", 0);
        term43700 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term43792 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term43922 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term44052 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(term43792, term43792.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term43700, term43700.getClass(), "propertyName", term43792);
        setField(term43700, term43700.getClass(), "_idType", term43922);
        setField(term43700, term43700.getClass(), "_deserializer", term44052);
        term50544 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term50545 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term50546 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term50547 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term50550 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Object term50551 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term50546, term50546.getClass(), "_keyType", null);
        setField(term50546, term50546.getClass(), "_valueType", null);
        setField(term50546, term50546.getClass(), "_superClass", null);
        setField(term50546, term50546.getClass(), "_superInterfaces", null);
        setField(term50546, term50546.getClass(), "_bindings", null);
        setField(term50546, term50546.getClass(), "_canonicalName", null);
        setField(term50546, term50546.getClass(), "_class", null);
        setIntField(term50546, term50546.getClass(), "_hash", 0);
        setField(term50546, term50546.getClass(), "_valueHandler", null);
        setField(term50546, term50546.getClass(), "_typeHandler", null);
        setBooleanField(term50546, term50546.getClass(), "_asStatic", false);
        setField(term50545, term50545.getClass(), "_idType", term50546);
        setField(term50547, term50547.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term50547, term50547.getClass(), "_namespace", null);
        setField(term50547, term50547.getClass(), "_encodedSimple", null);
        setField(term50545, term50545.getClass(), "propertyName", term50547);
        setField(term50545, term50545.getClass(), "generator", null);
        setField(term50545, term50545.getClass(), "resolver", null);
        setField(term50550, term50550.getClass(), "_nullFromCreator", null);
        setField(term50550, term50550.getClass(), "_currentlyTransforming", null);
        setField(term50550, term50550.getClass(), "_beanType", null);
        setField(term50550, term50550.getClass(), "_serializationShape", null);
        setField(term50550, term50550.getClass(), "_valueInstantiator", null);
        setField(term50550, term50550.getClass(), "_delegateDeserializer", null);
        setField(term50550, term50550.getClass(), "_arrayDelegateDeserializer", null);
        setField(term50550, term50550.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term50550, term50550.getClass(), "_nonStandardCreation", false);
        setBooleanField(term50550, term50550.getClass(), "_vanillaProcessing", false);
        setField(term50550, term50550.getClass(), "_beanProperties", null);
        setField(term50550, term50550.getClass(), "_injectables", null);
        setField(term50550, term50550.getClass(), "_anySetter", null);
        setField(term50550, term50550.getClass(), "_ignorableProps", null);
        setBooleanField(term50550, term50550.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term50550, term50550.getClass(), "_needViewProcesing", false);
        setField(term50550, term50550.getClass(), "_backRefs", null);
        setField(term50550, term50550.getClass(), "_subDeserializers", null);
        setField(term50550, term50550.getClass(), "_unwrappedPropertyHandler", null);
        setField(term50550, term50550.getClass(), "_externalTypeIdHandler", null);
        setField(term50550, term50550.getClass(), "_objectIdReader", null);
        setField(term50550, term50550.getClass(), "_valueClass", null);
        setField(term50545, term50545.getClass(), "_deserializer", term50550);
        setField(term50545, term50545.getClass(), "idProperty", null);
        setField(term50544, term50544.getClass(), "_objectIdReader", term50545);
        setField(term50544, term50544.getClass(), "_propName", term50547);
        setField(term50544, term50544.getClass(), "_type", term50546);
        setField(term50544, term50544.getClass(), "_wrapperName", null);
        setField(term50544, term50544.getClass(), "_contextAnnotations", null);
        setField(term50544, term50544.getClass(), "_valueDeserializer", term50550);
        setField(term50544, term50544.getClass(), "_valueTypeDeserializer", null);
        setField(term50544, term50544.getClass(), "_nullProvider", term50550);
        setField(term50544, term50544.getClass(), "_managedReferenceName", null);
        setField(term50544, term50544.getClass(), "_objectIdInfo", null);
        setField(term50544, term50544.getClass(), "_viewMatcher", null);
        setIntField(term50544, term50544.getClass(), "_propertyIndex", -1);
        setField(term50551, term50551.getClass(), "_required", null);
        setField(term50551, term50551.getClass(), "_description", null);
        setField(term50551, term50551.getClass(), "_index", null);
        setField(term50551, term50551.getClass(), "_defaultValue", null);
        setField(term50551, term50551.getClass(), "_mergeInfo", null);
        setField(term50551, term50551.getClass(), "_valueNulls", null);
        setField(term50551, term50551.getClass(), "_contentNulls", null);
        setField(term50544, term50544.getClass(), "_metadata", term50551);
        setField(term50544, term50544.getClass(), "_propertyFormat", null);
        setField(term50544, term50544.getClass(), "_aliases", null);
        term50552 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term50553 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term50554 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term50557 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(term50553, term50553.getClass(), "_keyType", null);
        setField(term50553, term50553.getClass(), "_valueType", null);
        setField(term50553, term50553.getClass(), "_superClass", null);
        setField(term50553, term50553.getClass(), "_superInterfaces", null);
        setField(term50553, term50553.getClass(), "_bindings", null);
        setField(term50553, term50553.getClass(), "_canonicalName", null);
        setField(term50553, term50553.getClass(), "_class", null);
        setIntField(term50553, term50553.getClass(), "_hash", 0);
        setField(term50553, term50553.getClass(), "_valueHandler", null);
        setField(term50553, term50553.getClass(), "_typeHandler", null);
        setBooleanField(term50553, term50553.getClass(), "_asStatic", false);
        setField(term50552, term50552.getClass(), "_idType", term50553);
        setField(term50554, term50554.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term50554, term50554.getClass(), "_namespace", null);
        setField(term50554, term50554.getClass(), "_encodedSimple", null);
        setField(term50552, term50552.getClass(), "propertyName", term50554);
        setField(term50552, term50552.getClass(), "generator", null);
        setField(term50552, term50552.getClass(), "resolver", null);
        setField(term50557, term50557.getClass(), "_nullFromCreator", null);
        setField(term50557, term50557.getClass(), "_currentlyTransforming", null);
        setField(term50557, term50557.getClass(), "_beanType", null);
        setField(term50557, term50557.getClass(), "_serializationShape", null);
        setField(term50557, term50557.getClass(), "_valueInstantiator", null);
        setField(term50557, term50557.getClass(), "_delegateDeserializer", null);
        setField(term50557, term50557.getClass(), "_arrayDelegateDeserializer", null);
        setField(term50557, term50557.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term50557, term50557.getClass(), "_nonStandardCreation", false);
        setBooleanField(term50557, term50557.getClass(), "_vanillaProcessing", false);
        setField(term50557, term50557.getClass(), "_beanProperties", null);
        setField(term50557, term50557.getClass(), "_injectables", null);
        setField(term50557, term50557.getClass(), "_anySetter", null);
        setField(term50557, term50557.getClass(), "_ignorableProps", null);
        setBooleanField(term50557, term50557.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term50557, term50557.getClass(), "_needViewProcesing", false);
        setField(term50557, term50557.getClass(), "_backRefs", null);
        setField(term50557, term50557.getClass(), "_subDeserializers", null);
        setField(term50557, term50557.getClass(), "_unwrappedPropertyHandler", null);
        setField(term50557, term50557.getClass(), "_externalTypeIdHandler", null);
        setField(term50557, term50557.getClass(), "_objectIdReader", null);
        setField(term50557, term50557.getClass(), "_valueClass", null);
        setField(term50552, term50552.getClass(), "_deserializer", term50557);
        setField(term50552, term50552.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term43700;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term50544));
        assertTrue(recursiveEquals(term43700, term50552));
    }

};


