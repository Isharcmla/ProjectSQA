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

public class Option_toString_1002693327187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30753;
     Object term31107;

    public Option_toString_1002693327187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30753 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term30753, term30753.getClass(), "opt", null);
        setField(term30753, term30753.getClass(), "longOpt", null);
        setIntField(term30753, term30753.getClass(), "numberOfArgs", -2147483646);
        setField(term30753, term30753.getClass(), "description", null);
        setField(term30753, term30753.getClass(), "type", "");
        term31107 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term31107, term31107.getClass(), "opt", null);
        setField(term31107, term31107.getClass(), "longOpt", null);
        setField(term31107, term31107.getClass(), "argName", null);
        setField(term31107, term31107.getClass(), "description", null);
        setBooleanField(term31107, term31107.getClass(), "required", false);
        setBooleanField(term31107, term31107.getClass(), "optionalArg", false);
        setIntField(term31107, term31107.getClass(), "numberOfArgs", -2147483646);
        setField(term31107, term31107.getClass(), "type", "");
        setField(term31107, term31107.getClass(), "values", null);
        setCharField(term31107, term31107.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term30753, args);
        assertTrue(recursiveEquals(term30753, term31107));
        assertTrue(recursiveEquals(retValue, "[ option: null  :: null ::  ]"));
    }

};


