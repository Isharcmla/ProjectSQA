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

public class Option_init_18650044217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37053;

    public Option_init_18650044217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term36984 = new ArrayList();
        Object term36932 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term36932, term36932.getClass(), "argName", null);
        setIntField(term36932, term36932.getClass(), "numberOfArgs", 0);
        setField(term36932, term36932.getClass(), "values", term36984);
        ArrayList term37058 = new ArrayList();
        term37053 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term37053, term37053.getClass(), "opt", "C");
        setField(term37053, term37053.getClass(), "longOpt", null);
        setField(term37053, term37053.getClass(), "argName", "arg");
        setField(term37053, term37053.getClass(), "description", null);
        setBooleanField(term37053, term37053.getClass(), "required", false);
        setBooleanField(term37053, term37053.getClass(), "optionalArg", false);
        setIntField(term37053, term37053.getClass(), "numberOfArgs", -1);
        setField(term37053, term37053.getClass(), "type", null);
        setField(term37053, term37053.getClass(), "values", term37058);
        setCharField(term37053, term37053.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "C";
        args[1] = false;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term37053));
    }

};


