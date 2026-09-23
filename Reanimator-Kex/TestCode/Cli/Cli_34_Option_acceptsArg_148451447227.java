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

public class Option_acceptsArg_148451447227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44697;
     Object term44714;

    public Option_acceptsArg_148451447227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44697 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term44697, term44697.getClass(), "numberOfArgs", 0);
        term44714 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term44714, term44714.getClass(), "opt", null);
        setField(term44714, term44714.getClass(), "longOpt", null);
        setField(term44714, term44714.getClass(), "argName", null);
        setField(term44714, term44714.getClass(), "description", null);
        setBooleanField(term44714, term44714.getClass(), "required", false);
        setBooleanField(term44714, term44714.getClass(), "optionalArg", false);
        setIntField(term44714, term44714.getClass(), "numberOfArgs", 0);
        setField(term44714, term44714.getClass(), "type", null);
        setField(term44714, term44714.getClass(), "values", null);
        setCharField(term44714, term44714.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acceptsArg", argTypes, term44697, args);
        assertTrue(recursiveEquals(term44697, term44714));
        assertTrue(recursiveEquals(retValue, false));
    }

};


