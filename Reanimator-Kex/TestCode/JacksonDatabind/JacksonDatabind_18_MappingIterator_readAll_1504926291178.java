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

public class MappingIterator_readAll_1504926291178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130588;

    public MappingIterator_readAll_1504926291178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130588 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term130708 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term130856 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer"));
        Object term131004 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term130588, term130588.getClass(), "_parser", term130708);
        setBooleanField(term130588, term130588.getClass(), "_hasNextChecked", true);
        setField(term130588, term130588.getClass(), "_updatedValue", null);
        setField(term130588, term130588.getClass(), "_deserializer", term130856);
        setField(term130588, term130588.getClass(), "_context", term131004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term130588, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


