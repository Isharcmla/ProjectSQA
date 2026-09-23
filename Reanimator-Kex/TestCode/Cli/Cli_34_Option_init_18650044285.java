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
import java.lang.Object;
import java.util.ArrayList;

public class Option_init_18650044285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59349;

    public Option_init_18650044285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term59246 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term59246, term59246.getClass(), "numberOfArgs", 0);
        setField(term59246, term59246.getClass(), "values", null);
        setField(term59246, term59246.getClass(), "opt", "");
        setField(term59246, term59246.getClass(), "longOpt", null);
        ArrayList term59352 = new ArrayList();
        term59349 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term59349, term59349.getClass(), "opt", "?");
        setField(term59349, term59349.getClass(), "longOpt", null);
        setField(term59349, term59349.getClass(), "argName", null);
        setField(term59349, term59349.getClass(), "description", null);
        setBooleanField(term59349, term59349.getClass(), "required", false);
        setBooleanField(term59349, term59349.getClass(), "optionalArg", false);
        setIntField(term59349, term59349.getClass(), "numberOfArgs", 1);
        setField(term59349, term59349.getClass(), "type", null);
        setField(term59349, term59349.getClass(), "values", term59352);
        setCharField(term59349, term59349.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "?";
        args[1] = true;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term59349));
    }

};


