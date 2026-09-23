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

public class Option_getId_123541895947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159;
     Object term4971;

    public Option_getId_123541895947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term211 = new ArrayList();
        term159 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term159, term159.getClass(), "opt", "MjGYSRKTNF");
        setField(term159, term159.getClass(), "longOpt", "hRNSzYYIrc");
        setField(term159, term159.getClass(), "argName", "RMFIsYGgne");
        setField(term159, term159.getClass(), "description", "NRdvgJlhkX");
        setBooleanField(term159, term159.getClass(), "required", false);
        setBooleanField(term159, term159.getClass(), "optionalArg", false);
        setIntField(term159, term159.getClass(), "numberOfArgs", 568599855);
        setField(term159, term159.getClass(), "type", null);
        setField(term159, term159.getClass(), "values", term211);
        setCharField(term159, term159.getClass(), "valuesep", 'P');
        ArrayList term4980 = new ArrayList();
        term4971 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4971, term4971.getClass(), "opt", "MjGYSRKTNF");
        setField(term4971, term4971.getClass(), "longOpt", "hRNSzYYIrc");
        setField(term4971, term4971.getClass(), "argName", "RMFIsYGgne");
        setField(term4971, term4971.getClass(), "description", "NRdvgJlhkX");
        setBooleanField(term4971, term4971.getClass(), "required", false);
        setBooleanField(term4971, term4971.getClass(), "optionalArg", false);
        setIntField(term4971, term4971.getClass(), "numberOfArgs", 568599855);
        setField(term4971, term4971.getClass(), "type", null);
        setField(term4971, term4971.getClass(), "values", term4980);
        setCharField(term4971, term4971.getClass(), "valuesep", 'P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getId", argTypes, term159, args);
        assertTrue(recursiveEquals(term159, term4971));
        assertTrue(recursiveEquals(retValue, 'M'));
    }

};


