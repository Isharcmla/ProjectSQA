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

public class Option_toString_1002693327121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16763;
     Object term16853;

    public Option_toString_1002693327121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16763 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term16763, term16763.getClass(), "opt", null);
        setField(term16763, term16763.getClass(), "longOpt", "");
        setIntField(term16763, term16763.getClass(), "numberOfArgs", 1);
        term16853 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term16853, term16853.getClass(), "opt", null);
        setField(term16853, term16853.getClass(), "longOpt", "");
        setField(term16853, term16853.getClass(), "argName", null);
        setField(term16853, term16853.getClass(), "description", null);
        setBooleanField(term16853, term16853.getClass(), "required", false);
        setBooleanField(term16853, term16853.getClass(), "optionalArg", false);
        setIntField(term16853, term16853.getClass(), "numberOfArgs", 1);
        setField(term16853, term16853.getClass(), "type", null);
        setField(term16853, term16853.getClass(), "values", null);
        setCharField(term16853, term16853.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term16763, args);
        assertTrue(recursiveEquals(term16763, term16853));
        assertTrue(recursiveEquals(retValue, "[ option: null   [ARG] :: null ]"));
    }

};


