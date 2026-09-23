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
     Object term2100;

    public OptionBuilder_create_79706675151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        setField(null, Class.forName("org.apache.commons.cli.OptionBuilder"), "description", null);
        ArrayList term2112 = new ArrayList();
        term2100 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term2100, term2100.getClass(), "opt", "@");
        setField(term2100, term2100.getClass(), "longOpt", null);
        setField(term2100, term2100.getClass(), "argName", "arg");
        setField(term2100, term2100.getClass(), "description", null);
        setBooleanField(term2100, term2100.getClass(), "required", false);
        setBooleanField(term2100, term2100.getClass(), "optionalArg", false);
        setIntField(term2100, term2100.getClass(), "numberOfArgs", -1);
        setField(term2100, term2100.getClass(), "type", null);
        setField(term2100, term2100.getClass(), "values", term2112);
        setCharField(term2100, term2100.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "@";
        Object retValue = callMethod(klass, "create", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term2100));
    }

};


