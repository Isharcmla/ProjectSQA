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

public class Option_equals_1962139692122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16283;
     Object term16365;
     Object term16664;
     Object term16665;

    public Option_equals_1962139692122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16283 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term16365 = newInstance(Class.forName("java.lang.Throwable$WrappedPrintWriter"));
        term16664 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term16664, term16664.getClass(), "opt", null);
        setField(term16664, term16664.getClass(), "longOpt", null);
        setField(term16664, term16664.getClass(), "argName", null);
        setField(term16664, term16664.getClass(), "description", null);
        setBooleanField(term16664, term16664.getClass(), "required", false);
        setBooleanField(term16664, term16664.getClass(), "optionalArg", false);
        setIntField(term16664, term16664.getClass(), "numberOfArgs", 0);
        setField(term16664, term16664.getClass(), "type", null);
        setField(term16664, term16664.getClass(), "values", null);
        setCharField(term16664, term16664.getClass(), "valuesep", (char) 0);
        term16665 = newInstance(Class.forName("java.lang.Throwable$WrappedPrintWriter"));
        setField(term16665, term16665.getClass(), "printWriter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16365;
        Object retValue = callMethod(klass, "equals", argTypes, term16283, args);
        assertTrue(recursiveEquals(term16283, term16664));
        assertTrue(recursiveEquals(term16365, term16665));
        assertTrue(recursiveEquals(retValue, false));
    }

};


