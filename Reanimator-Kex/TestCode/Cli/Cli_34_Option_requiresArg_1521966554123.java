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

public class Option_requiresArg_1521966554123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17012;
     Object term17020;

    public Option_requiresArg_1521966554123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17012 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setBooleanField(term17012, term17012.getClass(), "optionalArg", true);
        term17020 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term17020, term17020.getClass(), "opt", null);
        setField(term17020, term17020.getClass(), "longOpt", null);
        setField(term17020, term17020.getClass(), "argName", null);
        setField(term17020, term17020.getClass(), "description", null);
        setBooleanField(term17020, term17020.getClass(), "required", false);
        setBooleanField(term17020, term17020.getClass(), "optionalArg", true);
        setIntField(term17020, term17020.getClass(), "numberOfArgs", 0);
        setField(term17020, term17020.getClass(), "type", null);
        setField(term17020, term17020.getClass(), "values", null);
        setCharField(term17020, term17020.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "requiresArg", argTypes, term17012, args);
        assertTrue(recursiveEquals(term17012, term17020));
        assertTrue(recursiveEquals(retValue, false));
    }

};


