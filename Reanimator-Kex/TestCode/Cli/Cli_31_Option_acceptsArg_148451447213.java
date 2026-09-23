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

public class Option_acceptsArg_148451447213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36355;
     Object term36373;

    public Option_acceptsArg_148451447213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36355 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term36355, term36355.getClass(), "numberOfArgs", 0);
        setBooleanField(term36355, term36355.getClass(), "optionalArg", true);
        term36373 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term36373, term36373.getClass(), "opt", null);
        setField(term36373, term36373.getClass(), "longOpt", null);
        setField(term36373, term36373.getClass(), "argName", null);
        setField(term36373, term36373.getClass(), "description", null);
        setBooleanField(term36373, term36373.getClass(), "required", false);
        setBooleanField(term36373, term36373.getClass(), "optionalArg", true);
        setIntField(term36373, term36373.getClass(), "numberOfArgs", 0);
        setField(term36373, term36373.getClass(), "type", null);
        setField(term36373, term36373.getClass(), "values", null);
        setCharField(term36373, term36373.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acceptsArg", argTypes, term36355, args);
        assertTrue(recursiveEquals(term36355, term36373));
        assertTrue(recursiveEquals(retValue, true));
    }

};


