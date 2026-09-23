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

public class Option_toString_1002693327205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35393;
     Object term35477;

    public Option_toString_1002693327205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35393 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term35393, term35393.getClass(), "opt", null);
        setField(term35393, term35393.getClass(), "longOpt", "");
        setIntField(term35393, term35393.getClass(), "numberOfArgs", -2147483646);
        term35477 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term35477, term35477.getClass(), "opt", null);
        setField(term35477, term35477.getClass(), "longOpt", "");
        setField(term35477, term35477.getClass(), "argName", null);
        setField(term35477, term35477.getClass(), "description", null);
        setBooleanField(term35477, term35477.getClass(), "required", false);
        setBooleanField(term35477, term35477.getClass(), "optionalArg", false);
        setIntField(term35477, term35477.getClass(), "numberOfArgs", -2147483646);
        setField(term35477, term35477.getClass(), "type", null);
        setField(term35477, term35477.getClass(), "values", null);
        setCharField(term35477, term35477.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term35393, args);
        assertTrue(recursiveEquals(term35393, term35477));
        assertTrue(recursiveEquals(retValue, "[ option: null   :: null ]"));
    }

};


