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

public class BeanDeserializer_init_1678761736167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45256;
     Object term45518;

    public BeanDeserializer_init_1678761736167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45144 = Class.forName((String) "java.util.PrimitiveIterator");
        Object term45108 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term45108, term45108.getClass(), "_valueClass", term45144);
        setField(term45108, term45108.getClass(), "_beanType", null);
        setField(term45108, term45108.getClass(), "_valueInstantiator", null);
        setField(term45108, term45108.getClass(), "_delegateDeserializer", null);
        setField(term45108, term45108.getClass(), "_propertyBasedCreator", null);
        setField(term45108, term45108.getClass(), "_backRefs", null);
        setField(term45108, term45108.getClass(), "_ignorableProps", null);
        Class<? extends Object> term45406 = Class.forName((String) "java.util.stream.MatchOps$3MatchSink");
        term45256 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term45370 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term45370, term45370.getClass(), "_class", term45406);
        setField(term45256, term45256.getClass(), "_beanType", term45370);
        setField(term45256, term45256.getClass(), "_valueInstantiator", null);
        setField(term45256, term45256.getClass(), "_delegateDeserializer", null);
        setField(term45256, term45256.getClass(), "_propertyBasedCreator", null);
        setField(term45256, term45256.getClass(), "_backRefs", null);
        setField(term45256, term45256.getClass(), "_ignorableProps", null);
        term45518 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term45256;
        args[1] = term45518;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


