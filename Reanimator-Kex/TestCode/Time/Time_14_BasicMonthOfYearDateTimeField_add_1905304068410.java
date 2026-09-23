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

public class BasicMonthOfYearDateTimeField_add_1905304068410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136167;
     Object term136225;

    public BasicMonthOfYearDateTimeField_add_1905304068410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136167 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        term136225 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term136303 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term136391 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        Object term136479 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        Object term136579 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        Object term136691 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$LinkedDurationField"));
        setField(term136579, term136579.getClass(), "iDurationField", term136691);
        setField(term136479, term136479.getClass(), "iField", term136579);
        setField(term136391, term136391.getClass(), "iField", term136479);
        setField(term136303, term136303.getClass(), "iYear", term136391);
        setField(term136225, term136225.getClass(), "iChronology", term136303);
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
        args[0] = term136225;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term136167, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


