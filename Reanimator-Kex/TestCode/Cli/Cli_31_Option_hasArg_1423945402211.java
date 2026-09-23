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

public class Option_hasArg_1423945402211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36247;
     Object term36256;

    public Option_hasArg_1423945402211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36247 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term36247, term36247.getClass(), "numberOfArgs", -2);
        term36256 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term36256, term36256.getClass(), "opt", null);
        setField(term36256, term36256.getClass(), "longOpt", null);
        setField(term36256, term36256.getClass(), "argName", null);
        setField(term36256, term36256.getClass(), "description", null);
        setBooleanField(term36256, term36256.getClass(), "required", false);
        setBooleanField(term36256, term36256.getClass(), "optionalArg", false);
        setIntField(term36256, term36256.getClass(), "numberOfArgs", -2);
        setField(term36256, term36256.getClass(), "type", null);
        setField(term36256, term36256.getClass(), "values", null);
        setCharField(term36256, term36256.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasArg", argTypes, term36247, args);
        assertTrue(recursiveEquals(term36247, term36256));
        assertTrue(recursiveEquals(retValue, true));
    }

};


