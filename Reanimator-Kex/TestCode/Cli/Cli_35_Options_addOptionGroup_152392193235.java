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

public class Options_addOptionGroup_152392193235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4733;
     Object term4807;

    public Options_addOptionGroup_152392193235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4733 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        term4807 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setBooleanField(term4807, term4807.getClass(), "required", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.OptionGroup");
        Object[] args = new Object[1];
        args[0] = term4807;
        try {
            callMethod(klass, "addOptionGroup", argTypes, term4733, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


