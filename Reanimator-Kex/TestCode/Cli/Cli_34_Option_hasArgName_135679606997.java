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

public class Option_hasArgName_135679606997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13192;
     Object term13498;

    public Option_hasArgName_135679606997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13192 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term13192, term13192.getClass(), "argName", null);
        term13498 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term13498, term13498.getClass(), "opt", null);
        setField(term13498, term13498.getClass(), "longOpt", null);
        setField(term13498, term13498.getClass(), "argName", null);
        setField(term13498, term13498.getClass(), "description", null);
        setBooleanField(term13498, term13498.getClass(), "required", false);
        setBooleanField(term13498, term13498.getClass(), "optionalArg", false);
        setIntField(term13498, term13498.getClass(), "numberOfArgs", 0);
        setField(term13498, term13498.getClass(), "type", null);
        setField(term13498, term13498.getClass(), "values", null);
        setCharField(term13498, term13498.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasArgName", argTypes, term13192, args);
        assertTrue(recursiveEquals(term13192, term13498));
        assertTrue(recursiveEquals(retValue, false));
    }

};


