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

public class Option_getValues_10449165377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3233;
     Object term10428;

    public Option_getValues_10449165377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3285 = new ArrayList();
        term3233 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term3233, term3233.getClass(), "opt", "gCWtLVKVVe");
        setField(term3233, term3233.getClass(), "longOpt", "fWKJoSoCwE");
        setField(term3233, term3233.getClass(), "argName", "wfaXBpWAUH");
        setField(term3233, term3233.getClass(), "description", "VMeAzAHwZj");
        setBooleanField(term3233, term3233.getClass(), "required", false);
        setBooleanField(term3233, term3233.getClass(), "optionalArg", false);
        setIntField(term3233, term3233.getClass(), "numberOfArgs", -73683645);
        setField(term3233, term3233.getClass(), "type", null);
        setField(term3233, term3233.getClass(), "values", term3285);
        setCharField(term3233, term3233.getClass(), "valuesep", 'x');
        ArrayList term10437 = new ArrayList();
        term10428 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term10428, term10428.getClass(), "opt", "gCWtLVKVVe");
        setField(term10428, term10428.getClass(), "longOpt", "fWKJoSoCwE");
        setField(term10428, term10428.getClass(), "argName", "wfaXBpWAUH");
        setField(term10428, term10428.getClass(), "description", "VMeAzAHwZj");
        setBooleanField(term10428, term10428.getClass(), "required", false);
        setBooleanField(term10428, term10428.getClass(), "optionalArg", false);
        setIntField(term10428, term10428.getClass(), "numberOfArgs", -73683645);
        setField(term10428, term10428.getClass(), "type", null);
        setField(term10428, term10428.getClass(), "values", term10437);
        setCharField(term10428, term10428.getClass(), "valuesep", 'x');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValues", argTypes, term3233, args);
        assertTrue(recursiveEquals(term3233, term10428));
        assertTrue(recursiveEquals(retValue, null));
    }

};


