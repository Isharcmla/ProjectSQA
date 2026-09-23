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

public class OptionGroup_addOption_87027130622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2401;
     Object term2465;

    public OptionGroup_addOption_87027130622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2401 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term2401, term2401.getClass(), "optionMap", null);
        term2465 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term2465, term2465.getClass(), "opt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term2465;
        try {
            callMethod(klass, "addOption", argTypes, term2401, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


