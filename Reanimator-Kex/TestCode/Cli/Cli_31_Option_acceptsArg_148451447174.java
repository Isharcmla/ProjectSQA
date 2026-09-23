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

public class Option_acceptsArg_148451447174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25946;
     Object term26144;

    public Option_acceptsArg_148451447174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25946 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term25946, term25946.getClass(), "numberOfArgs", 0);
        term26144 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term26144, term26144.getClass(), "opt", null);
        setField(term26144, term26144.getClass(), "longOpt", null);
        setField(term26144, term26144.getClass(), "argName", null);
        setField(term26144, term26144.getClass(), "description", null);
        setBooleanField(term26144, term26144.getClass(), "required", false);
        setBooleanField(term26144, term26144.getClass(), "optionalArg", false);
        setIntField(term26144, term26144.getClass(), "numberOfArgs", 0);
        setField(term26144, term26144.getClass(), "type", null);
        setField(term26144, term26144.getClass(), "values", null);
        setCharField(term26144, term26144.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acceptsArg", argTypes, term25946, args);
        assertTrue(recursiveEquals(term25946, term26144));
        assertTrue(recursiveEquals(retValue, false));
    }

};


