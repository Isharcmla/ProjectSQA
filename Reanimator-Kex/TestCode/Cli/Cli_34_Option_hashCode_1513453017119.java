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

public class Option_hashCode_1513453017119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16152;
     Object term16161;

    public Option_hashCode_1513453017119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16152 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term16152, term16152.getClass(), "opt", null);
        term16161 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term16161, term16161.getClass(), "opt", null);
        setField(term16161, term16161.getClass(), "longOpt", null);
        setField(term16161, term16161.getClass(), "argName", null);
        setField(term16161, term16161.getClass(), "description", null);
        setBooleanField(term16161, term16161.getClass(), "required", false);
        setBooleanField(term16161, term16161.getClass(), "optionalArg", false);
        setIntField(term16161, term16161.getClass(), "numberOfArgs", 0);
        setField(term16161, term16161.getClass(), "type", null);
        setField(term16161, term16161.getClass(), "values", null);
        setCharField(term16161, term16161.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term16152, args);
        assertTrue(recursiveEquals(term16152, term16161));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


