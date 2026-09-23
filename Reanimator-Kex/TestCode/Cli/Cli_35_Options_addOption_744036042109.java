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

public class Options_addOption_744036042109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28130;
     Object term28242;
     Object term28263;
     Object term28268;
     Object term28254;

    public Options_addOption_744036042109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term28178 = new HashMap();
        term28130 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term28130, term28130.getClass(), "shortOpts", term28178);
        term28242 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term28242, term28242.getClass(), "opt", null);
        setField(term28242, term28242.getClass(), "longOpt", null);
        setBooleanField(term28242, term28242.getClass(), "required", false);
        HashMap term28264 = new HashMap();
        term28263 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term28263, term28263.getClass(), "shortOpts", term28264);
        setField(term28263, term28263.getClass(), "longOpts", null);
        setField(term28263, term28263.getClass(), "requiredOpts", null);
        setField(term28263, term28263.getClass(), "optionGroups", null);
        term28268 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term28268, term28268.getClass(), "opt", null);
        setField(term28268, term28268.getClass(), "longOpt", null);
        setField(term28268, term28268.getClass(), "argName", null);
        setField(term28268, term28268.getClass(), "description", null);
        setBooleanField(term28268, term28268.getClass(), "required", false);
        setBooleanField(term28268, term28268.getClass(), "optionalArg", false);
        setIntField(term28268, term28268.getClass(), "numberOfArgs", 0);
        setField(term28268, term28268.getClass(), "type", null);
        setField(term28268, term28268.getClass(), "values", null);
        setCharField(term28268, term28268.getClass(), "valuesep", (char) 0);
        HashMap term28255 = new HashMap();
        term28254 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term28254, term28254.getClass(), "shortOpts", term28255);
        setField(term28254, term28254.getClass(), "longOpts", null);
        setField(term28254, term28254.getClass(), "requiredOpts", null);
        setField(term28254, term28254.getClass(), "optionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term28242;
        Object retValue = callMethod(klass, "addOption", argTypes, term28130, args);
        assertTrue(recursiveEquals(term28130, term28263));
        assertTrue(recursiveEquals(term28242, term28268));
        assertTrue(recursiveEquals(retValue, term28254));
    }

};


