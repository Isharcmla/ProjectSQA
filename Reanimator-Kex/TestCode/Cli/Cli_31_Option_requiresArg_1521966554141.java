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

public class Option_requiresArg_1521966554141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19694;
     Object term19760;

    public Option_requiresArg_1521966554141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19746 = new ArrayList();
        term19694 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setBooleanField(term19694, term19694.getClass(), "optionalArg", false);
        setIntField(term19694, term19694.getClass(), "numberOfArgs", -2);
        setField(term19694, term19694.getClass(), "values", term19746);
        ArrayList term19761 = new ArrayList();
        term19760 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term19760, term19760.getClass(), "opt", null);
        setField(term19760, term19760.getClass(), "longOpt", null);
        setField(term19760, term19760.getClass(), "argName", null);
        setField(term19760, term19760.getClass(), "description", null);
        setBooleanField(term19760, term19760.getClass(), "required", false);
        setBooleanField(term19760, term19760.getClass(), "optionalArg", false);
        setIntField(term19760, term19760.getClass(), "numberOfArgs", -2);
        setField(term19760, term19760.getClass(), "type", null);
        setField(term19760, term19760.getClass(), "values", term19761);
        setCharField(term19760, term19760.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "requiresArg", argTypes, term19694, args);
        assertTrue(recursiveEquals(term19694, term19760));
        assertTrue(recursiveEquals(retValue, true));
    }

};


