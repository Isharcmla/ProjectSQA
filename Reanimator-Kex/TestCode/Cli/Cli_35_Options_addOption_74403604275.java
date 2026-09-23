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

public class Options_addOption_74403604275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18407;
     Object term18519;

    public Options_addOption_74403604275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18455 = new HashMap();
        term18407 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term18407, term18407.getClass(), "longOpts", term18455);
        term18519 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term18519, term18519.getClass(), "opt", null);
        setField(term18519, term18519.getClass(), "longOpt", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term18519;
        try {
            callMethod(klass, "addOption", argTypes, term18407, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


