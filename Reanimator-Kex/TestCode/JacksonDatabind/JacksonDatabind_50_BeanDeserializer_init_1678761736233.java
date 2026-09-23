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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BeanDeserializer_init_1678761736233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149815;
     Object term150295;

    public BeanDeserializer_init_1678761736233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term149561 = Class.forName((String) "java.nio.charset.CharacterCodingException");
        Object term149525 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term149679 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(term149525, term149525.getClass(), "_valueClass", term149561);
        setField(term149525, term149525.getClass(), "_classAnnotations", null);
        setField(term149525, term149525.getClass(), "_beanType", null);
        setField(term149525, term149525.getClass(), "_valueInstantiator", null);
        setField(term149525, term149525.getClass(), "_delegateDeserializer", null);
        setField(term149525, term149525.getClass(), "_propertyBasedCreator", null);
        setField(term149525, term149525.getClass(), "_backRefs", null);
        setField(term149525, term149525.getClass(), "_ignorableProps", null);
        setBooleanField(term149525, term149525.getClass(), "_ignoreAllUnknown", false);
        setField(term149525, term149525.getClass(), "_anySetter", null);
        setField(term149525, term149525.getClass(), "_injectables", null);
        setField(term149525, term149525.getClass(), "_objectIdReader", term149679);
        setBooleanField(term149525, term149525.getClass(), "_nonStandardCreation", false);
        term149815 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        Object term149921 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term150037 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term150157 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term149921, term149921.getClass(), "_class", null);
        setField(term149815, term149815.getClass(), "_beanType", term149921);
        setField(term149815, term149815.getClass(), "_classAnnotations", term150037);
        setField(term149815, term149815.getClass(), "_valueInstantiator", null);
        setField(term149815, term149815.getClass(), "_delegateDeserializer", null);
        setField(term149815, term149815.getClass(), "_propertyBasedCreator", null);
        setField(term149815, term149815.getClass(), "_backRefs", null);
        setField(term149815, term149815.getClass(), "_ignorableProps", null);
        setField(term149815, term149815.getClass(), "_anySetter", null);
        setField(term149815, term149815.getClass(), "_injectables", null);
        setField(term149815, term149815.getClass(), "_objectIdReader", null);
        setBooleanField(term149815, term149815.getClass(), "_nonStandardCreation", false);
        setField(term149815, term149815.getClass(), "_unwrappedPropertyHandler", null);
        setField(term149815, term149815.getClass(), "_beanProperties", term150157);
        term150295 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term149815;
        args[1] = term150295;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


