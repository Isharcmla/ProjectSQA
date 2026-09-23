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

public class MappingIterator_readAll_150492629158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20802;

    public MappingIterator_readAll_150492629158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23139 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term23138 = ((Class) term23139).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term23138).setAccessible(true);
        Object enum7 = ((Field) term23138).get((Object) null);
        term20802 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term20922 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term20922, term20922.getClass(), "_currToken", enum7);
        setField(term20802, term20802.getClass(), "_parser", term20922);
        setBooleanField(term20802, term20802.getClass(), "_hasNextChecked", false);
        setField(term20802, term20802.getClass(), "_updatedValue", "END_ARRAY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term20802, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


