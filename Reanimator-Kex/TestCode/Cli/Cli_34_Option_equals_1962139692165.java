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

public class Option_equals_1962139692165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25323;
     Object term25355;
     Object term25374;
     Object term25375;

    public Option_equals_1962139692165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25323 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term25355 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term25374 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term25374, term25374.getClass(), "opt", null);
        setField(term25374, term25374.getClass(), "longOpt", null);
        setField(term25374, term25374.getClass(), "argName", null);
        setField(term25374, term25374.getClass(), "description", null);
        setBooleanField(term25374, term25374.getClass(), "required", false);
        setBooleanField(term25374, term25374.getClass(), "optionalArg", false);
        setIntField(term25374, term25374.getClass(), "numberOfArgs", 0);
        setField(term25374, term25374.getClass(), "type", null);
        setField(term25374, term25374.getClass(), "values", null);
        setCharField(term25374, term25374.getClass(), "valuesep", (char) 0);
        term25375 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term25375, term25375.getClass(), "opt", null);
        setField(term25375, term25375.getClass(), "longOpt", null);
        setField(term25375, term25375.getClass(), "argName", null);
        setField(term25375, term25375.getClass(), "description", null);
        setBooleanField(term25375, term25375.getClass(), "required", false);
        setBooleanField(term25375, term25375.getClass(), "optionalArg", false);
        setIntField(term25375, term25375.getClass(), "numberOfArgs", 0);
        setField(term25375, term25375.getClass(), "type", null);
        setField(term25375, term25375.getClass(), "values", null);
        setCharField(term25375, term25375.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term25355;
        Object retValue = callMethod(klass, "equals", argTypes, term25323, args);
        assertTrue(recursiveEquals(term25323, term25374));
        assertTrue(recursiveEquals(term25355, term25375));
        assertTrue(recursiveEquals(retValue, true));
    }

};


