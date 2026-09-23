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
import java.lang.Boolean;

public class Option_setRequired_194114341361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1578;
     Object term1636;
     Object term7382;

    public Option_setRequired_194114341361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1631 = new ArrayList();
        term1578 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term1630 = newInstance(Class.forName("java.lang.Object"));
        setField(term1578, term1578.getClass(), "opt", "uWHnvSvaPl");
        setField(term1578, term1578.getClass(), "longOpt", "kBdSllIBVz");
        setField(term1578, term1578.getClass(), "argName", "TJmVBGfTML");
        setField(term1578, term1578.getClass(), "description", "tPlsykYBqO");
        setBooleanField(term1578, term1578.getClass(), "required", true);
        setBooleanField(term1578, term1578.getClass(), "optionalArg", true);
        setIntField(term1578, term1578.getClass(), "numberOfArgs", 1585847225);
        setField(term1578, term1578.getClass(), "type", term1630);
        setField(term1578, term1578.getClass(), "values", term1631);
        setCharField(term1578, term1578.getClass(), "valuesep", 'A');
        term1636 = new Boolean(true);
        ArrayList term7392 = new ArrayList();
        term7382 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term7391 = newInstance(Class.forName("java.lang.Object"));
        setField(term7382, term7382.getClass(), "opt", "uWHnvSvaPl");
        setField(term7382, term7382.getClass(), "longOpt", "kBdSllIBVz");
        setField(term7382, term7382.getClass(), "argName", "TJmVBGfTML");
        setField(term7382, term7382.getClass(), "description", "tPlsykYBqO");
        setBooleanField(term7382, term7382.getClass(), "required", true);
        setBooleanField(term7382, term7382.getClass(), "optionalArg", true);
        setIntField(term7382, term7382.getClass(), "numberOfArgs", 1585847225);
        setField(term7382, term7382.getClass(), "type", term7391);
        setField(term7382, term7382.getClass(), "values", term7392);
        setCharField(term7382, term7382.getClass(), "valuesep", 'A');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1636;
        callMethod(klass, "setRequired", argTypes, term1578, args);
        assertTrue(recursiveEquals(term1578, term7382));
        assertTrue(recursiveEquals(term1636, true));
    }

};


