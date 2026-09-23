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

public class OptionGroup_addOption_87027130634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4809;
     Object term4921;
     Object term5377;
     Object term5382;
     Object term5367;

    public OptionGroup_addOption_87027130634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4857 = new HashMap();
        term4809 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term4809, term4809.getClass(), "optionMap", term4857);
        term4921 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4921, term4921.getClass(), "opt", null);
        setField(term4921, term4921.getClass(), "longOpt", null);
        HashMap term5378 = new HashMap();
        term5377 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term5377, term5377.getClass(), "optionMap", term5378);
        setField(term5377, term5377.getClass(), "selected", null);
        setBooleanField(term5377, term5377.getClass(), "required", false);
        term5382 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term5382, term5382.getClass(), "opt", null);
        setField(term5382, term5382.getClass(), "longOpt", null);
        setField(term5382, term5382.getClass(), "argName", null);
        setField(term5382, term5382.getClass(), "description", null);
        setBooleanField(term5382, term5382.getClass(), "required", false);
        setBooleanField(term5382, term5382.getClass(), "optionalArg", false);
        setIntField(term5382, term5382.getClass(), "numberOfArgs", 0);
        setField(term5382, term5382.getClass(), "type", null);
        setField(term5382, term5382.getClass(), "values", null);
        setCharField(term5382, term5382.getClass(), "valuesep", (char) 0);
        HashMap term5368 = new HashMap();
        term5367 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term5367, term5367.getClass(), "optionMap", term5368);
        setField(term5367, term5367.getClass(), "selected", null);
        setBooleanField(term5367, term5367.getClass(), "required", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term4921;
        Object retValue = callMethod(klass, "addOption", argTypes, term4809, args);
        assertTrue(recursiveEquals(term4809, term5377));
        assertTrue(recursiveEquals(term4921, term5382));
        assertTrue(recursiveEquals(retValue, term5367));
    }

};


