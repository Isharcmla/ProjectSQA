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

public class CommandLine_addOption_15694463161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14120;
     Object term14184;

    public CommandLine_addOption_15694463161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14120 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term14120, term14120.getClass(), "hashcodeMap", null);
        term14184 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14184, term14184.getClass(), "opt", "");
        setField(term14184, term14184.getClass(), "longOpt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term14184;
        try {
            callMethod(klass, "addOption", argTypes, term14120, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


