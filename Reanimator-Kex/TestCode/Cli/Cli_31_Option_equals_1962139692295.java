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

public class Option_equals_1962139692295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52516;
     Object term52586;
     Object term52659;
     Object term52662;

    public Option_equals_1962139692295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52516 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term52516, term52516.getClass(), "opt", null);
        setField(term52516, term52516.getClass(), "longOpt", "int");
        term52586 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term52586, term52586.getClass(), "opt", null);
        setField(term52586, term52586.getClass(), "longOpt", "int");
        term52659 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term52659, term52659.getClass(), "opt", null);
        setField(term52659, term52659.getClass(), "longOpt", "int");
        setField(term52659, term52659.getClass(), "argName", null);
        setField(term52659, term52659.getClass(), "description", null);
        setBooleanField(term52659, term52659.getClass(), "required", false);
        setBooleanField(term52659, term52659.getClass(), "optionalArg", false);
        setIntField(term52659, term52659.getClass(), "numberOfArgs", 0);
        setField(term52659, term52659.getClass(), "type", null);
        setField(term52659, term52659.getClass(), "values", null);
        setCharField(term52659, term52659.getClass(), "valuesep", (char) 0);
        term52662 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term52662, term52662.getClass(), "opt", null);
        setField(term52662, term52662.getClass(), "longOpt", "int");
        setField(term52662, term52662.getClass(), "argName", null);
        setField(term52662, term52662.getClass(), "description", null);
        setBooleanField(term52662, term52662.getClass(), "required", false);
        setBooleanField(term52662, term52662.getClass(), "optionalArg", false);
        setIntField(term52662, term52662.getClass(), "numberOfArgs", 0);
        setField(term52662, term52662.getClass(), "type", null);
        setField(term52662, term52662.getClass(), "values", null);
        setCharField(term52662, term52662.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term52586;
        Object retValue = callMethod(klass, "equals", argTypes, term52516, args);
        assertTrue(recursiveEquals(term52516, term52659));
        assertTrue(recursiveEquals(term52586, term52662));
        assertTrue(recursiveEquals(retValue, true));
    }

};


