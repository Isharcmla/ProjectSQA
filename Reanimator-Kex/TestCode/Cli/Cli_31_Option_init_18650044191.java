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

public class Option_init_18650044191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31511;

    public Option_init_18650044191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31430 = new ArrayList();
        Object term31378 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term31378, term31378.getClass(), "argName", null);
        setIntField(term31378, term31378.getClass(), "numberOfArgs", 0);
        setField(term31378, term31378.getClass(), "values", term31430);
        setField(term31378, term31378.getClass(), "opt", null);
        setField(term31378, term31378.getClass(), "longOpt", "");
        ArrayList term31514 = new ArrayList();
        term31511 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term31511, term31511.getClass(), "opt", null);
        setField(term31511, term31511.getClass(), "longOpt", null);
        setField(term31511, term31511.getClass(), "argName", "arg");
        setField(term31511, term31511.getClass(), "description", null);
        setBooleanField(term31511, term31511.getClass(), "required", false);
        setBooleanField(term31511, term31511.getClass(), "optionalArg", false);
        setIntField(term31511, term31511.getClass(), "numberOfArgs", 1);
        setField(term31511, term31511.getClass(), "type", null);
        setField(term31511, term31511.getClass(), "values", term31514);
        setCharField(term31511, term31511.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = true;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term31511));
    }

};


