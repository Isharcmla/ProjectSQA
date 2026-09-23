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

public class MappingIterator_readAll_1504926291150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97889;

    public MappingIterator_readAll_1504926291150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97889 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term98009 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term98047 = newInstance(Class.forName("java.lang.Object"));
        Object term98167 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        setField(term97889, term97889.getClass(), "_parser", term98009);
        setBooleanField(term97889, term97889.getClass(), "_hasNextChecked", true);
        setField(term97889, term97889.getClass(), "_updatedValue", term98047);
        setField(term97889, term97889.getClass(), "_deserializer", term98167);
        setField(term97889, term97889.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term97889, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


