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

public class Option_equals_1962139692157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23155;
     Object term23225;
     Object term23298;
     Object term23301;

    public Option_equals_1962139692157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23155 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term23155, term23155.getClass(), "opt", null);
        setField(term23155, term23155.getClass(), "longOpt", "java.lang.String");
        term23225 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term23225, term23225.getClass(), "opt", null);
        term23298 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term23298, term23298.getClass(), "opt", null);
        setField(term23298, term23298.getClass(), "longOpt", "java.lang.String");
        setField(term23298, term23298.getClass(), "argName", null);
        setField(term23298, term23298.getClass(), "description", null);
        setBooleanField(term23298, term23298.getClass(), "required", false);
        setBooleanField(term23298, term23298.getClass(), "optionalArg", false);
        setIntField(term23298, term23298.getClass(), "numberOfArgs", 0);
        setField(term23298, term23298.getClass(), "type", null);
        setField(term23298, term23298.getClass(), "values", null);
        setCharField(term23298, term23298.getClass(), "valuesep", (char) 0);
        term23301 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term23301, term23301.getClass(), "opt", null);
        setField(term23301, term23301.getClass(), "longOpt", null);
        setField(term23301, term23301.getClass(), "argName", null);
        setField(term23301, term23301.getClass(), "description", null);
        setBooleanField(term23301, term23301.getClass(), "required", false);
        setBooleanField(term23301, term23301.getClass(), "optionalArg", false);
        setIntField(term23301, term23301.getClass(), "numberOfArgs", 0);
        setField(term23301, term23301.getClass(), "type", null);
        setField(term23301, term23301.getClass(), "values", null);
        setCharField(term23301, term23301.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23225;
        Object retValue = callMethod(klass, "equals", argTypes, term23155, args);
        assertTrue(recursiveEquals(term23155, term23298));
        assertTrue(recursiveEquals(term23225, term23301));
        assertTrue(recursiveEquals(retValue, false));
    }

};


