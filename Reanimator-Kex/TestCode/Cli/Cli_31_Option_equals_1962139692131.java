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

public class Option_equals_1962139692131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17987;
     Object term18059;
     Object term18070;
     Object term18071;

    public Option_equals_1962139692131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17987 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term18059 = newInstance(Class.forName("java.util.regex.Pattern$UnixCaret"));
        term18070 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term18070, term18070.getClass(), "opt", null);
        setField(term18070, term18070.getClass(), "longOpt", null);
        setField(term18070, term18070.getClass(), "argName", null);
        setField(term18070, term18070.getClass(), "description", null);
        setBooleanField(term18070, term18070.getClass(), "required", false);
        setBooleanField(term18070, term18070.getClass(), "optionalArg", false);
        setIntField(term18070, term18070.getClass(), "numberOfArgs", 0);
        setField(term18070, term18070.getClass(), "type", null);
        setField(term18070, term18070.getClass(), "values", null);
        setCharField(term18070, term18070.getClass(), "valuesep", (char) 0);
        term18071 = newInstance(Class.forName("java.util.regex.Pattern$UnixCaret"));
        setField(term18071, term18071.getClass(), "next", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18059;
        Object retValue = callMethod(klass, "equals", argTypes, term17987, args);
        assertTrue(recursiveEquals(term17987, term18070));
        assertTrue(recursiveEquals(term18059, term18071));
        assertTrue(recursiveEquals(retValue, false));
    }

};


