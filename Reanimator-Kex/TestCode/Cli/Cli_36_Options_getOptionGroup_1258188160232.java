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
import java.lang.NullPointerException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Options_getOptionGroup_1258188160232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74578;
     Object term74642;

    public Options_getOptionGroup_1258188160232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74578 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term74578, term74578.getClass(), "optionGroups", null);
        term74642 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term74642, term74642.getClass(), "opt", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term74642;
        try {
            callMethod(klass, "getOptionGroup", argTypes, term74578, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


