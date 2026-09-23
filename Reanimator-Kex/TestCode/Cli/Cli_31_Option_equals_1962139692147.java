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

public class Option_equals_1962139692147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20963;
     Object term20995;
     Object term21140;
     Object term21141;

    public Option_equals_1962139692147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20963 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term20963, term20963.getClass(), "opt", null);
        term20995 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term20995, term20995.getClass(), "opt", "byte[]");
        term21140 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term21140, term21140.getClass(), "opt", null);
        setField(term21140, term21140.getClass(), "longOpt", null);
        setField(term21140, term21140.getClass(), "argName", null);
        setField(term21140, term21140.getClass(), "description", null);
        setBooleanField(term21140, term21140.getClass(), "required", false);
        setBooleanField(term21140, term21140.getClass(), "optionalArg", false);
        setIntField(term21140, term21140.getClass(), "numberOfArgs", 0);
        setField(term21140, term21140.getClass(), "type", null);
        setField(term21140, term21140.getClass(), "values", null);
        setCharField(term21140, term21140.getClass(), "valuesep", (char) 0);
        term21141 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term21141, term21141.getClass(), "opt", "byte[]");
        setField(term21141, term21141.getClass(), "longOpt", null);
        setField(term21141, term21141.getClass(), "argName", null);
        setField(term21141, term21141.getClass(), "description", null);
        setBooleanField(term21141, term21141.getClass(), "required", false);
        setBooleanField(term21141, term21141.getClass(), "optionalArg", false);
        setIntField(term21141, term21141.getClass(), "numberOfArgs", 0);
        setField(term21141, term21141.getClass(), "type", null);
        setField(term21141, term21141.getClass(), "values", null);
        setCharField(term21141, term21141.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20995;
        Object retValue = callMethod(klass, "equals", argTypes, term20963, args);
        assertTrue(recursiveEquals(term20963, term21140));
        assertTrue(recursiveEquals(term20995, term21141));
        assertTrue(recursiveEquals(retValue, false));
    }

};


