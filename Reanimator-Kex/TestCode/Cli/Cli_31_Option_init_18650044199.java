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

public class Option_init_18650044199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33378;

    public Option_init_18650044199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33269 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term33269, term33269.getClass(), "argName", "");
        setIntField(term33269, term33269.getClass(), "numberOfArgs", 0);
        setField(term33269, term33269.getClass(), "values", null);
        ArrayList term33383 = new ArrayList();
        term33378 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term33378, term33378.getClass(), "opt", "@");
        setField(term33378, term33378.getClass(), "longOpt", null);
        setField(term33378, term33378.getClass(), "argName", "arg");
        setField(term33378, term33378.getClass(), "description", null);
        setBooleanField(term33378, term33378.getClass(), "required", false);
        setBooleanField(term33378, term33378.getClass(), "optionalArg", false);
        setIntField(term33378, term33378.getClass(), "numberOfArgs", -1);
        setField(term33378, term33378.getClass(), "type", null);
        setField(term33378, term33378.getClass(), "values", term33383);
        setCharField(term33378, term33378.getClass(), "valuesep", (char) 0);
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
        args[1] = false;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33378));
    }

};


