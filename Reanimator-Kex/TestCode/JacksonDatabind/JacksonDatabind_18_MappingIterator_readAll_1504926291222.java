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

public class MappingIterator_readAll_1504926291222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179765;

    public MappingIterator_readAll_1504926291222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179765 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term179871 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term179977 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term180097 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term180131 = newInstance(Class.forName("java.lang.invoke.VarHandleBytes"));
        Object term180202 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(term179977, term179977.getClass(), "delegate", term180097);
        setField(term179871, term179871.getClass(), "delegate", term179977);
        setField(term179765, term179765.getClass(), "_parser", term179871);
        setBooleanField(term179765, term179765.getClass(), "_hasNextChecked", true);
        setField(term179765, term179765.getClass(), "_updatedValue", term180131);
        setField(term179765, term179765.getClass(), "_deserializer", term180202);
        setField(term179765, term179765.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term179765, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


