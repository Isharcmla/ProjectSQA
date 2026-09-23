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

public class MappingIterator_readAll_150492629188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47292;

    public MappingIterator_readAll_150492629188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47292 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term47398 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object term47466 = newInstance(Class.forName("java.lang.invoke.VarHandleBytes"));
        Object term47608 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(term47292, term47292.getClass(), "_parser", term47398);
        setBooleanField(term47292, term47292.getClass(), "_hasNextChecked", true);
        setField(term47292, term47292.getClass(), "_updatedValue", term47466);
        setField(term47292, term47292.getClass(), "_deserializer", term47608);
        setField(term47292, term47292.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term47292, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


