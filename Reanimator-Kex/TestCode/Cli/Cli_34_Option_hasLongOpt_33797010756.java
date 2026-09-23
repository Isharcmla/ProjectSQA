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

public class Option_hasLongOpt_33797010756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1056;
     Object term6408;

    public Option_hasLongOpt_33797010756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1108 = new ArrayList();
        term1056 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1056, term1056.getClass(), "opt", "BndsHwAFMv");
        setField(term1056, term1056.getClass(), "longOpt", "GzFkzHGYFt");
        setField(term1056, term1056.getClass(), "argName", "tShwQLRGNe");
        setField(term1056, term1056.getClass(), "description", "LvtrsXUliU");
        setBooleanField(term1056, term1056.getClass(), "required", true);
        setBooleanField(term1056, term1056.getClass(), "optionalArg", true);
        setIntField(term1056, term1056.getClass(), "numberOfArgs", -1339778481);
        setField(term1056, term1056.getClass(), "type", null);
        setField(term1056, term1056.getClass(), "values", term1108);
        setCharField(term1056, term1056.getClass(), "valuesep", 'D');
        ArrayList term6417 = new ArrayList();
        term6408 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term6408, term6408.getClass(), "opt", "BndsHwAFMv");
        setField(term6408, term6408.getClass(), "longOpt", "GzFkzHGYFt");
        setField(term6408, term6408.getClass(), "argName", "tShwQLRGNe");
        setField(term6408, term6408.getClass(), "description", "LvtrsXUliU");
        setBooleanField(term6408, term6408.getClass(), "required", true);
        setBooleanField(term6408, term6408.getClass(), "optionalArg", true);
        setIntField(term6408, term6408.getClass(), "numberOfArgs", -1339778481);
        setField(term6408, term6408.getClass(), "type", null);
        setField(term6408, term6408.getClass(), "values", term6417);
        setCharField(term6408, term6408.getClass(), "valuesep", 'D');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasLongOpt", argTypes, term1056, args);
        assertTrue(recursiveEquals(term1056, term6408));
        assertTrue(recursiveEquals(retValue, true));
    }

};


