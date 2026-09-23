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

public class BeanDeserializer_init_1678761736161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70427;
     Object term70823;

    public BeanDeserializer_init_1678761736161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term70315 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonAutoDetect$1");
        Object term70279 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term70279, term70279.getClass(), "_valueClass", term70315);
        setField(term70279, term70279.getClass(), "_classAnnotations", null);
        setField(term70279, term70279.getClass(), "_beanType", null);
        setField(term70279, term70279.getClass(), "_valueInstantiator", null);
        setField(term70279, term70279.getClass(), "_delegateDeserializer", null);
        setField(term70279, term70279.getClass(), "_propertyBasedCreator", null);
        setField(term70279, term70279.getClass(), "_backRefs", null);
        setField(term70279, term70279.getClass(), "_ignorableProps", null);
        Class<? extends Object> term70569 = Class.forName((String) "java.nio.channels.AsynchronousChannelGroup");
        term70427 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term70533 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term70685 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term70533, term70533.getClass(), "_class", term70569);
        setField(term70427, term70427.getClass(), "_beanType", term70533);
        setField(term70427, term70427.getClass(), "_classAnnotations", term70685);
        setField(term70427, term70427.getClass(), "_valueInstantiator", null);
        setField(term70427, term70427.getClass(), "_delegateDeserializer", null);
        setField(term70427, term70427.getClass(), "_propertyBasedCreator", null);
        setField(term70427, term70427.getClass(), "_backRefs", null);
        setField(term70427, term70427.getClass(), "_ignorableProps", null);
        term70823 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term70427;
        args[1] = term70823;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


