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

public class Option_toString_1002693327177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28873;
     Object term28922;

    public Option_toString_1002693327177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28873 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term28873, term28873.getClass(), "opt", null);
        setField(term28873, term28873.getClass(), "longOpt", null);
        setIntField(term28873, term28873.getClass(), "numberOfArgs", 2);
        term28922 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term28922, term28922.getClass(), "opt", null);
        setField(term28922, term28922.getClass(), "longOpt", null);
        setField(term28922, term28922.getClass(), "argName", null);
        setField(term28922, term28922.getClass(), "description", null);
        setBooleanField(term28922, term28922.getClass(), "required", false);
        setBooleanField(term28922, term28922.getClass(), "optionalArg", false);
        setIntField(term28922, term28922.getClass(), "numberOfArgs", 2);
        setField(term28922, term28922.getClass(), "type", null);
        setField(term28922, term28922.getClass(), "values", null);
        setCharField(term28922, term28922.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term28873, args);
        assertTrue(recursiveEquals(term28873, term28922));
        assertTrue(recursiveEquals(retValue, "[ option: null [ARG...] :: null ]"));
    }

};


