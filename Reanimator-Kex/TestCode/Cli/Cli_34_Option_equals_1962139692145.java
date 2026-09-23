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

public class Option_equals_1962139692145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20053;
     Object term20085;
     Object term20174;
     Object term20175;

    public Option_equals_1962139692145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20053 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term20053, term20053.getClass(), "opt", null);
        term20085 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term20085, term20085.getClass(), "opt", "byte[]");
        term20174 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term20174, term20174.getClass(), "opt", null);
        setField(term20174, term20174.getClass(), "longOpt", null);
        setField(term20174, term20174.getClass(), "argName", null);
        setField(term20174, term20174.getClass(), "description", null);
        setBooleanField(term20174, term20174.getClass(), "required", false);
        setBooleanField(term20174, term20174.getClass(), "optionalArg", false);
        setIntField(term20174, term20174.getClass(), "numberOfArgs", 0);
        setField(term20174, term20174.getClass(), "type", null);
        setField(term20174, term20174.getClass(), "values", null);
        setCharField(term20174, term20174.getClass(), "valuesep", (char) 0);
        term20175 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term20175, term20175.getClass(), "opt", "byte[]");
        setField(term20175, term20175.getClass(), "longOpt", null);
        setField(term20175, term20175.getClass(), "argName", null);
        setField(term20175, term20175.getClass(), "description", null);
        setBooleanField(term20175, term20175.getClass(), "required", false);
        setBooleanField(term20175, term20175.getClass(), "optionalArg", false);
        setIntField(term20175, term20175.getClass(), "numberOfArgs", 0);
        setField(term20175, term20175.getClass(), "type", null);
        setField(term20175, term20175.getClass(), "values", null);
        setCharField(term20175, term20175.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20085;
        Object retValue = callMethod(klass, "equals", argTypes, term20053, args);
        assertTrue(recursiveEquals(term20053, term20174));
        assertTrue(recursiveEquals(term20085, term20175));
        assertTrue(recursiveEquals(retValue, false));
    }

};


