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

public class BaseSingleFieldPeriod_between_180280244159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39410;
     Object term39654;

    public BaseSingleFieldPeriod_between_180280244159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39410 = newInstance(Class.forName("org.joda.time.YearMonth"));
        Object term39490 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
        Object term39602 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        setField(term39490, term39490.getClass(), "iYear", term39602);
        setField(term39410, term39410.getClass(), "iChronology", term39490);
        term39654 = newInstance(Class.forName("org.joda.time.YearMonth"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[2] = Class.forName("org.joda.time.ReadablePeriod");
        Object[] args = new Object[3];
        args[0] = term39410;
        args[1] = term39654;
        args[2] = null;
        try {
            callMethod(klass, "between", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


