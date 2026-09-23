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

public class MappingIterator_readAll_1504926291148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96943;

    public MappingIterator_readAll_1504926291148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96943 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term97049 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term97211 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$ByteDeser"));
        setField(term96943, term96943.getClass(), "_parser", term97049);
        setBooleanField(term96943, term96943.getClass(), "_hasNextChecked", true);
        setField(term96943, term96943.getClass(), "_updatedValue", null);
        setField(term96943, term96943.getClass(), "_deserializer", term97211);
        setField(term96943, term96943.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term96943, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


