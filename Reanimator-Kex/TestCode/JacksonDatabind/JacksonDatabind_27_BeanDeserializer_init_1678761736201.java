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
import java.util.ArrayList;

public class BeanDeserializer_init_1678761736201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124274;
     Object term124722;

    public BeanDeserializer_init_1678761736201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term123928 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term124044 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term124162 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(term123928, term123928.getClass(), "_valueClass", null);
        setField(term123928, term123928.getClass(), "_classAnnotations", term124044);
        setField(term123928, term123928.getClass(), "_beanType", null);
        setField(term123928, term123928.getClass(), "_valueInstantiator", null);
        setField(term123928, term123928.getClass(), "_delegateDeserializer", null);
        setField(term123928, term123928.getClass(), "_propertyBasedCreator", null);
        setField(term123928, term123928.getClass(), "_backRefs", null);
        setField(term123928, term123928.getClass(), "_ignorableProps", null);
        setBooleanField(term123928, term123928.getClass(), "_ignoreAllUnknown", false);
        setField(term123928, term123928.getClass(), "_anySetter", null);
        setField(term123928, term123928.getClass(), "_injectables", null);
        setField(term123928, term123928.getClass(), "_objectIdReader", term124162);
        setBooleanField(term123928, term123928.getClass(), "_nonStandardCreation", false);
        ArrayList term124584 = new ArrayList();
        term124274 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term124394 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumDeserializer"));
        Object term124532 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        setField(term124274, term124274.getClass(), "_beanType", null);
        setField(term124274, term124274.getClass(), "_classAnnotations", null);
        setField(term124274, term124274.getClass(), "_valueInstantiator", null);
        setField(term124274, term124274.getClass(), "_delegateDeserializer", term124394);
        setField(term124274, term124274.getClass(), "_propertyBasedCreator", null);
        setField(term124274, term124274.getClass(), "_backRefs", null);
        setField(term124274, term124274.getClass(), "_ignorableProps", null);
        setField(term124274, term124274.getClass(), "_anySetter", null);
        setField(term124274, term124274.getClass(), "_injectables", null);
        setField(term124274, term124274.getClass(), "_objectIdReader", null);
        setBooleanField(term124274, term124274.getClass(), "_nonStandardCreation", false);
        setField(term124532, term124532.getClass(), "_properties", term124584);
        setField(term124274, term124274.getClass(), "_unwrappedPropertyHandler", term124532);
        term124722 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term124274;
        args[1] = term124722;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


