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

public class Option_init_18650044277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58140;

    public Option_init_18650044277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term58000 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term58000, term58000.getClass(), "numberOfArgs", 0);
        setField(term58000, term58000.getClass(), "values", null);
        setField(term58000, term58000.getClass(), "opt", "");
        setField(term58000, term58000.getClass(), "longOpt", "");
        ArrayList term58143 = new ArrayList();
        term58140 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term58140, term58140.getClass(), "opt", "k");
        setField(term58140, term58140.getClass(), "longOpt", null);
        setField(term58140, term58140.getClass(), "argName", null);
        setField(term58140, term58140.getClass(), "description", null);
        setBooleanField(term58140, term58140.getClass(), "required", false);
        setBooleanField(term58140, term58140.getClass(), "optionalArg", false);
        setIntField(term58140, term58140.getClass(), "numberOfArgs", 1);
        setField(term58140, term58140.getClass(), "type", null);
        setField(term58140, term58140.getClass(), "values", term58143);
        setCharField(term58140, term58140.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "k";
        args[1] = true;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term58140));
    }

};


