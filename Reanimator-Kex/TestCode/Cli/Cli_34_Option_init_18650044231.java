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

public class Option_init_18650044231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45249;

    public Option_init_18650044231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45184 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term45184, term45184.getClass(), "numberOfArgs", 0);
        setField(term45184, term45184.getClass(), "values", null);
        ArrayList term45252 = new ArrayList();
        term45249 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term45249, term45249.getClass(), "opt", "?");
        setField(term45249, term45249.getClass(), "longOpt", null);
        setField(term45249, term45249.getClass(), "argName", null);
        setField(term45249, term45249.getClass(), "description", null);
        setBooleanField(term45249, term45249.getClass(), "required", false);
        setBooleanField(term45249, term45249.getClass(), "optionalArg", false);
        setIntField(term45249, term45249.getClass(), "numberOfArgs", -1);
        setField(term45249, term45249.getClass(), "type", null);
        setField(term45249, term45249.getClass(), "values", term45252);
        setCharField(term45249, term45249.getClass(), "valuesep", (char) 0);
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
        args[1] = false;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45249));
    }

};


