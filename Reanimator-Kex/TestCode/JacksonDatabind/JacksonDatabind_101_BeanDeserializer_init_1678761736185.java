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

public class BeanDeserializer_init_1678761736185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70624;

    public BeanDeserializer_init_1678761736185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term70898 = Class.forName((String) "com.fasterxml.jackson.databind.deser.BeanDeserializerModifier");
        HashSet term70987 = new HashSet();
        Object term70880 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term70824 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        Object term70963 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(term70880, term70880.getClass(), "_valueClass", term70898);
        setField(term70880, term70880.getClass(), "_beanType", null);
        setField(term70880, term70880.getClass(), "_valueInstantiator", term70824);
        setField(term70880, term70880.getClass(), "_delegateDeserializer", term70880);
        setField(term70880, term70880.getClass(), "_propertyBasedCreator", term70963);
        setField(term70880, term70880.getClass(), "_backRefs", null);
        setField(term70880, term70880.getClass(), "_ignorableProps", term70987);
        Class<? extends Object> term70756 = Class.forName((String) "kex.java.util.LinkedHashMap$LinkedEntryIterator");
        HashMap term71035 = new HashMap();
        term70624 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term70720 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term70720, term70720.getClass(), "_class", term70756);
        setField(term70624, term70624.getClass(), "_beanType", term70720);
        setField(term70624, term70624.getClass(), "_valueInstantiator", term70824);
        setField(term70624, term70624.getClass(), "_delegateDeserializer", term70880);
        setField(term70624, term70624.getClass(), "_propertyBasedCreator", term70963);
        setField(term70624, term70624.getClass(), "_backRefs", term71035);
        setField(term70624, term70624.getClass(), "_ignorableProps", null);
        setBooleanField(term70624, term70624.getClass(), "_ignoreAllUnknown", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term70624;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


