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

public class MappingIterator_readAll_150492629185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43619;

    public MappingIterator_readAll_150492629185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45440 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term45439 = ((Class) term45440).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term45439).setAccessible(true);
        Object enum26 = ((Field) term45439).get((Object) null);
        term43619 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term43739 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term44023 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(term43739, term43739.getClass(), "_currToken", enum26);
        setField(term43619, term43619.getClass(), "_parser", term43739);
        setBooleanField(term43619, term43619.getClass(), "_hasNextChecked", false);
        setField(term43619, term43619.getClass(), "_updatedValue", "START_ARRAY");
        setField(term43619, term43619.getClass(), "_deserializer", term44023);
        setField(term43619, term43619.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term43619, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


