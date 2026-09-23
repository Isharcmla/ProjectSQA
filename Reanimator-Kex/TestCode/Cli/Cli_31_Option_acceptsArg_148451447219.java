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

public class Option_acceptsArg_148451447219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37145;
     Object term37157;

    public Option_acceptsArg_148451447219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37145 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term37145, term37145.getClass(), "numberOfArgs", -2);
        term37157 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term37157, term37157.getClass(), "opt", null);
        setField(term37157, term37157.getClass(), "longOpt", null);
        setField(term37157, term37157.getClass(), "argName", null);
        setField(term37157, term37157.getClass(), "description", null);
        setBooleanField(term37157, term37157.getClass(), "required", false);
        setBooleanField(term37157, term37157.getClass(), "optionalArg", false);
        setIntField(term37157, term37157.getClass(), "numberOfArgs", -2);
        setField(term37157, term37157.getClass(), "type", null);
        setField(term37157, term37157.getClass(), "values", null);
        setCharField(term37157, term37157.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acceptsArg", argTypes, term37145, args);
        assertTrue(recursiveEquals(term37145, term37157));
        assertTrue(recursiveEquals(retValue, true));
    }

};


