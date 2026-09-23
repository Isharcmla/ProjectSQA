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

public class Option_hasArgs_521147701201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35325;
     Object term35366;

    public Option_hasArgs_521147701201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35325 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term35325, term35325.getClass(), "numberOfArgs", 1);
        term35366 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term35366, term35366.getClass(), "opt", null);
        setField(term35366, term35366.getClass(), "longOpt", null);
        setField(term35366, term35366.getClass(), "argName", null);
        setField(term35366, term35366.getClass(), "description", null);
        setBooleanField(term35366, term35366.getClass(), "required", false);
        setBooleanField(term35366, term35366.getClass(), "optionalArg", false);
        setIntField(term35366, term35366.getClass(), "numberOfArgs", 1);
        setField(term35366, term35366.getClass(), "type", null);
        setField(term35366, term35366.getClass(), "values", null);
        setCharField(term35366, term35366.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasArgs", argTypes, term35325, args);
        assertTrue(recursiveEquals(term35325, term35366));
        assertTrue(recursiveEquals(retValue, false));
    }

};


