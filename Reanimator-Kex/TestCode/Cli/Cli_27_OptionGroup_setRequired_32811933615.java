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
import java.lang.Boolean;

public class OptionGroup_setRequired_32811933615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342;
     Object term361;
     Object term1800;

    public OptionGroup_setRequired_32811933615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term343 = new HashMap();
        term342 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term342, term342.getClass(), "optionMap", term343);
        setField(term342, term342.getClass(), "selected", "LQFpaHEwXR");
        setBooleanField(term342, term342.getClass(), "required", true);
        term361 = new Boolean(false);
        HashMap term1801 = new HashMap();
        term1800 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term1800, term1800.getClass(), "optionMap", term1801);
        setField(term1800, term1800.getClass(), "selected", "LQFpaHEwXR");
        setBooleanField(term1800, term1800.getClass(), "required", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term361;
        callMethod(klass, "setRequired", argTypes, term342, args);
        assertTrue(recursiveEquals(term342, term1800));
        assertTrue(recursiveEquals(term361, false));
    }

};


