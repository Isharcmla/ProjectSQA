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

public class CommandLine_addOption_15694463189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26207;
     Object term26271;

    public CommandLine_addOption_15694463189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26207 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term26207, term26207.getClass(), "hashcodeMap", null);
        term26271 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term26271, term26271.getClass(), "opt", null);
        setField(term26271, term26271.getClass(), "longOpt", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term26271;
        try {
            callMethod(klass, "addOption", argTypes, term26207, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


