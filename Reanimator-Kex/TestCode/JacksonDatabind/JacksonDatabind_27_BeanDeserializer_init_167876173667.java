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

public class BeanDeserializer_init_167876173667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9958;
     Object term10077;
     Object term10079;

    public BeanDeserializer_init_167876173667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9846 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term9958 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term10056 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term9958, term9958.getClass(), "_beanType", term10056);
        term10077 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term10078 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term10077, term10077.getClass(), "_classAnnotations", null);
        setField(term10078, term10078.getClass(), "_typeParametersFor", null);
        setField(term10078, term10078.getClass(), "_typeParameters", null);
        setField(term10078, term10078.getClass(), "_typeNames", null);
        setField(term10078, term10078.getClass(), "_canonicalName", null);
        setField(term10078, term10078.getClass(), "_class", null);
        setIntField(term10078, term10078.getClass(), "_hash", 0);
        setField(term10078, term10078.getClass(), "_valueHandler", null);
        setField(term10078, term10078.getClass(), "_typeHandler", null);
        setBooleanField(term10078, term10078.getClass(), "_asStatic", false);
        setField(term10077, term10077.getClass(), "_beanType", term10078);
        setField(term10077, term10077.getClass(), "_serializationShape", null);
        setField(term10077, term10077.getClass(), "_valueInstantiator", null);
        setField(term10077, term10077.getClass(), "_delegateDeserializer", null);
        setField(term10077, term10077.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term10077, term10077.getClass(), "_nonStandardCreation", false);
        setBooleanField(term10077, term10077.getClass(), "_vanillaProcessing", false);
        setField(term10077, term10077.getClass(), "_beanProperties", null);
        setField(term10077, term10077.getClass(), "_injectables", null);
        setField(term10077, term10077.getClass(), "_anySetter", null);
        setField(term10077, term10077.getClass(), "_ignorableProps", null);
        setBooleanField(term10077, term10077.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term10077, term10077.getClass(), "_needViewProcesing", false);
        setField(term10077, term10077.getClass(), "_backRefs", null);
        setField(term10077, term10077.getClass(), "_subDeserializers", null);
        setField(term10077, term10077.getClass(), "_unwrappedPropertyHandler", null);
        setField(term10077, term10077.getClass(), "_externalTypeIdHandler", null);
        setField(term10077, term10077.getClass(), "_objectIdReader", null);
        setField(term10077, term10077.getClass(), "_valueClass", null);
        term10079 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term10080 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term10079, term10079.getClass(), "_classAnnotations", null);
        setField(term10080, term10080.getClass(), "_typeParametersFor", null);
        setField(term10080, term10080.getClass(), "_typeParameters", null);
        setField(term10080, term10080.getClass(), "_typeNames", null);
        setField(term10080, term10080.getClass(), "_canonicalName", null);
        setField(term10080, term10080.getClass(), "_class", null);
        setIntField(term10080, term10080.getClass(), "_hash", 0);
        setField(term10080, term10080.getClass(), "_valueHandler", null);
        setField(term10080, term10080.getClass(), "_typeHandler", null);
        setBooleanField(term10080, term10080.getClass(), "_asStatic", false);
        setField(term10079, term10079.getClass(), "_beanType", term10080);
        setField(term10079, term10079.getClass(), "_serializationShape", null);
        setField(term10079, term10079.getClass(), "_valueInstantiator", null);
        setField(term10079, term10079.getClass(), "_delegateDeserializer", null);
        setField(term10079, term10079.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term10079, term10079.getClass(), "_nonStandardCreation", false);
        setBooleanField(term10079, term10079.getClass(), "_vanillaProcessing", false);
        setField(term10079, term10079.getClass(), "_beanProperties", null);
        setField(term10079, term10079.getClass(), "_injectables", null);
        setField(term10079, term10079.getClass(), "_anySetter", null);
        setField(term10079, term10079.getClass(), "_ignorableProps", null);
        setBooleanField(term10079, term10079.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term10079, term10079.getClass(), "_needViewProcesing", false);
        setField(term10079, term10079.getClass(), "_backRefs", null);
        setField(term10079, term10079.getClass(), "_subDeserializers", null);
        setField(term10079, term10079.getClass(), "_unwrappedPropertyHandler", null);
        setField(term10079, term10079.getClass(), "_externalTypeIdHandler", null);
        setField(term10079, term10079.getClass(), "_objectIdReader", null);
        setField(term10079, term10079.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term9958;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10077));
        assertTrue(recursiveEquals(term9958, term10079));
    }

};


