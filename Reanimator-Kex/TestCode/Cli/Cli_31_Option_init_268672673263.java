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

public class Option_init_268672673263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46829;

    public Option_init_268672673263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term46680 = new ArrayList();
        Object term46590 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term46590, term46590.getClass(), "argName", "");
        setIntField(term46590, term46590.getClass(), "numberOfArgs", 0);
        setField(term46590, term46590.getClass(), "values", term46680);
        setField(term46590, term46590.getClass(), "opt", null);
        setField(term46590, term46590.getClass(), "longOpt", "");
        ArrayList term46836 = new ArrayList();
        term46829 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term46829, term46829.getClass(), "opt", "h");
        setField(term46829, term46829.getClass(), "longOpt", "");
        setField(term46829, term46829.getClass(), "argName", "arg");
        setField(term46829, term46829.getClass(), "description", null);
        setBooleanField(term46829, term46829.getClass(), "required", false);
        setBooleanField(term46829, term46829.getClass(), "optionalArg", false);
        setIntField(term46829, term46829.getClass(), "numberOfArgs", 1);
        setField(term46829, term46829.getClass(), "type", null);
        setField(term46829, term46829.getClass(), "values", term46836);
        setCharField(term46829, term46829.getClass(), "valuesep", (char) 0);
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
        args[0] = "h";
        args[1] = "";
        args[2] = true;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term46829));
    }

};


