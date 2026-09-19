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

public class CommandLine_addOption_15694463183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23943;
     Object term24055;

    public CommandLine_addOption_15694463183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term23991 = new HashMap();
        term23943 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term23943, term23943.getClass(), "hashcodeMap", term23991);
        term24055 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term24055, term24055.getClass(), "opt", "");
        setField(term24055, term24055.getClass(), "longOpt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term24055;
        try {
            callMethod(klass, "addOption", argTypes, term23943, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


