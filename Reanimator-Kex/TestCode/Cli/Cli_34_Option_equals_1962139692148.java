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

public class Option_equals_1962139692148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20398;
     Object term20430;
     Object term20768;
     Object term20769;

    public Option_equals_1962139692148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20398 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term20398, term20398.getClass(), "opt", null);
        setField(term20398, term20398.getClass(), "longOpt", null);
        term20430 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term20430, term20430.getClass(), "opt", null);
        setField(term20430, term20430.getClass(), "longOpt", "byte");
        term20768 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term20768, term20768.getClass(), "opt", null);
        setField(term20768, term20768.getClass(), "longOpt", null);
        setField(term20768, term20768.getClass(), "argName", null);
        setField(term20768, term20768.getClass(), "description", null);
        setBooleanField(term20768, term20768.getClass(), "required", false);
        setBooleanField(term20768, term20768.getClass(), "optionalArg", false);
        setIntField(term20768, term20768.getClass(), "numberOfArgs", 0);
        setField(term20768, term20768.getClass(), "type", null);
        setField(term20768, term20768.getClass(), "values", null);
        setCharField(term20768, term20768.getClass(), "valuesep", (char) 0);
        term20769 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term20769, term20769.getClass(), "opt", null);
        setField(term20769, term20769.getClass(), "longOpt", "byte");
        setField(term20769, term20769.getClass(), "argName", null);
        setField(term20769, term20769.getClass(), "description", null);
        setBooleanField(term20769, term20769.getClass(), "required", false);
        setBooleanField(term20769, term20769.getClass(), "optionalArg", false);
        setIntField(term20769, term20769.getClass(), "numberOfArgs", 0);
        setField(term20769, term20769.getClass(), "type", null);
        setField(term20769, term20769.getClass(), "values", null);
        setCharField(term20769, term20769.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20430;
        Object retValue = callMethod(klass, "equals", argTypes, term20398, args);
        assertTrue(recursiveEquals(term20398, term20768));
        assertTrue(recursiveEquals(term20430, term20769));
        assertTrue(recursiveEquals(retValue, false));
    }

};


