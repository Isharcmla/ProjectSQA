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

public class Option_init_268672673215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39399;

    public Option_init_268672673215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term39335 = new ArrayList();
        Object term39283 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term39283, term39283.getClass(), "numberOfArgs", 0);
        setField(term39283, term39283.getClass(), "values", term39335);
        ArrayList term39402 = new ArrayList();
        term39399 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term39399, term39399.getClass(), "opt", "k");
        setField(term39399, term39399.getClass(), "longOpt", null);
        setField(term39399, term39399.getClass(), "argName", null);
        setField(term39399, term39399.getClass(), "description", null);
        setBooleanField(term39399, term39399.getClass(), "required", false);
        setBooleanField(term39399, term39399.getClass(), "optionalArg", false);
        setIntField(term39399, term39399.getClass(), "numberOfArgs", -1);
        setField(term39399, term39399.getClass(), "type", null);
        setField(term39399, term39399.getClass(), "values", term39402);
        setCharField(term39399, term39399.getClass(), "valuesep", (char) 0);
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
        args[0] = "k";
        args[1] = null;
        args[2] = false;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term39399));
    }

};


