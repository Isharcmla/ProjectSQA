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

public class Option_toString_1002693327193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32132;
     Object term32178;

    public Option_toString_1002693327193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32132 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term32132, term32132.getClass(), "opt", null);
        setField(term32132, term32132.getClass(), "longOpt", null);
        setIntField(term32132, term32132.getClass(), "numberOfArgs", 2);
        term32178 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term32178, term32178.getClass(), "opt", null);
        setField(term32178, term32178.getClass(), "longOpt", null);
        setField(term32178, term32178.getClass(), "argName", null);
        setField(term32178, term32178.getClass(), "description", null);
        setBooleanField(term32178, term32178.getClass(), "required", false);
        setBooleanField(term32178, term32178.getClass(), "optionalArg", false);
        setIntField(term32178, term32178.getClass(), "numberOfArgs", 2);
        setField(term32178, term32178.getClass(), "type", null);
        setField(term32178, term32178.getClass(), "values", null);
        setCharField(term32178, term32178.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term32132, args);
        assertTrue(recursiveEquals(term32132, term32178));
        assertTrue(recursiveEquals(retValue, "[ option: null [ARG...] :: null ]"));
    }

};


