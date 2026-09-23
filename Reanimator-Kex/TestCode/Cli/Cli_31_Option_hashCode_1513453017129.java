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

public class Option_hashCode_1513453017129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17699;
     Object term17751;

    public Option_hashCode_1513453017129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17699 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term17699, term17699.getClass(), "opt", "");
        setField(term17699, term17699.getClass(), "longOpt", null);
        term17751 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term17751, term17751.getClass(), "opt", "");
        setField(term17751, term17751.getClass(), "longOpt", null);
        setField(term17751, term17751.getClass(), "argName", null);
        setField(term17751, term17751.getClass(), "description", null);
        setBooleanField(term17751, term17751.getClass(), "required", false);
        setBooleanField(term17751, term17751.getClass(), "optionalArg", false);
        setIntField(term17751, term17751.getClass(), "numberOfArgs", 0);
        setField(term17751, term17751.getClass(), "type", null);
        setField(term17751, term17751.getClass(), "values", null);
        setCharField(term17751, term17751.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term17699, args);
        assertTrue(recursiveEquals(term17699, term17751));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


