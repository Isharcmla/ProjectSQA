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

public class CommandLine_addOption_156944631101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29092;
     Object term29204;

    public CommandLine_addOption_156944631101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term29140 = new HashMap();
        term29092 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term29092, term29092.getClass(), "hashcodeMap", term29140);
        term29204 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term29204, term29204.getClass(), "opt", null);
        setField(term29204, term29204.getClass(), "longOpt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term29204;
        try {
            callMethod(klass, "addOption", argTypes, term29092, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
