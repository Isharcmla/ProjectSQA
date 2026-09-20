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

public class CommandLine_addOption_156944631103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29578;
     Object term29642;

    public CommandLine_addOption_156944631103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29578 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term29578, term29578.getClass(), "hashcodeMap", null);
        term29642 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term29642, term29642.getClass(), "opt", null);
        setField(term29642, term29642.getClass(), "longOpt", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term29642;
        try {
            callMethod(klass, "addOption", argTypes, term29578, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
