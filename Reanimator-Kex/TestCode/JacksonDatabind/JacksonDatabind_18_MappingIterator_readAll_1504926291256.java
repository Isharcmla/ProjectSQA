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

public class MappingIterator_readAll_1504926291256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220488;

    public MappingIterator_readAll_1504926291256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220488 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term220594 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term220700 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term220828 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term220976 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term220594, term220594.getClass(), "delegate", term220700);
        setField(term220488, term220488.getClass(), "_parser", term220594);
        setBooleanField(term220488, term220488.getClass(), "_hasNextChecked", true);
        setField(term220488, term220488.getClass(), "_updatedValue", null);
        setField(term220488, term220488.getClass(), "_deserializer", term220828);
        setField(term220488, term220488.getClass(), "_context", term220976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term220488, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


