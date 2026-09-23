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

public class BasicMonthOfYearDateTimeField_add_1905304068420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143936;
     Object term143994;

    public BasicMonthOfYearDateTimeField_add_1905304068420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143936 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term143994 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term144072 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term144160 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        Object term144262 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfYearDateTimeField"));
        Object term144348 = newInstance(Class.forName("org.joda.time.field.PreciseDurationField"));
        setField(term144262, term144262.getClass(), "iUnitField", term144348);
        setField(term144160, term144160.getClass(), "iField", term144262);
        setField(term144072, term144072.getClass(), "iYear", term144160);
        setField(term143994, term143994.getClass(), "iChronology", term144072);
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
        args[0] = term143994;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term143936, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


