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

public class Option_equals_1962139692295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60630;
     Object term60700;
     Object term60773;
     Object term60776;

    public Option_equals_1962139692295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60630 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term60630, term60630.getClass(), "opt", null);
        setField(term60630, term60630.getClass(), "longOpt", "int");
        term60700 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term60700, term60700.getClass(), "opt", null);
        setField(term60700, term60700.getClass(), "longOpt", "int");
        term60773 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term60773, term60773.getClass(), "opt", null);
        setField(term60773, term60773.getClass(), "longOpt", "int");
        setField(term60773, term60773.getClass(), "argName", null);
        setField(term60773, term60773.getClass(), "description", null);
        setBooleanField(term60773, term60773.getClass(), "required", false);
        setBooleanField(term60773, term60773.getClass(), "optionalArg", false);
        setIntField(term60773, term60773.getClass(), "numberOfArgs", 0);
        setField(term60773, term60773.getClass(), "type", null);
        setField(term60773, term60773.getClass(), "values", null);
        setCharField(term60773, term60773.getClass(), "valuesep", (char) 0);
        term60776 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term60776, term60776.getClass(), "opt", null);
        setField(term60776, term60776.getClass(), "longOpt", "int");
        setField(term60776, term60776.getClass(), "argName", null);
        setField(term60776, term60776.getClass(), "description", null);
        setBooleanField(term60776, term60776.getClass(), "required", false);
        setBooleanField(term60776, term60776.getClass(), "optionalArg", false);
        setIntField(term60776, term60776.getClass(), "numberOfArgs", 0);
        setField(term60776, term60776.getClass(), "type", null);
        setField(term60776, term60776.getClass(), "values", null);
        setCharField(term60776, term60776.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term60700;
        Object retValue = callMethod(klass, "equals", argTypes, term60630, args);
        assertTrue(recursiveEquals(term60630, term60773));
        assertTrue(recursiveEquals(term60700, term60776));
        assertTrue(recursiveEquals(retValue, true));
    }

};


