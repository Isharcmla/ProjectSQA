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

public class Option_init_18650044156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23254;

    public Option_init_18650044156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term22951 = new ArrayList();
        Object term22899 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term22899, term22899.getClass(), "numberOfArgs", 0);
        setField(term22899, term22899.getClass(), "values", term22951);
        ArrayList term23255 = new ArrayList();
        term23254 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term23254, term23254.getClass(), "opt", null);
        setField(term23254, term23254.getClass(), "longOpt", null);
        setField(term23254, term23254.getClass(), "argName", null);
        setField(term23254, term23254.getClass(), "description", null);
        setBooleanField(term23254, term23254.getClass(), "required", false);
        setBooleanField(term23254, term23254.getClass(), "optionalArg", false);
        setIntField(term23254, term23254.getClass(), "numberOfArgs", -1);
        setField(term23254, term23254.getClass(), "type", null);
        setField(term23254, term23254.getClass(), "values", term23255);
        setCharField(term23254, term23254.getClass(), "valuesep", (char) 0);
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
        assertTrue(recursiveEquals(instance, term23254));
    }

};


