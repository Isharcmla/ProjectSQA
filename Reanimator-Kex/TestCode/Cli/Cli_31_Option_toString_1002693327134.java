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

public class Option_toString_1002693327134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18670;
     Object term19004;

    public Option_toString_1002693327134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18670 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term18670, term18670.getClass(), "opt", null);
        setField(term18670, term18670.getClass(), "longOpt", null);
        term19004 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term19004, term19004.getClass(), "opt", null);
        setField(term19004, term19004.getClass(), "longOpt", null);
        setField(term19004, term19004.getClass(), "argName", null);
        setField(term19004, term19004.getClass(), "description", null);
        setBooleanField(term19004, term19004.getClass(), "required", false);
        setBooleanField(term19004, term19004.getClass(), "optionalArg", false);
        setIntField(term19004, term19004.getClass(), "numberOfArgs", 0);
        setField(term19004, term19004.getClass(), "type", null);
        setField(term19004, term19004.getClass(), "values", null);
        setCharField(term19004, term19004.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term18670, args);
        assertTrue(recursiveEquals(term18670, term19004));
        assertTrue(recursiveEquals(retValue, "[ option: null  :: null ]"));
    }

};


