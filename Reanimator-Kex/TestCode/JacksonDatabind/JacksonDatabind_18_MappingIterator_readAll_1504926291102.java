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

public class MappingIterator_readAll_1504926291102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58467;

    public MappingIterator_readAll_1504926291102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59715 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term59714 = ((Class) term59715).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term59714).setAccessible(true);
        Object enum35 = ((Field) term59714).get((Object) null);
        term58467 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term58587 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term58851 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer"));
        setField(term58587, term58587.getClass(), "_currToken", enum35);
        setField(term58467, term58467.getClass(), "_parser", term58587);
        setBooleanField(term58467, term58467.getClass(), "_hasNextChecked", false);
        setField(term58467, term58467.getClass(), "_updatedValue", null);
        setField(term58467, term58467.getClass(), "_deserializer", term58851);
        setField(term58467, term58467.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term58467, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


