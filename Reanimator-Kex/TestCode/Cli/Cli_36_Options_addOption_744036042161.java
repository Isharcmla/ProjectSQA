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

public class Options_addOption_744036042161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46034;
     Object term46146;
     Object term46167;
     Object term46172;
     Object term46158;

    public Options_addOption_744036042161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term46082 = new HashMap();
        term46034 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term46034, term46034.getClass(), "shortOpts", term46082);
        term46146 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term46146, term46146.getClass(), "opt", null);
        setField(term46146, term46146.getClass(), "longOpt", null);
        setBooleanField(term46146, term46146.getClass(), "required", false);
        HashMap term46168 = new HashMap();
        term46167 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term46167, term46167.getClass(), "shortOpts", term46168);
        setField(term46167, term46167.getClass(), "longOpts", null);
        setField(term46167, term46167.getClass(), "requiredOpts", null);
        setField(term46167, term46167.getClass(), "optionGroups", null);
        term46172 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term46172, term46172.getClass(), "opt", null);
        setField(term46172, term46172.getClass(), "longOpt", null);
        setField(term46172, term46172.getClass(), "argName", null);
        setField(term46172, term46172.getClass(), "description", null);
        setBooleanField(term46172, term46172.getClass(), "required", false);
        setBooleanField(term46172, term46172.getClass(), "optionalArg", false);
        setIntField(term46172, term46172.getClass(), "numberOfArgs", 0);
        setField(term46172, term46172.getClass(), "type", null);
        setField(term46172, term46172.getClass(), "values", null);
        setCharField(term46172, term46172.getClass(), "valuesep", (char) 0);
        HashMap term46159 = new HashMap();
        term46158 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term46158, term46158.getClass(), "shortOpts", term46159);
        setField(term46158, term46158.getClass(), "longOpts", null);
        setField(term46158, term46158.getClass(), "requiredOpts", null);
        setField(term46158, term46158.getClass(), "optionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term46146;
        Object retValue = callMethod(klass, "addOption", argTypes, term46034, args);
        assertTrue(recursiveEquals(term46034, term46167));
        assertTrue(recursiveEquals(term46146, term46172));
        assertTrue(recursiveEquals(retValue, term46158));
    }

};


