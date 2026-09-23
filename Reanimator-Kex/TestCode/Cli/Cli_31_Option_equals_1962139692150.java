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

public class Option_equals_1962139692150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21354;
     Object term21386;
     Object term21724;
     Object term21725;

    public Option_equals_1962139692150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21354 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term21354, term21354.getClass(), "opt", null);
        setField(term21354, term21354.getClass(), "longOpt", null);
        term21386 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term21386, term21386.getClass(), "opt", null);
        setField(term21386, term21386.getClass(), "longOpt", "byte");
        term21724 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term21724, term21724.getClass(), "opt", null);
        setField(term21724, term21724.getClass(), "longOpt", null);
        setField(term21724, term21724.getClass(), "argName", null);
        setField(term21724, term21724.getClass(), "description", null);
        setBooleanField(term21724, term21724.getClass(), "required", false);
        setBooleanField(term21724, term21724.getClass(), "optionalArg", false);
        setIntField(term21724, term21724.getClass(), "numberOfArgs", 0);
        setField(term21724, term21724.getClass(), "type", null);
        setField(term21724, term21724.getClass(), "values", null);
        setCharField(term21724, term21724.getClass(), "valuesep", (char) 0);
        term21725 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term21725, term21725.getClass(), "opt", null);
        setField(term21725, term21725.getClass(), "longOpt", "byte");
        setField(term21725, term21725.getClass(), "argName", null);
        setField(term21725, term21725.getClass(), "description", null);
        setBooleanField(term21725, term21725.getClass(), "required", false);
        setBooleanField(term21725, term21725.getClass(), "optionalArg", false);
        setIntField(term21725, term21725.getClass(), "numberOfArgs", 0);
        setField(term21725, term21725.getClass(), "type", null);
        setField(term21725, term21725.getClass(), "values", null);
        setCharField(term21725, term21725.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term21386;
        Object retValue = callMethod(klass, "equals", argTypes, term21354, args);
        assertTrue(recursiveEquals(term21354, term21724));
        assertTrue(recursiveEquals(term21386, term21725));
        assertTrue(recursiveEquals(retValue, false));
    }

};


