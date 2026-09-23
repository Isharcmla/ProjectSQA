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
import java.util.ArrayList;

public class Option_requiresArg_1521966554211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38888;
     Object term38959;

    public Option_requiresArg_1521966554211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term38940 = new ArrayList();
        term38888 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setBooleanField(term38888, term38888.getClass(), "optionalArg", false);
        setIntField(term38888, term38888.getClass(), "numberOfArgs", 1073741824);
        setField(term38888, term38888.getClass(), "values", term38940);
        ArrayList term38960 = new ArrayList();
        term38959 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term38959, term38959.getClass(), "opt", null);
        setField(term38959, term38959.getClass(), "longOpt", null);
        setField(term38959, term38959.getClass(), "argName", null);
        setField(term38959, term38959.getClass(), "description", null);
        setBooleanField(term38959, term38959.getClass(), "required", false);
        setBooleanField(term38959, term38959.getClass(), "optionalArg", false);
        setIntField(term38959, term38959.getClass(), "numberOfArgs", 1073741824);
        setField(term38959, term38959.getClass(), "type", null);
        setField(term38959, term38959.getClass(), "values", term38960);
        setCharField(term38959, term38959.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "requiresArg", argTypes, term38888, args);
        assertTrue(recursiveEquals(term38888, term38959));
        assertTrue(recursiveEquals(retValue, true));
    }

};


