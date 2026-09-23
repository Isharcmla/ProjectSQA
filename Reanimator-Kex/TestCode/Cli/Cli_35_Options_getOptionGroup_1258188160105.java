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
import java.util.HashMap;

public class Options_getOptionGroup_1258188160105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27455;
     Object term27567;
     Object term27580;
     Object term27582;

    public Options_getOptionGroup_1258188160105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term27503 = new HashMap();
        term27455 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term27455, term27455.getClass(), "optionGroups", term27503);
        term27567 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term27567, term27567.getClass(), "opt", null);
        setField(term27567, term27567.getClass(), "longOpt", null);
        HashMap term27581 = new HashMap();
        term27580 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term27580, term27580.getClass(), "shortOpts", null);
        setField(term27580, term27580.getClass(), "longOpts", null);
        setField(term27580, term27580.getClass(), "requiredOpts", null);
        setField(term27580, term27580.getClass(), "optionGroups", term27581);
        term27582 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term27582, term27582.getClass(), "opt", null);
        setField(term27582, term27582.getClass(), "longOpt", null);
        setField(term27582, term27582.getClass(), "argName", null);
        setField(term27582, term27582.getClass(), "description", null);
        setBooleanField(term27582, term27582.getClass(), "required", false);
        setBooleanField(term27582, term27582.getClass(), "optionalArg", false);
        setIntField(term27582, term27582.getClass(), "numberOfArgs", 0);
        setField(term27582, term27582.getClass(), "type", null);
        setField(term27582, term27582.getClass(), "values", null);
        setCharField(term27582, term27582.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term27567;
        Object retValue = callMethod(klass, "getOptionGroup", argTypes, term27455, args);
        assertTrue(recursiveEquals(term27455, term27580));
        assertTrue(recursiveEquals(term27567, term27582));
        assertTrue(recursiveEquals(retValue, null));
    }

};


