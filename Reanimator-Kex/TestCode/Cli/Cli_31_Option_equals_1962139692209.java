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

public class Option_equals_1962139692209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36118;
     Object term36150;
     Object term36169;
     Object term36170;

    public Option_equals_1962139692209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36118 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term36150 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term36169 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term36169, term36169.getClass(), "opt", null);
        setField(term36169, term36169.getClass(), "longOpt", null);
        setField(term36169, term36169.getClass(), "argName", null);
        setField(term36169, term36169.getClass(), "description", null);
        setBooleanField(term36169, term36169.getClass(), "required", false);
        setBooleanField(term36169, term36169.getClass(), "optionalArg", false);
        setIntField(term36169, term36169.getClass(), "numberOfArgs", 0);
        setField(term36169, term36169.getClass(), "type", null);
        setField(term36169, term36169.getClass(), "values", null);
        setCharField(term36169, term36169.getClass(), "valuesep", (char) 0);
        term36170 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term36170, term36170.getClass(), "opt", null);
        setField(term36170, term36170.getClass(), "longOpt", null);
        setField(term36170, term36170.getClass(), "argName", null);
        setField(term36170, term36170.getClass(), "description", null);
        setBooleanField(term36170, term36170.getClass(), "required", false);
        setBooleanField(term36170, term36170.getClass(), "optionalArg", false);
        setIntField(term36170, term36170.getClass(), "numberOfArgs", 0);
        setField(term36170, term36170.getClass(), "type", null);
        setField(term36170, term36170.getClass(), "values", null);
        setCharField(term36170, term36170.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term36150;
        Object retValue = callMethod(klass, "equals", argTypes, term36118, args);
        assertTrue(recursiveEquals(term36118, term36169));
        assertTrue(recursiveEquals(term36150, term36170));
        assertTrue(recursiveEquals(retValue, true));
    }

};


