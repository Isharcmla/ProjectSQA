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

public class BaseSingleFieldPeriod_between_180280244120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27545;
     Object term27597;

    public BaseSingleFieldPeriod_between_180280244120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27545 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        term27597 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term27671 = newInstance(Class.forName("org.joda.time.chrono.ISOChronology"));
        setField(term27597, term27597.getClass(), "iChronology", term27671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[2] = Class.forName("org.joda.time.ReadablePeriod");
        Object[] args = new Object[3];
        args[0] = term27545;
        args[1] = term27597;
        args[2] = null;
        try {
            callMethod(klass, "between", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


