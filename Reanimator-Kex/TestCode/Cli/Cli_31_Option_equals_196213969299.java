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

public class Option_equals_196213969299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13930;
     Object term13984;
     Object term14020;
     Object term14021;

    public Option_equals_196213969299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13930 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term13984 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        term14020 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14020, term14020.getClass(), "opt", null);
        setField(term14020, term14020.getClass(), "longOpt", null);
        setField(term14020, term14020.getClass(), "argName", null);
        setField(term14020, term14020.getClass(), "description", null);
        setBooleanField(term14020, term14020.getClass(), "required", false);
        setBooleanField(term14020, term14020.getClass(), "optionalArg", false);
        setIntField(term14020, term14020.getClass(), "numberOfArgs", 0);
        setField(term14020, term14020.getClass(), "type", null);
        setField(term14020, term14020.getClass(), "values", null);
        setCharField(term14020, term14020.getClass(), "valuesep", (char) 0);
        term14021 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term14021, term14021.getClass(), "m", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13984;
        Object retValue = callMethod(klass, "equals", argTypes, term13930, args);
        assertTrue(recursiveEquals(term13930, term14020));
        assertTrue(recursiveEquals(term13984, term14021));
        assertTrue(recursiveEquals(retValue, false));
    }

};


