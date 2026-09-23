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

public class Option_hasArgs_521147701221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37262;
     Object term37271;

    public Option_hasArgs_521147701221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37262 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term37262, term37262.getClass(), "numberOfArgs", -2);
        term37271 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term37271, term37271.getClass(), "opt", null);
        setField(term37271, term37271.getClass(), "longOpt", null);
        setField(term37271, term37271.getClass(), "argName", null);
        setField(term37271, term37271.getClass(), "description", null);
        setBooleanField(term37271, term37271.getClass(), "required", false);
        setBooleanField(term37271, term37271.getClass(), "optionalArg", false);
        setIntField(term37271, term37271.getClass(), "numberOfArgs", -2);
        setField(term37271, term37271.getClass(), "type", null);
        setField(term37271, term37271.getClass(), "values", null);
        setCharField(term37271, term37271.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasArgs", argTypes, term37262, args);
        assertTrue(recursiveEquals(term37262, term37271));
        assertTrue(recursiveEquals(retValue, true));
    }

};


