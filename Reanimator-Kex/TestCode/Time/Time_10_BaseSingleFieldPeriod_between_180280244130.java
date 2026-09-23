package org.joda.time.base;

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
import static org.joda.time.base.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseSingleFieldPeriod_between_180280244130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30114;
     Object term30248;

    public BaseSingleFieldPeriod_between_180280244130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30114 = newInstance(Class.forName("org.joda.time.MonthDay"));
        Object term30198 = newInstance(Class.forName("org.joda.time.chrono.BuddhistChronology"));
        setField(term30114, term30114.getClass(), "iChronology", term30198);
        term30248 = newInstance(Class.forName("org.joda.time.MonthDay"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[2] = Class.forName("org.joda.time.ReadablePeriod");
        Object[] args = new Object[3];
        args[0] = term30114;
        args[1] = term30248;
        args[2] = null;
        try {
            callMethod(klass, "between", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


