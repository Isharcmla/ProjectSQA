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
import java.lang.ClassCastException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MappingIterator_readAll_1504926291116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66822;

    public MappingIterator_readAll_1504926291116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68318 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term68317 = ((Class) term68318).getDeclaredField((String) "VALUE_NULL");
        ((Field) term68317).setAccessible(true);
        Object enum41 = ((Field) term68317).get((Object) null);
        term66822 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term66942 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term67224 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer"));
        setField(term66942, term66942.getClass(), "_currToken", enum41);
        setField(term66822, term66822.getClass(), "_parser", term66942);
        setBooleanField(term66822, term66822.getClass(), "_hasNextChecked", true);
        setField(term66822, term66822.getClass(), "_updatedValue", "");
        setField(term66822, term66822.getClass(), "_deserializer", term67224);
        setField(term66822, term66822.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term66822, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


