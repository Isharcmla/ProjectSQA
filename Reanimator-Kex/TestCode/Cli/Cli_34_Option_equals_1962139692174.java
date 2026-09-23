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

public class Option_equals_1962139692174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28117;
     Object term28256;

    public Option_equals_1962139692174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28117 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term28256 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term28256, term28256.getClass(), "opt", null);
        setField(term28256, term28256.getClass(), "longOpt", null);
        setField(term28256, term28256.getClass(), "argName", null);
        setField(term28256, term28256.getClass(), "description", null);
        setBooleanField(term28256, term28256.getClass(), "required", false);
        setBooleanField(term28256, term28256.getClass(), "optionalArg", false);
        setIntField(term28256, term28256.getClass(), "numberOfArgs", 0);
        setField(term28256, term28256.getClass(), "type", null);
        setField(term28256, term28256.getClass(), "values", null);
        setCharField(term28256, term28256.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "equals", argTypes, term28117, args);
        assertTrue(recursiveEquals(term28117, term28256));
        assertTrue(recursiveEquals(retValue, false));
    }

};


