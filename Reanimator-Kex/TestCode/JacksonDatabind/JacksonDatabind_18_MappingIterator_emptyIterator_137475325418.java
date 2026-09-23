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

public class MappingIterator_emptyIterator_137475325418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2979;

    public MappingIterator_emptyIterator_137475325418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2979 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        setField(term2979, term2979.getClass(), "_type", null);
        setField(term2979, term2979.getClass(), "_context", null);
        setField(term2979, term2979.getClass(), "_deserializer", null);
        setField(term2979, term2979.getClass(), "_parser", null);
        setField(term2979, term2979.getClass(), "_updatedValue", null);
        setBooleanField(term2979, term2979.getClass(), "_closeParser", false);
        setBooleanField(term2979, term2979.getClass(), "_hasNextChecked", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "emptyIterator", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term2979));
    }

};


