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

public class Option_init_119895164225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37685;

    public Option_init_119895164225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37576 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term37576, term37576.getClass(), "argName", "");
        setIntField(term37576, term37576.getClass(), "numberOfArgs", 0);
        setField(term37576, term37576.getClass(), "values", null);
        ArrayList term37690 = new ArrayList();
        term37685 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term37685, term37685.getClass(), "opt", "@");
        setField(term37685, term37685.getClass(), "longOpt", null);
        setField(term37685, term37685.getClass(), "argName", "arg");
        setField(term37685, term37685.getClass(), "description", null);
        setBooleanField(term37685, term37685.getClass(), "required", false);
        setBooleanField(term37685, term37685.getClass(), "optionalArg", false);
        setIntField(term37685, term37685.getClass(), "numberOfArgs", -1);
        setField(term37685, term37685.getClass(), "type", null);
        setField(term37685, term37685.getClass(), "values", term37690);
        setCharField(term37685, term37685.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "@";
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term37685));
    }

};


