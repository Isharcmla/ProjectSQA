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

public class MappingIterator_readAll_1504926291128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79969;

    public MappingIterator_readAll_1504926291128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79969 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term80075 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term80181 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object term80279 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term80407 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer"));
        Object term80555 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term80075, term80075.getClass(), "delegate", term80181);
        setField(term79969, term79969.getClass(), "_parser", term80075);
        setBooleanField(term79969, term79969.getClass(), "_hasNextChecked", true);
        setField(term79969, term79969.getClass(), "_updatedValue", term80279);
        setField(term79969, term79969.getClass(), "_deserializer", term80407);
        setField(term79969, term79969.getClass(), "_context", term80555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term79969, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


