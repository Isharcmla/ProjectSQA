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

public class Option_equals_1962139692151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21613;
     Object term21683;
     Object term21771;
     Object term21774;

    public Option_equals_1962139692151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21613 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term21613, term21613.getClass(), "opt", "java.lang.String");
        term21683 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term21771 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term21771, term21771.getClass(), "opt", "java.lang.String");
        setField(term21771, term21771.getClass(), "longOpt", null);
        setField(term21771, term21771.getClass(), "argName", null);
        setField(term21771, term21771.getClass(), "description", null);
        setBooleanField(term21771, term21771.getClass(), "required", false);
        setBooleanField(term21771, term21771.getClass(), "optionalArg", false);
        setIntField(term21771, term21771.getClass(), "numberOfArgs", 0);
        setField(term21771, term21771.getClass(), "type", null);
        setField(term21771, term21771.getClass(), "values", null);
        setCharField(term21771, term21771.getClass(), "valuesep", (char) 0);
        term21774 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term21774, term21774.getClass(), "opt", null);
        setField(term21774, term21774.getClass(), "longOpt", null);
        setField(term21774, term21774.getClass(), "argName", null);
        setField(term21774, term21774.getClass(), "description", null);
        setBooleanField(term21774, term21774.getClass(), "required", false);
        setBooleanField(term21774, term21774.getClass(), "optionalArg", false);
        setIntField(term21774, term21774.getClass(), "numberOfArgs", 0);
        setField(term21774, term21774.getClass(), "type", null);
        setField(term21774, term21774.getClass(), "values", null);
        setCharField(term21774, term21774.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term21683;
        Object retValue = callMethod(klass, "equals", argTypes, term21613, args);
        assertTrue(recursiveEquals(term21613, term21771));
        assertTrue(recursiveEquals(term21683, term21774));
        assertTrue(recursiveEquals(retValue, false));
    }

};


