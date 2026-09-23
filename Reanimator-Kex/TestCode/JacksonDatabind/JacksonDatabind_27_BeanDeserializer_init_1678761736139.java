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

public class BeanDeserializer_init_1678761736139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48768;
     Object term49865;
     Object term49875;

    public BeanDeserializer_init_1678761736139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48656 = Class.forName((String) "java.util.stream.SpinedBuffer$1Splitr");
        Object term48620 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term48620, term48620.getClass(), "_valueClass", term48656);
        setField(term48620, term48620.getClass(), "_classAnnotations", null);
        setField(term48620, term48620.getClass(), "_beanType", null);
        setField(term48620, term48620.getClass(), "_valueInstantiator", null);
        setField(term48620, term48620.getClass(), "_delegateDeserializer", null);
        setField(term48620, term48620.getClass(), "_propertyBasedCreator", null);
        setField(term48620, term48620.getClass(), "_backRefs", null);
        setField(term48620, term48620.getClass(), "_ignorableProps", null);
        Class<? extends Object> term48900 = Class.forName((String) "java.util.concurrent.ForkJoinWorkerThread$InnocuousForkJoinWorkerThread$1");
        term48768 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term48864 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term49016 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term48864, term48864.getClass(), "_class", term48900);
        setField(term48768, term48768.getClass(), "_beanType", term48864);
        setField(term48768, term48768.getClass(), "_classAnnotations", term49016);
        setField(term48768, term48768.getClass(), "_valueInstantiator", null);
        setField(term48768, term48768.getClass(), "_delegateDeserializer", null);
        setField(term48768, term48768.getClass(), "_propertyBasedCreator", null);
        setField(term48768, term48768.getClass(), "_backRefs", null);
        setField(term48768, term48768.getClass(), "_ignorableProps", null);
        setBooleanField(term48768, term48768.getClass(), "_ignoreAllUnknown", true);
        Class<? extends Object> term49868 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.RawSerializer");
        term49865 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term49866 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term49867 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term49866, term49866.getClass(), "_annotations", null);
        setField(term49865, term49865.getClass(), "_classAnnotations", term49866);
        setField(term49867, term49867.getClass(), "_componentType", null);
        setField(term49867, term49867.getClass(), "_emptyArray", null);
        setField(term49867, term49867.getClass(), "_canonicalName", null);
        setField(term49867, term49867.getClass(), "_class", term49868);
        setIntField(term49867, term49867.getClass(), "_hash", 0);
        setField(term49867, term49867.getClass(), "_valueHandler", null);
        setField(term49867, term49867.getClass(), "_typeHandler", null);
        setBooleanField(term49867, term49867.getClass(), "_asStatic", false);
        setField(term49865, term49865.getClass(), "_beanType", term49867);
        setField(term49865, term49865.getClass(), "_serializationShape", null);
        setField(term49865, term49865.getClass(), "_valueInstantiator", null);
        setField(term49865, term49865.getClass(), "_delegateDeserializer", null);
        setField(term49865, term49865.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term49865, term49865.getClass(), "_nonStandardCreation", false);
        setBooleanField(term49865, term49865.getClass(), "_vanillaProcessing", false);
        setField(term49865, term49865.getClass(), "_beanProperties", null);
        setField(term49865, term49865.getClass(), "_injectables", null);
        setField(term49865, term49865.getClass(), "_anySetter", null);
        setField(term49865, term49865.getClass(), "_ignorableProps", null);
        setBooleanField(term49865, term49865.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term49865, term49865.getClass(), "_needViewProcesing", false);
        setField(term49865, term49865.getClass(), "_backRefs", null);
        setField(term49865, term49865.getClass(), "_subDeserializers", null);
        setField(term49865, term49865.getClass(), "_unwrappedPropertyHandler", null);
        setField(term49865, term49865.getClass(), "_externalTypeIdHandler", null);
        setField(term49865, term49865.getClass(), "_objectIdReader", null);
        setField(term49865, term49865.getClass(), "_valueClass", term49868);
        Class<? extends Object> term49878 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.RawSerializer");
        term49875 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term49876 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term49877 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term49876, term49876.getClass(), "_annotations", null);
        setField(term49875, term49875.getClass(), "_classAnnotations", term49876);
        setField(term49877, term49877.getClass(), "_componentType", null);
        setField(term49877, term49877.getClass(), "_emptyArray", null);
        setField(term49877, term49877.getClass(), "_canonicalName", null);
        setField(term49877, term49877.getClass(), "_class", term49878);
        setIntField(term49877, term49877.getClass(), "_hash", 0);
        setField(term49877, term49877.getClass(), "_valueHandler", null);
        setField(term49877, term49877.getClass(), "_typeHandler", null);
        setBooleanField(term49877, term49877.getClass(), "_asStatic", false);
        setField(term49875, term49875.getClass(), "_beanType", term49877);
        setField(term49875, term49875.getClass(), "_serializationShape", null);
        setField(term49875, term49875.getClass(), "_valueInstantiator", null);
        setField(term49875, term49875.getClass(), "_delegateDeserializer", null);
        setField(term49875, term49875.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term49875, term49875.getClass(), "_nonStandardCreation", false);
        setBooleanField(term49875, term49875.getClass(), "_vanillaProcessing", false);
        setField(term49875, term49875.getClass(), "_beanProperties", null);
        setField(term49875, term49875.getClass(), "_injectables", null);
        setField(term49875, term49875.getClass(), "_anySetter", null);
        setField(term49875, term49875.getClass(), "_ignorableProps", null);
        setBooleanField(term49875, term49875.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term49875, term49875.getClass(), "_needViewProcesing", false);
        setField(term49875, term49875.getClass(), "_backRefs", null);
        setField(term49875, term49875.getClass(), "_subDeserializers", null);
        setField(term49875, term49875.getClass(), "_unwrappedPropertyHandler", null);
        setField(term49875, term49875.getClass(), "_externalTypeIdHandler", null);
        setField(term49875, term49875.getClass(), "_objectIdReader", null);
        setField(term49875, term49875.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term48768;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term49865));
        assertTrue(recursiveEquals(term48768, term49875));
    }

};


