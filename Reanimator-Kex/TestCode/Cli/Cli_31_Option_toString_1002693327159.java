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

public class Option_toString_1002693327159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22981;
     Object term23073;

    public Option_toString_1002693327159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22981 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term22981, term22981.getClass(), "opt", null);
        setField(term22981, term22981.getClass(), "longOpt", "");
        setIntField(term22981, term22981.getClass(), "numberOfArgs", -2);
        term23073 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term23073, term23073.getClass(), "opt", null);
        setField(term23073, term23073.getClass(), "longOpt", "");
        setField(term23073, term23073.getClass(), "argName", null);
        setField(term23073, term23073.getClass(), "description", null);
        setBooleanField(term23073, term23073.getClass(), "required", false);
        setBooleanField(term23073, term23073.getClass(), "optionalArg", false);
        setIntField(term23073, term23073.getClass(), "numberOfArgs", -2);
        setField(term23073, term23073.getClass(), "type", null);
        setField(term23073, term23073.getClass(), "values", null);
        setCharField(term23073, term23073.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term22981, args);
        assertTrue(recursiveEquals(term22981, term23073));
        assertTrue(recursiveEquals(retValue, "[ option: null  [ARG...] :: null ]"));
    }

};


