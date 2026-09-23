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
import java.lang.Object;

public class Option_add_1254905744223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37370;
     Object term37445;

    public Option_add_1254905744223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37422 = new ArrayList();
        term37370 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term37370, term37370.getClass(), "numberOfArgs", 0);
        setBooleanField(term37370, term37370.getClass(), "optionalArg", true);
        setField(term37370, term37370.getClass(), "values", term37422);
        ArrayList term37446 = new ArrayList();
        ((ArrayList) term37446).add((Object)null);
        term37445 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term37445, term37445.getClass(), "opt", null);
        setField(term37445, term37445.getClass(), "longOpt", null);
        setField(term37445, term37445.getClass(), "argName", null);
        setField(term37445, term37445.getClass(), "description", null);
        setBooleanField(term37445, term37445.getClass(), "required", false);
        setBooleanField(term37445, term37445.getClass(), "optionalArg", true);
        setIntField(term37445, term37445.getClass(), "numberOfArgs", 0);
        setField(term37445, term37445.getClass(), "type", null);
        setField(term37445, term37445.getClass(), "values", term37446);
        setCharField(term37445, term37445.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term37370, args);
        assertTrue(recursiveEquals(term37370, term37445));
    }

};


