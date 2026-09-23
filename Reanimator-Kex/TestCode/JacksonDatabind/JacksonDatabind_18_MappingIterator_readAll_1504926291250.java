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

public class MappingIterator_readAll_1504926291250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214492;

    public MappingIterator_readAll_1504926291250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term215975 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term215974 = ((Class) term215975).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term215974).setAccessible(true);
        Object enum133 = ((Field) term215974).get((Object) null);
        term214492 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term214612 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term214892 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer"));
        setField(term214612, term214612.getClass(), "_currToken", enum133);
        setField(term214492, term214492.getClass(), "_parser", term214612);
        setBooleanField(term214492, term214492.getClass(), "_hasNextChecked", false);
        setField(term214492, term214492.getClass(), "_updatedValue", "START_ARRAY");
        setField(term214492, term214492.getClass(), "_deserializer", term214892);
        setField(term214492, term214492.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term214492, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


