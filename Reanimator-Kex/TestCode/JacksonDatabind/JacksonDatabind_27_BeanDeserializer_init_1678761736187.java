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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BeanDeserializer_init_1678761736187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105236;

    public BeanDeserializer_init_1678761736187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term105124 = Class.forName((String) "com.fasterxml.jackson.core.format.MatchStrength");
        Object term105088 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term105088, term105088.getClass(), "_valueClass", term105124);
        setField(term105088, term105088.getClass(), "_classAnnotations", null);
        setField(term105088, term105088.getClass(), "_beanType", null);
        setField(term105088, term105088.getClass(), "_valueInstantiator", null);
        setField(term105088, term105088.getClass(), "_delegateDeserializer", null);
        setField(term105088, term105088.getClass(), "_propertyBasedCreator", null);
        setField(term105088, term105088.getClass(), "_backRefs", null);
        setField(term105088, term105088.getClass(), "_ignorableProps", null);
        Class<? extends Object> term105376 = Class.forName((String) "java.util.concurrent.ThreadPoolExecutor$DiscardPolicy");
        term105236 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term105340 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term105492 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term105340, term105340.getClass(), "_class", term105376);
        setField(term105236, term105236.getClass(), "_beanType", term105340);
        setField(term105236, term105236.getClass(), "_classAnnotations", term105492);
        setField(term105236, term105236.getClass(), "_valueInstantiator", null);
        setField(term105236, term105236.getClass(), "_delegateDeserializer", null);
        setField(term105236, term105236.getClass(), "_propertyBasedCreator", null);
        setField(term105236, term105236.getClass(), "_backRefs", null);
        setField(term105236, term105236.getClass(), "_ignorableProps", null);
        setBooleanField(term105236, term105236.getClass(), "_ignoreAllUnknown", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term105236;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


