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

public class BeanDeserializer_init_1678761736183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67795;

    public BeanDeserializer_init_1678761736183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68061 = Class.forName((String) "com.fasterxml.jackson.core.io.DataOutputAsStream");
        HashSet term68150 = new HashSet();
        Object term68043 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term67987 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object term68126 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(term68043, term68043.getClass(), "_valueClass", term68061);
        setField(term68043, term68043.getClass(), "_beanType", null);
        setField(term68043, term68043.getClass(), "_valueInstantiator", term67987);
        setField(term68043, term68043.getClass(), "_delegateDeserializer", term68043);
        setField(term68043, term68043.getClass(), "_propertyBasedCreator", term68126);
        setField(term68043, term68043.getClass(), "_backRefs", null);
        setField(term68043, term68043.getClass(), "_ignorableProps", term68150);
        Class<? extends Object> term67923 = Class.forName((String) "java.nio.charset.CharsetEncoder");
        HashMap term68198 = new HashMap();
        term67795 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term67887 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term67887, term67887.getClass(), "_class", term67923);
        setField(term67795, term67795.getClass(), "_beanType", term67887);
        setField(term67795, term67795.getClass(), "_valueInstantiator", term67987);
        setField(term67795, term67795.getClass(), "_delegateDeserializer", term68043);
        setField(term67795, term67795.getClass(), "_propertyBasedCreator", term68126);
        setField(term67795, term67795.getClass(), "_backRefs", term68198);
        setField(term67795, term67795.getClass(), "_ignorableProps", null);
        setBooleanField(term67795, term67795.getClass(), "_ignoreAllUnknown", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term67795;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


