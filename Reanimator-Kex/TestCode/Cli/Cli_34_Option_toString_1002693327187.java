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
     Object term31719;
     Object term32424;

    public Option_toString_1002693327187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31719 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term31719, term31719.getClass(), "opt", null);
        setField(term31719, term31719.getClass(), "longOpt", null);
        setIntField(term31719, term31719.getClass(), "numberOfArgs", -2);
        term32424 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term32424, term32424.getClass(), "opt", null);
        setField(term32424, term32424.getClass(), "longOpt", null);
        setField(term32424, term32424.getClass(), "argName", null);
        setField(term32424, term32424.getClass(), "description", null);
        setBooleanField(term32424, term32424.getClass(), "required", false);
        setBooleanField(term32424, term32424.getClass(), "optionalArg", false);
        setIntField(term32424, term32424.getClass(), "numberOfArgs", -2);
        setField(term32424, term32424.getClass(), "type", null);
        setField(term32424, term32424.getClass(), "values", null);
        setCharField(term32424, term32424.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term31719, args);
        assertTrue(recursiveEquals(term31719, term32424));
        assertTrue(recursiveEquals(retValue, "[ option: null [ARG...] :: null ]"));
    }

};


