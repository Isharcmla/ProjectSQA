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

public class BasicMonthOfYearDateTimeField_add_1905304068463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171334;
     Object term171392;

    public BasicMonthOfYearDateTimeField_add_1905304068463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171334 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term171392 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term171470 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term171554 = newInstance(Class.forName("org.joda.time.field.OffsetDateTimeField"));
        Object term171658 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term171742 = newInstance(Class.forName("org.joda.time.field.MillisDurationField"));
        setField(term171658, term171658.getClass(), "iUnitField", term171742);
        setField(term171554, term171554.getClass(), "iField", term171658);
        setField(term171470, term171470.getClass(), "iYear", term171554);
        setField(term171392, term171392.getClass(), "iChronology", term171470);
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
        args[0] = term171392;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term171334, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


