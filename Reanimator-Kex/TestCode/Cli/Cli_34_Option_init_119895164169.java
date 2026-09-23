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

public class Option_init_119895164169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26099;

    public Option_init_119895164169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26086 = new ArrayList();
        Object term26034 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term26034, term26034.getClass(), "numberOfArgs", 0);
        setField(term26034, term26034.getClass(), "values", term26086);
        ArrayList term26100 = new ArrayList();
        term26099 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term26099, term26099.getClass(), "opt", null);
        setField(term26099, term26099.getClass(), "longOpt", null);
        setField(term26099, term26099.getClass(), "argName", null);
        setField(term26099, term26099.getClass(), "description", null);
        setBooleanField(term26099, term26099.getClass(), "required", false);
        setBooleanField(term26099, term26099.getClass(), "optionalArg", false);
        setIntField(term26099, term26099.getClass(), "numberOfArgs", -1);
        setField(term26099, term26099.getClass(), "type", null);
        setField(term26099, term26099.getClass(), "values", term26100);
        setCharField(term26099, term26099.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term26099));
    }

};


