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

public class Option_hasArg_1423945402194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33973;
     Object term34190;

    public Option_hasArg_1423945402194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33973 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term33973, term33973.getClass(), "numberOfArgs", -2);
        term34190 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term34190, term34190.getClass(), "opt", null);
        setField(term34190, term34190.getClass(), "longOpt", null);
        setField(term34190, term34190.getClass(), "argName", null);
        setField(term34190, term34190.getClass(), "description", null);
        setBooleanField(term34190, term34190.getClass(), "required", false);
        setBooleanField(term34190, term34190.getClass(), "optionalArg", false);
        setIntField(term34190, term34190.getClass(), "numberOfArgs", -2);
        setField(term34190, term34190.getClass(), "type", null);
        setField(term34190, term34190.getClass(), "values", null);
        setCharField(term34190, term34190.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasArg", argTypes, term33973, args);
        assertTrue(recursiveEquals(term33973, term34190));
        assertTrue(recursiveEquals(retValue, true));
    }

};


