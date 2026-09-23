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

public class MappingIterator_readAll_150492629190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48394;

    public MappingIterator_readAll_150492629190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48394 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term48500 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term48606 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term48704 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term48832 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer"));
        Object term48980 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term48500, term48500.getClass(), "delegate", term48606);
        setField(term48394, term48394.getClass(), "_parser", term48500);
        setBooleanField(term48394, term48394.getClass(), "_hasNextChecked", true);
        setField(term48394, term48394.getClass(), "_updatedValue", term48704);
        setField(term48394, term48394.getClass(), "_deserializer", term48832);
        setField(term48394, term48394.getClass(), "_context", term48980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term48394, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


