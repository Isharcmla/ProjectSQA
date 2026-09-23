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

public class Option_acceptsArg_148451447293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60406;
     Object term60424;

    public Option_acceptsArg_148451447293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60406 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term60406, term60406.getClass(), "numberOfArgs", 0);
        setBooleanField(term60406, term60406.getClass(), "optionalArg", true);
        term60424 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term60424, term60424.getClass(), "opt", null);
        setField(term60424, term60424.getClass(), "longOpt", null);
        setField(term60424, term60424.getClass(), "argName", null);
        setField(term60424, term60424.getClass(), "description", null);
        setBooleanField(term60424, term60424.getClass(), "required", false);
        setBooleanField(term60424, term60424.getClass(), "optionalArg", true);
        setIntField(term60424, term60424.getClass(), "numberOfArgs", 0);
        setField(term60424, term60424.getClass(), "type", null);
        setField(term60424, term60424.getClass(), "values", null);
        setCharField(term60424, term60424.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acceptsArg", argTypes, term60406, args);
        assertTrue(recursiveEquals(term60406, term60424));
        assertTrue(recursiveEquals(retValue, true));
    }

};


