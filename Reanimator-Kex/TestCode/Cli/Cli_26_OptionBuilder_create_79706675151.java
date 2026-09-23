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

public class OptionBuilder_create_79706675151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1728;

    public OptionBuilder_create_79706675151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        setField(null, Class.forName("org.apache.commons.cli.OptionBuilder"), "description", null);
        ArrayList term1740 = new ArrayList();
        term1728 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1728, term1728.getClass(), "opt", "l");
        setField(term1728, term1728.getClass(), "longOpt", null);
        setField(term1728, term1728.getClass(), "argName", "arg");
        setField(term1728, term1728.getClass(), "description", null);
        setBooleanField(term1728, term1728.getClass(), "required", false);
        setBooleanField(term1728, term1728.getClass(), "optionalArg", false);
        setIntField(term1728, term1728.getClass(), "numberOfArgs", -1);
        setField(term1728, term1728.getClass(), "type", null);
        setField(term1728, term1728.getClass(), "values", term1740);
        setCharField(term1728, term1728.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "l";
        Object retValue = callMethod(klass, "create", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1728));
    }

};


