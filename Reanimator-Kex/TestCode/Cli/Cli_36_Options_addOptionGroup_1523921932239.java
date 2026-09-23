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

public class Options_addOptionGroup_1523921932239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76856;
     Object term76930;

    public Options_addOptionGroup_1523921932239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76856 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        term76930 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setBooleanField(term76930, term76930.getClass(), "required", false);
        setField(term76930, term76930.getClass(), "optionMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.OptionGroup");
        Object[] args = new Object[1];
        args[0] = term76930;
        try {
            callMethod(klass, "addOptionGroup", argTypes, term76856, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


