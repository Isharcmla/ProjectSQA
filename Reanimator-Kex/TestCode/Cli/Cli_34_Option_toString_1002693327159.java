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

public class Option_toString_1002693327159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23944;
     Object term24032;

    public Option_toString_1002693327159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23944 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term23944, term23944.getClass(), "opt", null);
        setField(term23944, term23944.getClass(), "longOpt", "");
        setIntField(term23944, term23944.getClass(), "numberOfArgs", -2);
        term24032 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term24032, term24032.getClass(), "opt", null);
        setField(term24032, term24032.getClass(), "longOpt", "");
        setField(term24032, term24032.getClass(), "argName", null);
        setField(term24032, term24032.getClass(), "description", null);
        setBooleanField(term24032, term24032.getClass(), "required", false);
        setBooleanField(term24032, term24032.getClass(), "optionalArg", false);
        setIntField(term24032, term24032.getClass(), "numberOfArgs", -2);
        setField(term24032, term24032.getClass(), "type", null);
        setField(term24032, term24032.getClass(), "values", null);
        setCharField(term24032, term24032.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term23944, args);
        assertTrue(recursiveEquals(term23944, term24032));
        assertTrue(recursiveEquals(retValue, "[ option: null  [ARG...] :: null ]"));
    }

};


