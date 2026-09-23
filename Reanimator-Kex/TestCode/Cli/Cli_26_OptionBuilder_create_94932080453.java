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

public class OptionBuilder_create_94932080453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1964;

    public OptionBuilder_create_94932080453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        setField(null, Class.forName("org.apache.commons.cli.OptionBuilder"), "description", null);
        ArrayList term1976 = new ArrayList();
        term1964 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1964, term1964.getClass(), "opt", "\b");
        setField(term1964, term1964.getClass(), "longOpt", null);
        setField(term1964, term1964.getClass(), "argName", "arg");
        setField(term1964, term1964.getClass(), "description", null);
        setBooleanField(term1964, term1964.getClass(), "required", false);
        setBooleanField(term1964, term1964.getClass(), "optionalArg", false);
        setIntField(term1964, term1964.getClass(), "numberOfArgs", -1);
        setField(term1964, term1964.getClass(), "type", null);
        setField(term1964, term1964.getClass(), "values", term1976);
        setCharField(term1964, term1964.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 8;
        Object retValue = callMethod(klass, "create", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1964));
    }

};


