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

public class Option_equals_1962139692109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14909;
     Object term14941;
     Object term14962;
     Object term14963;

    public Option_equals_1962139692109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14909 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term14941 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term14962 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14962, term14962.getClass(), "opt", null);
        setField(term14962, term14962.getClass(), "longOpt", null);
        setField(term14962, term14962.getClass(), "argName", null);
        setField(term14962, term14962.getClass(), "description", null);
        setBooleanField(term14962, term14962.getClass(), "required", false);
        setBooleanField(term14962, term14962.getClass(), "optionalArg", false);
        setIntField(term14962, term14962.getClass(), "numberOfArgs", 0);
        setField(term14962, term14962.getClass(), "type", null);
        setField(term14962, term14962.getClass(), "values", null);
        setCharField(term14962, term14962.getClass(), "valuesep", (char) 0);
        term14963 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14963, term14963.getClass(), "opt", null);
        setField(term14963, term14963.getClass(), "longOpt", null);
        setField(term14963, term14963.getClass(), "argName", null);
        setField(term14963, term14963.getClass(), "description", null);
        setBooleanField(term14963, term14963.getClass(), "required", false);
        setBooleanField(term14963, term14963.getClass(), "optionalArg", false);
        setIntField(term14963, term14963.getClass(), "numberOfArgs", 0);
        setField(term14963, term14963.getClass(), "type", null);
        setField(term14963, term14963.getClass(), "values", null);
        setCharField(term14963, term14963.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14941;
        Object retValue = callMethod(klass, "equals", argTypes, term14909, args);
        assertTrue(recursiveEquals(term14909, term14962));
        assertTrue(recursiveEquals(term14941, term14963));
        assertTrue(recursiveEquals(retValue, true));
    }

};


