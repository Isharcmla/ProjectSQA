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

public class Option_toString_1002693327181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28999;
     Object term29404;

    public Option_toString_1002693327181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28999 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term28999, term28999.getClass(), "opt", null);
        setField(term28999, term28999.getClass(), "longOpt", "");
        setIntField(term28999, term28999.getClass(), "numberOfArgs", 1);
        setField(term28999, term28999.getClass(), "description", null);
        setField(term28999, term28999.getClass(), "type", " :: ");
        term29404 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term29404, term29404.getClass(), "opt", null);
        setField(term29404, term29404.getClass(), "longOpt", "");
        setField(term29404, term29404.getClass(), "argName", null);
        setField(term29404, term29404.getClass(), "description", null);
        setBooleanField(term29404, term29404.getClass(), "required", false);
        setBooleanField(term29404, term29404.getClass(), "optionalArg", false);
        setIntField(term29404, term29404.getClass(), "numberOfArgs", 1);
        setField(term29404, term29404.getClass(), "type", " :: ");
        setField(term29404, term29404.getClass(), "values", null);
        setCharField(term29404, term29404.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term28999, args);
        assertTrue(recursiveEquals(term28999, term29404));
        assertTrue(recursiveEquals(retValue, "[ option: null   [ARG] :: null ::  ::  ]"));
    }

};


