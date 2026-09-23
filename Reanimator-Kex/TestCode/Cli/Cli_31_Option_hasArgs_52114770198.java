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

public class Option_hasArgs_52114770198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13717;
     Object term14002;

    public Option_hasArgs_52114770198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13717 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term13717, term13717.getClass(), "numberOfArgs", 1);
        term14002 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14002, term14002.getClass(), "opt", null);
        setField(term14002, term14002.getClass(), "longOpt", null);
        setField(term14002, term14002.getClass(), "argName", null);
        setField(term14002, term14002.getClass(), "description", null);
        setBooleanField(term14002, term14002.getClass(), "required", false);
        setBooleanField(term14002, term14002.getClass(), "optionalArg", false);
        setIntField(term14002, term14002.getClass(), "numberOfArgs", 1);
        setField(term14002, term14002.getClass(), "type", null);
        setField(term14002, term14002.getClass(), "values", null);
        setCharField(term14002, term14002.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasArgs", argTypes, term13717, args);
        assertTrue(recursiveEquals(term13717, term14002));
        assertTrue(recursiveEquals(retValue, false));
    }

};


