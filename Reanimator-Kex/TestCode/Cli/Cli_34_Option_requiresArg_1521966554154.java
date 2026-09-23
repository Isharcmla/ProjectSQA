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

public class Option_requiresArg_1521966554154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22101;
     Object term22965;

    public Option_requiresArg_1521966554154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term22153 = new ArrayList();
        term22101 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setBooleanField(term22101, term22101.getClass(), "optionalArg", false);
        setIntField(term22101, term22101.getClass(), "numberOfArgs", -2);
        setField(term22101, term22101.getClass(), "values", term22153);
        ArrayList term22966 = new ArrayList();
        term22965 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term22965, term22965.getClass(), "opt", null);
        setField(term22965, term22965.getClass(), "longOpt", null);
        setField(term22965, term22965.getClass(), "argName", null);
        setField(term22965, term22965.getClass(), "description", null);
        setBooleanField(term22965, term22965.getClass(), "required", false);
        setBooleanField(term22965, term22965.getClass(), "optionalArg", false);
        setIntField(term22965, term22965.getClass(), "numberOfArgs", -2);
        setField(term22965, term22965.getClass(), "type", null);
        setField(term22965, term22965.getClass(), "values", term22966);
        setCharField(term22965, term22965.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "requiresArg", argTypes, term22101, args);
        assertTrue(recursiveEquals(term22101, term22965));
        assertTrue(recursiveEquals(retValue, true));
    }

};


