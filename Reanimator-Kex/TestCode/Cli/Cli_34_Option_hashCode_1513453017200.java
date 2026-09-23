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

public class Option_hashCode_1513453017200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35214;
     Object term35354;

    public Option_hashCode_1513453017200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35214 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term35214, term35214.getClass(), "opt", null);
        setField(term35214, term35214.getClass(), "longOpt", "");
        term35354 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term35354, term35354.getClass(), "opt", null);
        setField(term35354, term35354.getClass(), "longOpt", "");
        setField(term35354, term35354.getClass(), "argName", null);
        setField(term35354, term35354.getClass(), "description", null);
        setBooleanField(term35354, term35354.getClass(), "required", false);
        setBooleanField(term35354, term35354.getClass(), "optionalArg", false);
        setIntField(term35354, term35354.getClass(), "numberOfArgs", 0);
        setField(term35354, term35354.getClass(), "type", null);
        setField(term35354, term35354.getClass(), "values", null);
        setCharField(term35354, term35354.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term35214, args);
        assertTrue(recursiveEquals(term35214, term35354));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


