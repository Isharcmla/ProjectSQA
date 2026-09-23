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

public class MappingIterator_readAll_1504926291262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227697;

    public MappingIterator_readAll_1504926291262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term229634 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term229633 = ((Class) term229634).getDeclaredField((String) "END_ARRAY");
        ((Field) term229633).setAccessible(true);
        Object enum140 = ((Field) term229633).get((Object) null);
        Class<? extends Object> term229848 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term229847 = ((Class) term229848).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term229847).setAccessible(true);
        Object enum141 = ((Field) term229847).get((Object) null);
        term227697 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term227817 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term228045 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term228309 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer"));
        setField(term227817, term227817.getClass(), "_currToken", enum140);
        setField(term228045, term228045.getClass(), "_currToken", enum141);
        setField(term227817, term227817.getClass(), "delegate", term228045);
        setField(term227697, term227697.getClass(), "_parser", term227817);
        setBooleanField(term227697, term227697.getClass(), "_hasNextChecked", false);
        setField(term227697, term227697.getClass(), "_updatedValue", null);
        setField(term227697, term227697.getClass(), "_deserializer", term228309);
        setField(term227697, term227697.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term227697, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


