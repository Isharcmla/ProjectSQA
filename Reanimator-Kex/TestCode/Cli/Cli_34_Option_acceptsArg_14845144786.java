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

public class Option_acceptsArg_14845144786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4129;
     Object term12265;

    public Option_acceptsArg_14845144786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4181 = new ArrayList();
        term4129 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4129, term4129.getClass(), "opt", "rLHAoqXgPh");
        setField(term4129, term4129.getClass(), "longOpt", "zUlRdimJtU");
        setField(term4129, term4129.getClass(), "argName", "vwbEQQNQrx");
        setField(term4129, term4129.getClass(), "description", "xtftXXMbem");
        setBooleanField(term4129, term4129.getClass(), "required", true);
        setBooleanField(term4129, term4129.getClass(), "optionalArg", false);
        setIntField(term4129, term4129.getClass(), "numberOfArgs", 767834723);
        setField(term4129, term4129.getClass(), "type", null);
        setField(term4129, term4129.getClass(), "values", term4181);
        setCharField(term4129, term4129.getClass(), "valuesep", 'j');
        ArrayList term12274 = new ArrayList();
        term12265 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term12265, term12265.getClass(), "opt", "rLHAoqXgPh");
        setField(term12265, term12265.getClass(), "longOpt", "zUlRdimJtU");
        setField(term12265, term12265.getClass(), "argName", "vwbEQQNQrx");
        setField(term12265, term12265.getClass(), "description", "xtftXXMbem");
        setBooleanField(term12265, term12265.getClass(), "required", true);
        setBooleanField(term12265, term12265.getClass(), "optionalArg", false);
        setIntField(term12265, term12265.getClass(), "numberOfArgs", 767834723);
        setField(term12265, term12265.getClass(), "type", null);
        setField(term12265, term12265.getClass(), "values", term12274);
        setCharField(term12265, term12265.getClass(), "valuesep", 'j');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acceptsArg", argTypes, term4129, args);
        assertTrue(recursiveEquals(term4129, term12265));
        assertTrue(recursiveEquals(retValue, true));
    }

};


