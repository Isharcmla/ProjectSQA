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
import java.lang.UnsupportedOperationException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MappingIterator_readAll_1504926291160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110207;

    public MappingIterator_readAll_1504926291160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term111998 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term111997 = ((Class) term111998).getDeclaredField((String) "END_ARRAY");
        ((Field) term111997).setAccessible(true);
        Object enum68 = ((Field) term111997).get((Object) null);
        term110207 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term110327 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term110607 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$FloatDeser"));
        Object term110773 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer"));
        setField(term110327, term110327.getClass(), "_currToken", enum68);
        setField(term110207, term110207.getClass(), "_parser", term110327);
        setBooleanField(term110207, term110207.getClass(), "_hasNextChecked", false);
        setField(term110207, term110207.getClass(), "_updatedValue", term110607);
        setField(term110207, term110207.getClass(), "_deserializer", term110773);
        setField(term110207, term110207.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term110207, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


