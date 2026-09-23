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

public class BeanDeserializer_init_1678761736197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105468;
     Object term105886;

    public BeanDeserializer_init_1678761736197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term105338 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term105338, term105338.getClass(), "_valueClass", null);
        setField(term105338, term105338.getClass(), "_classAnnotations", null);
        setField(term105338, term105338.getClass(), "_beanType", null);
        setField(term105338, term105338.getClass(), "_valueInstantiator", null);
        setField(term105338, term105338.getClass(), "_delegateDeserializer", null);
        setField(term105338, term105338.getClass(), "_propertyBasedCreator", null);
        setField(term105338, term105338.getClass(), "_backRefs", null);
        setField(term105338, term105338.getClass(), "_ignorableProps", null);
        setBooleanField(term105338, term105338.getClass(), "_ignoreAllUnknown", false);
        setField(term105338, term105338.getClass(), "_anySetter", null);
        setField(term105338, term105338.getClass(), "_injectables", null);
        setField(term105338, term105338.getClass(), "_objectIdReader", null);
        setBooleanField(term105338, term105338.getClass(), "_nonStandardCreation", false);
        ArrayList term105774 = new ArrayList();
        term105468 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Object term105584 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term105722 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        setField(term105468, term105468.getClass(), "_beanType", null);
        setField(term105468, term105468.getClass(), "_classAnnotations", term105584);
        setField(term105468, term105468.getClass(), "_valueInstantiator", null);
        setField(term105468, term105468.getClass(), "_delegateDeserializer", null);
        setField(term105468, term105468.getClass(), "_propertyBasedCreator", null);
        setField(term105468, term105468.getClass(), "_backRefs", null);
        setField(term105468, term105468.getClass(), "_ignorableProps", null);
        setField(term105468, term105468.getClass(), "_anySetter", null);
        setField(term105468, term105468.getClass(), "_injectables", null);
        setField(term105468, term105468.getClass(), "_objectIdReader", null);
        setBooleanField(term105468, term105468.getClass(), "_nonStandardCreation", false);
        setField(term105722, term105722.getClass(), "_properties", term105774);
        setField(term105468, term105468.getClass(), "_unwrappedPropertyHandler", term105722);
        term105886 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term105468;
        args[1] = term105886;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


