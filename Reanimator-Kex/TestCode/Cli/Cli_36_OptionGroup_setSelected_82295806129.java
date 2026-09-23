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

public class OptionGroup_setSelected_82295806129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4314;
     Object term4378;
     Object term4401;
     Object term4402;

    public OptionGroup_setSelected_82295806129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4314 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term4314, term4314.getClass(), "selected", null);
        term4378 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term4401 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term4401, term4401.getClass(), "optionMap", null);
        setField(term4401, term4401.getClass(), "selected", null);
        setBooleanField(term4401, term4401.getClass(), "required", false);
        term4402 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4402, term4402.getClass(), "opt", null);
        setField(term4402, term4402.getClass(), "longOpt", null);
        setField(term4402, term4402.getClass(), "argName", null);
        setField(term4402, term4402.getClass(), "description", null);
        setBooleanField(term4402, term4402.getClass(), "required", false);
        setBooleanField(term4402, term4402.getClass(), "optionalArg", false);
        setIntField(term4402, term4402.getClass(), "numberOfArgs", 0);
        setField(term4402, term4402.getClass(), "type", null);
        setField(term4402, term4402.getClass(), "values", null);
        setCharField(term4402, term4402.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term4378;
        callMethod(klass, "setSelected", argTypes, term4314, args);
        assertTrue(recursiveEquals(term4314, term4401));
        assertTrue(recursiveEquals(term4378, term4402));
    }

};


