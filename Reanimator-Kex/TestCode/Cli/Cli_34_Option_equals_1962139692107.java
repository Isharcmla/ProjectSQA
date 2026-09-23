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

public class Option_equals_1962139692107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14493;
     Object term14559;
     Object term14572;
     Object term14573;

    public Option_equals_1962139692107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14493 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term14559 = newInstance(Class.forName("java.util.regex.Pattern$Behind"));
        term14572 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14572, term14572.getClass(), "opt", null);
        setField(term14572, term14572.getClass(), "longOpt", null);
        setField(term14572, term14572.getClass(), "argName", null);
        setField(term14572, term14572.getClass(), "description", null);
        setBooleanField(term14572, term14572.getClass(), "required", false);
        setBooleanField(term14572, term14572.getClass(), "optionalArg", false);
        setIntField(term14572, term14572.getClass(), "numberOfArgs", 0);
        setField(term14572, term14572.getClass(), "type", null);
        setField(term14572, term14572.getClass(), "values", null);
        setCharField(term14572, term14572.getClass(), "valuesep", (char) 0);
        term14573 = newInstance(Class.forName("java.util.regex.Pattern$Behind"));
        setField(term14573, term14573.getClass(), "cond", null);
        setIntField(term14573, term14573.getClass(), "rmax", 0);
        setIntField(term14573, term14573.getClass(), "rmin", 0);
        setField(term14573, term14573.getClass(), "next", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14559;
        Object retValue = callMethod(klass, "equals", argTypes, term14493, args);
        assertTrue(recursiveEquals(term14493, term14572));
        assertTrue(recursiveEquals(term14559, term14573));
        assertTrue(recursiveEquals(retValue, false));
    }

};


