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

public class OptionBuilder_create_94932080447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1842;

    public OptionBuilder_create_94932080447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        setField(null, Class.forName("org.apache.commons.cli.OptionBuilder"), "description", "");
        ArrayList term1856 = new ArrayList();
        term1842 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1842, term1842.getClass(), "opt", " ");
        setField(term1842, term1842.getClass(), "longOpt", null);
        setField(term1842, term1842.getClass(), "argName", "arg");
        setField(term1842, term1842.getClass(), "description", "");
        setBooleanField(term1842, term1842.getClass(), "required", false);
        setBooleanField(term1842, term1842.getClass(), "optionalArg", false);
        setIntField(term1842, term1842.getClass(), "numberOfArgs", -1);
        setField(term1842, term1842.getClass(), "type", null);
        setField(term1842, term1842.getClass(), "values", term1856);
        setCharField(term1842, term1842.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        Object retValue = callMethod(klass, "create", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1842));
    }

};


