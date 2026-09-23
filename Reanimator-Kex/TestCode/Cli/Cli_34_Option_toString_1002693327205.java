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
import java.lang.reflect.InaccessibleObjectException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Option_toString_1002693327205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36353;

    public Option_toString_1002693327205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36427 = Class.forName((String) "java.util.InvalidPropertiesFormatException");
        term36353 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term36353, term36353.getClass(), "opt", null);
        setField(term36353, term36353.getClass(), "longOpt", " ");
        setIntField(term36353, term36353.getClass(), "numberOfArgs", -2147483643);
        setField(term36353, term36353.getClass(), "description", null);
        setField(term36353, term36353.getClass(), "type", term36427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term36353, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


