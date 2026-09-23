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

public class Option_toString_1002693327125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17293;
     Object term17382;

    public Option_toString_1002693327125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17293 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term17293, term17293.getClass(), "opt", null);
        setField(term17293, term17293.getClass(), "longOpt", "");
        setIntField(term17293, term17293.getClass(), "numberOfArgs", 1);
        term17382 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term17382, term17382.getClass(), "opt", null);
        setField(term17382, term17382.getClass(), "longOpt", "");
        setField(term17382, term17382.getClass(), "argName", null);
        setField(term17382, term17382.getClass(), "description", null);
        setBooleanField(term17382, term17382.getClass(), "required", false);
        setBooleanField(term17382, term17382.getClass(), "optionalArg", false);
        setIntField(term17382, term17382.getClass(), "numberOfArgs", 1);
        setField(term17382, term17382.getClass(), "type", null);
        setField(term17382, term17382.getClass(), "values", null);
        setCharField(term17382, term17382.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term17293, args);
        assertTrue(recursiveEquals(term17293, term17382));
        assertTrue(recursiveEquals(retValue, "[ option: null   [ARG] :: null ]"));
    }

};


