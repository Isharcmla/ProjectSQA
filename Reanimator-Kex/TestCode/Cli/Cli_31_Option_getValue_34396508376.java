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

public class Option_getValue_34396508376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3144;
     Object term10372;

    public Option_getValue_34396508376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3197 = new ArrayList();
        term3144 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3196 = newInstance(Class.forName("java.lang.Object"));
        setField(term3144, term3144.getClass(), "opt", "SdCKLMIYnX");
        setField(term3144, term3144.getClass(), "longOpt", "OJJtVNPyKZ");
        setField(term3144, term3144.getClass(), "argName", "AKNapTAfmD");
        setField(term3144, term3144.getClass(), "description", "xJgPlLxpgC");
        setBooleanField(term3144, term3144.getClass(), "required", true);
        setBooleanField(term3144, term3144.getClass(), "optionalArg", true);
        setIntField(term3144, term3144.getClass(), "numberOfArgs", -1179120542);
        setField(term3144, term3144.getClass(), "type", term3196);
        setField(term3144, term3144.getClass(), "values", term3197);
        setCharField(term3144, term3144.getClass(), "valuesep", 'x');
        ArrayList term10382 = new ArrayList();
        term10372 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term10381 = newInstance(Class.forName("java.lang.Object"));
        setField(term10372, term10372.getClass(), "opt", "SdCKLMIYnX");
        setField(term10372, term10372.getClass(), "longOpt", "OJJtVNPyKZ");
        setField(term10372, term10372.getClass(), "argName", "AKNapTAfmD");
        setField(term10372, term10372.getClass(), "description", "xJgPlLxpgC");
        setBooleanField(term10372, term10372.getClass(), "required", true);
        setBooleanField(term10372, term10372.getClass(), "optionalArg", true);
        setIntField(term10372, term10372.getClass(), "numberOfArgs", -1179120542);
        setField(term10372, term10372.getClass(), "type", term10381);
        setField(term10372, term10372.getClass(), "values", term10382);
        setCharField(term10372, term10372.getClass(), "valuesep", 'x');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EYtfuJaxiM";
        Object retValue = callMethod(klass, "getValue", argTypes, term3144, args);
        assertTrue(recursiveEquals(term3144, term10372));
        assertTrue(recursiveEquals(retValue, "EYtfuJaxiM"));
    }

};


