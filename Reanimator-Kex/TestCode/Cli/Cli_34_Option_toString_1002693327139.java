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

public class Option_toString_1002693327139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19436;
     Object term19480;

    public Option_toString_1002693327139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19436 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term19436, term19436.getClass(), "opt", null);
        setField(term19436, term19436.getClass(), "longOpt", null);
        term19480 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term19480, term19480.getClass(), "opt", null);
        setField(term19480, term19480.getClass(), "longOpt", null);
        setField(term19480, term19480.getClass(), "argName", null);
        setField(term19480, term19480.getClass(), "description", null);
        setBooleanField(term19480, term19480.getClass(), "required", false);
        setBooleanField(term19480, term19480.getClass(), "optionalArg", false);
        setIntField(term19480, term19480.getClass(), "numberOfArgs", 0);
        setField(term19480, term19480.getClass(), "type", null);
        setField(term19480, term19480.getClass(), "values", null);
        setCharField(term19480, term19480.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term19436, args);
        assertTrue(recursiveEquals(term19436, term19480));
        assertTrue(recursiveEquals(retValue, "[ option: null  :: null ]"));
    }

};


