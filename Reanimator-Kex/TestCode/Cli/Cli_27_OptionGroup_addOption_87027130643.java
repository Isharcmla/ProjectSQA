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

public class OptionGroup_addOption_87027130643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8590;
     Object term8654;

    public OptionGroup_addOption_87027130643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8590 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term8590, term8590.getClass(), "optionMap", null);
        term8654 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term8654, term8654.getClass(), "opt", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term8654;
        try {
            callMethod(klass, "addOption", argTypes, term8590, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


