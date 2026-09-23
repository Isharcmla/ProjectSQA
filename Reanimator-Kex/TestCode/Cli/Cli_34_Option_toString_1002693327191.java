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

public class Option_toString_1002693327191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33272;
     Object term33846;

    public Option_toString_1002693327191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33272 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term33272, term33272.getClass(), "opt", null);
        setField(term33272, term33272.getClass(), "longOpt", null);
        setIntField(term33272, term33272.getClass(), "numberOfArgs", 1);
        term33846 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term33846, term33846.getClass(), "opt", null);
        setField(term33846, term33846.getClass(), "longOpt", null);
        setField(term33846, term33846.getClass(), "argName", null);
        setField(term33846, term33846.getClass(), "description", null);
        setBooleanField(term33846, term33846.getClass(), "required", false);
        setBooleanField(term33846, term33846.getClass(), "optionalArg", false);
        setIntField(term33846, term33846.getClass(), "numberOfArgs", 1);
        setField(term33846, term33846.getClass(), "type", null);
        setField(term33846, term33846.getClass(), "values", null);
        setCharField(term33846, term33846.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term33272, args);
        assertTrue(recursiveEquals(term33272, term33846));
        assertTrue(recursiveEquals(retValue, "[ option: null  [ARG] :: null ]"));
    }

};


