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

public class Option_equals_1962139692125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17142;
     Object term17150;
     Object term17151;

    public Option_equals_1962139692125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17142 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term17150 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term17150, term17150.getClass(), "opt", null);
        setField(term17150, term17150.getClass(), "longOpt", null);
        setField(term17150, term17150.getClass(), "argName", null);
        setField(term17150, term17150.getClass(), "description", null);
        setBooleanField(term17150, term17150.getClass(), "required", false);
        setBooleanField(term17150, term17150.getClass(), "optionalArg", false);
        setIntField(term17150, term17150.getClass(), "numberOfArgs", 0);
        setField(term17150, term17150.getClass(), "type", null);
        setField(term17150, term17150.getClass(), "values", null);
        setCharField(term17150, term17150.getClass(), "valuesep", (char) 0);
        term17151 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term17151, term17151.getClass(), "opt", null);
        setField(term17151, term17151.getClass(), "longOpt", null);
        setField(term17151, term17151.getClass(), "argName", null);
        setField(term17151, term17151.getClass(), "description", null);
        setBooleanField(term17151, term17151.getClass(), "required", false);
        setBooleanField(term17151, term17151.getClass(), "optionalArg", false);
        setIntField(term17151, term17151.getClass(), "numberOfArgs", 0);
        setField(term17151, term17151.getClass(), "type", null);
        setField(term17151, term17151.getClass(), "values", null);
        setCharField(term17151, term17151.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17142;
        Object retValue = callMethod(klass, "equals", argTypes, term17142, args);
        assertTrue(recursiveEquals(term17142, term17150));
        assertTrue(recursiveEquals(term17142, term17151));
        assertTrue(recursiveEquals(retValue, true));
    }

};


