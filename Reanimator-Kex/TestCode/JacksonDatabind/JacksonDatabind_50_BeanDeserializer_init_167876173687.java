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
import java.util.HashSet;

public class BeanDeserializer_init_167876173687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16019;
     Object term16431;

    public BeanDeserializer_init_167876173687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15657 = Class.forName((String) "java.util.TreeMap$AscendingSubMap$AscendingEntrySetView");
        Object term15621 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term15753 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term15889 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term15621, term15621.getClass(), "_valueClass", term15657);
        setField(term15621, term15621.getClass(), "_classAnnotations", null);
        setField(term15621, term15621.getClass(), "_beanType", term15753);
        setField(term15621, term15621.getClass(), "_valueInstantiator", term15889);
        setField(term15621, term15621.getClass(), "_delegateDeserializer", null);
        setField(term15621, term15621.getClass(), "_propertyBasedCreator", null);
        setField(term15621, term15621.getClass(), "_backRefs", null);
        setField(term15621, term15621.getClass(), "_ignorableProps", null);
        HashSet term16319 = new HashSet();
        term16019 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Object term16135 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term16271 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term16019, term16019.getClass(), "_beanType", null);
        setField(term16019, term16019.getClass(), "_classAnnotations", term16135);
        setField(term16019, term16019.getClass(), "_valueInstantiator", term16271);
        setField(term16019, term16019.getClass(), "_delegateDeserializer", null);
        setField(term16019, term16019.getClass(), "_propertyBasedCreator", null);
        setField(term16019, term16019.getClass(), "_backRefs", null);
        setField(term16019, term16019.getClass(), "_ignorableProps", term16319);
        term16431 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term16019;
        args[1] = term16431;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


