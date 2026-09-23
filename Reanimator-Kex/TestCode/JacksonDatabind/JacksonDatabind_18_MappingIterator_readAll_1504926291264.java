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

public class MappingIterator_readAll_1504926291264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230946;

    public MappingIterator_readAll_1504926291264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term232173 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term232172 = ((Class) term232173).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term232172).setAccessible(true);
        Object enum145 = ((Field) term232172).get((Object) null);
        term230946 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term231066 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term231350 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(term231066, term231066.getClass(), "_currToken", enum145);
        setField(term231066, term231066.getClass(), "delegate", null);
        setField(term230946, term230946.getClass(), "_parser", term231066);
        setBooleanField(term230946, term230946.getClass(), "_hasNextChecked", false);
        setField(term230946, term230946.getClass(), "_updatedValue", "VALUE_TRUE");
        setField(term230946, term230946.getClass(), "_deserializer", term231350);
        setField(term230946, term230946.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term230946, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


