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

public class Option_init_18650044257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45836;

    public Option_init_18650044257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45690 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term45690, term45690.getClass(), "argName", null);
        setIntField(term45690, term45690.getClass(), "numberOfArgs", 0);
        setField(term45690, term45690.getClass(), "values", null);
        setField(term45690, term45690.getClass(), "opt", "");
        setField(term45690, term45690.getClass(), "longOpt", "");
        ArrayList term45841 = new ArrayList();
        term45836 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term45836, term45836.getClass(), "opt", "?");
        setField(term45836, term45836.getClass(), "longOpt", null);
        setField(term45836, term45836.getClass(), "argName", "arg");
        setField(term45836, term45836.getClass(), "description", null);
        setBooleanField(term45836, term45836.getClass(), "required", false);
        setBooleanField(term45836, term45836.getClass(), "optionalArg", false);
        setIntField(term45836, term45836.getClass(), "numberOfArgs", 1);
        setField(term45836, term45836.getClass(), "type", null);
        setField(term45836, term45836.getClass(), "values", term45841);
        setCharField(term45836, term45836.getClass(), "valuesep", (char) 0);
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
        args[1] = true;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45836));
    }

};


