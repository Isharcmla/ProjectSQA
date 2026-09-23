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

public class Option_hasArgName_135679606989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12717;
     Object term12767;

    public Option_hasArgName_135679606989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12717 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term12717, term12717.getClass(), "argName", "");
        term12767 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term12767, term12767.getClass(), "opt", null);
        setField(term12767, term12767.getClass(), "longOpt", null);
        setField(term12767, term12767.getClass(), "argName", "");
        setField(term12767, term12767.getClass(), "description", null);
        setBooleanField(term12767, term12767.getClass(), "required", false);
        setBooleanField(term12767, term12767.getClass(), "optionalArg", false);
        setIntField(term12767, term12767.getClass(), "numberOfArgs", 0);
        setField(term12767, term12767.getClass(), "type", null);
        setField(term12767, term12767.getClass(), "values", null);
        setCharField(term12767, term12767.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasArgName", argTypes, term12717, args);
        assertTrue(recursiveEquals(term12717, term12767));
        assertTrue(recursiveEquals(retValue, false));
    }

};


