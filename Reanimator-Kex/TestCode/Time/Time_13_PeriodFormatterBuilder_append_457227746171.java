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
import java.lang.NullPointerException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PeriodFormatterBuilder_append_457227746171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34812;
     Object term34924;

    public PeriodFormatterBuilder_append_457227746171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34812 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        term34924 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Composite"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.PeriodPrinter");
        argTypes[1] = Class.forName("org.joda.time.format.PeriodParser");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term34924;
        try {
            callMethod(klass, "append", argTypes, term34812, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


