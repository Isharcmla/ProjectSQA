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

public class Option_toString_1002693327201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34005;
     Object term34052;

    public Option_toString_1002693327201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34005 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term34005, term34005.getClass(), "opt", null);
        setField(term34005, term34005.getClass(), "longOpt", null);
        setIntField(term34005, term34005.getClass(), "numberOfArgs", -2);
        term34052 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term34052, term34052.getClass(), "opt", null);
        setField(term34052, term34052.getClass(), "longOpt", null);
        setField(term34052, term34052.getClass(), "argName", null);
        setField(term34052, term34052.getClass(), "description", null);
        setBooleanField(term34052, term34052.getClass(), "required", false);
        setBooleanField(term34052, term34052.getClass(), "optionalArg", false);
        setIntField(term34052, term34052.getClass(), "numberOfArgs", -2);
        setField(term34052, term34052.getClass(), "type", null);
        setField(term34052, term34052.getClass(), "values", null);
        setCharField(term34052, term34052.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term34005, args);
        assertTrue(recursiveEquals(term34005, term34052));
        assertTrue(recursiveEquals(retValue, "[ option: null [ARG...] :: null ]"));
    }

};


