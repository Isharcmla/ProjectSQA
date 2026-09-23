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

public class Option_setArgName_46127342662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1678;
     Object term7547;

    public Option_setArgName_46127342662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1731 = new ArrayList();
        term1678 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term1730 = newInstance(Class.forName("java.lang.Object"));
        setField(term1678, term1678.getClass(), "opt", "bLPjGVBhlX");
        setField(term1678, term1678.getClass(), "longOpt", "whBvTVIIlC");
        setField(term1678, term1678.getClass(), "argName", "IgRJUzaCwW");
        setField(term1678, term1678.getClass(), "description", "JUmudUmaaV");
        setBooleanField(term1678, term1678.getClass(), "required", false);
        setBooleanField(term1678, term1678.getClass(), "optionalArg", true);
        setIntField(term1678, term1678.getClass(), "numberOfArgs", 597278769);
        setField(term1678, term1678.getClass(), "type", term1730);
        setField(term1678, term1678.getClass(), "values", term1731);
        setCharField(term1678, term1678.getClass(), "valuesep", 'E');
        ArrayList term7557 = new ArrayList();
        term7547 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term7556 = newInstance(Class.forName("java.lang.Object"));
        setField(term7547, term7547.getClass(), "opt", "bLPjGVBhlX");
        setField(term7547, term7547.getClass(), "longOpt", "whBvTVIIlC");
        setField(term7547, term7547.getClass(), "argName", "KoyGrUJeJW");
        setField(term7547, term7547.getClass(), "description", "JUmudUmaaV");
        setBooleanField(term7547, term7547.getClass(), "required", false);
        setBooleanField(term7547, term7547.getClass(), "optionalArg", true);
        setIntField(term7547, term7547.getClass(), "numberOfArgs", 597278769);
        setField(term7547, term7547.getClass(), "type", term7556);
        setField(term7547, term7547.getClass(), "values", term7557);
        setCharField(term7547, term7547.getClass(), "valuesep", 'E');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KoyGrUJeJW";
        callMethod(klass, "setArgName", argTypes, term1678, args);
        assertTrue(recursiveEquals(term1678, term7547));
    }

};


