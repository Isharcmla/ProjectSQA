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

public class OptionGroup_setSelected_82295806137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7070;
     Object term7172;

    public OptionGroup_setSelected_82295806137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7070 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term7070, term7070.getClass(), "selected", "");
        term7172 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term7172, term7172.getClass(), "opt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term7172;
        try {
            callMethod(klass, "setSelected", argTypes, term7070, args);
            assertTrue(false);
        }
        catch (AlreadySelectedException e) {
        }

    }

};


