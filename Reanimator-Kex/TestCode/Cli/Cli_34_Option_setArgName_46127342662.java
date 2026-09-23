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

public class Option_setArgName_46127342662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1662;
     Object term7370;

    public Option_setArgName_46127342662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1714 = new ArrayList();
        term1662 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1662, term1662.getClass(), "opt", "bLPjGVBhlX");
        setField(term1662, term1662.getClass(), "longOpt", "whBvTVIIlC");
        setField(term1662, term1662.getClass(), "argName", "IgRJUzaCwW");
        setField(term1662, term1662.getClass(), "description", "JUmudUmaaV");
        setBooleanField(term1662, term1662.getClass(), "required", false);
        setBooleanField(term1662, term1662.getClass(), "optionalArg", true);
        setIntField(term1662, term1662.getClass(), "numberOfArgs", 597278769);
        setField(term1662, term1662.getClass(), "type", null);
        setField(term1662, term1662.getClass(), "values", term1714);
        setCharField(term1662, term1662.getClass(), "valuesep", 'E');
        ArrayList term7379 = new ArrayList();
        term7370 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term7370, term7370.getClass(), "opt", "bLPjGVBhlX");
        setField(term7370, term7370.getClass(), "longOpt", "whBvTVIIlC");
        setField(term7370, term7370.getClass(), "argName", "KoyGrUJeJW");
        setField(term7370, term7370.getClass(), "description", "JUmudUmaaV");
        setBooleanField(term7370, term7370.getClass(), "required", false);
        setBooleanField(term7370, term7370.getClass(), "optionalArg", true);
        setIntField(term7370, term7370.getClass(), "numberOfArgs", 597278769);
        setField(term7370, term7370.getClass(), "type", null);
        setField(term7370, term7370.getClass(), "values", term7379);
        setCharField(term7370, term7370.getClass(), "valuesep", 'E');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KoyGrUJeJW";
        callMethod(klass, "setArgName", argTypes, term1662, args);
        assertTrue(recursiveEquals(term1662, term7370));
    }

};


