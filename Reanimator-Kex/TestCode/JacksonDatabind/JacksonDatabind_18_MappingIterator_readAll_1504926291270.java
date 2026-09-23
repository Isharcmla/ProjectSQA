package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MappingIterator_readAll_1504926291270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238285;

    public MappingIterator_readAll_1504926291270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term239587 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term239586 = ((Class) term239587).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term239586).setAccessible(true);
        Object enum151 = ((Field) term239586).get((Object) null);
        term238285 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term238405 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term238657 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        Object term238757 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term238405, term238405.getClass(), "_currToken", enum151);
        setField(term238285, term238285.getClass(), "_parser", term238405);
        setBooleanField(term238285, term238285.getClass(), "_hasNextChecked", false);
        setField(term238285, term238285.getClass(), "_updatedValue", null);
        setField(term238657, term238657.getClass(), "_beanType", term238757);
        setField(term238285, term238285.getClass(), "_deserializer", term238657);
        setField(term238285, term238285.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term238285, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


