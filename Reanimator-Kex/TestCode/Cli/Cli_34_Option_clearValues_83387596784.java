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

public class Option_clearValues_83387596784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3913;
     Object term11694;

    public Option_clearValues_83387596784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3965 = new ArrayList();
        term3913 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term3913, term3913.getClass(), "opt", "BRIVNtfUWU");
        setField(term3913, term3913.getClass(), "longOpt", "DbiCVtPPCT");
        setField(term3913, term3913.getClass(), "argName", "WzFopsaDuG");
        setField(term3913, term3913.getClass(), "description", "PapWxkhEWe");
        setBooleanField(term3913, term3913.getClass(), "required", false);
        setBooleanField(term3913, term3913.getClass(), "optionalArg", true);
        setIntField(term3913, term3913.getClass(), "numberOfArgs", 679763016);
        setField(term3913, term3913.getClass(), "type", null);
        setField(term3913, term3913.getClass(), "values", term3965);
        setCharField(term3913, term3913.getClass(), "valuesep", 'F');
        ArrayList term11703 = new ArrayList();
        term11694 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term11694, term11694.getClass(), "opt", "BRIVNtfUWU");
        setField(term11694, term11694.getClass(), "longOpt", "DbiCVtPPCT");
        setField(term11694, term11694.getClass(), "argName", "WzFopsaDuG");
        setField(term11694, term11694.getClass(), "description", "PapWxkhEWe");
        setBooleanField(term11694, term11694.getClass(), "required", false);
        setBooleanField(term11694, term11694.getClass(), "optionalArg", true);
        setIntField(term11694, term11694.getClass(), "numberOfArgs", 679763016);
        setField(term11694, term11694.getClass(), "type", null);
        setField(term11694, term11694.getClass(), "values", term11703);
        setCharField(term11694, term11694.getClass(), "valuesep", 'F');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearValues", argTypes, term3913, args);
        assertTrue(recursiveEquals(term3913, term11694));
    }

};


