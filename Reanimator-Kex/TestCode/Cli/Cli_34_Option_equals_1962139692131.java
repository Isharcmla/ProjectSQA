package org.apache.commons.cli;

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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;

public class Option_equals_1962139692131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17626;
     Object term17746;
     Object term18055;
     Object term18056;

    public Option_equals_1962139692131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17626 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term17746 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$KeySpliterator"));
        term18055 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term18055, term18055.getClass(), "opt", null);
        setField(term18055, term18055.getClass(), "longOpt", null);
        setField(term18055, term18055.getClass(), "argName", null);
        setField(term18055, term18055.getClass(), "description", null);
        setBooleanField(term18055, term18055.getClass(), "required", false);
        setBooleanField(term18055, term18055.getClass(), "optionalArg", false);
        setIntField(term18055, term18055.getClass(), "numberOfArgs", 0);
        setField(term18055, term18055.getClass(), "type", null);
        setField(term18055, term18055.getClass(), "values", null);
        setCharField(term18055, term18055.getClass(), "valuesep", (char) 0);
        term18056 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$KeySpliterator"));
        setField(term18056, term18056.getClass(), "comparator", null);
        setField(term18056, term18056.getClass(), "fence", null);
        setField(term18056, term18056.getClass(), "row", null);
        setField(term18056, term18056.getClass(), "current", null);
        setLongField(term18056, term18056.getClass(), "est", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17746;
        Object retValue = callMethod(klass, "equals", argTypes, term17626, args);
        assertTrue(recursiveEquals(term17626, term18055));
        assertTrue(recursiveEquals(term17746, term18056));
        assertTrue(recursiveEquals(retValue, false));
    }

};


