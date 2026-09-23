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

public class Option_isRequired_66256050560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1466;
     Object term7061;

    public Option_isRequired_66256050560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1518 = new ArrayList();
        term1466 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1466, term1466.getClass(), "opt", "dEnhdmILtU");
        setField(term1466, term1466.getClass(), "longOpt", "hoicvmsovO");
        setField(term1466, term1466.getClass(), "argName", "eqJfYWRaEL");
        setField(term1466, term1466.getClass(), "description", "fhkbdRViHi");
        setBooleanField(term1466, term1466.getClass(), "required", true);
        setBooleanField(term1466, term1466.getClass(), "optionalArg", true);
        setIntField(term1466, term1466.getClass(), "numberOfArgs", -883034806);
        setField(term1466, term1466.getClass(), "type", null);
        setField(term1466, term1466.getClass(), "values", term1518);
        setCharField(term1466, term1466.getClass(), "valuesep", 'J');
        ArrayList term7070 = new ArrayList();
        term7061 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term7061, term7061.getClass(), "opt", "dEnhdmILtU");
        setField(term7061, term7061.getClass(), "longOpt", "hoicvmsovO");
        setField(term7061, term7061.getClass(), "argName", "eqJfYWRaEL");
        setField(term7061, term7061.getClass(), "description", "fhkbdRViHi");
        setBooleanField(term7061, term7061.getClass(), "required", true);
        setBooleanField(term7061, term7061.getClass(), "optionalArg", true);
        setIntField(term7061, term7061.getClass(), "numberOfArgs", -883034806);
        setField(term7061, term7061.getClass(), "type", null);
        setField(term7061, term7061.getClass(), "values", term7070);
        setCharField(term7061, term7061.getClass(), "valuesep", 'J');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRequired", argTypes, term1466, args);
        assertTrue(recursiveEquals(term1466, term7061));
    }

};


