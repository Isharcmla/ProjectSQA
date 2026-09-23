package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Boolean;

public class PeriodFormatterBuilder_toFormatter_204687810588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1013;
     Object term1016;
     Object term1018;

    public PeriodFormatterBuilder_toFormatter_204687810588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1013 = new LinkedList();
        term1016 = new Boolean(true);
        term1018 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term1013;
        args[1] = term1016;
        args[2] = term1018;
        try {
            callMethod(klass, "toFormatter", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


