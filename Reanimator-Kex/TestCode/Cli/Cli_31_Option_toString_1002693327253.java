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

public class Option_toString_1002693327253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44925;
     Object term45027;

    public Option_toString_1002693327253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44925 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term44925, term44925.getClass(), "opt", null);
        setField(term44925, term44925.getClass(), "longOpt", null);
        setIntField(term44925, term44925.getClass(), "numberOfArgs", 2);
        setField(term44925, term44925.getClass(), "description", null);
        setField(term44925, term44925.getClass(), "type", " :: ");
        term45027 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term45027, term45027.getClass(), "opt", null);
        setField(term45027, term45027.getClass(), "longOpt", null);
        setField(term45027, term45027.getClass(), "argName", null);
        setField(term45027, term45027.getClass(), "description", null);
        setBooleanField(term45027, term45027.getClass(), "required", false);
        setBooleanField(term45027, term45027.getClass(), "optionalArg", false);
        setIntField(term45027, term45027.getClass(), "numberOfArgs", 2);
        setField(term45027, term45027.getClass(), "type", " :: ");
        setField(term45027, term45027.getClass(), "values", null);
        setCharField(term45027, term45027.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term44925, args);
        assertTrue(recursiveEquals(term44925, term45027));
        assertTrue(recursiveEquals(retValue, "[ option: null [ARG...] :: null ::  ::  ]"));
    }

};


