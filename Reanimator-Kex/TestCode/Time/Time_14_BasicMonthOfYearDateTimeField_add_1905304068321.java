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

public class BasicMonthOfYearDateTimeField_add_1905304068321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80828;
     Object term80886;

    public BasicMonthOfYearDateTimeField_add_1905304068321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80828 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term80886 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term80964 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term81052 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        Object term81140 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        Object term81246 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term81140, term81140.getClass(), "iField", term81246);
        setField(term81052, term81052.getClass(), "iField", term81140);
        setField(term80964, term80964.getClass(), "iYear", term81052);
        setField(term80886, term80886.getClass(), "iChronology", term80964);
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
        args[0] = term80886;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term80828, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


