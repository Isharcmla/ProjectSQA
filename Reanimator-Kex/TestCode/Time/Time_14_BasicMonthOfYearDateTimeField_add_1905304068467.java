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

public class BasicMonthOfYearDateTimeField_add_1905304068467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178430;
     Object term178488;

    public BasicMonthOfYearDateTimeField_add_1905304068467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178430 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        term178488 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term178566 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term178654 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        Object term178742 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        Object term178842 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        Object term178958 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        setField(term178842, term178842.getClass(), "iDurationField", term178958);
        setField(term178742, term178742.getClass(), "iField", term178842);
        setField(term178654, term178654.getClass(), "iField", term178742);
        setField(term178566, term178566.getClass(), "iYear", term178654);
        setField(term178488, term178488.getClass(), "iChronology", term178566);
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
        args[0] = term178488;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term178430, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


