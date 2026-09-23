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

public class Option_hashCode_1513453017105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14187;
     Object term14236;

    public Option_hashCode_1513453017105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14187 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14187, term14187.getClass(), "opt", "");
        setField(term14187, term14187.getClass(), "longOpt", null);
        term14236 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14236, term14236.getClass(), "opt", "");
        setField(term14236, term14236.getClass(), "longOpt", null);
        setField(term14236, term14236.getClass(), "argName", null);
        setField(term14236, term14236.getClass(), "description", null);
        setBooleanField(term14236, term14236.getClass(), "required", false);
        setBooleanField(term14236, term14236.getClass(), "optionalArg", false);
        setIntField(term14236, term14236.getClass(), "numberOfArgs", 0);
        setField(term14236, term14236.getClass(), "type", null);
        setField(term14236, term14236.getClass(), "values", null);
        setCharField(term14236, term14236.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term14187, args);
        assertTrue(recursiveEquals(term14187, term14236));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


