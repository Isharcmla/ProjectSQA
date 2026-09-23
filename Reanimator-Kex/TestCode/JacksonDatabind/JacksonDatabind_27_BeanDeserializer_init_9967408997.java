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

public class BeanDeserializer_init_9967408997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27643;
     Object term27766;
     Object term27768;

    public BeanDeserializer_init_9967408997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27531 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term27643 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term27747 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term27643, term27643.getClass(), "_beanType", term27747);
        term27766 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term27767 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term27766, term27766.getClass(), "_classAnnotations", null);
        setField(term27767, term27767.getClass(), "_referencedType", null);
        setField(term27767, term27767.getClass(), "_typeParametersFor", null);
        setField(term27767, term27767.getClass(), "_typeParameters", null);
        setField(term27767, term27767.getClass(), "_typeNames", null);
        setField(term27767, term27767.getClass(), "_canonicalName", null);
        setField(term27767, term27767.getClass(), "_class", null);
        setIntField(term27767, term27767.getClass(), "_hash", 0);
        setField(term27767, term27767.getClass(), "_valueHandler", null);
        setField(term27767, term27767.getClass(), "_typeHandler", null);
        setBooleanField(term27767, term27767.getClass(), "_asStatic", false);
        setField(term27766, term27766.getClass(), "_beanType", term27767);
        setField(term27766, term27766.getClass(), "_serializationShape", null);
        setField(term27766, term27766.getClass(), "_valueInstantiator", null);
        setField(term27766, term27766.getClass(), "_delegateDeserializer", null);
        setField(term27766, term27766.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term27766, term27766.getClass(), "_nonStandardCreation", false);
        setBooleanField(term27766, term27766.getClass(), "_vanillaProcessing", false);
        setField(term27766, term27766.getClass(), "_beanProperties", null);
        setField(term27766, term27766.getClass(), "_injectables", null);
        setField(term27766, term27766.getClass(), "_anySetter", null);
        setField(term27766, term27766.getClass(), "_ignorableProps", null);
        setBooleanField(term27766, term27766.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term27766, term27766.getClass(), "_needViewProcesing", false);
        setField(term27766, term27766.getClass(), "_backRefs", null);
        setField(term27766, term27766.getClass(), "_subDeserializers", null);
        setField(term27766, term27766.getClass(), "_unwrappedPropertyHandler", null);
        setField(term27766, term27766.getClass(), "_externalTypeIdHandler", null);
        setField(term27766, term27766.getClass(), "_objectIdReader", null);
        setField(term27766, term27766.getClass(), "_valueClass", null);
        term27768 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term27769 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term27768, term27768.getClass(), "_classAnnotations", null);
        setField(term27769, term27769.getClass(), "_referencedType", null);
        setField(term27769, term27769.getClass(), "_typeParametersFor", null);
        setField(term27769, term27769.getClass(), "_typeParameters", null);
        setField(term27769, term27769.getClass(), "_typeNames", null);
        setField(term27769, term27769.getClass(), "_canonicalName", null);
        setField(term27769, term27769.getClass(), "_class", null);
        setIntField(term27769, term27769.getClass(), "_hash", 0);
        setField(term27769, term27769.getClass(), "_valueHandler", null);
        setField(term27769, term27769.getClass(), "_typeHandler", null);
        setBooleanField(term27769, term27769.getClass(), "_asStatic", false);
        setField(term27768, term27768.getClass(), "_beanType", term27769);
        setField(term27768, term27768.getClass(), "_serializationShape", null);
        setField(term27768, term27768.getClass(), "_valueInstantiator", null);
        setField(term27768, term27768.getClass(), "_delegateDeserializer", null);
        setField(term27768, term27768.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term27768, term27768.getClass(), "_nonStandardCreation", false);
        setBooleanField(term27768, term27768.getClass(), "_vanillaProcessing", false);
        setField(term27768, term27768.getClass(), "_beanProperties", null);
        setField(term27768, term27768.getClass(), "_injectables", null);
        setField(term27768, term27768.getClass(), "_anySetter", null);
        setField(term27768, term27768.getClass(), "_ignorableProps", null);
        setBooleanField(term27768, term27768.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term27768, term27768.getClass(), "_needViewProcesing", false);
        setField(term27768, term27768.getClass(), "_backRefs", null);
        setField(term27768, term27768.getClass(), "_subDeserializers", null);
        setField(term27768, term27768.getClass(), "_unwrappedPropertyHandler", null);
        setField(term27768, term27768.getClass(), "_externalTypeIdHandler", null);
        setField(term27768, term27768.getClass(), "_objectIdReader", null);
        setField(term27768, term27768.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term27643;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term27766));
        assertTrue(recursiveEquals(term27643, term27768));
    }

};


