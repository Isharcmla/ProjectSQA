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

public class MappingIterator_readAll_150492629151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15558;

    public MappingIterator_readAll_150492629151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17377 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term17376 = ((Class) term17377).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term17376).setAccessible(true);
        Object enum1 = ((Field) term17376).get((Object) null);
        term15558 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term15678 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term15678, term15678.getClass(), "_currToken", enum1);
        setField(term15558, term15558.getClass(), "_parser", term15678);
        setBooleanField(term15558, term15558.getClass(), "_hasNextChecked", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term15558, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


