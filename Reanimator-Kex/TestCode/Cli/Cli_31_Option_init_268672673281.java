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

public class Option_init_268672673281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49909;

    public Option_init_268672673281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term49801 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term49801, term49801.getClass(), "argName", null);
        setIntField(term49801, term49801.getClass(), "numberOfArgs", 0);
        setField(term49801, term49801.getClass(), "values", null);
        setField(term49801, term49801.getClass(), "opt", null);
        setField(term49801, term49801.getClass(), "longOpt", "");
        ArrayList term49914 = new ArrayList();
        term49909 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term49909, term49909.getClass(), "opt", "?");
        setField(term49909, term49909.getClass(), "longOpt", null);
        setField(term49909, term49909.getClass(), "argName", "arg");
        setField(term49909, term49909.getClass(), "description", null);
        setBooleanField(term49909, term49909.getClass(), "required", false);
        setBooleanField(term49909, term49909.getClass(), "optionalArg", false);
        setIntField(term49909, term49909.getClass(), "numberOfArgs", 1);
        setField(term49909, term49909.getClass(), "type", null);
        setField(term49909, term49909.getClass(), "values", term49914);
        setCharField(term49909, term49909.getClass(), "valuesep", (char) 0);
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
        args[0] = "?";
        args[1] = null;
        args[2] = true;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term49909));
    }

};


