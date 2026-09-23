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

public class Option_equals_1962139692137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18733;
     Object term18813;
     Object term18842;
     Object term18843;

    public Option_equals_1962139692137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18733 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term18813 = newInstance(Class.forName("java.io.ObjectInputStream$HandleTable"));
        term18842 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term18842, term18842.getClass(), "opt", null);
        setField(term18842, term18842.getClass(), "longOpt", null);
        setField(term18842, term18842.getClass(), "argName", null);
        setField(term18842, term18842.getClass(), "description", null);
        setBooleanField(term18842, term18842.getClass(), "required", false);
        setBooleanField(term18842, term18842.getClass(), "optionalArg", false);
        setIntField(term18842, term18842.getClass(), "numberOfArgs", 0);
        setField(term18842, term18842.getClass(), "type", null);
        setField(term18842, term18842.getClass(), "values", null);
        setCharField(term18842, term18842.getClass(), "valuesep", (char) 0);
        term18843 = newInstance(Class.forName("java.io.ObjectInputStream$HandleTable"));
        setField(term18843, term18843.getClass(), "status", null);
        setField(term18843, term18843.getClass(), "entries", null);
        setField(term18843, term18843.getClass(), "deps", null);
        setIntField(term18843, term18843.getClass(), "lowDep", 0);
        setIntField(term18843, term18843.getClass(), "size", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18813;
        Object retValue = callMethod(klass, "equals", argTypes, term18733, args);
        assertTrue(recursiveEquals(term18733, term18842));
        assertTrue(recursiveEquals(term18813, term18843));
        assertTrue(recursiveEquals(retValue, false));
    }

};


