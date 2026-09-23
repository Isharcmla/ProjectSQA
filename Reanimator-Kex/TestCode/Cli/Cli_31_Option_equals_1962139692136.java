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

public class Option_equals_1962139692136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18891;
     Object term18961;
     Object term19177;
     Object term19178;

    public Option_equals_1962139692136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18891 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term18961 = newInstance(Class.forName("java.util.Collections$SetFromMap"));
        term19177 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term19177, term19177.getClass(), "opt", null);
        setField(term19177, term19177.getClass(), "longOpt", null);
        setField(term19177, term19177.getClass(), "argName", null);
        setField(term19177, term19177.getClass(), "description", null);
        setBooleanField(term19177, term19177.getClass(), "required", false);
        setBooleanField(term19177, term19177.getClass(), "optionalArg", false);
        setIntField(term19177, term19177.getClass(), "numberOfArgs", 0);
        setField(term19177, term19177.getClass(), "type", null);
        setField(term19177, term19177.getClass(), "values", null);
        setCharField(term19177, term19177.getClass(), "valuesep", (char) 0);
        term19178 = newInstance(Class.forName("java.util.Collections$SetFromMap"));
        setField(term19178, term19178.getClass(), "m", null);
        setField(term19178, term19178.getClass(), "s", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18961;
        Object retValue = callMethod(klass, "equals", argTypes, term18891, args);
        assertTrue(recursiveEquals(term18891, term19177));
        assertTrue(recursiveEquals(term18961, term19178));
        assertTrue(recursiveEquals(retValue, false));
    }

};


