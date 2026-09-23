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

public class MappingIterator_readAll_1504926291220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176601;

    public MappingIterator_readAll_1504926291220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term178060 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term178059 = ((Class) term178060).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term178059).setAccessible(true);
        Object enum109 = ((Field) term178059).get((Object) null);
        term176601 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term176721 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term176949 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term177097 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer"));
        setField(term176721, term176721.getClass(), "_currToken", enum109);
        setField(term176721, term176721.getClass(), "delegate", term176949);
        setField(term176601, term176601.getClass(), "_parser", term176721);
        setBooleanField(term176601, term176601.getClass(), "_hasNextChecked", false);
        setField(term176601, term176601.getClass(), "_updatedValue", null);
        setField(term176601, term176601.getClass(), "_deserializer", term177097);
        setField(term176601, term176601.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term176601, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


