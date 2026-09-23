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

public class MappingIterator_readAll_1504926291202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158225;

    public MappingIterator_readAll_1504926291202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158225 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term158331 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term158437 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term158609 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer"));
        Object term158757 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term158331, term158331.getClass(), "delegate", term158437);
        setField(term158225, term158225.getClass(), "_parser", term158331);
        setBooleanField(term158225, term158225.getClass(), "_hasNextChecked", true);
        setField(term158225, term158225.getClass(), "_updatedValue", null);
        setField(term158225, term158225.getClass(), "_deserializer", term158609);
        setField(term158225, term158225.getClass(), "_context", term158757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term158225, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


