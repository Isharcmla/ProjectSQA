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

public class Option_requiresArg_1521966554107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14697;
     Object term14725;

    public Option_requiresArg_1521966554107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14697 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setBooleanField(term14697, term14697.getClass(), "optionalArg", true);
        term14725 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14725, term14725.getClass(), "opt", null);
        setField(term14725, term14725.getClass(), "longOpt", null);
        setField(term14725, term14725.getClass(), "argName", null);
        setField(term14725, term14725.getClass(), "description", null);
        setBooleanField(term14725, term14725.getClass(), "required", false);
        setBooleanField(term14725, term14725.getClass(), "optionalArg", true);
        setIntField(term14725, term14725.getClass(), "numberOfArgs", 0);
        setField(term14725, term14725.getClass(), "type", null);
        setField(term14725, term14725.getClass(), "values", null);
        setCharField(term14725, term14725.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "requiresArg", argTypes, term14697, args);
        assertTrue(recursiveEquals(term14697, term14725));
        assertTrue(recursiveEquals(retValue, false));
    }

};


