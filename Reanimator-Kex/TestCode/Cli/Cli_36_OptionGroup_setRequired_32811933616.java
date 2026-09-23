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
import java.util.HashMap;
import java.lang.Boolean;

public class OptionGroup_setRequired_32811933616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term538;
     Object term557;
     Object term2136;

    public OptionGroup_setRequired_32811933616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term539 = new HashMap();
        term538 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term538, term538.getClass(), "optionMap", term539);
        setField(term538, term538.getClass(), "selected", "xOEqzGAmDU");
        setBooleanField(term538, term538.getClass(), "required", true);
        term557 = new Boolean(false);
        HashMap term2137 = new HashMap();
        term2136 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term2136, term2136.getClass(), "optionMap", term2137);
        setField(term2136, term2136.getClass(), "selected", "xOEqzGAmDU");
        setBooleanField(term2136, term2136.getClass(), "required", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term557;
        callMethod(klass, "setRequired", argTypes, term538, args);
        assertTrue(recursiveEquals(term538, term2136));
        assertTrue(recursiveEquals(term557, false));
    }

};


