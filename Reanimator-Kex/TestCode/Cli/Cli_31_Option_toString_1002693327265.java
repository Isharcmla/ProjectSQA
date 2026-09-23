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

public class Option_toString_1002693327265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47051;
     Object term47227;

    public Option_toString_1002693327265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47051 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term47051, term47051.getClass(), "opt", "");
        setField(term47051, term47051.getClass(), "longOpt", null);
        setIntField(term47051, term47051.getClass(), "numberOfArgs", 1);
        setField(term47051, term47051.getClass(), "description", "");
        setField(term47051, term47051.getClass(), "type", " :: ");
        term47227 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term47227, term47227.getClass(), "opt", "");
        setField(term47227, term47227.getClass(), "longOpt", null);
        setField(term47227, term47227.getClass(), "argName", null);
        setField(term47227, term47227.getClass(), "description", "");
        setBooleanField(term47227, term47227.getClass(), "required", false);
        setBooleanField(term47227, term47227.getClass(), "optionalArg", false);
        setIntField(term47227, term47227.getClass(), "numberOfArgs", 1);
        setField(term47227, term47227.getClass(), "type", " :: ");
        setField(term47227, term47227.getClass(), "values", null);
        setCharField(term47227, term47227.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term47051, args);
        assertTrue(recursiveEquals(term47051, term47227));
        assertTrue(recursiveEquals(retValue, "[ option:   [ARG] ::  ::  ::  ]"));
    }

};


