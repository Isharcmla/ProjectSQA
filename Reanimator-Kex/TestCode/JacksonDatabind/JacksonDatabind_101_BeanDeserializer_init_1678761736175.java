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

public class BeanDeserializer_init_1678761736175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55138;
     Object term55404;

    public BeanDeserializer_init_1678761736175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term55026 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term55026, term55026.getClass(), "_valueClass", null);
        setField(term55026, term55026.getClass(), "_beanType", null);
        setField(term55026, term55026.getClass(), "_valueInstantiator", null);
        setField(term55026, term55026.getClass(), "_delegateDeserializer", null);
        setField(term55026, term55026.getClass(), "_propertyBasedCreator", null);
        setField(term55026, term55026.getClass(), "_backRefs", null);
        setField(term55026, term55026.getClass(), "_ignorableProps", null);
        Class<? extends Object> term55266 = Class.forName((String) "java.lang.invoke.VarHandleLongs$Array");
        term55138 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term55230 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term55230, term55230.getClass(), "_class", term55266);
        setField(term55138, term55138.getClass(), "_beanType", term55230);
        setField(term55138, term55138.getClass(), "_valueInstantiator", null);
        setField(term55138, term55138.getClass(), "_delegateDeserializer", null);
        setField(term55138, term55138.getClass(), "_propertyBasedCreator", null);
        setField(term55138, term55138.getClass(), "_backRefs", null);
        setField(term55138, term55138.getClass(), "_ignorableProps", null);
        term55404 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term55138;
        args[1] = term55404;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


