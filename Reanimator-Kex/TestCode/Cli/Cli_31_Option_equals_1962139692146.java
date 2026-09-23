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

public class Option_equals_1962139692146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20166;
     Object term20236;
     Object term21076;
     Object term21079;

    public Option_equals_1962139692146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20166 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term20166, term20166.getClass(), "opt", null);
        setField(term20166, term20166.getClass(), "longOpt", "java.lang.String");
        term20236 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term20236, term20236.getClass(), "opt", null);
        term21076 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term21076, term21076.getClass(), "opt", null);
        setField(term21076, term21076.getClass(), "longOpt", "java.lang.String");
        setField(term21076, term21076.getClass(), "argName", null);
        setField(term21076, term21076.getClass(), "description", null);
        setBooleanField(term21076, term21076.getClass(), "required", false);
        setBooleanField(term21076, term21076.getClass(), "optionalArg", false);
        setIntField(term21076, term21076.getClass(), "numberOfArgs", 0);
        setField(term21076, term21076.getClass(), "type", null);
        setField(term21076, term21076.getClass(), "values", null);
        setCharField(term21076, term21076.getClass(), "valuesep", (char) 0);
        term21079 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term21079, term21079.getClass(), "opt", null);
        setField(term21079, term21079.getClass(), "longOpt", null);
        setField(term21079, term21079.getClass(), "argName", null);
        setField(term21079, term21079.getClass(), "description", null);
        setBooleanField(term21079, term21079.getClass(), "required", false);
        setBooleanField(term21079, term21079.getClass(), "optionalArg", false);
        setIntField(term21079, term21079.getClass(), "numberOfArgs", 0);
        setField(term21079, term21079.getClass(), "type", null);
        setField(term21079, term21079.getClass(), "values", null);
        setCharField(term21079, term21079.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20236;
        Object retValue = callMethod(klass, "equals", argTypes, term20166, args);
        assertTrue(recursiveEquals(term20166, term21076));
        assertTrue(recursiveEquals(term20236, term21079));
        assertTrue(recursiveEquals(retValue, false));
    }

};


