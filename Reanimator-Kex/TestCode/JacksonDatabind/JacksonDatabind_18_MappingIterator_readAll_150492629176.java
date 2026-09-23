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

public class MappingIterator_readAll_150492629176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37008;

    public MappingIterator_readAll_150492629176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38019 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term38018 = ((Class) term38019).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term38018).setAccessible(true);
        Object enum20 = ((Field) term38018).get((Object) null);
        term37008 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term37128 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term37128, term37128.getClass(), "_currToken", enum20);
        setField(term37008, term37008.getClass(), "_parser", term37128);
        setBooleanField(term37008, term37008.getClass(), "_hasNextChecked", false);
        setField(term37008, term37008.getClass(), "_updatedValue", null);
        setField(term37008, term37008.getClass(), "_deserializer", null);
        setField(term37008, term37008.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term37008, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


