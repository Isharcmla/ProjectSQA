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

public class Option_equals_1962139692149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20657;
     Object term20727;
     Object term20819;
     Object term20822;

    public Option_equals_1962139692149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20657 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term20657, term20657.getClass(), "opt", "java.lang.String");
        term20727 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term20819 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term20819, term20819.getClass(), "opt", "java.lang.String");
        setField(term20819, term20819.getClass(), "longOpt", null);
        setField(term20819, term20819.getClass(), "argName", null);
        setField(term20819, term20819.getClass(), "description", null);
        setBooleanField(term20819, term20819.getClass(), "required", false);
        setBooleanField(term20819, term20819.getClass(), "optionalArg", false);
        setIntField(term20819, term20819.getClass(), "numberOfArgs", 0);
        setField(term20819, term20819.getClass(), "type", null);
        setField(term20819, term20819.getClass(), "values", null);
        setCharField(term20819, term20819.getClass(), "valuesep", (char) 0);
        term20822 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term20822, term20822.getClass(), "opt", null);
        setField(term20822, term20822.getClass(), "longOpt", null);
        setField(term20822, term20822.getClass(), "argName", null);
        setField(term20822, term20822.getClass(), "description", null);
        setBooleanField(term20822, term20822.getClass(), "required", false);
        setBooleanField(term20822, term20822.getClass(), "optionalArg", false);
        setIntField(term20822, term20822.getClass(), "numberOfArgs", 0);
        setField(term20822, term20822.getClass(), "type", null);
        setField(term20822, term20822.getClass(), "values", null);
        setCharField(term20822, term20822.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20727;
        Object retValue = callMethod(klass, "equals", argTypes, term20657, args);
        assertTrue(recursiveEquals(term20657, term20819));
        assertTrue(recursiveEquals(term20727, term20822));
        assertTrue(recursiveEquals(retValue, false));
    }

};


