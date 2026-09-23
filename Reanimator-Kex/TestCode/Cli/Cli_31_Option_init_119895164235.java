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

public class Option_init_119895164235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40845;

    public Option_init_119895164235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term40776 = new ArrayList();
        Object term40724 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term40724, term40724.getClass(), "argName", null);
        setIntField(term40724, term40724.getClass(), "numberOfArgs", 0);
        setField(term40724, term40724.getClass(), "values", term40776);
        ArrayList term40850 = new ArrayList();
        term40845 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term40845, term40845.getClass(), "opt", "k");
        setField(term40845, term40845.getClass(), "longOpt", null);
        setField(term40845, term40845.getClass(), "argName", "arg");
        setField(term40845, term40845.getClass(), "description", null);
        setBooleanField(term40845, term40845.getClass(), "required", false);
        setBooleanField(term40845, term40845.getClass(), "optionalArg", false);
        setIntField(term40845, term40845.getClass(), "numberOfArgs", -1);
        setField(term40845, term40845.getClass(), "type", null);
        setField(term40845, term40845.getClass(), "values", term40850);
        setCharField(term40845, term40845.getClass(), "valuesep", (char) 0);
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
        assertTrue(recursiveEquals(instance, term40845));
    }

};


