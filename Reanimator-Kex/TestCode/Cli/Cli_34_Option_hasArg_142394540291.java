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

public class Option_hasArg_142394540291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12843;
     Object term12852;

    public Option_hasArg_142394540291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12843 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term12843, term12843.getClass(), "numberOfArgs", 0);
        term12852 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term12852, term12852.getClass(), "opt", null);
        setField(term12852, term12852.getClass(), "longOpt", null);
        setField(term12852, term12852.getClass(), "argName", null);
        setField(term12852, term12852.getClass(), "description", null);
        setBooleanField(term12852, term12852.getClass(), "required", false);
        setBooleanField(term12852, term12852.getClass(), "optionalArg", false);
        setIntField(term12852, term12852.getClass(), "numberOfArgs", 0);
        setField(term12852, term12852.getClass(), "type", null);
        setField(term12852, term12852.getClass(), "values", null);
        setCharField(term12852, term12852.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasArg", argTypes, term12843, args);
        assertTrue(recursiveEquals(term12843, term12852));
        assertTrue(recursiveEquals(retValue, false));
    }

};


