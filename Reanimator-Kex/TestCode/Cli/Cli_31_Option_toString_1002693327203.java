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

public class Option_toString_1002693327203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34705;
     Object term34753;

    public Option_toString_1002693327203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34705 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term34705, term34705.getClass(), "opt", null);
        setField(term34705, term34705.getClass(), "longOpt", null);
        setIntField(term34705, term34705.getClass(), "numberOfArgs", 1);
        term34753 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term34753, term34753.getClass(), "opt", null);
        setField(term34753, term34753.getClass(), "longOpt", null);
        setField(term34753, term34753.getClass(), "argName", null);
        setField(term34753, term34753.getClass(), "description", null);
        setBooleanField(term34753, term34753.getClass(), "required", false);
        setBooleanField(term34753, term34753.getClass(), "optionalArg", false);
        setIntField(term34753, term34753.getClass(), "numberOfArgs", 1);
        setField(term34753, term34753.getClass(), "type", null);
        setField(term34753, term34753.getClass(), "values", null);
        setCharField(term34753, term34753.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term34705, args);
        assertTrue(recursiveEquals(term34705, term34753));
        assertTrue(recursiveEquals(retValue, "[ option: null  [ARG] :: null ]"));
    }

};


