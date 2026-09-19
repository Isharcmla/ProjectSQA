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

public class CommandLine_addOption_15694463185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24520;
     Object term24632;

    public CommandLine_addOption_15694463185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term24568 = new HashMap();
        term24520 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term24520, term24520.getClass(), "hashcodeMap", term24568);
        term24632 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term24632, term24632.getClass(), "opt", null);
        setField(term24632, term24632.getClass(), "longOpt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term24632;
        try {
            callMethod(klass, "addOption", argTypes, term24520, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


