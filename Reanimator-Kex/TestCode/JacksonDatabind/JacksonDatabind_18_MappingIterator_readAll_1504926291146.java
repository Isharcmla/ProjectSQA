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

public class MappingIterator_readAll_1504926291146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95793;

    public MappingIterator_readAll_1504926291146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95793 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term95913 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term95947 = newInstance(Class.forName("java.lang.invoke.VarHandleBytes"));
        Object term96018 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(term95793, term95793.getClass(), "_parser", term95913);
        setBooleanField(term95793, term95793.getClass(), "_hasNextChecked", true);
        setField(term95793, term95793.getClass(), "_updatedValue", term95947);
        setField(term95793, term95793.getClass(), "_deserializer", term96018);
        setField(term95793, term95793.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term95793, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


