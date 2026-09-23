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

public class Option_equals_1962139692105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14612;
     Object term14620;
     Object term14621;

    public Option_equals_1962139692105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14612 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term14620 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14620, term14620.getClass(), "opt", null);
        setField(term14620, term14620.getClass(), "longOpt", null);
        setField(term14620, term14620.getClass(), "argName", null);
        setField(term14620, term14620.getClass(), "description", null);
        setBooleanField(term14620, term14620.getClass(), "required", false);
        setBooleanField(term14620, term14620.getClass(), "optionalArg", false);
        setIntField(term14620, term14620.getClass(), "numberOfArgs", 0);
        setField(term14620, term14620.getClass(), "type", null);
        setField(term14620, term14620.getClass(), "values", null);
        setCharField(term14620, term14620.getClass(), "valuesep", (char) 0);
        term14621 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14621, term14621.getClass(), "opt", null);
        setField(term14621, term14621.getClass(), "longOpt", null);
        setField(term14621, term14621.getClass(), "argName", null);
        setField(term14621, term14621.getClass(), "description", null);
        setBooleanField(term14621, term14621.getClass(), "required", false);
        setBooleanField(term14621, term14621.getClass(), "optionalArg", false);
        setIntField(term14621, term14621.getClass(), "numberOfArgs", 0);
        setField(term14621, term14621.getClass(), "type", null);
        setField(term14621, term14621.getClass(), "values", null);
        setCharField(term14621, term14621.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14612;
        Object retValue = callMethod(klass, "equals", argTypes, term14612, args);
        assertTrue(recursiveEquals(term14612, term14620));
        assertTrue(recursiveEquals(term14612, term14621));
        assertTrue(recursiveEquals(retValue, true));
    }

};


