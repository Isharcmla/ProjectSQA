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
import java.util.HashSet;
import java.util.HashMap;

public class BeanDeserializer_init_1678761736179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61050;

    public BeanDeserializer_init_1678761736179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61328 = Class.forName((String) "java.util.concurrent.locks.Lock");
        HashSet term61417 = new HashSet();
        Object term61310 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term61254 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object term61393 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(term61310, term61310.getClass(), "_valueClass", term61328);
        setField(term61310, term61310.getClass(), "_beanType", null);
        setField(term61310, term61310.getClass(), "_valueInstantiator", term61254);
        setField(term61310, term61310.getClass(), "_delegateDeserializer", term61310);
        setField(term61310, term61310.getClass(), "_propertyBasedCreator", term61393);
        setField(term61310, term61310.getClass(), "_backRefs", null);
        setField(term61310, term61310.getClass(), "_ignorableProps", term61417);
        Class<? extends Object> term61190 = Class.forName((String) "java.nio.file.Paths");
        HashMap term61465 = new HashMap();
        term61050 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term61154 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term61154, term61154.getClass(), "_class", term61190);
        setField(term61050, term61050.getClass(), "_beanType", term61154);
        setField(term61050, term61050.getClass(), "_valueInstantiator", term61254);
        setField(term61050, term61050.getClass(), "_delegateDeserializer", term61310);
        setField(term61050, term61050.getClass(), "_propertyBasedCreator", term61393);
        setField(term61050, term61050.getClass(), "_backRefs", term61465);
        setField(term61050, term61050.getClass(), "_ignorableProps", null);
        setBooleanField(term61050, term61050.getClass(), "_ignoreAllUnknown", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term61050;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


