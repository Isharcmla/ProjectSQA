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
import org.apache.commons.cli.AlreadySelectedException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OptionGroup_setSelected_82295806133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4585;
     Object term4687;

    public OptionGroup_setSelected_82295806133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4585 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term4585, term4585.getClass(), "selected", "");
        term4687 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4687, term4687.getClass(), "opt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term4687;
        try {
            callMethod(klass, "setSelected", argTypes, term4585, args);
            assertTrue(false);
        }
        catch (AlreadySelectedException e) {
        }

    }

};


