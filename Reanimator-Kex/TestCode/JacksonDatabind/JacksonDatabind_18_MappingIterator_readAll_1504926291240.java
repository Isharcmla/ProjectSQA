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

public class MappingIterator_readAll_1504926291240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199313;

    public MappingIterator_readAll_1504926291240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term200281 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term200280 = ((Class) term200281).getDeclaredField((String) "FIELD_NAME");
        ((Field) term200280).setAccessible(true);
        Object enum121 = ((Field) term200280).get((Object) null);
        term199313 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term199433 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term199433, term199433.getClass(), "_currToken", enum121);
        setField(term199313, term199313.getClass(), "_parser", term199433);
        setBooleanField(term199313, term199313.getClass(), "_hasNextChecked", true);
        setField(term199313, term199313.getClass(), "_updatedValue", null);
        setField(term199313, term199313.getClass(), "_deserializer", null);
        setField(term199313, term199313.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term199313, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


