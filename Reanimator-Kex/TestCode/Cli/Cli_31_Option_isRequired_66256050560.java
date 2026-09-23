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

public class Option_isRequired_66256050560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1480;
     Object term7161;

    public Option_isRequired_66256050560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1533 = new ArrayList();
        term1480 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term1532 = newInstance(Class.forName("java.lang.Object"));
        setField(term1480, term1480.getClass(), "opt", "dEnhdmILtU");
        setField(term1480, term1480.getClass(), "longOpt", "hoicvmsovO");
        setField(term1480, term1480.getClass(), "argName", "eqJfYWRaEL");
        setField(term1480, term1480.getClass(), "description", "fhkbdRViHi");
        setBooleanField(term1480, term1480.getClass(), "required", true);
        setBooleanField(term1480, term1480.getClass(), "optionalArg", true);
        setIntField(term1480, term1480.getClass(), "numberOfArgs", -883034806);
        setField(term1480, term1480.getClass(), "type", term1532);
        setField(term1480, term1480.getClass(), "values", term1533);
        setCharField(term1480, term1480.getClass(), "valuesep", 'J');
        ArrayList term7171 = new ArrayList();
        term7161 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term7170 = newInstance(Class.forName("java.lang.Object"));
        setField(term7161, term7161.getClass(), "opt", "dEnhdmILtU");
        setField(term7161, term7161.getClass(), "longOpt", "hoicvmsovO");
        setField(term7161, term7161.getClass(), "argName", "eqJfYWRaEL");
        setField(term7161, term7161.getClass(), "description", "fhkbdRViHi");
        setBooleanField(term7161, term7161.getClass(), "required", true);
        setBooleanField(term7161, term7161.getClass(), "optionalArg", true);
        setIntField(term7161, term7161.getClass(), "numberOfArgs", -883034806);
        setField(term7161, term7161.getClass(), "type", term7170);
        setField(term7161, term7161.getClass(), "values", term7171);
        setCharField(term7161, term7161.getClass(), "valuesep", 'J');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRequired", argTypes, term1480, args);
        assertTrue(recursiveEquals(term1480, term7161));
    }

};


