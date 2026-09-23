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

public class Option_init_18650044251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54939;

    public Option_init_18650044251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term54875 = new ArrayList();
        Object term54823 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term54823, term54823.getClass(), "numberOfArgs", 0);
        setField(term54823, term54823.getClass(), "values", term54875);
        ArrayList term54942 = new ArrayList();
        term54939 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term54939, term54939.getClass(), "opt", "k");
        setField(term54939, term54939.getClass(), "longOpt", null);
        setField(term54939, term54939.getClass(), "argName", null);
        setField(term54939, term54939.getClass(), "description", null);
        setBooleanField(term54939, term54939.getClass(), "required", false);
        setBooleanField(term54939, term54939.getClass(), "optionalArg", false);
        setIntField(term54939, term54939.getClass(), "numberOfArgs", -1);
        setField(term54939, term54939.getClass(), "type", null);
        setField(term54939, term54939.getClass(), "values", term54942);
        setCharField(term54939, term54939.getClass(), "valuesep", (char) 0);
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
        args[1] = false;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term54939));
    }

};


