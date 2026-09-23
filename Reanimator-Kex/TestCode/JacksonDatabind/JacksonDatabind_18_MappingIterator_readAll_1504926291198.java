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
import java.lang.UnsupportedOperationException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MappingIterator_readAll_1504926291198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153436;

    public MappingIterator_readAll_1504926291198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term155093 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term155092 = ((Class) term155093).getDeclaredField((String) "END_OBJECT");
        ((Field) term155092).setAccessible(true);
        Object enum89 = ((Field) term155092).get((Object) null);
        term153436 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term153556 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term153760 = newInstance(Class.forName("java.util.concurrent.ForkJoinWorkerThread"));
        Object term153926 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer"));
        setField(term153556, term153556.getClass(), "_currToken", enum89);
        setField(term153436, term153436.getClass(), "_parser", term153556);
        setBooleanField(term153436, term153436.getClass(), "_hasNextChecked", false);
        setField(term153436, term153436.getClass(), "_updatedValue", term153760);
        setField(term153436, term153436.getClass(), "_deserializer", term153926);
        setField(term153436, term153436.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term153436, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


