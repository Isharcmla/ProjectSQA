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

public class Option_toString_1002693327207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35750;
     Object term35885;

    public Option_toString_1002693327207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35750 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term35750, term35750.getClass(), "opt", "");
        setField(term35750, term35750.getClass(), "longOpt", " :: ");
        setIntField(term35750, term35750.getClass(), "numberOfArgs", 2);
        setField(term35750, term35750.getClass(), "description", null);
        setField(term35750, term35750.getClass(), "type", null);
        term35885 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term35885, term35885.getClass(), "opt", "");
        setField(term35885, term35885.getClass(), "longOpt", " :: ");
        setField(term35885, term35885.getClass(), "argName", null);
        setField(term35885, term35885.getClass(), "description", null);
        setBooleanField(term35885, term35885.getClass(), "required", false);
        setBooleanField(term35885, term35885.getClass(), "optionalArg", false);
        setIntField(term35885, term35885.getClass(), "numberOfArgs", 2);
        setField(term35885, term35885.getClass(), "type", null);
        setField(term35885, term35885.getClass(), "values", null);
        setCharField(term35885, term35885.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term35750, args);
        assertTrue(recursiveEquals(term35750, term35885));
        assertTrue(recursiveEquals(retValue, "[ option:   ::  [ARG...] :: null ]"));
    }

};


