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

public class Options_getOptionGroup_1258188160239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79064;
     Object term79128;

    public Options_getOptionGroup_1258188160239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79064 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term79064, term79064.getClass(), "optionGroups", null);
        term79128 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term79128, term79128.getClass(), "opt", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term79128;
        try {
            callMethod(klass, "getOptionGroup", argTypes, term79064, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


