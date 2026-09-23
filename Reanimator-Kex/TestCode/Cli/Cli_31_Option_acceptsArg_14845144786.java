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

public class Option_acceptsArg_14845144786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4169;
     Object term12463;

    public Option_acceptsArg_14845144786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4222 = new ArrayList();
        term4169 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term4221 = newInstance(Class.forName("java.lang.Object"));
        setField(term4169, term4169.getClass(), "opt", "rLHAoqXgPh");
        setField(term4169, term4169.getClass(), "longOpt", "zUlRdimJtU");
        setField(term4169, term4169.getClass(), "argName", "vwbEQQNQrx");
        setField(term4169, term4169.getClass(), "description", "xtftXXMbem");
        setBooleanField(term4169, term4169.getClass(), "required", true);
        setBooleanField(term4169, term4169.getClass(), "optionalArg", false);
        setIntField(term4169, term4169.getClass(), "numberOfArgs", 767834723);
        setField(term4169, term4169.getClass(), "type", term4221);
        setField(term4169, term4169.getClass(), "values", term4222);
        setCharField(term4169, term4169.getClass(), "valuesep", 'j');
        ArrayList term12473 = new ArrayList();
        term12463 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term12472 = newInstance(Class.forName("java.lang.Object"));
        setField(term12463, term12463.getClass(), "opt", "rLHAoqXgPh");
        setField(term12463, term12463.getClass(), "longOpt", "zUlRdimJtU");
        setField(term12463, term12463.getClass(), "argName", "vwbEQQNQrx");
        setField(term12463, term12463.getClass(), "description", "xtftXXMbem");
        setBooleanField(term12463, term12463.getClass(), "required", true);
        setBooleanField(term12463, term12463.getClass(), "optionalArg", false);
        setIntField(term12463, term12463.getClass(), "numberOfArgs", 767834723);
        setField(term12463, term12463.getClass(), "type", term12472);
        setField(term12463, term12463.getClass(), "values", term12473);
        setCharField(term12463, term12463.getClass(), "valuesep", 'j');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acceptsArg", argTypes, term4169, args);
        assertTrue(recursiveEquals(term4169, term12463));
        assertTrue(recursiveEquals(retValue, true));
    }

};


