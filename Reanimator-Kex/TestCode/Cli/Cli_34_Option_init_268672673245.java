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

public class Option_init_268672673245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52368;

    public Option_init_268672673245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term52223 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term52223, term52223.getClass(), "numberOfArgs", 0);
        setField(term52223, term52223.getClass(), "values", null);
        setField(term52223, term52223.getClass(), "opt", "");
        setField(term52223, term52223.getClass(), "longOpt", null);
        ArrayList term52373 = new ArrayList();
        term52368 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term52368, term52368.getClass(), "opt", "?");
        setField(term52368, term52368.getClass(), "longOpt", "");
        setField(term52368, term52368.getClass(), "argName", null);
        setField(term52368, term52368.getClass(), "description", null);
        setBooleanField(term52368, term52368.getClass(), "required", false);
        setBooleanField(term52368, term52368.getClass(), "optionalArg", false);
        setIntField(term52368, term52368.getClass(), "numberOfArgs", 1);
        setField(term52368, term52368.getClass(), "type", null);
        setField(term52368, term52368.getClass(), "values", term52373);
        setCharField(term52368, term52368.getClass(), "valuesep", (char) 0);
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
        args[1] = "";
        args[2] = true;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term52368));
    }

};


