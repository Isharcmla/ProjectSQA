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

public class OptionGroup_addOption_87027130629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4087;
     Object term4151;

    public OptionGroup_addOption_87027130629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4087 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term4087, term4087.getClass(), "optionMap", null);
        term4151 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4151, term4151.getClass(), "opt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term4151;
        try {
            callMethod(klass, "addOption", argTypes, term4087, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


