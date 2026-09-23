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

public class Option_equals_196213969281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3621;
     Object term3678;
     Object term11146;
     Object term11157;

    public Option_equals_196213969281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3673 = new ArrayList();
        term3621 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term3621, term3621.getClass(), "opt", "jwsfVjMoJT");
        setField(term3621, term3621.getClass(), "longOpt", "ZfdXfCCFDf");
        setField(term3621, term3621.getClass(), "argName", "MwwjNtdOFT");
        setField(term3621, term3621.getClass(), "description", "VYkqXKVlAJ");
        setBooleanField(term3621, term3621.getClass(), "required", false);
        setBooleanField(term3621, term3621.getClass(), "optionalArg", false);
        setIntField(term3621, term3621.getClass(), "numberOfArgs", -1530420153);
        setField(term3621, term3621.getClass(), "type", null);
        setField(term3621, term3621.getClass(), "values", term3673);
        setCharField(term3621, term3621.getClass(), "valuesep", 'w');
        term3678 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11155 = new ArrayList();
        term11146 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term11146, term11146.getClass(), "opt", "jwsfVjMoJT");
        setField(term11146, term11146.getClass(), "longOpt", "ZfdXfCCFDf");
        setField(term11146, term11146.getClass(), "argName", "MwwjNtdOFT");
        setField(term11146, term11146.getClass(), "description", "VYkqXKVlAJ");
        setBooleanField(term11146, term11146.getClass(), "required", false);
        setBooleanField(term11146, term11146.getClass(), "optionalArg", false);
        setIntField(term11146, term11146.getClass(), "numberOfArgs", -1530420153);
        setField(term11146, term11146.getClass(), "type", null);
        setField(term11146, term11146.getClass(), "values", term11155);
        setCharField(term11146, term11146.getClass(), "valuesep", 'w');
        term11157 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3678;
        Object retValue = callMethod(klass, "equals", argTypes, term3621, args);
        assertTrue(recursiveEquals(term3621, term11146));
        assertTrue(recursiveEquals(term3678, term11157));
        assertTrue(recursiveEquals(retValue, false));
    }

};


