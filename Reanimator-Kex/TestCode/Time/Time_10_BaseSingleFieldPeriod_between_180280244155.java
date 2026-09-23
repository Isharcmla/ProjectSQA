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

public class BaseSingleFieldPeriod_between_180280244155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37682;
     Object term38126;

    public BaseSingleFieldPeriod_between_180280244155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37682 = newInstance(Class.forName("org.joda.time.YearMonth"));
        Object term37766 = newInstance(Class.forName("org.joda.time.chrono.BuddhistChronology"));
        Object term37882 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$ImpreciseCutoverField"));
        Object term37994 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$LinkedDurationField"));
        Object term38074 = newInstance(Class.forName("org.joda.time.field.SkipDateTimeField"));
        setField(term37994, term37994.getClass(), "iType", null);
        setField(term37882, term37882.getClass(), "iDurationField", term37994);
        setField(term37766, term37766.getClass(), "iYear", term37882);
        setField(term37766, term37766.getClass(), "iMonthOfYear", term38074);
        setField(term37682, term37682.getClass(), "iChronology", term37766);
        term38126 = newInstance(Class.forName("org.joda.time.YearMonth"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[2] = Class.forName("org.joda.time.ReadablePeriod");
        Object[] args = new Object[3];
        args[0] = term37682;
        args[1] = term38126;
        args[2] = null;
        try {
            callMethod(klass, "between", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


