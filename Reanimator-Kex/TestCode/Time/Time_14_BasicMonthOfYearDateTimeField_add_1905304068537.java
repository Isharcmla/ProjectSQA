package org.joda.time.chrono;

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
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BasicMonthOfYearDateTimeField_add_1905304068537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228011;
     Object term228069;

    public BasicMonthOfYearDateTimeField_add_1905304068537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228011 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        term228069 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term228147 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term228247 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        Object term228363 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        Object term228463 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        Object term228547 = newInstance(Class.forName("org.joda.time.chrono.EthiopicChronology"));
        setField(term228363, term228363.getClass(), "iType", null);
        setField(term228247, term228247.getClass(), "iDurationField", term228363);
        setField(term228147, term228147.getClass(), "iYear", term228247);
        setField(term228463, term228463.getClass(), "iChronology", term228547);
        setField(term228147, term228147.getClass(), "iMonthOfYear", term228463);
        setField(term228069, term228069.getClass(), "iChronology", term228147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term228069;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term228011, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


