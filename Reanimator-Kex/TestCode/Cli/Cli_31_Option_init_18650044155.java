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

public class Option_init_18650044155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22162;

    public Option_init_18650044155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22081 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term22081, term22081.getClass(), "argName", "");
        setIntField(term22081, term22081.getClass(), "numberOfArgs", 0);
        setField(term22081, term22081.getClass(), "values", null);
        ArrayList term22165 = new ArrayList();
        term22162 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term22162, term22162.getClass(), "opt", null);
        setField(term22162, term22162.getClass(), "longOpt", null);
        setField(term22162, term22162.getClass(), "argName", "arg");
        setField(term22162, term22162.getClass(), "description", null);
        setBooleanField(term22162, term22162.getClass(), "required", false);
        setBooleanField(term22162, term22162.getClass(), "optionalArg", false);
        setIntField(term22162, term22162.getClass(), "numberOfArgs", -1);
        setField(term22162, term22162.getClass(), "type", null);
        setField(term22162, term22162.getClass(), "values", term22165);
        setCharField(term22162, term22162.getClass(), "valuesep", (char) 0);
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
        args[1] = false;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22162));
    }

};


