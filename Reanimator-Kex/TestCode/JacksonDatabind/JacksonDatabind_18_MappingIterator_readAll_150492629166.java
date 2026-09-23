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

public class MappingIterator_readAll_150492629166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27575;

    public MappingIterator_readAll_150492629166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27575 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term27695 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term27733 = newInstance(Class.forName("java.lang.Object"));
        Object term27861 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer"));
        setField(term27575, term27575.getClass(), "_parser", term27695);
        setBooleanField(term27575, term27575.getClass(), "_hasNextChecked", true);
        setField(term27575, term27575.getClass(), "_updatedValue", term27733);
        setField(term27575, term27575.getClass(), "_deserializer", term27861);
        setField(term27575, term27575.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term27575, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


