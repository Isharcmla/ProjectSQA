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

public class Option_getKey_1185522764103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14098;
     Object term14105;

    public Option_getKey_1185522764103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14098 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14098, term14098.getClass(), "opt", null);
        term14105 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14105, term14105.getClass(), "opt", null);
        setField(term14105, term14105.getClass(), "longOpt", null);
        setField(term14105, term14105.getClass(), "argName", null);
        setField(term14105, term14105.getClass(), "description", null);
        setBooleanField(term14105, term14105.getClass(), "required", false);
        setBooleanField(term14105, term14105.getClass(), "optionalArg", false);
        setIntField(term14105, term14105.getClass(), "numberOfArgs", 0);
        setField(term14105, term14105.getClass(), "type", null);
        setField(term14105, term14105.getClass(), "values", null);
        setCharField(term14105, term14105.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getKey", argTypes, term14098, args);
        assertTrue(recursiveEquals(term14098, term14105));
        assertTrue(recursiveEquals(retValue, null));
    }

};


