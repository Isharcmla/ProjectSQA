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
import java.util.HashMap;

public class CommandLine_addOption_15694463175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17456;
     Object term17568;

    public CommandLine_addOption_15694463175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17504 = new HashMap();
        term17456 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term17456, term17456.getClass(), "hashcodeMap", term17504);
        term17568 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term17568, term17568.getClass(), "opt", "");
        setField(term17568, term17568.getClass(), "longOpt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term17568;
        try {
            callMethod(klass, "addOption", argTypes, term17456, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
