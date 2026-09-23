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

public class Option_hasArgName_1356796069119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16044;
     Object term16052;

    public Option_hasArgName_1356796069119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16044 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term16044, term16044.getClass(), "argName", null);
        term16052 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term16052, term16052.getClass(), "opt", null);
        setField(term16052, term16052.getClass(), "longOpt", null);
        setField(term16052, term16052.getClass(), "argName", null);
        setField(term16052, term16052.getClass(), "description", null);
        setBooleanField(term16052, term16052.getClass(), "required", false);
        setBooleanField(term16052, term16052.getClass(), "optionalArg", false);
        setIntField(term16052, term16052.getClass(), "numberOfArgs", 0);
        setField(term16052, term16052.getClass(), "type", null);
        setField(term16052, term16052.getClass(), "values", null);
        setCharField(term16052, term16052.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasArgName", argTypes, term16044, args);
        assertTrue(recursiveEquals(term16044, term16052));
        assertTrue(recursiveEquals(retValue, false));
    }

};


