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

public class MappingIterator_readAll_150492629192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50287;

    public MappingIterator_readAll_150492629192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51425 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term51424 = ((Class) term51425).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term51424).setAccessible(true);
        Object enum29 = ((Field) term51424).get((Object) null);
        term50287 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term50407 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term50643 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term50407, term50407.getClass(), "_currToken", enum29);
        setField(term50287, term50287.getClass(), "_parser", term50407);
        setBooleanField(term50287, term50287.getClass(), "_hasNextChecked", false);
        setField(term50287, term50287.getClass(), "_updatedValue", term50643);
        setField(term50287, term50287.getClass(), "_deserializer", null);
        setField(term50287, term50287.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term50287, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


