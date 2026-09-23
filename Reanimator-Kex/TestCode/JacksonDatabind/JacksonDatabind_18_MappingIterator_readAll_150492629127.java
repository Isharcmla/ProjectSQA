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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.EqualityUtils.*;

public class MappingIterator_readAll_150492629127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16;
     Object term4956;

    public MappingIterator_readAll_150492629127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        setField(term16, term16.getClass(), "_type", null);
        setField(term16, term16.getClass(), "_context", null);
        setField(term16, term16.getClass(), "_deserializer", null);
        setField(term16, term16.getClass(), "_parser", null);
        setField(term16, term16.getClass(), "_updatedValue", null);
        setBooleanField(term16, term16.getClass(), "_closeParser", false);
        setBooleanField(term16, term16.getClass(), "_hasNextChecked", false);
        term4956 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        setField(term4956, term4956.getClass(), "_type", null);
        setField(term4956, term4956.getClass(), "_context", null);
        setField(term4956, term4956.getClass(), "_deserializer", null);
        setField(term4956, term4956.getClass(), "_parser", null);
        setField(term4956, term4956.getClass(), "_updatedValue", null);
        setBooleanField(term4956, term4956.getClass(), "_closeParser", false);
        setBooleanField(term4956, term4956.getClass(), "_hasNextChecked", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "readAll", argTypes, term16, args);
        assertTrue(recursiveEquals(term16, term4956));
    }

};


