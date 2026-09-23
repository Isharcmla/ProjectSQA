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

public class Option_toString_1002693327215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36571;
     Object term36749;

    public Option_toString_1002693327215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36571 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term36571, term36571.getClass(), "opt", "");
        setField(term36571, term36571.getClass(), "longOpt", "");
        setIntField(term36571, term36571.getClass(), "numberOfArgs", -2);
        setField(term36571, term36571.getClass(), "description", "");
        setField(term36571, term36571.getClass(), "type", " :: ");
        term36749 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term36749, term36749.getClass(), "opt", "");
        setField(term36749, term36749.getClass(), "longOpt", "");
        setField(term36749, term36749.getClass(), "argName", null);
        setField(term36749, term36749.getClass(), "description", "");
        setBooleanField(term36749, term36749.getClass(), "required", false);
        setBooleanField(term36749, term36749.getClass(), "optionalArg", false);
        setIntField(term36749, term36749.getClass(), "numberOfArgs", -2);
        setField(term36749, term36749.getClass(), "type", " :: ");
        setField(term36749, term36749.getClass(), "values", null);
        setCharField(term36749, term36749.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term36571, args);
        assertTrue(recursiveEquals(term36571, term36749));
        assertTrue(recursiveEquals(retValue, "[ option:   [ARG...] ::  ::  ::  ]"));
    }

};


