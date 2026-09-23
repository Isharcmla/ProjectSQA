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

public class Option_init_268672673267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47535;

    public Option_init_268672673267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term47426 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term47426, term47426.getClass(), "argName", null);
        setIntField(term47426, term47426.getClass(), "numberOfArgs", 0);
        setField(term47426, term47426.getClass(), "values", null);
        setField(term47426, term47426.getClass(), "opt", null);
        setField(term47426, term47426.getClass(), "longOpt", "");
        ArrayList term47540 = new ArrayList();
        term47535 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term47535, term47535.getClass(), "opt", "@");
        setField(term47535, term47535.getClass(), "longOpt", null);
        setField(term47535, term47535.getClass(), "argName", "arg");
        setField(term47535, term47535.getClass(), "description", null);
        setBooleanField(term47535, term47535.getClass(), "required", false);
        setBooleanField(term47535, term47535.getClass(), "optionalArg", false);
        setIntField(term47535, term47535.getClass(), "numberOfArgs", 1);
        setField(term47535, term47535.getClass(), "type", null);
        setField(term47535, term47535.getClass(), "values", term47540);
        setCharField(term47535, term47535.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = "@";
        args[1] = null;
        args[2] = true;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term47535));
    }

};


