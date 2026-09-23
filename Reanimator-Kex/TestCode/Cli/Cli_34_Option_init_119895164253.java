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

public class Option_init_119895164253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55186;

    public Option_init_119895164253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55122 = new ArrayList();
        Object term55070 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term55070, term55070.getClass(), "numberOfArgs", 0);
        setField(term55070, term55070.getClass(), "values", term55122);
        ArrayList term55189 = new ArrayList();
        term55186 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term55186, term55186.getClass(), "opt", "k");
        setField(term55186, term55186.getClass(), "longOpt", null);
        setField(term55186, term55186.getClass(), "argName", null);
        setField(term55186, term55186.getClass(), "description", null);
        setBooleanField(term55186, term55186.getClass(), "required", false);
        setBooleanField(term55186, term55186.getClass(), "optionalArg", false);
        setIntField(term55186, term55186.getClass(), "numberOfArgs", -1);
        setField(term55186, term55186.getClass(), "type", null);
        setField(term55186, term55186.getClass(), "values", term55189);
        setCharField(term55186, term55186.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "k";
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term55186));
    }

};


