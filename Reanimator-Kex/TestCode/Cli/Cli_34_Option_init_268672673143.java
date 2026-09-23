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

public class Option_init_268672673143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19827;

    public Option_init_268672673143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19814 = new ArrayList();
        Object term19762 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term19762, term19762.getClass(), "numberOfArgs", 0);
        setField(term19762, term19762.getClass(), "values", term19814);
        ArrayList term19828 = new ArrayList();
        term19827 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term19827, term19827.getClass(), "opt", null);
        setField(term19827, term19827.getClass(), "longOpt", null);
        setField(term19827, term19827.getClass(), "argName", null);
        setField(term19827, term19827.getClass(), "description", null);
        setBooleanField(term19827, term19827.getClass(), "required", false);
        setBooleanField(term19827, term19827.getClass(), "optionalArg", false);
        setIntField(term19827, term19827.getClass(), "numberOfArgs", -1);
        setField(term19827, term19827.getClass(), "type", null);
        setField(term19827, term19827.getClass(), "values", term19828);
        setCharField(term19827, term19827.getClass(), "valuesep", (char) 0);
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
        args[0] = null;
        args[1] = null;
        args[2] = false;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term19827));
    }

};


