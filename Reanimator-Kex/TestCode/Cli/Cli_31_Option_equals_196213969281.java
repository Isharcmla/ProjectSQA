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
import java.lang.Object;
import java.util.ArrayList;

public class Option_equals_196213969281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3656;
     Object term3714;
     Object term11339;
     Object term11351;

    public Option_equals_196213969281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3709 = new ArrayList();
        term3656 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3708 = newInstance(Class.forName("java.lang.Object"));
        setField(term3656, term3656.getClass(), "opt", "jwsfVjMoJT");
        setField(term3656, term3656.getClass(), "longOpt", "ZfdXfCCFDf");
        setField(term3656, term3656.getClass(), "argName", "MwwjNtdOFT");
        setField(term3656, term3656.getClass(), "description", "VYkqXKVlAJ");
        setBooleanField(term3656, term3656.getClass(), "required", false);
        setBooleanField(term3656, term3656.getClass(), "optionalArg", false);
        setIntField(term3656, term3656.getClass(), "numberOfArgs", -1530420153);
        setField(term3656, term3656.getClass(), "type", term3708);
        setField(term3656, term3656.getClass(), "values", term3709);
        setCharField(term3656, term3656.getClass(), "valuesep", 'w');
        term3714 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11349 = new ArrayList();
        term11339 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term11348 = newInstance(Class.forName("java.lang.Object"));
        setField(term11339, term11339.getClass(), "opt", "jwsfVjMoJT");
        setField(term11339, term11339.getClass(), "longOpt", "ZfdXfCCFDf");
        setField(term11339, term11339.getClass(), "argName", "MwwjNtdOFT");
        setField(term11339, term11339.getClass(), "description", "VYkqXKVlAJ");
        setBooleanField(term11339, term11339.getClass(), "required", false);
        setBooleanField(term11339, term11339.getClass(), "optionalArg", false);
        setIntField(term11339, term11339.getClass(), "numberOfArgs", -1530420153);
        setField(term11339, term11339.getClass(), "type", term11348);
        setField(term11339, term11339.getClass(), "values", term11349);
        setCharField(term11339, term11339.getClass(), "valuesep", 'w');
        term11351 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3714;
        Object retValue = callMethod(klass, "equals", argTypes, term3656, args);
        assertTrue(recursiveEquals(term3656, term11339));
        assertTrue(recursiveEquals(term3714, term11351));
        assertTrue(recursiveEquals(retValue, false));
    }

};


