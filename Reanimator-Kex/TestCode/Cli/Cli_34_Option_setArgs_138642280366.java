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
import java.util.ArrayList;
import java.lang.Integer;

public class Option_setArgs_138642280366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2072;
     Object term2129;
     Object term8014;

    public Option_setArgs_138642280366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2124 = new ArrayList();
        term2072 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term2072, term2072.getClass(), "opt", "PHvxnGHptP");
        setField(term2072, term2072.getClass(), "longOpt", "TimdotUuNC");
        setField(term2072, term2072.getClass(), "argName", "PkWMRdJcBb");
        setField(term2072, term2072.getClass(), "description", "jSpAteRute");
        setBooleanField(term2072, term2072.getClass(), "required", true);
        setBooleanField(term2072, term2072.getClass(), "optionalArg", true);
        setIntField(term2072, term2072.getClass(), "numberOfArgs", 1048535127);
        setField(term2072, term2072.getClass(), "type", null);
        setField(term2072, term2072.getClass(), "values", term2124);
        setCharField(term2072, term2072.getClass(), "valuesep", 'b');
        term2129 = new Integer(-655067527);
        ArrayList term8023 = new ArrayList();
        term8014 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term8014, term8014.getClass(), "opt", "PHvxnGHptP");
        setField(term8014, term8014.getClass(), "longOpt", "TimdotUuNC");
        setField(term8014, term8014.getClass(), "argName", "PkWMRdJcBb");
        setField(term8014, term8014.getClass(), "description", "jSpAteRute");
        setBooleanField(term8014, term8014.getClass(), "required", true);
        setBooleanField(term8014, term8014.getClass(), "optionalArg", true);
        setIntField(term8014, term8014.getClass(), "numberOfArgs", -655067527);
        setField(term8014, term8014.getClass(), "type", null);
        setField(term8014, term8014.getClass(), "values", term8023);
        setCharField(term8014, term8014.getClass(), "valuesep", 'b');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2129;
        callMethod(klass, "setArgs", argTypes, term2072, args);
        assertTrue(recursiveEquals(term2072, term8014));
        assertTrue(recursiveEquals(term2129, -655067527));
    }

};


