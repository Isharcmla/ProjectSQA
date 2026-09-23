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
import java.util.HashSet;

public class BeanDeserializer_init_1678761736139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54112;
     Object term54520;

    public BeanDeserializer_init_1678761736139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term54000 = new HashSet();
        Object term53836 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term53952 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object[] term53634 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ValueInjector", 0);
        setField(term53836, term53836.getClass(), "_valueClass", null);
        setField(term53836, term53836.getClass(), "_classAnnotations", term53952);
        setField(term53836, term53836.getClass(), "_beanType", null);
        setField(term53836, term53836.getClass(), "_valueInstantiator", null);
        setField(term53836, term53836.getClass(), "_delegateDeserializer", null);
        setField(term53836, term53836.getClass(), "_propertyBasedCreator", null);
        setField(term53836, term53836.getClass(), "_backRefs", null);
        setField(term53836, term53836.getClass(), "_ignorableProps", term54000);
        setBooleanField(term53836, term53836.getClass(), "_ignoreAllUnknown", false);
        setField(term53836, term53836.getClass(), "_anySetter", null);
        setField(term53836, term53836.getClass(), "_injectables", term53634);
        setField(term53836, term53836.getClass(), "_objectIdReader", null);
        setBooleanField(term53836, term53836.getClass(), "_nonStandardCreation", false);
        HashSet term54276 = new HashSet();
        term54112 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term54228 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term54396 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term54112, term54112.getClass(), "_beanType", null);
        setField(term54112, term54112.getClass(), "_classAnnotations", term54228);
        setField(term54112, term54112.getClass(), "_valueInstantiator", null);
        setField(term54112, term54112.getClass(), "_delegateDeserializer", null);
        setField(term54112, term54112.getClass(), "_propertyBasedCreator", null);
        setField(term54112, term54112.getClass(), "_backRefs", null);
        setField(term54112, term54112.getClass(), "_ignorableProps", term54276);
        setField(term54112, term54112.getClass(), "_anySetter", null);
        setField(term54112, term54112.getClass(), "_injectables", null);
        setField(term54112, term54112.getClass(), "_objectIdReader", null);
        setBooleanField(term54112, term54112.getClass(), "_nonStandardCreation", false);
        setField(term54112, term54112.getClass(), "_unwrappedPropertyHandler", null);
        setField(term54112, term54112.getClass(), "_beanProperties", term54396);
        term54520 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term54112;
        args[1] = term54520;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


