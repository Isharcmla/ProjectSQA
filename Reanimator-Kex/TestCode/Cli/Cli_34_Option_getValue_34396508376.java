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

public class Option_getValue_34396508376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3114;
     Object term10246;

    public Option_getValue_34396508376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3166 = new ArrayList();
        term3114 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term3114, term3114.getClass(), "opt", "SdCKLMIYnX");
        setField(term3114, term3114.getClass(), "longOpt", "OJJtVNPyKZ");
        setField(term3114, term3114.getClass(), "argName", "AKNapTAfmD");
        setField(term3114, term3114.getClass(), "description", "xJgPlLxpgC");
        setBooleanField(term3114, term3114.getClass(), "required", true);
        setBooleanField(term3114, term3114.getClass(), "optionalArg", true);
        setIntField(term3114, term3114.getClass(), "numberOfArgs", -1179120542);
        setField(term3114, term3114.getClass(), "type", null);
        setField(term3114, term3114.getClass(), "values", term3166);
        setCharField(term3114, term3114.getClass(), "valuesep", 'x');
        ArrayList term10255 = new ArrayList();
        term10246 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term10246, term10246.getClass(), "opt", "SdCKLMIYnX");
        setField(term10246, term10246.getClass(), "longOpt", "OJJtVNPyKZ");
        setField(term10246, term10246.getClass(), "argName", "AKNapTAfmD");
        setField(term10246, term10246.getClass(), "description", "xJgPlLxpgC");
        setBooleanField(term10246, term10246.getClass(), "required", true);
        setBooleanField(term10246, term10246.getClass(), "optionalArg", true);
        setIntField(term10246, term10246.getClass(), "numberOfArgs", -1179120542);
        setField(term10246, term10246.getClass(), "type", null);
        setField(term10246, term10246.getClass(), "values", term10255);
        setCharField(term10246, term10246.getClass(), "valuesep", 'x');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EYtfuJaxiM";
        Object retValue = callMethod(klass, "getValue", argTypes, term3114, args);
        assertTrue(recursiveEquals(term3114, term10246));
        assertTrue(recursiveEquals(retValue, "EYtfuJaxiM"));
    }

};


