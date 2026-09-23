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

public class Option_hashCode_151345301797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13644;
     Object term13993;

    public Option_hashCode_151345301797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13644 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term13644, term13644.getClass(), "opt", null);
        term13993 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term13993, term13993.getClass(), "opt", null);
        setField(term13993, term13993.getClass(), "longOpt", null);
        setField(term13993, term13993.getClass(), "argName", null);
        setField(term13993, term13993.getClass(), "description", null);
        setBooleanField(term13993, term13993.getClass(), "required", false);
        setBooleanField(term13993, term13993.getClass(), "optionalArg", false);
        setIntField(term13993, term13993.getClass(), "numberOfArgs", 0);
        setField(term13993, term13993.getClass(), "type", null);
        setField(term13993, term13993.getClass(), "values", null);
        setCharField(term13993, term13993.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term13644, args);
        assertTrue(recursiveEquals(term13644, term13993));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


