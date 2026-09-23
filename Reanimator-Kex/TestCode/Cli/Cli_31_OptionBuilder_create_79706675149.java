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

public class OptionBuilder_create_79706675149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1947;

    public OptionBuilder_create_79706675149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        setField(null, Class.forName("org.apache.commons.cli.OptionBuilder"), "description", null);
        ArrayList term1956 = new ArrayList();
        term1947 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1947, term1947.getClass(), "opt", null);
        setField(term1947, term1947.getClass(), "longOpt", null);
        setField(term1947, term1947.getClass(), "argName", "arg");
        setField(term1947, term1947.getClass(), "description", null);
        setBooleanField(term1947, term1947.getClass(), "required", false);
        setBooleanField(term1947, term1947.getClass(), "optionalArg", false);
        setIntField(term1947, term1947.getClass(), "numberOfArgs", -1);
        setField(term1947, term1947.getClass(), "type", null);
        setField(term1947, term1947.getClass(), "values", term1956);
        setCharField(term1947, term1947.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "create", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1947));
    }

};


