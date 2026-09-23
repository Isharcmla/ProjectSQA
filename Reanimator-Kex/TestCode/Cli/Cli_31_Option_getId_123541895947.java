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

public class Option_getId_123541895947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159;
     Object term5044;

    public Option_getId_123541895947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term212 = new ArrayList();
        term159 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term211 = newInstance(Class.forName("java.lang.Object"));
        setField(term159, term159.getClass(), "opt", "MjGYSRKTNF");
        setField(term159, term159.getClass(), "longOpt", "hRNSzYYIrc");
        setField(term159, term159.getClass(), "argName", "RMFIsYGgne");
        setField(term159, term159.getClass(), "description", "NRdvgJlhkX");
        setBooleanField(term159, term159.getClass(), "required", false);
        setBooleanField(term159, term159.getClass(), "optionalArg", false);
        setIntField(term159, term159.getClass(), "numberOfArgs", 568599855);
        setField(term159, term159.getClass(), "type", term211);
        setField(term159, term159.getClass(), "values", term212);
        setCharField(term159, term159.getClass(), "valuesep", 'P');
        ArrayList term5054 = new ArrayList();
        term5044 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term5053 = newInstance(Class.forName("java.lang.Object"));
        setField(term5044, term5044.getClass(), "opt", "MjGYSRKTNF");
        setField(term5044, term5044.getClass(), "longOpt", "hRNSzYYIrc");
        setField(term5044, term5044.getClass(), "argName", "RMFIsYGgne");
        setField(term5044, term5044.getClass(), "description", "NRdvgJlhkX");
        setBooleanField(term5044, term5044.getClass(), "required", false);
        setBooleanField(term5044, term5044.getClass(), "optionalArg", false);
        setIntField(term5044, term5044.getClass(), "numberOfArgs", 568599855);
        setField(term5044, term5044.getClass(), "type", term5053);
        setField(term5044, term5044.getClass(), "values", term5054);
        setCharField(term5044, term5044.getClass(), "valuesep", 'P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getId", argTypes, term159, args);
        assertTrue(recursiveEquals(term159, term5044));
        assertTrue(recursiveEquals(retValue, 'M'));
    }

};


