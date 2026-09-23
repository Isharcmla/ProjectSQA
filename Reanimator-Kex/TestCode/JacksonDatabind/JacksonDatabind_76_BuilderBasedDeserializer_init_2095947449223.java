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

public class BuilderBasedDeserializer_init_2095947449223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133650;
     Object term134804;
     Object term134815;

    public BuilderBasedDeserializer_init_2095947449223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term133338 = Class.forName((String) "java.lang.invoke.DirectMethodHandle$EnsureInitialized");
        HashMap term133522 = new HashMap();
        Object term133302 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term133474 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term133302, term133302.getClass(), "_valueClass", term133338);
        setField(term133302, term133302.getClass(), "_classAnnotations", null);
        setField(term133302, term133302.getClass(), "_beanType", null);
        setField(term133302, term133302.getClass(), "_valueInstantiator", term133474);
        setField(term133302, term133302.getClass(), "_delegateDeserializer", null);
        setField(term133302, term133302.getClass(), "_propertyBasedCreator", null);
        setField(term133302, term133302.getClass(), "_backRefs", term133522);
        setField(term133302, term133302.getClass(), "_ignorableProps", null);
        Class<? extends Object> term133778 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeParser$MyTokenizer");
        term133650 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term133742 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term133894 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term134022 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term133742, term133742.getClass(), "_class", term133778);
        setField(term133650, term133650.getClass(), "_beanType", term133742);
        setField(term133650, term133650.getClass(), "_classAnnotations", term133894);
        setField(term133650, term133650.getClass(), "_valueInstantiator", null);
        setField(term133650, term133650.getClass(), "_delegateDeserializer", term134022);
        setField(term133650, term133650.getClass(), "_propertyBasedCreator", null);
        setField(term133650, term133650.getClass(), "_backRefs", null);
        setField(term133650, term133650.getClass(), "_ignorableProps", null);
        setBooleanField(term133650, term133650.getClass(), "_ignoreAllUnknown", true);
        Class<? extends Object> term134807 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value");
        term134804 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term134805 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term134806 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term134814 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term134804, term134804.getClass(), "_buildMethod", null);
        setField(term134805, term134805.getClass(), "_annotations", null);
        setField(term134804, term134804.getClass(), "_classAnnotations", term134805);
        setField(term134806, term134806.getClass(), "_keyType", null);
        setField(term134806, term134806.getClass(), "_valueType", null);
        setField(term134806, term134806.getClass(), "_superClass", null);
        setField(term134806, term134806.getClass(), "_superInterfaces", null);
        setField(term134806, term134806.getClass(), "_bindings", null);
        setField(term134806, term134806.getClass(), "_canonicalName", null);
        setField(term134806, term134806.getClass(), "_class", term134807);
        setIntField(term134806, term134806.getClass(), "_hash", 0);
        setField(term134806, term134806.getClass(), "_valueHandler", null);
        setField(term134806, term134806.getClass(), "_typeHandler", null);
        setBooleanField(term134806, term134806.getClass(), "_asStatic", false);
        setField(term134804, term134804.getClass(), "_beanType", term134806);
        setField(term134804, term134804.getClass(), "_serializationShape", null);
        setField(term134804, term134804.getClass(), "_valueInstantiator", null);
        setField(term134814, term134814.getClass(), "_buildMethod", null);
        setField(term134814, term134814.getClass(), "_classAnnotations", null);
        setField(term134814, term134814.getClass(), "_beanType", null);
        setField(term134814, term134814.getClass(), "_serializationShape", null);
        setField(term134814, term134814.getClass(), "_valueInstantiator", null);
        setField(term134814, term134814.getClass(), "_delegateDeserializer", null);
        setField(term134814, term134814.getClass(), "_arrayDelegateDeserializer", null);
        setField(term134814, term134814.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term134814, term134814.getClass(), "_nonStandardCreation", false);
        setBooleanField(term134814, term134814.getClass(), "_vanillaProcessing", false);
        setField(term134814, term134814.getClass(), "_beanProperties", null);
        setField(term134814, term134814.getClass(), "_injectables", null);
        setField(term134814, term134814.getClass(), "_anySetter", null);
        setField(term134814, term134814.getClass(), "_ignorableProps", null);
        setBooleanField(term134814, term134814.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term134814, term134814.getClass(), "_needViewProcesing", false);
        setField(term134814, term134814.getClass(), "_backRefs", null);
        setField(term134814, term134814.getClass(), "_subDeserializers", null);
        setField(term134814, term134814.getClass(), "_unwrappedPropertyHandler", null);
        setField(term134814, term134814.getClass(), "_externalTypeIdHandler", null);
        setField(term134814, term134814.getClass(), "_objectIdReader", null);
        setField(term134814, term134814.getClass(), "_valueClass", null);
        setField(term134804, term134804.getClass(), "_delegateDeserializer", term134814);
        setField(term134804, term134804.getClass(), "_arrayDelegateDeserializer", null);
        setField(term134804, term134804.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term134804, term134804.getClass(), "_nonStandardCreation", false);
        setBooleanField(term134804, term134804.getClass(), "_vanillaProcessing", false);
        setField(term134804, term134804.getClass(), "_beanProperties", null);
        setField(term134804, term134804.getClass(), "_injectables", null);
        setField(term134804, term134804.getClass(), "_anySetter", null);
        setField(term134804, term134804.getClass(), "_ignorableProps", null);
        setBooleanField(term134804, term134804.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term134804, term134804.getClass(), "_needViewProcesing", false);
        setField(term134804, term134804.getClass(), "_backRefs", null);
        setField(term134804, term134804.getClass(), "_subDeserializers", null);
        setField(term134804, term134804.getClass(), "_unwrappedPropertyHandler", null);
        setField(term134804, term134804.getClass(), "_externalTypeIdHandler", null);
        setField(term134804, term134804.getClass(), "_objectIdReader", null);
        setField(term134804, term134804.getClass(), "_valueClass", term134807);
        Class<? extends Object> term134818 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value");
        term134815 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term134816 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term134817 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term134825 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term134815, term134815.getClass(), "_buildMethod", null);
        setField(term134816, term134816.getClass(), "_annotations", null);
        setField(term134815, term134815.getClass(), "_classAnnotations", term134816);
        setField(term134817, term134817.getClass(), "_keyType", null);
        setField(term134817, term134817.getClass(), "_valueType", null);
        setField(term134817, term134817.getClass(), "_superClass", null);
        setField(term134817, term134817.getClass(), "_superInterfaces", null);
        setField(term134817, term134817.getClass(), "_bindings", null);
        setField(term134817, term134817.getClass(), "_canonicalName", null);
        setField(term134817, term134817.getClass(), "_class", term134818);
        setIntField(term134817, term134817.getClass(), "_hash", 0);
        setField(term134817, term134817.getClass(), "_valueHandler", null);
        setField(term134817, term134817.getClass(), "_typeHandler", null);
        setBooleanField(term134817, term134817.getClass(), "_asStatic", false);
        setField(term134815, term134815.getClass(), "_beanType", term134817);
        setField(term134815, term134815.getClass(), "_serializationShape", null);
        setField(term134815, term134815.getClass(), "_valueInstantiator", null);
        setField(term134825, term134825.getClass(), "_buildMethod", null);
        setField(term134825, term134825.getClass(), "_classAnnotations", null);
        setField(term134825, term134825.getClass(), "_beanType", null);
        setField(term134825, term134825.getClass(), "_serializationShape", null);
        setField(term134825, term134825.getClass(), "_valueInstantiator", null);
        setField(term134825, term134825.getClass(), "_delegateDeserializer", null);
        setField(term134825, term134825.getClass(), "_arrayDelegateDeserializer", null);
        setField(term134825, term134825.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term134825, term134825.getClass(), "_nonStandardCreation", false);
        setBooleanField(term134825, term134825.getClass(), "_vanillaProcessing", false);
        setField(term134825, term134825.getClass(), "_beanProperties", null);
        setField(term134825, term134825.getClass(), "_injectables", null);
        setField(term134825, term134825.getClass(), "_anySetter", null);
        setField(term134825, term134825.getClass(), "_ignorableProps", null);
        setBooleanField(term134825, term134825.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term134825, term134825.getClass(), "_needViewProcesing", false);
        setField(term134825, term134825.getClass(), "_backRefs", null);
        setField(term134825, term134825.getClass(), "_subDeserializers", null);
        setField(term134825, term134825.getClass(), "_unwrappedPropertyHandler", null);
        setField(term134825, term134825.getClass(), "_externalTypeIdHandler", null);
        setField(term134825, term134825.getClass(), "_objectIdReader", null);
        setField(term134825, term134825.getClass(), "_valueClass", null);
        setField(term134815, term134815.getClass(), "_delegateDeserializer", term134825);
        setField(term134815, term134815.getClass(), "_arrayDelegateDeserializer", null);
        setField(term134815, term134815.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term134815, term134815.getClass(), "_nonStandardCreation", false);
        setBooleanField(term134815, term134815.getClass(), "_vanillaProcessing", false);
        setField(term134815, term134815.getClass(), "_beanProperties", null);
        setField(term134815, term134815.getClass(), "_injectables", null);
        setField(term134815, term134815.getClass(), "_anySetter", null);
        setField(term134815, term134815.getClass(), "_ignorableProps", null);
        setBooleanField(term134815, term134815.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term134815, term134815.getClass(), "_needViewProcesing", false);
        setField(term134815, term134815.getClass(), "_backRefs", null);
        setField(term134815, term134815.getClass(), "_subDeserializers", null);
        setField(term134815, term134815.getClass(), "_unwrappedPropertyHandler", null);
        setField(term134815, term134815.getClass(), "_externalTypeIdHandler", null);
        setField(term134815, term134815.getClass(), "_objectIdReader", null);
        setField(term134815, term134815.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term133650;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term134804));
        assertTrue(recursiveEquals(term133650, term134815));
    }

};


