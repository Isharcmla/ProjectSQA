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

public class Option_toString_1002693327277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49299;
     Object term49402;

    public Option_toString_1002693327277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49299 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term49299, term49299.getClass(), "opt", null);
        setField(term49299, term49299.getClass(), "longOpt", null);
        setIntField(term49299, term49299.getClass(), "numberOfArgs", -2);
        setField(term49299, term49299.getClass(), "description", null);
        setField(term49299, term49299.getClass(), "type", " :: ");
        term49402 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term49402, term49402.getClass(), "opt", null);
        setField(term49402, term49402.getClass(), "longOpt", null);
        setField(term49402, term49402.getClass(), "argName", null);
        setField(term49402, term49402.getClass(), "description", null);
        setBooleanField(term49402, term49402.getClass(), "required", false);
        setBooleanField(term49402, term49402.getClass(), "optionalArg", false);
        setIntField(term49402, term49402.getClass(), "numberOfArgs", -2);
        setField(term49402, term49402.getClass(), "type", " :: ");
        setField(term49402, term49402.getClass(), "values", null);
        setCharField(term49402, term49402.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term49299, args);
        assertTrue(recursiveEquals(term49299, term49402));
        assertTrue(recursiveEquals(retValue, "[ option: null [ARG...] :: null ::  ::  ]"));
    }

};


