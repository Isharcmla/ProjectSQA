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

public class Option_getLongOpt_66861836452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term650;
     Object term5852;

    public Option_getLongOpt_66861836452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term703 = new ArrayList();
        term650 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term702 = newInstance(Class.forName("java.lang.Object"));
        setField(term650, term650.getClass(), "opt", "OclPbYPkcH");
        setField(term650, term650.getClass(), "longOpt", "IoAlmYsBwc");
        setField(term650, term650.getClass(), "argName", "TEParAifyi");
        setField(term650, term650.getClass(), "description", "OWDIEULEFu");
        setBooleanField(term650, term650.getClass(), "required", false);
        setBooleanField(term650, term650.getClass(), "optionalArg", true);
        setIntField(term650, term650.getClass(), "numberOfArgs", -616727354);
        setField(term650, term650.getClass(), "type", term702);
        setField(term650, term650.getClass(), "values", term703);
        setCharField(term650, term650.getClass(), "valuesep", 'n');
        ArrayList term5862 = new ArrayList();
        term5852 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term5861 = newInstance(Class.forName("java.lang.Object"));
        setField(term5852, term5852.getClass(), "opt", "OclPbYPkcH");
        setField(term5852, term5852.getClass(), "longOpt", "IoAlmYsBwc");
        setField(term5852, term5852.getClass(), "argName", "TEParAifyi");
        setField(term5852, term5852.getClass(), "description", "OWDIEULEFu");
        setBooleanField(term5852, term5852.getClass(), "required", false);
        setBooleanField(term5852, term5852.getClass(), "optionalArg", true);
        setIntField(term5852, term5852.getClass(), "numberOfArgs", -616727354);
        setField(term5852, term5852.getClass(), "type", term5861);
        setField(term5852, term5852.getClass(), "values", term5862);
        setCharField(term5852, term5852.getClass(), "valuesep", 'n');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLongOpt", argTypes, term650, args);
        assertTrue(recursiveEquals(term650, term5852));
        assertTrue(recursiveEquals(retValue, "IoAlmYsBwc"));
    }

};


