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

public class Option_init_18650044281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58718;

    public Option_init_18650044281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term58614 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term58614, term58614.getClass(), "numberOfArgs", 0);
        setField(term58614, term58614.getClass(), "values", null);
        setField(term58614, term58614.getClass(), "opt", "");
        setField(term58614, term58614.getClass(), "longOpt", null);
        ArrayList term58721 = new ArrayList();
        term58718 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term58718, term58718.getClass(), "opt", "@");
        setField(term58718, term58718.getClass(), "longOpt", null);
        setField(term58718, term58718.getClass(), "argName", null);
        setField(term58718, term58718.getClass(), "description", null);
        setBooleanField(term58718, term58718.getClass(), "required", false);
        setBooleanField(term58718, term58718.getClass(), "optionalArg", false);
        setIntField(term58718, term58718.getClass(), "numberOfArgs", 1);
        setField(term58718, term58718.getClass(), "type", null);
        setField(term58718, term58718.getClass(), "values", term58721);
        setCharField(term58718, term58718.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "@";
        args[1] = true;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term58718));
    }

};


