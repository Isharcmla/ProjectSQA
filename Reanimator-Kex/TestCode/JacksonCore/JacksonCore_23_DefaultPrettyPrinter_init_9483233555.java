package com.fasterxml.jackson.core.util;

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
import static com.fasterxml.jackson.core.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.util.EqualityUtils.*;

public class DefaultPrettyPrinter_init_9483233555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6708;
     Object term6819;
     Object term6820;

    public DefaultPrettyPrinter_init_9483233555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6708 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        term6819 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(term6819, term6819.getClass(), "_arrayIndenter", null);
        setField(term6819, term6819.getClass(), "_objectIndenter", null);
        setField(term6819, term6819.getClass(), "_rootSeparator", null);
        setBooleanField(term6819, term6819.getClass(), "_spacesInObjectEntries", false);
        setIntField(term6819, term6819.getClass(), "_nesting", 0);
        setField(term6819, term6819.getClass(), "_separators", null);
        setField(term6819, term6819.getClass(), "_objectFieldValueSeparatorWithSpaces", null);
        term6820 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(term6820, term6820.getClass(), "_arrayIndenter", null);
        setField(term6820, term6820.getClass(), "_objectIndenter", null);
        setField(term6820, term6820.getClass(), "_rootSeparator", null);
        setBooleanField(term6820, term6820.getClass(), "_spacesInObjectEntries", false);
        setIntField(term6820, term6820.getClass(), "_nesting", 0);
        setField(term6820, term6820.getClass(), "_separators", null);
        setField(term6820, term6820.getClass(), "_objectFieldValueSeparatorWithSpaces", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
        Object[] args = new Object[1];
        args[0] = term6708;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6819));
        assertTrue(recursiveEquals(term6708, term6820));
    }

};


