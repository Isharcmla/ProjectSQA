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

public class OptionGroup_setSelected_82295806122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2110;
     Object term2174;
     Object term2998;
     Object term2999;

    public OptionGroup_setSelected_82295806122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2110 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term2110, term2110.getClass(), "selected", null);
        term2174 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term2998 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term2998, term2998.getClass(), "optionMap", null);
        setField(term2998, term2998.getClass(), "selected", null);
        setBooleanField(term2998, term2998.getClass(), "required", false);
        term2999 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term2999, term2999.getClass(), "opt", null);
        setField(term2999, term2999.getClass(), "longOpt", null);
        setField(term2999, term2999.getClass(), "argName", null);
        setField(term2999, term2999.getClass(), "description", null);
        setBooleanField(term2999, term2999.getClass(), "required", false);
        setBooleanField(term2999, term2999.getClass(), "optionalArg", false);
        setIntField(term2999, term2999.getClass(), "numberOfArgs", 0);
        setField(term2999, term2999.getClass(), "type", null);
        setField(term2999, term2999.getClass(), "values", null);
        setCharField(term2999, term2999.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term2174;
        callMethod(klass, "setSelected", argTypes, term2110, args);
        assertTrue(recursiveEquals(term2110, term2998));
        assertTrue(recursiveEquals(term2174, term2999));
    }

};


