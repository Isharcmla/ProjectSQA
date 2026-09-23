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

public class BeanDeserializer_init_1678761736130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30065;

    public BeanDeserializer_init_1678761736130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29833 = Class.forName((String) "java.lang.invoke.ConstantGroup$1");
        Object term29797 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term29953 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term29797, term29797.getClass(), "_valueClass", term29833);
        setField(term29797, term29797.getClass(), "_beanType", term29953);
        setField(term29797, term29797.getClass(), "_valueInstantiator", null);
        setField(term29797, term29797.getClass(), "_delegateDeserializer", null);
        setField(term29797, term29797.getClass(), "_propertyBasedCreator", null);
        setField(term29797, term29797.getClass(), "_backRefs", null);
        setField(term29797, term29797.getClass(), "_ignorableProps", null);
        Class<? extends Object> term30215 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.MemberKey");
        term30065 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term30179 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term30377 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$LongDeser"));
        setField(term30179, term30179.getClass(), "_class", term30215);
        setField(term30065, term30065.getClass(), "_beanType", term30179);
        setField(term30065, term30065.getClass(), "_valueInstantiator", null);
        setField(term30065, term30065.getClass(), "_delegateDeserializer", term30377);
        setField(term30065, term30065.getClass(), "_propertyBasedCreator", null);
        setField(term30065, term30065.getClass(), "_backRefs", null);
        setField(term30065, term30065.getClass(), "_ignorableProps", null);
        setBooleanField(term30065, term30065.getClass(), "_ignoreAllUnknown", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term30065;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


