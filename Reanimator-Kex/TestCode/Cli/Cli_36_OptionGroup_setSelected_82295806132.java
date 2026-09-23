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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;

public class OptionGroup_setSelected_82295806132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4483;
     Object term4691;

    public OptionGroup_setSelected_82295806132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4483 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        term4691 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term4691, term4691.getClass(), "optionMap", null);
        setField(term4691, term4691.getClass(), "selected", null);
        setBooleanField(term4691, term4691.getClass(), "required", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSelected", argTypes, term4483, args);
        assertTrue(recursiveEquals(term4483, term4691));
    }

};


