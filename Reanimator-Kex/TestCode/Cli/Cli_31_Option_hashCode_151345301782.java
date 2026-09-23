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

public class Option_hashCode_151345301782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3755;
     Object term11494;

    public Option_hashCode_151345301782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3808 = new ArrayList();
        term3755 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3807 = newInstance(Class.forName("java.lang.Object"));
        setField(term3755, term3755.getClass(), "opt", "XkIoWJRNwN");
        setField(term3755, term3755.getClass(), "longOpt", "aNWLJdrZMq");
        setField(term3755, term3755.getClass(), "argName", "HHmNoYxIGj");
        setField(term3755, term3755.getClass(), "description", "PtirvZmsGt");
        setBooleanField(term3755, term3755.getClass(), "required", false);
        setBooleanField(term3755, term3755.getClass(), "optionalArg", false);
        setIntField(term3755, term3755.getClass(), "numberOfArgs", -469968304);
        setField(term3755, term3755.getClass(), "type", term3807);
        setField(term3755, term3755.getClass(), "values", term3808);
        setCharField(term3755, term3755.getClass(), "valuesep", 'D');
        ArrayList term11504 = new ArrayList();
        term11494 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term11503 = newInstance(Class.forName("java.lang.Object"));
        setField(term11494, term11494.getClass(), "opt", "XkIoWJRNwN");
        setField(term11494, term11494.getClass(), "longOpt", "aNWLJdrZMq");
        setField(term11494, term11494.getClass(), "argName", "HHmNoYxIGj");
        setField(term11494, term11494.getClass(), "description", "PtirvZmsGt");
        setBooleanField(term11494, term11494.getClass(), "required", false);
        setBooleanField(term11494, term11494.getClass(), "optionalArg", false);
        setIntField(term11494, term11494.getClass(), "numberOfArgs", -469968304);
        setField(term11494, term11494.getClass(), "type", term11503);
        setField(term11494, term11494.getClass(), "values", term11504);
        setCharField(term11494, term11494.getClass(), "valuesep", 'D');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3755, args);
        assertTrue(recursiveEquals(term3755, term11494));
        assertTrue(recursiveEquals(retValue, 1529732137));
    }

};


