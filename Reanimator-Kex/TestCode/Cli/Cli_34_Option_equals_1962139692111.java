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

public class Option_equals_1962139692111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15107;
     Object term15139;
     Object term15159;
     Object term15160;

    public Option_equals_1962139692111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15107 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term15139 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term15159 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term15159, term15159.getClass(), "opt", null);
        setField(term15159, term15159.getClass(), "longOpt", null);
        setField(term15159, term15159.getClass(), "argName", null);
        setField(term15159, term15159.getClass(), "description", null);
        setBooleanField(term15159, term15159.getClass(), "required", false);
        setBooleanField(term15159, term15159.getClass(), "optionalArg", false);
        setIntField(term15159, term15159.getClass(), "numberOfArgs", 0);
        setField(term15159, term15159.getClass(), "type", null);
        setField(term15159, term15159.getClass(), "values", null);
        setCharField(term15159, term15159.getClass(), "valuesep", (char) 0);
        term15160 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term15160, term15160.getClass(), "opt", null);
        setField(term15160, term15160.getClass(), "longOpt", null);
        setField(term15160, term15160.getClass(), "argName", null);
        setField(term15160, term15160.getClass(), "description", null);
        setBooleanField(term15160, term15160.getClass(), "required", false);
        setBooleanField(term15160, term15160.getClass(), "optionalArg", false);
        setIntField(term15160, term15160.getClass(), "numberOfArgs", 0);
        setField(term15160, term15160.getClass(), "type", null);
        setField(term15160, term15160.getClass(), "values", null);
        setCharField(term15160, term15160.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15139;
        Object retValue = callMethod(klass, "equals", argTypes, term15107, args);
        assertTrue(recursiveEquals(term15107, term15159));
        assertTrue(recursiveEquals(term15139, term15160));
        assertTrue(recursiveEquals(retValue, true));
    }

};


