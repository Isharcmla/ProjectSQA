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

public class Option_init_18650044261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46424;

    public Option_init_18650044261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46317 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term46317, term46317.getClass(), "argName", "");
        setIntField(term46317, term46317.getClass(), "numberOfArgs", 0);
        setField(term46317, term46317.getClass(), "values", null);
        setField(term46317, term46317.getClass(), "opt", null);
        setField(term46317, term46317.getClass(), "longOpt", null);
        ArrayList term46429 = new ArrayList();
        term46424 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term46424, term46424.getClass(), "opt", "P");
        setField(term46424, term46424.getClass(), "longOpt", null);
        setField(term46424, term46424.getClass(), "argName", "arg");
        setField(term46424, term46424.getClass(), "description", null);
        setBooleanField(term46424, term46424.getClass(), "required", false);
        setBooleanField(term46424, term46424.getClass(), "optionalArg", false);
        setIntField(term46424, term46424.getClass(), "numberOfArgs", 1);
        setField(term46424, term46424.getClass(), "type", null);
        setField(term46424, term46424.getClass(), "values", term46429);
        setCharField(term46424, term46424.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "P";
        args[1] = true;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term46424));
    }

};


