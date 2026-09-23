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

public class BasicMonthOfYearDateTimeField_add_1905304068296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73107;
     Object term73165;

    public BasicMonthOfYearDateTimeField_add_1905304068296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73107 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term73165 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term73243 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term73331 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        Object term73419 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        setField(term73331, term73331.getClass(), "iField", term73419);
        setField(term73243, term73243.getClass(), "iYear", term73331);
        setField(term73165, term73165.getClass(), "iChronology", term73243);
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
        args[0] = term73165;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term73107, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


