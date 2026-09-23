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
import java.util.ArrayList;

public class Option_hasNoValues_174921116380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3524;
     Object term10993;

    public Option_hasNoValues_174921116380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3576 = new ArrayList();
        term3524 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term3524, term3524.getClass(), "opt", "UfQtPRyWRC");
        setField(term3524, term3524.getClass(), "longOpt", "FPvxVzzSvD");
        setField(term3524, term3524.getClass(), "argName", "WHcwFgsGFC");
        setField(term3524, term3524.getClass(), "description", "HzqpegHiRq");
        setBooleanField(term3524, term3524.getClass(), "required", false);
        setBooleanField(term3524, term3524.getClass(), "optionalArg", false);
        setIntField(term3524, term3524.getClass(), "numberOfArgs", -1087774327);
        setField(term3524, term3524.getClass(), "type", null);
        setField(term3524, term3524.getClass(), "values", term3576);
        setCharField(term3524, term3524.getClass(), "valuesep", 'P');
        ArrayList term11002 = new ArrayList();
        term10993 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term10993, term10993.getClass(), "opt", "UfQtPRyWRC");
        setField(term10993, term10993.getClass(), "longOpt", "FPvxVzzSvD");
        setField(term10993, term10993.getClass(), "argName", "WHcwFgsGFC");
        setField(term10993, term10993.getClass(), "description", "HzqpegHiRq");
        setBooleanField(term10993, term10993.getClass(), "required", false);
        setBooleanField(term10993, term10993.getClass(), "optionalArg", false);
        setIntField(term10993, term10993.getClass(), "numberOfArgs", -1087774327);
        setField(term10993, term10993.getClass(), "type", null);
        setField(term10993, term10993.getClass(), "values", term11002);
        setCharField(term10993, term10993.getClass(), "valuesep", 'P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNoValues", argTypes, term3524, args);
        assertTrue(recursiveEquals(term3524, term10993));
    }

};


