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
import java.util.ArrayList;

public class Options_addOption_74403604272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17438;
     Object term17554;

    public Options_addOption_74403604272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17490 = new ArrayList();
        term17438 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term17438, term17438.getClass(), "requiredOpts", term17490);
        term17554 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term17554, term17554.getClass(), "opt", null);
        setField(term17554, term17554.getClass(), "longOpt", null);
        setBooleanField(term17554, term17554.getClass(), "required", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term17554;
        try {
            callMethod(klass, "addOption", argTypes, term17438, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


