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

public class Option_hasLongOpt_33797010793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12928;
     Object term12936;

    public Option_hasLongOpt_33797010793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12928 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term12928, term12928.getClass(), "longOpt", null);
        term12936 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term12936, term12936.getClass(), "opt", null);
        setField(term12936, term12936.getClass(), "longOpt", null);
        setField(term12936, term12936.getClass(), "argName", null);
        setField(term12936, term12936.getClass(), "description", null);
        setBooleanField(term12936, term12936.getClass(), "required", false);
        setBooleanField(term12936, term12936.getClass(), "optionalArg", false);
        setIntField(term12936, term12936.getClass(), "numberOfArgs", 0);
        setField(term12936, term12936.getClass(), "type", null);
        setField(term12936, term12936.getClass(), "values", null);
        setCharField(term12936, term12936.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasLongOpt", argTypes, term12928, args);
        assertTrue(recursiveEquals(term12928, term12936));
        assertTrue(recursiveEquals(retValue, false));
    }

};


